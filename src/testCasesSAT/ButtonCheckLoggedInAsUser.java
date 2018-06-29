package testCasesSAT;



import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUser;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ButtonCheckLoggedInAsUser extends BeforeAfterTestBrowsers {

	@Test 
	public void LoginAsNormalUser() {

		//Loggar in som anv�ndare kkprisma@yahoo.com
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.kkprismayahooSATusername, UserCredentials.kkprismayahooSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUser.MinProfil_Start_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsNormalUser"})
	public void ClickStartButton() {

		//KLICKAR P� START
		PortalLoggedInAsUser.MinProfil_Start_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		//KLICKAR P� PERSONUPPGIFTER
		PortalLoggedInAsUser.MinProfil_Personuppgifter_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER UTBILDNING
		PortalLoggedInAsUser.MinProfil_Utbildning_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Utbildning_Forskarutbildning_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Utbildning_UtbildningP�GrundOch_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER ARBETSLIV
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Anst�llningar_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Postdoktorvistelser_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Forskarutbyten_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Uppeh�llIForskningen_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER PUBLIKATIONER
		PortalLoggedInAsUser.MinProfil_Publikationer_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Publikationer_Publikationer_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtm�rkelserButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MERITER OCH UTM�RKELSER
		PortalLoggedInAsUser.MinProfil_MeriterOchUtm�rkelser_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtm�rkelser_Docentur_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens_XpathXpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser_XpathXpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelserButton"})
	public void ClickImmaterialr�ttButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MERITER OCH UTM�RKELSER
		PortalLoggedInAsUser.MinProfil_Immaterialr�tt(driver).click();
		PortalLoggedInAsUser.MinProfil_Immaterialr�tt_Immaterialr�tt(driver).click();

	}


	@Test (dependsOnMethods={"ClickImmaterialr�ttButton"})
	public void ClickGranskarkompetens() {

		//KLICKAR P� ALLA RUBRIKER UNDER GRANSKARKOMPETENS
		while (driver.getPageSource().contains("Granskarkompetens")) {
			PortalLoggedInAsUser.MinProfil_Granskarkompetens(driver).click();
			break;
		}
	}

	@Test (dependsOnMethods={"ClickGranskarkompetens"})
	public void ClickAns�kningarOchBidrag() {

		//Klickar p� alla knappar som finns p� "Ans�kningar och bidrag" sidan
		PortalLoggedInAsUser.AnsokningarOchBidragButton_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragUtlysningarButton_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragAnsokningarButton_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragBidragButton_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragAns�kOmEtikpr�vning_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragEtikpr�vningsans�kningar_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickAns�kningarOchBidrag"})
	public void ClickGranskning() {

		//Klickar p� alla knappar som finns p� "Granskning" sidan
		PortalLoggedInAsUser.GranskningButton_Xpath(driver).click();
		PortalLoggedInAsUser.Granskning_Granskning_Xpath(driver).click();
		PortalLoggedInAsUser.GranskningBetalningsinformation_Xpath(driver).click();
		PortalLoggedInAsUser.GranskningArvoden_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		//Klickar p� alla knappar som finns p� "ORGANISATIONSUPPGIFTER" SIDAN
		PortalLoggedInAsUser.Organisationsuppifter_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationsuppifter_Signera_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationsuppifter_Rapportera_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		//Klickar p� alla knappar som finns p� "ORGANISATIONSKONTO" SIDAN
		PortalLoggedInAsUser.Organisationskonto_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Ans�kningarOchBidrag_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Nedladdning_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Struktur_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Anv�ndare_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Byt_Hemvist_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_F�reslagen_Hemvist_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Rapporterings�versikt_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Rapporteringsstruktur_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Signerings�versikt_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Signeringsstruktur_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Organisationsutlysningar_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Organisationsans�kningar_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Utbetalningar_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsUser.LoggaUt_Xpath(driver).click();

	}

}


