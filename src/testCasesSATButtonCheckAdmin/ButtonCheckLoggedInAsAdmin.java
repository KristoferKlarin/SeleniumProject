package testCasesSATButtonCheckAdmin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsAdminAndUserLoggaUt;
import pageElementsSAT.PortalLoggedInAsAdminBeredningsgrupper;
import pageElementsSAT.PortalLoggedInAsAdminFinansi�r;
import pageElementsSAT.PortalLoggedInAsAdminFormul�r;
import pageElementsSAT.PortalLoggedInAsAdminIntressentregister;
import pageElementsSAT.PortalLoggedInAsAdminMinProfil;
import pageElementsSAT.PortalLoggedInAsAdminPortalAdministration;
import reusableMethods.CheckIfElementIsPresentOnPage;
import reusableMethods.DriverWaitExpectedConditions;


public class ButtonCheckLoggedInAsAdmin extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = 
				"Loggar in som en admin och testar att alla synliga knappar �r klickbara";
	}

	@Test
	public void ClickMyProfileButton() {

		driver.findElement(
				PortalLoggedInAsAdminMinProfil.MinProfilButton()).click();

	}
	
	@Test (dependsOnMethods={"ClickMyProfileButton"})
	public void ClickInst�llningar() {
		
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminMinProfil.MinProfilButton_Inst�llningar());

		driver.findElement(
				PortalLoggedInAsAdminMinProfil.MinProfilButton_Inst�llningar()).click();

		CheckIfElementIsPresentOnPage.test(driver, By.id("OldPassword"));

		driver.findElement(
				PortalLoggedInAsAdminMinProfil.MinProfilButton_SWAMID_KONTO()).click();
		
	}

	@Test (dependsOnMethods={"ClickInst�llningar"})
	public void ClickIntressentregisterButton() {


		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Personkonto());

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Personkonto()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Organisationskonto()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_OrganisationsAns�kningar()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Beredningsgruppsmedlemmar()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Granskarpool()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Arbetsgivare()).click();
	}

	@Test (dependsOnMethods={"ClickIntressentregisterButton"})
	public void ClickBeredningsgrupperButton() {

		driver.findElement(
				PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Beredningsgrupper());

		driver.findElement(
				PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Beredningsgrupper()).click();
		driver.findElement(
				PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Arvodeshantering()).click();
	}

	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormul�rButton() {

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Formul�rButton()).click();
	}

	@Test (dependsOnMethods={"ClickFormul�rButton"})
	public void Formul�rKarolinskaInstitutet() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormul�r.KarolinskaInstitutet());

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.KarolinskaInstitutet()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormul�r.KarolinskaInstitutetFormul�r());

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.KarolinskaInstitutetFormul�r()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.KarolinskaInstitutetSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.KarolinskaAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.KarolinskaUnderh�llstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.KarolinskaDataInst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.KarolinskaKontroller()).click();
	}

	@Test (dependsOnMethods={"Formul�rKarolinskaInstitutet"})
	public void Formul�rFormas() {

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Formas()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormul�r.FormasFormul�r());

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.FormasFormul�r()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.FormasSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.FormasAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.FormasUnderh�llstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.FormasDatainst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.FormasKontroller()).click();
	}

	@Test (dependsOnMethods={"Formul�rFormas"})
	public void Formul�rVetenskapsr�det() {

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Vetenskapsr�det()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormul�r.Vetenskapsr�detFormul�r());

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Vetenskapsr�detFormul�r()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Vetenskapsr�detSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Vetenskapsr�detAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Vetenskapsr�detUnderh�llstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Vetenskapsr�detDataInst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Vetenskapsr�detKontroller()).click();
	}

	@Test (dependsOnMethods={"Formul�rVetenskapsr�det"})
	public void Formul�rForte() {

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Forte()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormul�r.ForteFormul�r());

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.ForteFormul�r()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.ForteSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.ForteAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.ForteUnderh�llstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.ForteDatainst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.ForteKontroller()).click();
	}

	@Test (dependsOnMethods={"Formul�rForte"})
	public void Formul�rSkolfi() {

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.Skolfi()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormul�r.SkolfiFormul�r());

		driver.findElement(
				PortalLoggedInAsAdminFormul�r.SkolfiFormul�r()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.SkolfiSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.SkolfiAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.SkolfiUnderh�llstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.SkolfiDatainst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormul�r.SkolfiKontroller()).click();
	}

	@Test (dependsOnMethods={"Formul�rSkolfi"})
	public void Formul�rEPN() {

		//EPN
		/*PortalLoggedInAsAdminFormul�r.EPN(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNFormul�r(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNSidmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNUnderh�llstabeller(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNDatainst�llningar(driver).click();
		PortalLoggedInAsAdminFormul�r.EpnKontroller(driver).click();
		 */
	}

	@Test (dependsOnMethods={"Formul�rEPN"})
	public void ClickFinansi�rButton() {

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Finansi�rButton()).click();
	}

	@Test (dependsOnMethods={"ClickFinansi�rButton"})
	public void Finansi�rKarolinskaInstitutet() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutet());

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutet()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetFinansi�rsinst�llningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetFinansi�rsinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetGranskarpoolinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetInternaAnv�ndare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetArvodesinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetS�knycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetOrganisationskontoans�kningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetInternaF�rfr�ningar()).click();
	}

	@Test (dependsOnMethods={"Finansi�rKarolinskaInstitutet"})
	public void Finansi�rFormas() {

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Formas()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansi�r.FormasFinansi�rsinst�llningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasFinansi�rsinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasGranskarpoolinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasInternaAnv�ndare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasArvodesinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasS�knycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasOrganisationskontoans�kningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.FormasInternaF�rfr�ningar()).click();
	}

	@Test (dependsOnMethods={"Finansi�rFormas"})
	public void Finansi�rVetenskapsr�det() {

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�det()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detFinansi�rsinst�llningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detFinansi�rsinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detGranskarpoolinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detInternaAnv�ndare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detArvodesinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detS�knycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detOrganisationskontoans�kningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detInternaF�rfr�ningar()).click();
	}

	@Test (dependsOnMethods={"Finansi�rVetenskapsr�det"})
	public void Finansi�rForte() {

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Forte()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansi�r.ForteFinansi�rsinst�llningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteFinansi�rsinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteGranskarpoolinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteInternaAnv�ndare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteArvodesinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteS�knycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteOrganisationskontoans�kningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.ForteInternaF�rfr�ningar()).click();
	}

	@Test (dependsOnMethods={"Finansi�rForte"})
	public void Finansi�rSkolfi() {

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.Skolfi()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansi�r.SkolfiFinansi�rsinst�llningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiFinansi�rsinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiGranskarpoolinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiInternaAnv�ndare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiArvodesinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiS�knycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiOrganisationskontoans�kningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansi�r.SkolfiInternaF�rfr�ningar()).click();
	}

	@Test (dependsOnMethods={"Finansi�rSkolfi"})
	public void Finansi�rEPN() {

		//EPN
		/*
		PortalLoggedInAsAdminFinansi�r.EPN(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNFinansi�rsinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNGranskarpoolinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNInternaAnv�ndare(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNArvodesinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNS�knycklar(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNOrganisationskontoans�kningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNInternaF�rfr�ningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNAvgiftskategorier(driver).click();
		 */
	}

	@Test (dependsOnMethods={"Finansi�rEPN"})
	public void ClickPortaladministrationButton() {

		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.PortaladministrationButton()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminPortalAdministration.Webbplatinst�llningar());

		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Webbplatinst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Portalanv�ndare()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Finansi�rer()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Underh�llstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.HierarkiskaUnderh�llstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Spr�k()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Meddelanden()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Driftstatus()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Statistik()).click();
	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		driver.findElement(
				PortalLoggedInAsAdminAndUserLoggaUt.LoggaUtButton()).click();
	}
}


