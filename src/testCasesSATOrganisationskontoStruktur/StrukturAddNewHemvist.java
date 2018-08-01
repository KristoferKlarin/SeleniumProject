package testCasesSATOrganisationskontoStruktur;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;



public class StrukturAddNewHemvist extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en organisationskontoansvarig och l�gger till en ny hemvist under fliken organisationskonto, sidan struktur.";

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

		int RandomNumber = 1 + (int)(Math.random() * 9999); 

		String SvenskNamnP�Enhet = "Autoskapad hemvist svenska: " + RandomNumber;
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

		int RandomNumber = 1 + (int)(Math.random() * 9999); 

		String EngelsktNamnP�Enhet = "Autoskapad hemvist engelska: " + RandomNumber;
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
	public void SparaNyHemvist() throws InterruptedException {

		Thread.sleep(1000);
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetKnapp(driver).click();
	
	}

}