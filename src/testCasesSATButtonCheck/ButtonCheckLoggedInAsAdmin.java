package testCasesSATButtonCheck;



import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsAdmin;
import pageElementsSAT.PortalLoggedInAsAdminBeredningsgrupper;
import pageElementsSAT.PortalLoggedInAsAdminFinansi�r;
import pageElementsSAT.PortalLoggedInAsAdminFormul�r;
import pageElementsSAT.PortalLoggedInAsAdminIntressentregister;
import pageElementsSAT.PortalLoggedInAsAdminMinProfil;
import pageElementsSAT.PortalLoggedInAsAdminPortalAdministration;


public class ButtonCheckLoggedInAsAdmin extends BeforeAfterTestBrowsers {

	@Test 
	public void LoginAsAdminUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsAdminMinProfil.MinProfilButton));
		
	}

	@Test (dependsOnMethods={"LoginAsAdminUser"})
	public void ClickMyProfileButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MIN PROFIL
		PortalLoggedInAsAdminMinProfil.MinProfilButton(driver).click();
		PortalLoggedInAsAdminMinProfil.MinProfilButton_Inst�llningar(driver).click();
		PortalLoggedInAsAdminMinProfil.MinProfilButton_SWAMID_KONTO(driver).click();
	}

	@Test (dependsOnMethods={"ClickMyProfileButton"})
	public void ClickIntressentregisterButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER INTRESSENTREGISTER
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Personkonto(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Organisationskonto(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_OrganisationsAns�kningar(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Beredningsgruppsmedlemmar(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Granskarpool(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Arbetsgivare(driver).click();	
	}

	@Test (dependsOnMethods={"ClickIntressentregisterButton"})
	public void ClickBeredningsgrupperButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER BEREDNINGSGRUPPER
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton(driver).click();
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Beredningsgrupper(driver).click();
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Arvodeshantering(driver).click();

	}


	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormul�rButton() {


		PortalLoggedInAsAdminFormul�r.Formul�rButton(driver).click();
	}

	@Test (dependsOnMethods={"ClickFormul�rButton"})
	public void Formul�rKarolinskaInstitutet() {

		//KAROLINSKA
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsAdminFormul�r.KarolinskaInstitutet));
		PortalLoggedInAsAdminFormul�r.KarolinskaInstitutet(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaInstitutetFormul�r(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaInstitutetSidmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaUnderh�llstabeller(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaDataInst�llningar(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaKontroller(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rKarolinskaInstitutet"})
	public void Formul�rFormas() {


		//FORMAS
		PortalLoggedInAsAdminFormul�r.Formas(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasFormul�r(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasSidmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasUnderh�llstabeller(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasDatainst�llningar(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasKontroller(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rFormas"})
	public void Formul�rVetenskapsr�det() {

		//VETENSKAPSR�DET
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�det(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detFormul�r(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detSidmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detUnderh�llstabeller(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detDataInst�llningar(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detKontroller(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rVetenskapsr�det"})
	public void Formul�rForte() {

		//FORTE
		PortalLoggedInAsAdminFormul�r.Forte(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteFormul�r(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteSidmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteUnderh�llstabeller(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteDatainst�llningar(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteKontroller(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rForte"})
	public void Formul�rSkolfi() {

		//SKOLFI
		PortalLoggedInAsAdminFormul�r.Skolfi(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiFormul�r(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiSidmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiUnderh�llstabeller(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiDatainst�llningar(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiKontroller(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rSkolfi"})
	public void Formul�rEPN() {

		//EPN
		PortalLoggedInAsAdminFormul�r.EPN(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNFormul�r(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNSidmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNUnderh�llstabeller(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNDatainst�llningar(driver).click();
		PortalLoggedInAsAdminFormul�r.EpnKontroller(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rEPN"})
	public void ClickFinansi�rButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER FINANSI�R
		PortalLoggedInAsAdminFinansi�r.Finansi�rButton(driver).click();

	}

	@Test (dependsOnMethods={"ClickFinansi�rButton"})
	public void Finansi�rKarolinskaInstitutet() {

		//KAROLINSKA INSTITUTET
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutet));
		
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutet(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetFinansi�rsinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetGranskarpoolinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetInternaAnv�ndare(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetArvodesinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetS�knycklar(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetOrganisationskontoans�kningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetInternaF�rfr�ningar(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rKarolinskaInstitutet"})
	public void Finansi�rFormas() {

		//FORMAS
		PortalLoggedInAsAdminFinansi�r.Formas(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasFinansi�rsinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasGranskarpoolinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasInternaAnv�ndare(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasArvodesinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasS�knycklar(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasOrganisationskontoans�kningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasInternaF�rfr�ningar(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rFormas"})
	public void Finansi�rVetenskapsr�det() {


		//VETENSKAPSR�DET
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�det(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detFinansi�rsinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detGranskarpoolinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detInternaAnv�ndare(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detArvodesinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detS�knycklar(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detOrganisationskontoans�kningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detInternaF�rfr�ningar(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rVetenskapsr�det"})
	public void Finansi�rForte() {

		//FORTE
		PortalLoggedInAsAdminFinansi�r.Forte(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteFinansi�rsinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteGranskarpoolinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteInternaAnv�ndare(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteArvodesinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteS�knycklar(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteOrganisationskontoans�kningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteInternaF�rfr�ningar(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rForte"})
	public void Finansi�rSkolfi() {

		//SKOLFI
		PortalLoggedInAsAdminFinansi�r.Skolfi(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiFinansi�rsinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiGranskarpoolinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiInternaAnv�ndare(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiArvodesinst�llningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiS�knycklar(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiOrganisationskontoans�kningar(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiInternaF�rfr�ningar(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rSkolfi"})
	public void Finansi�rEPN() {

		//EPN
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
	}

	
	@Test (dependsOnMethods={"Finansi�rEPN"})
	public void ClickPortaladministrationButton() {

		////KLICKAR P� ALLA RUBRIKER UNDER PORTALADMINISTRAION
		PortalLoggedInAsAdminPortalAdministration.PortaladministrationButton(driver).click();

		PortalLoggedInAsAdminPortalAdministration.Webbplatinst�llningar(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Portalanv�ndare(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Finansi�rer(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Underh�llstabeller(driver).click();
		PortalLoggedInAsAdminPortalAdministration.HierarkiskaUnderh�llstabeller(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Spr�k(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Meddelanden(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Driftstatus(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Statistik(driver).click();
	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsAdmin.LoggaUt(driver).click();

	}


}


