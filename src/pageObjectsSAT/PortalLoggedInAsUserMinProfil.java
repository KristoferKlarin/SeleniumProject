package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsUserMinProfil {
	private static WebElement element = null;


	//MIN PROFIL - KNAPPEN
	public static final String MinProfil_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[1]"; {
	}
	public static WebElement MinProfil_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[1]"));
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
	//MIN PROFIL - UTBILDNING - KNAPP F�R ATT L�GGA TILL FORSKARUTBILDNING
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_CSS = "#researchEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#researchEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - KNAPP F�R ATT L�GGA TILL FORSKARUTBILDNING - S�K ORGANISATION
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - L�GG TILL FORSKARUTBILDNING - KNAPP F�R ATT SPARA S�KT ORGANISATION
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp_Tagname= "button"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp_Tagname(WebDriver driver) {

		element = driver.findElement(By.tagName("button"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING TYP (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_TypDropDownForskarUtbildning_ID = "Type"; {
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN - EXAMENSDATUM
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatexamenExamensdatum_NAME = "DateDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatexamenExamensdatum_NAME(WebDriver driver) {

		element = driver.findElement(By.name("DateDoctorsDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne1 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne1DropDownForskarUtbildning_ID = "SubjectId_select_0"; {
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne2 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne2DropDownForskarUtbildning_ID = "SubjectId_select_1"; {
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne3 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne3DropDownForskarUtbildning_ID = "SubjectId_select_2"; {
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ORGINALSPR�K)
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k_ID = "TitleDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k_ID(WebDriver driver) {

		element = driver.findElement(By.id("TitleDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ENGELSKA)
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska_ID = "TitleDoctorsDegreeEN"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska_ID(WebDriver driver) {

		element = driver.findElement(By.id("TitleDoctorsDegreeEN"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - ISSN/ISBN-NUMMER
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer_ID = "IsbnNumber"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer_ID(WebDriver driver) {

		element = driver.findElement(By.id("IsbnNumber"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - F�RNAMN HANDLEDARE
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare_ID = "FirstNameSupervisorDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare_ID(WebDriver driver) {

		element = driver.findElement(By.id("FirstNameSupervisorDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - EFTERNAMN HANDLEDARE
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare_ID = "LastNameSupervisorDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare_ID(WebDriver driver) {

		element = driver.findElement(By.id("LastNameSupervisorDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - SPARA FORSKARUTBILDNINGKNAPP
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_SparaForskarUtbildningButton_ID = "CreateExamPost"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_SparaForskarUtbildningButton_ID(WebDriver driver) {

		element = driver.findElement(By.id("CreateExamPost"));
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



}

