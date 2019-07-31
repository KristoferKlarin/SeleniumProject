package testCasesSATOrganisationskontoStruktur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;

public class StrukturCheckThatYouCantAddHemvistWithSameName extends BeforeAfterTestBrowsers {
	String StrukturH�gstaNamn;

	String EngelsktNamnP�EnhetValue; String SvenskNamnP�EnhetValue;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = 
				"Loggar in som en organisationskontoansvarig och f�rs�ker l�gga till en hemvist med namn som redan finns. "
						+ "Testet kontrollerar att valideringsmeddelande visas korrekt";
	}

	@Test
	public void LoginAsUser() {

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickOrganisationskonto() {

		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationskonto"})
	public void ClickStruktur() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur());
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur()).click();
	}

	@Test (dependsOnMethods={"ClickStruktur"})
	public void RedigeraH�gstaNiv�n() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�n());

		WebElement StrukturH�gstaNamnElement =  driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_H�gstaNiv�Namn()); 
		StrukturH�gstaNamn = StrukturH�gstaNamnElement.getText();

		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�n())
		.click();
	}

	@Test (dependsOnMethods={"RedigeraH�gstaNiv�n"})
	public void NamnP�NyEnhet() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet());
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet())
		.sendKeys(StrukturH�gstaNamn);
		if (driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet())
				.getAttribute("value") != StrukturH�gstaNamn);{
					driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet())
					.clear();
					driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet())
					.sendKeys(StrukturH�gstaNamn);}
	}

	@Test (dependsOnMethods={"NamnP�NyEnhet"})
	public void SparaNyHemvist() {

		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetKnapp()).click();
	}

	@Test (dependsOnMethods={"SparaNyHemvist"})
	public void CheckForValidationMessage() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.xpath("//*[@id=\"organizationStructureCreate\"]/div/ul/li"));

		if (driver.getPageSource().contains(("Det finns redan ett objekt i strukturen med namnet: " + "'"+StrukturH�gstaNamn+"'")) 
				|| (driver.getPageSource().contains(("This object with name " + "'"+StrukturH�gstaNamn+"' " + "already exists in the structure"))))  {
		}
		else 
		{
			Assert.fail();
		}
	}


}


