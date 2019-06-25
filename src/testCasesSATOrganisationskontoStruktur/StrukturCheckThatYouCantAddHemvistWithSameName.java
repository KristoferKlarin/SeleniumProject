package testCasesSATOrganisationskontoStruktur;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;

public class StrukturCheckThatYouCantAddHemvistWithSameName extends BeforeAfterTestBrowsers {
	
	String EngelsktNamnP�EnhetValue; String SvenskNamnP�EnhetValue;
	
	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en organisationskontoansvarig och f�rs�ker l�gga till en hemvist med namn som redan finns. Testet kontrollerar att valideringsmeddelande visas korrekt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickOrganisationskonto() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationskonto"})
	public void ClickStruktur() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur));
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur(driver).click();
	}

	@Test (dependsOnMethods={"ClickStruktur"})
	public void RedigeraH�gstaNiv�n() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�n));
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�n(driver).click();
	}

	@Test (dependsOnMethods={"RedigeraH�gstaNiv�n"})
	public void SvensktNamnP�NyEnhet() {

		String SvenskNamnP�Enhet = "Jordens Coolaste Hj�ltar";
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).sendKeys(SvenskNamnP�Enhet);

		if (PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).getAttribute("value") != SvenskNamnP�Enhet);
		{
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).clear();
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).sendKeys(SvenskNamnP�Enhet);

			SvenskNamnP�EnhetValue = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).getAttribute("value");
//			System.out.println("Svensk namn p� enhet �r = " + SvenskNamnP�EnhetValue); 
		}

	}

	@Test (dependsOnMethods={"SvensktNamnP�NyEnhet"})
	public void EngelsktNamnP�NyEnhet() {

		String EngelsktNamnP�Enhet = "Earths Coolest Heroes";
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).sendKeys(EngelsktNamnP�Enhet);

		if (PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).getAttribute("value") != EngelsktNamnP�Enhet);
		{
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).clear();
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).sendKeys(EngelsktNamnP�Enhet);

			EngelsktNamnP�EnhetValue = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).getAttribute("value");
//			System.out.println("Engelskt namn p� enhet �r = " + EngelsktNamnP�EnhetValue); 
		}
	}

	@Test (dependsOnMethods={"EngelsktNamnP�NyEnhet"})
	public void SparaNyHemvist() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetKnapp(driver).click();
		
	}

	@Test (dependsOnMethods={"SparaNyHemvist"})
	public void CheckForValidationMessage() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#organizationStructureCreate > div > ul > li:nth-child(1)"));
		
		if (driver.getPageSource().contains(("Det finns redan ett objekt i strukturen med namnet: " + "'"+EngelsktNamnP�EnhetValue+"'")) && (driver.getPageSource().contains(("Det finns redan ett objekt i strukturen med namnet: " + "'"+SvenskNamnP�EnhetValue+"'"))))  {

//			System.out.println("Felmeddelande visas korrekt b�de p� svenska och engelska. Testet har lyckats"); 

		}  else if (driver.getPageSource().contains(("This object with name " + "'"+EngelsktNamnP�EnhetValue+"'")) && (driver.getPageSource().contains(("This object with name " + "'"+SvenskNamnP�EnhetValue+"'")))) {

			System.out.println(" ");
//			System.out.println("Felmeddelande visas korrekt b�de p� svenska och engelska. Testet har lyckats"); 
		}
		else 
		{
			System.out.println(" ");
//			System.out.print("Felmeddelande visas inte korrekt. Testet har misslyckats");
			Assert.fail();
		}
	}


}


