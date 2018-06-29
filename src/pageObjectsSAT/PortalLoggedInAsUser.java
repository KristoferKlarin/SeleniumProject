package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsUser {
	private static WebElement element = null;


	//MIN PROFIL - KNAPPEN
	public static final String MinProfil_Xpath = "/html/body/div[5]/div[1]/div[2]/header/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/header/ul/li[1]/a"));
		return element;
	}

	//MIN PROFIL - START
	public static final String MinProfil_Start_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement MinProfil_Start_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//MIN PROFIL - PERSONUPPGIFTER
	public static final String MinProfil_Personuppgifter_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement MinProfil_Personuppgifter_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING
	public static final String MinProfil_Utbildning_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement MinProfil_Utbildning_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING
	public static final String MinProfil_Utbildning_Forskarutbildning_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_Utbildning_Forskarutbildning_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[1]/a"));
		return element;

	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV�	
	public static final String MinProfil_Utbildning_UtbildningP�GrundOch_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOch_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[2]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV
	public static final String MinProfil_Arbetsliv_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;

	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR
	public static final String MinProfil_Arbetsliv_Anst�llningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[1]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a"));
		return element;
	}
	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN
	public static final String MinProfil_Arbetsliv_Forskarutbyten_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyten_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a"));
		return element;
	}
	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningen_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningen_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER
	public static final String MinProfil_Publikationer_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement MinProfil_Publikationer_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONER
	public static final String MinProfil_Publikationer_Publikationer_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/ul/li/a"; {
	}
	public static WebElement MinProfil_Publikationer_Publikationer_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/ul/li/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER
	public static final String MinProfil_MeriterOchUtm�rkelser_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR
	public static final String MinProfil_MeriterOchUtm�rkelser_Docentur_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Docentur_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[1]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - Bidrag Erh�llna I Konkurrens
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens_XpathXpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a"));
		return element;
	}
	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser_XpathXpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a"));
		return element;
	}
	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT
	public static final String MinProfil_Immaterialr�tt = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"; {
	}
	public static WebElement MinProfil_Immaterialr�tt(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"));
		return element;
	}
	//MIN PROFIL - IMMATERIALR�TT - IMMATERIALR�TT
	public static final String MinProfil_Immaterialr�tt_Immaterialr�tt = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/ul/li/a"; {
	}
	public static WebElement MinProfil_Immaterialr�tt_Immaterialr�tt(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/ul/li/a"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS
	public static final String MinProfil_Granskarkompetens = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"; {
	}
	public static WebElement MinProfil_Granskarkompetens(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - KNAPPEN
	public static final String Ans�kningarOchBidragButton_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[2]/a"; {
	}
	public static WebElement AnsokningarOchBidragButton_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[2]/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - UTLYSNINGAR
	public static final String AnsokningarOchBidragUtlysningarButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement AnsokningarOchBidragUtlysningarButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ANS�KNINGAR
	public static final String AnsokningarOchBidragAnsokningarButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement AnsokningarOchBidragAnsokningarButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - BIDRAG
	public static final String AnsokningarOchBidragBidragButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement AnsokningarOchBidragBidragButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ANS�KAN OM ETIKPR�VNING
	public static final String AnsokningarOchBidragAns�kOmEtikpr�vning_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement AnsokningarOchBidragAns�kOmEtikpr�vning_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ETIKPR�VNINGSANS�KNINGAR
	public static final String AnsokningarOchBidragEtikpr�vningsans�kningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement AnsokningarOchBidragEtikpr�vningsans�kningar_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//GRANSKNING - KNAPPEN
	public static final String GranskningButton_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[3]/a"; {
	}
	public static WebElement GranskningButton_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[3]/a"));
		return element;
	}

	//GRANSKNING - GRANSKNING
	public static final String Granskning_Granskning_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"; {
	}
	public static WebElement Granskning_Granskning_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION
	public static final String GranskningBetalningsinformation_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"; {
	}
	public static WebElement GranskningBetalningsinformation_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"));
		return element;
	}

	//GRANSKNING - ARVODEN
	public static final String GranskningArvoden_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"; {
	}
	public static WebElement GranskningArvoden_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"));
		return element;
	}

	//ORGANISATIONSUPPGIFTER - KNAPPEN
	public static final String Organisationsuppifter_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[5]/a"; {
	}
	public static WebElement Organisationsuppifter_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[5]/a"));
		return element;
	}

	//ORGANISATIONSUPPGIFTER - SIGNERA
	public static final String Organisationsuppifter_Signera_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement Organisationsuppifter_Signera_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//ORGANISATIONSUPPGIFTER - RAPPORTERA
	public static final String Organisationsuppifter_Rapportera_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement Organisationsuppifter_Rapportera_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - KNAPPEN
	public static final String Organisationskonto_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[4]/a"; {
	}
	public static WebElement Organisationskonto_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[4]/a"));
		return element;
	}
	//ORGANISATIONSKONTO - INST�LLNINGAR
	public static final String Organisationskonto_Inst�llningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement Organisationskonto_Inst�llningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}
	//ORGANISATIONSKONTO - ANS�KNINGAR OCH BIDRAG
	public static final String Organisationskonto_Ans�kningarOchBidrag_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement Organisationskonto_Ans�kningarOchBidrag_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - NEDLADDNING
	public static final String Organisationskonto_Nedladdning_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement Organisationskonto_Nedladdning_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR
	public static final String Organisationskonto_Struktur_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement Organisationskonto_Struktur_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ANV�NDARE
	public static final String Organisationskonto_Anv�ndare_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement Organisationskonto_Anv�ndare_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - BYT HEMVIST
	public static final String Organisationskonto_Byt_Hemvist_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement Organisationskonto_Byt_Hemvist_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - F�RESLAGEN HEMVIST
	public static final String Organisationskonto_F�reslagen_Hemvist_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"; {
	}
	public static WebElement Organisationskonto_F�reslagen_Hemvist_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGS�VERSIKT
	public static final String Organisationskonto_Rapporterings�versikt_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"; {
	}
	public static WebElement Organisationskonto_Rapporterings�versikt_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSSTRUKTUR
	public static final String Organisationskonto_Rapporteringsstruktur_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a"; {
	}
	public static WebElement Organisationskonto_Rapporteringsstruktur_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGS�VERSIKT
	public static final String Organisationskonto_Signerings�versikt_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a"; {
	}
	public static WebElement Organisationskonto_Signerings�versikt_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSSTRUKTUR
	public static final String Organisationskonto_Signeringsstruktur_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a"; {
	}
	public static WebElement Organisationskonto_Signeringsstruktur_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSUTLYSNINGAR
	public static final String Organisationskonto_Organisationsutlysningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a"; {
	}
	public static WebElement Organisationskonto_Organisationsutlysningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSANS�KNINGAR
	public static final String Organisationskonto_Organisationsans�kningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a"; {
	}
	public static WebElement Organisationskonto_Organisationsans�kningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - UTBETALNINGAR
	public static final String Organisationskonto_Utbetalningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a"; {
	}
	public static WebElement Organisationskonto_Utbetalningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a"));
		return element;
	}

	//LOGGA UT - KNAPPEN
	public static final String LoggaUt_Xpath = "/html/body/div[5]/div[2]/div[2]/header/div/a"; {
	}
	public static WebElement LoggaUt_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/a"));
		return element;
	}

}

