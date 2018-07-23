package testCasesSAT;



import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUser;
import pageObjectsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageObjectsSAT.PortalLoggedInAsOrgUserOrganisationsuppgifter;
import pageObjectsSAT.PortalLoggedInAsUserAns�kningarOchBidrag;
import pageObjectsSAT.PortalLoggedInAsUserGranskning;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ButtonCheckLoggedInAsUser extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en organisationsanv�ndare och testar att alla synliga knappar �r klickbara";

	@Test 
	public void LoginAsNormalUser() {

		System.out.println("Testfall = " + TestCaseInfo);

		//Loggar in som anv�ndare kkprisma@yahoo.com
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.kkprismayahooSATusername, UserCredentials.kkprismayahooSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsNormalUser"})
	public void ClickStartButton() {

		//KLICKAR P� START
		PortalLoggedInAsUserMinProfil.MinProfil_Start_Xpath(driver).click();


	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		//KLICKAR P� PERSONUPPGIFTER
		PortalLoggedInAsUserMinProfil.MinProfil_Personuppgifter_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER UTBILDNING
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�_CSS(driver).click();

	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER ARBETSLIV
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyten_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningen_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER PUBLIKATIONER
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtm�rkelserButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MERITER OCH UTM�RKELSER
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens_XpathXpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser_XpathXpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelserButton"})
	public void ClickImmaterialr�ttButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MERITER OCH UTM�RKELSER
		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt_Immaterialr�tt(driver).click();

	}


	@Test (dependsOnMethods={"ClickImmaterialr�ttButton"})
	public void ClickGranskarkompetensIfVisible() {

		//KLICKAR P� ALLA RUBRIKER UNDER GRANSKARKOMPETENS
		while (driver.getPageSource().contains("Granskarkompetens")) {
			PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens(driver).click();
			break;
		}
	}

	@Test (dependsOnMethods={"ClickGranskarkompetensIfVisible"})
	public void ClickAns�kningarOchBidrag() {

		//Klickar p� alla knappar som finns p� "Ans�kningar och bidrag" sidan
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragButton_CSS(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragUtlysningarButton_Xpath(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragAnsokningarButton_Xpath(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragBidragButton_Xpath(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragAns�kOmEtikpr�vning_Xpath(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragEtikpr�vningsans�kningar_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickAns�kningarOchBidrag"})
	public void ClickGranskning() {

		//Klickar p� alla knappar som finns p� "Granskning" sidan
		PortalLoggedInAsUserGranskning.GranskningButton_CSS(driver).click();
		PortalLoggedInAsUserGranskning.Granskning_Granskning_Xpath(driver).click();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformation_Xpath(driver).click();
		PortalLoggedInAsUserGranskning.GranskningArvoden_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		//Klickar p� alla knappar som finns p� "ORGANISATIONSUPPGIFTER" SIDAN
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_CSS(driver).click();
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Rapportera_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		//Klickar p� alla knappar som finns p� "ORGANISATIONSKONTO" SIDAN
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_CSS(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Ans�kningarOchBidrag_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Nedladdning_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Byt_Hemvist_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_F�reslagen_Hemvist_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporterings�versikt_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsstruktur_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signerings�versikt_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsstruktur_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsutlysningar_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsans�kningar_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Utbetalningar_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsUser.LoggaUt_Xpath(driver).click();

	}

}


