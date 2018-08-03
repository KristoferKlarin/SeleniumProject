package testCasesSATButtonCheck;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationsuppgifter;
import pageElementsSAT.PortalLoggedInAsUser;
import pageElementsSAT.PortalLoggedInAsUserAns�kningarOchBidrag;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class ButtonCheckLoggedInAsUser extends BeforeAfterTestBrowsers {

	@Test 
	public void LoginAsNormalUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
	}

	@Test (dependsOnMethods={"LoginAsNormalUser"})
	public void ClickStartButton() {

		//KLICKAR P� START
		PortalLoggedInAsUserMinProfil.MinProfil_Start(driver).click();
	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		//KLICKAR P� PERSONUPPGIFTER
		PortalLoggedInAsUserMinProfil.MinProfil_Personuppgifter(driver).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER UTBILDNING
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�(driver).click();

	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER ARBETSLIV
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyten(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningen(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER PUBLIKATIONER
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer(driver).click();

	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtm�rkelserButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MERITER OCH UTM�RKELSER
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter(driver).click();

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
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragButton(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragUtlysningarButton(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragAnsokningarButton(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragBidragButton(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragAns�kOmEtikpr�vning(driver).click();
		PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragEtikpr�vningsans�kningar(driver).click();
	}

	@Test (dependsOnMethods={"ClickAns�kningarOchBidrag"})
	public void ClickGranskning() {

		//Klickar p� alla knappar som finns p� "Granskning" sidan
		PortalLoggedInAsUserGranskning.GranskningButton(driver).click();
		PortalLoggedInAsUserGranskning.Granskning_Granskning(driver).click();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformation(driver).click();
		PortalLoggedInAsUserGranskning.GranskningArvoden(driver).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		//Klickar p� alla knappar som finns p� "ORGANISATIONSUPPGIFTER" SIDAN
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter(driver).click();
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera(driver).click();
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Rapportera(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		//Klickar p� alla knappar som finns p� "ORGANISATIONSKONTO" SIDAN
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Ans�kningarOchBidrag(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Nedladdning(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Byt_Hemvist(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_F�reslagen_Hemvist(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporterings�versikt(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsstruktur(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signerings�versikt(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsstruktur(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsutlysningar(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsans�kningar(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Utbetalningar(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsUser.LoggaUt(driver).click();

	}

}


