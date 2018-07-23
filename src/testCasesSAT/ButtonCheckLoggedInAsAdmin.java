package testCasesSAT;



import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsAdminMinProfil;
import pageObjectsSAT.PortalLoggedInAsAdminPortalAdministration;
import pageObjectsSAT.PortalLoggedInAsAdmin;
import pageObjectsSAT.PortalLoggedInAsAdminBeredningsgrupper;
import pageObjectsSAT.PortalLoggedInAsAdminFinansi�r;
import pageObjectsSAT.PortalLoggedInAsAdminFormul�r;
import pageObjectsSAT.PortalLoggedInAsAdminIntressentregister;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ButtonCheckLoggedInAsAdmin extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en admin och testar att alla synliga knappar �r klickbara";

	@Test 
	public void LoginAsAdminUser() {

		System.out.println("Testfall = " + TestCaseInfo);

		//Loggar in som anv�ndare kkprisma@yahoo.com
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.KristoferKlarinAdminUserNameSAT, UserCredentials.KristoferKlarinAdminPasswordSAT);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsAdmin.LoggaUt_Xpath);
		
	}

	@Test (dependsOnMethods={"LoginAsAdminUser"})
	public void ClickMyProfileButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MIN PROFIL
		PortalLoggedInAsAdminMinProfil.MinProfilButton_CSS(driver).click();
		PortalLoggedInAsAdminMinProfil.MinProfilButton_Inst�llningar_Xpath(driver).click();
		PortalLoggedInAsAdminMinProfil.MinProfilButton_SWAMID_KONTO_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickMyProfileButton"})
	public void ClickIntressentregisterButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER INTRESSENTREGISTER
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_CSS(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Personkonto_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Organisationskonto_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_OrganisationsAns�kningar_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Beredningsgruppsmedlemmar_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Granskarpool_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Arbetsgivare_Xpath(driver).click();	
	}

	@Test (dependsOnMethods={"ClickIntressentregisterButton"})
	public void ClickBeredningsgrupperButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER BEREDNINGSGRUPPER
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_CSS(driver).click();
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Beredningsgrupper_Xpath(driver).click();
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Arvodeshantering_Xpath(driver).click();

	}


	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormul�rButton() {


		PortalLoggedInAsAdminFormul�r.Formul�rButton_CSS(driver).click();
	}

	@Test (dependsOnMethods={"ClickFormul�rButton"})
	public void Formul�rKarolinskaInstitutet() {

		//KAROLINSKA
		DriverWaitExpectedConditions.WebDriverWaitForExpectedCssSelectorLocator(driver, PortalLoggedInAsAdminFormul�r.KarolinskaInstitutet_CSS);
		PortalLoggedInAsAdminFormul�r.KarolinskaInstitutet_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaInstitutetFormul�r_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaInstitutetSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaUnderh�llstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaDataInst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.KarolinskaKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rKarolinskaInstitutet"})
	public void Formul�rFormas() {


		//FORMAS
		PortalLoggedInAsAdminFormul�r.Formas_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasFormul�r_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasUnderh�llstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasDatainst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.FormasKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rFormas"})
	public void Formul�rVetenskapsr�det() {

		//VETENSKAPSR�DET
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�det_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detFormul�r_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detSidmallar_CSSS(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detUnderh�llstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detDataInst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.Vetenskapsr�detKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rVetenskapsr�det"})
	public void Formul�rForte() {

		//FORTE
		PortalLoggedInAsAdminFormul�r.Forte_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteFormul�r_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteUnderh�llstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteDatainst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.ForteKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rForte"})
	public void Formul�rSkolfi() {

		//SKOLFI
		PortalLoggedInAsAdminFormul�r.Skolfi_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiFormul�r_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiUnderh�llstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiDatainst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.SkolfiKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rSkolfi"})
	public void Formul�rEPN() {

		//EPN
		PortalLoggedInAsAdminFormul�r.EPN_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNFormul�r_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNUnderh�llstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.EPNDatainst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFormul�r.EpnKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Formul�rEPN"})
	public void ClickFinansi�rButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER FINANSI�R
		PortalLoggedInAsAdminFinansi�r.Finansi�rButton_CSS(driver).click();

	}

	@Test (dependsOnMethods={"ClickFinansi�rButton"})
	public void Finansi�rKarolinskaInstitutet() {

		//KAROLINSKA INSTITUTET
		DriverWaitExpectedConditions.WebDriverWaitForExpectedCssSelectorLocator(driver, PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutet_CSS);
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutet_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetFinansi�rsinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetGranskarpoolinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetInternaAnv�ndare_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetArvodesinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetS�knycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetOrganisationskontoans�kningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.KarolinskaInstitutetInternaF�rfr�ningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rKarolinskaInstitutet"})
	public void Finansi�rFormas() {

		//FORMAS
		PortalLoggedInAsAdminFinansi�r.Formas_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasFinansi�rsinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasGranskarpoolinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasInternaAnv�ndare_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasArvodesinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasS�knycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasOrganisationskontoans�kningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.FormasInternaF�rfr�ningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rFormas"})
	public void Finansi�rVetenskapsr�det() {


		//VETENSKAPSR�DET
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�det_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detFinansi�rsinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detGranskarpoolinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detInternaAnv�ndare_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detArvodesinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detS�knycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detOrganisationskontoans�kningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.Vetenskapsr�detInternaF�rfr�ningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rVetenskapsr�det"})
	public void Finansi�rForte() {

		//FORTE
		PortalLoggedInAsAdminFinansi�r.Forte_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteFinansi�rsinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteGranskarpoolinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteInternaAnv�ndare_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteArvodesinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteS�knycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteOrganisationskontoans�kningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.ForteInternaF�rfr�ningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rForte"})
	public void Finansi�rSkolfi() {

		//SKOLFI
		PortalLoggedInAsAdminFinansi�r.Skolfi_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiFinansi�rsinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiGranskarpoolinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiInternaAnv�ndare_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiArvodesinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiS�knycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiOrganisationskontoans�kningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.SkolfiInternaF�rfr�ningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"Finansi�rSkolfi"})
	public void Finansi�rEPN() {

		//EPN
		PortalLoggedInAsAdminFinansi�r.EPN_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNFinansi�rsinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNGranskarpoolinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNInternaAnv�ndare_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNArvodesinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNS�knycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNOrganisationskontoans�kningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNInternaF�rfr�ningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansi�r.EPNAvgiftskategorier_CSS(driver).click();
	}

	
	@Test (dependsOnMethods={"Finansi�rEPN"})
	public void ClickPortaladministrationButton() {

		////KLICKAR P� ALLA RUBRIKER UNDER PORTALADMINISTRAION
		PortalLoggedInAsAdminPortalAdministration.PortaladministrationButton_CSS(driver).click();

		PortalLoggedInAsAdminPortalAdministration.Webbplatinst�llningar_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Portalanv�ndare_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Finansi�rer_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Underh�llstabeller_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.HierarkiskaUnderh�llstabeller_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Spr�k_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Meddelanden_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Driftstatus_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Statistik_CSS(driver).click();
	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsAdmin.LoggaUt_Xpath(driver).click();

	}


}


