package testCasesSATOrganisationskontoStruktur;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import reusableMethods.DriverWaitExpectedConditions;

public class StrukturAddNewHemvist extends BeforeAfterTestSetup {
	String EngelsktNamnP�Enhet; String SvenskNamnP�Enhet;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en organisationskontoansvarig och l�gger till en ny hemvist under fliken organisationskonto, sidan struktur";
	}

	@Test 
	public void ClickOrganisationskonto() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationskonto"})
	public void ClickStruktur() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur());
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur()).click();
	}

	@Test (dependsOnMethods={"ClickStruktur"})
	public void RedigeraH�gstaNiv�n() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�n());
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�n()).click();
	}

	@Test (dependsOnMethods={"RedigeraH�gstaNiv�n"})
	public void SvensktNamnP�NyEnhet() {

		int RandomNumber = 1 + (int)(Math.random() * 9999); 
		SvenskNamnP�Enhet = "Autoskapad hemvist svenska: " + RandomNumber;
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet()).sendKeys(SvenskNamnP�Enhet);
		if (driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet()).getAttribute("value") != SvenskNamnP�Enhet); {
			driver.findElement(
					PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet()).clear();
			driver.findElement(
					PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet()).sendKeys(SvenskNamnP�Enhet); }
	}

	@Test (dependsOnMethods={"SvensktNamnP�NyEnhet"})
	public void EngelsktNamnP�NyEnhet() {

		int RandomNumber = 1 + (int)(Math.random() * 9999); 
		EngelsktNamnP�Enhet = "Autoskapad hemvist engelska: " + RandomNumber;
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet())
		.sendKeys(EngelsktNamnP�Enhet);
		if (driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet()).getAttribute("value") != EngelsktNamnP�Enhet);
		{
			driver.findElement(
					PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet()).clear();
			driver.findElement(
					PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet()).sendKeys(EngelsktNamnP�Enhet);
		}
	}

	@Test (dependsOnMethods={"EngelsktNamnP�NyEnhet"})
	public void SparaNyHemvist() throws InterruptedException  {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetKnapp()).click();
		
		Thread.sleep(1000);
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetSt�ng()).click();
	}

	@Test (dependsOnMethods={"SparaNyHemvist"})
	public void KontrollerAttHemvistenHarLagtsTill() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraH�gstaNiv�n());
		if (driver.getPageSource().contains(SvenskNamnP�Enhet)) {
			
		}
		else if (driver.getPageSource().contains(EngelsktNamnP�Enhet)) {
			
		}
		else {
			Assert.fail(); }
	}
}


