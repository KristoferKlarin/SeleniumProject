package testCasesSATOrganisationskontoStruktur;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;

public class StrukturCheckThatYouCantAddHemvistWithSameName extends BeforeAfterTestBrowsers {
	String EngelsktNamnP�Enhet; String SvenskNamnP�Enhet;


	String TestCaseInfo = "Loggar in som en organisationskontoansvarig och f�r�sker l�gga till en hemvist med namn som redan finns. Testet kontrollerar att valideringsmeddelande visas korrekt.";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto));

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

		SvenskNamnP�Enhet = "Jordens Coolaste Hj�ltar";
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).sendKeys(SvenskNamnP�Enhet);

		if (PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).getAttribute("value") != SvenskNamnP�Enhet);
		{
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).clear();
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).sendKeys(SvenskNamnP�Enhet);

			String SvenskNamnP�EnhetString = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(driver).getAttribute("value");
			System.out.println("Svensk namn p� enhet �r = " + SvenskNamnP�EnhetString); 
		}


	}

	@Test (dependsOnMethods={"SvensktNamnP�NyEnhet"})
	public void EngelsktNamnP�NyEnhet() {



		EngelsktNamnP�Enhet = "Earths Coolest Heroes";
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).sendKeys(EngelsktNamnP�Enhet);

		if (PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).getAttribute("value") != EngelsktNamnP�Enhet);
		{
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).clear();
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).sendKeys(EngelsktNamnP�Enhet);

			String EngelsktNamnP�EnhetString = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(driver).getAttribute("value");
			System.out.println("Engelskt namn p� enhet �r = " + EngelsktNamnP�EnhetString); 
		}
	}

	@Test (dependsOnMethods={"EngelsktNamnP�NyEnhet"})
	public void SparaNyHemvist() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetKnapp(driver).click();
	}

	@Test (dependsOnMethods={"SparaNyHemvist"})
	public void CheckForValidationMessage() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#organizationStructureCreate > div > ul > li:nth-child(1)"));
		
		if (driver.getPageSource().contains(("Det finns redan ett objekt i strukturen med namnet: " + "'"+EngelsktNamnP�Enhet+"'")) && (driver.getPageSource().contains(("Det finns redan ett objekt i strukturen med namnet: " + "'"+SvenskNamnP�Enhet+"'"))))  {

			System.out.println("Felmeddelande visas korrekt b�de p� svenska och engelska. Testet har lyckats"); 

		} else {

			Assert.fail("Felmeddelandet visas inte korrekt. Testet har misslyckats");
		}
	}


}

