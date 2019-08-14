package testCasesSATButtonCheckOrgUser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsAdminMinProfil;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationsuppgifter;
import pageElementsSAT.PortalLoggedInAsUserLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserAns�kningarOchBidrag;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class ButtonCheckLoggedInAsUser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en organisationsanv�ndare och testar att alla synliga knappar �r klickbara";
		
	}

	@Test 
	public void ClickStartButton() {

		//KLICKAR P� START
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Start()).click();
	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		//KLICKAR P� PERSONUPPGIFTER
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Personuppgifter()).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER UTBILDNING
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�()).click();


	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER ARBETSLIV
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyten()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningen()).click();
	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER PUBLIKATIONER
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer()).click();
	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtm�rkelserButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MERITER OCH UTM�RKELSER
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelserButton"})
	public void ClickImmaterialr�ttButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MERITER OCH UTM�RKELSER
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt_Immaterialr�tt());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt_Immaterialr�tt()).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialr�ttButton"})
	public void ClickGranskarkompetensIfVisible() {

		while (driver.getPageSource().contains("Granskarkompetens")) {
			driver.findElement(
					PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens()).click();
			break;
		}
	}

	@Test (dependsOnMethods={"ClickGranskarkompetensIfVisible"})
	public void ClickAns�kningarOchBidrag() {

		//Klickar p� alla knappar som finns p� "Ans�kningar och bidrag" sidan
		driver.findElement(
				PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragButton()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragUtlysningarButton());
		
		driver.findElement(
				PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragUtlysningarButton()).click();
		driver.findElement(
				PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragAnsokningar()).click();
		driver.findElement(
				PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragBidrag()).click();
		driver.findElement(
				PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragAns�kOmEtikpr�vning()).click();
		driver.findElement(
				PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidragEtikpr�vningsans�kningar()).click();
		driver.findElement(
				PortalLoggedInAsUserAns�kningarOchBidrag.Ans�kningarOchBidrag�ndringsans�kningar()).click();
	}

	@Test (dependsOnMethods={"ClickAns�kningarOchBidrag"})
	public void ClickGranskning() {

		//Klickar p� alla knappar som finns p� "Granskning" sidan
		driver.findElement(PortalLoggedInAsUserGranskning.GranskningButton()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.Granskning_Granskning());
		
		driver.findElement(
				PortalLoggedInAsUserGranskning.Granskning_Granskning()).click();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformation()).click();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningArvoden()).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera());
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Rapportera()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		//Klickar p� alla knappar som finns p� "ORGANISATIONSKONTO" SIDAN
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
		
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Ans�kningarOchBidrag());
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Ans�kningarOchBidrag()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Nedladdning()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Byt_Hemvist()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_F�reslagen_Hemvist()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporterings�versikt()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsstruktur()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signerings�versikt()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsstruktur()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsutlysningar()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsans�kningar()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Utbetalningar()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		//LOGGAR UT

		driver.findElement(
				PortalLoggedInAsUserLoggaUt.LoggaUt()).click();
	}
}


