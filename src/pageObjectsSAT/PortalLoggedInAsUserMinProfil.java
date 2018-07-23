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
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation_Name = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation_Name(WebDriver driver){

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

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum_NAME = "DateDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum_NAME(WebDriver driver) {

		element = driver.findElement(By.name("DateDoctorsDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- DATUM F�R N�R FORSKNINGSKOMPETENS UPPN�TTS
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumN�rForskningskompetensUppn�tts_NAME = "CompetenceAchievedDate"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumN�rForskningskompetensUppn�tts_NAME(WebDriver driver) {

		element = driver.findElement(By.name("CompetenceAchievedDate"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - SVENSKA
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV_ID = "DescriptionCompetenceSV"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV_ID(WebDriver driver) {

		element = driver.findElement(By.id("DescriptionCompetenceSV"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - ENGELSKA
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN_ID = "DescriptionCompetenceEN"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN_ID(WebDriver driver) {

		element = driver.findElement(By.id("DescriptionCompetenceEN"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne1 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne1DropDownForskarUtbildning_ID = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_Utbildning_�mne1DropDownForskarUtbildning_ID(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne2 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne2DropDownForskarUtbildning_ID = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_Utbildning_�mne2DropDownForskarUtbildning_ID(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne3 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne3DropDownForskarUtbildning_ID = "SubjectId_select_2"; {
	}
	public static WebElement MinProfil_Utbildning_�mne3DropDownForskarUtbildning_ID(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_2"));
		return element;
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
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.active.menuItem-educationalhistory > div > ul > li:nth-child(2) > a"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.active.menuItem-educationalhistory > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - KNAPP F�R ATT L�GGA TILL L�GG TILL
	public static final String MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv�_CSS = "#basicEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillUtbildningP�GrundOchAvanceradNiv�_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#basicEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - �R F�R EXAMEN
	public static final String MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv��rF�rExamen_ID = "YearBasicDegree"; {
	}
	public static WebElement MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv��rF�rExamen_ID(WebDriver driver){

		element = driver.findElement(By.id("YearBasicDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE1 (DROPDOWN SELECT) 
	public static final String MinProfil_L�ggTillUtbildning_�mne1UtbildningP�GrundOchAvanceradNiv�_ID = "BasicTrainingId_select_0"; {
	}
	public static WebElement MinProfil_L�ggTillUtbildning_�mne1UtbildningP�GrundOchAvanceradNiv�_ID(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_0"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE 2 (DROPDOWN SELECT) 
	public static final String MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�_ID = "BasicTrainingId_select_1"; {
	}
	public static WebElement MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�_ID(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_1"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE 3 (DROPDOWN SELECT) 
	public static final String MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�_ID = "BasicTrainingId_select_2"; {
	}
	public static WebElement MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�_ID(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_2"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMEN
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Examen_ID = "BasicEducationDegree"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Examen_ID(WebDriver driver){

		element = driver.findElement(By.id("BasicEducationDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - SPECIALISTKOMPETENS
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens_ID = "SpecialistTrainingId"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens_ID(WebDriver driver){

		element = driver.findElement(By.id("SpecialistTrainingId"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - SPECIALISTKOMPETENS �R
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R_ID = "SpecialistTrainingYear"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R_ID(WebDriver driver){

		element = driver.findElement(By.id("SpecialistTrainingYear"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - OMR�DE/BESKRIVNING
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Omr�deBeskrivning_NAME = "SpecialistTrainingDescription"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Omr�deBeskrivning_NAME(WebDriver driver){

		element = driver.findElement(By.name("SpecialistTrainingDescription"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� -SPARAKNAPP
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�SparaKnapp_ID = "Submitter"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�SparaKnapp_ID(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
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

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - KNAPP L�GG TILL ANST�LLNING
	public static final String MinProfil_Arbetsliv_Anst�llningar_L�ggTill_CSS = "#employmentManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_L�ggTill_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#employmentManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - S�K ARBETSGIVARE
	public static final String MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare_NAME = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare_NAME(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - SPARA S�KT ARBETSGIVARE
	public static final String MinProfil_Arbetsliv_Anst�llningar_SparaS�kArbetsgivare_xpath = "//button[contains(text(), 'Spara val')]"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_SparaS�kArbetsgivare_xpath (WebDriver driver){

		element = driver.findElement(By.xpath("//button[contains(text(), 'Spara val')]"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNING DROPDOWN
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown_ID = "Position"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown_ID (WebDriver driver){

		element = driver.findElement(By.id("Position"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGSFORM DROPDOWN
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown_ID = "FormOfEmployment"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown_ID (WebDriver driver){

		element = driver.findElement(By.id("FormOfEmployment"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - DEL AV FORSKNING I ANST�LLNINGEN BASERAD P� HELTID (%)*
	public static final String MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid_ID = "PartOfResearchInEmployment"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid_ID(WebDriver driver){

		element = driver.findElement(By.id("PartOfResearchInEmployment"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS B�RJAN (YEAR)
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear_NAME = "StartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear_NAME(WebDriver driver){

		element = driver.findElement(By.name("StartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS B�RJAN (MONTH)
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth_NAME = "StartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth_NAME(WebDriver driver){

		element = driver.findElement(By.name("StartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS SLUT (YEAR)
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear_NAME = "EndDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear_NAME(WebDriver driver){

		element = driver.findElement(By.name("EndDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS SLUT (MONTH)
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth_NAME = "EndDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth_NAME(WebDriver driver){

		element = driver.findElement(By.name("EndDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - �VRIG INFORMATION
	public static final String MinProfil_Arbetsliv_Anst�llningar_�vrigInformation_ID = "OtherInformation"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_�vrigInformation_ID(WebDriver driver){

		element = driver.findElement(By.id("OtherInformation"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - SPARA ANST�LLNING
	public static final String MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning_ID = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning_ID(WebDriver driver){

		element = driver.findElement(By.name("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - L�GG TILL KNAPP
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserL�ggTill_CSS = "#postDoctorialManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserL�ggTill_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#postDoctorialManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - S�K ORGANISATION
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation_NAME = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation_NAME(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA S�Kt ORGANISATION
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation_Tagname = "Button"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation_Tagname(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 1 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser�mne1_ID = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser�mne_ID(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 2 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser�mne2_ID = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser�mne2_ID(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 3 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser�mne3_ID = "SubjectId_select_2"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser�mne3_ID(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_2"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART �R
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear_Name = "PeriodStartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear_Name(WebDriver driver){

		element = driver.findElement(By.name("PeriodStartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT �R
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear_Name = "PeriodStopDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear_Name(WebDriver driver){

		element = driver.findElement(By.name("PeriodStopDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART M�NAD
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth_Name = "PeriodStartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth_Name(WebDriver driver){

		element = driver.findElement(By.name("PeriodStartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT M�NAD
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth_Name = "PeriodStopDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth_Name(WebDriver driver){

		element = driver.findElement(By.name("PeriodStopDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA Postdoktorvistelser
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserSpara_ID = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserSpara_ID(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN
	public static final String MinProfil_Arbetsliv_Forskarutbyten_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyten_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - L�GG TILL KNAPP
	public static final String MinProfil_Arbetsliv_ForskarutbytenL�ggTill_CSS = "#ResearchExchangeManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenL�ggTill_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#ResearchExchangeManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - S�K ORGANISATION
	public static final String MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation_Name = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation_Name(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA S�KT ORGANISATION
	public static final String MinProfil_Arbetsliv_ForskarutbytenSparaS�ktOrganisation_Tagname = "Button"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenSparaS�ktOrganisation_Tagname(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 1 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Forskarutbyte�mne1_ID = "ScbTableId_select_0"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyte�mne1_ID(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_0"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 2 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Forskarutbyte�mne2_ID = "ScbTableId_select_1"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyte�mne2_ID(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_1"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 3 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Forskarutbyte�mne3_ID = "ScbTableId_select_2"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyte�mne3_ID(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_2"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - TYP (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbyteTyp_ID = "Type"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbyteTyp_ID(WebDriver driver){

		element = driver.findElement(By.id("Type"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (YEAR) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear_Name = "StartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytePeriodStartYear_Name(WebDriver driver){

		element = driver.findElement(By.name("StartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (MONTH) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth_Name = "StartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytePeriodStartMonth_Name(WebDriver driver){

		element = driver.findElement(By.name("StartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (YEAR) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear_Name = "StopDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear_Name(WebDriver driver){

		element = driver.findElement(By.name("StopDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (MONTH) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth_Name = "StopDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytePeriodSlutMonth_Name(WebDriver driver){

		element = driver.findElement(By.name("StopDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA FORSKARUTBYTE
	public static final String MinProfil_Arbetsliv_ForskarutbytenSpara_ID = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenSpara_ID(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningen_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningen_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - L�GG TILL KNAPP
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenL�ggTill_Css = "#InterruptionInResearchManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenL�ggTill_Css(WebDriver driver){

		element = driver.findElement(By.cssSelector("#InterruptionInResearchManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - STARTDATUM
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum_Name = "StartDate"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum_Name (WebDriver driver){

		element = driver.findElement(By.name("StartDate"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SLUTDATUM
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum_Name = "EndDate"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum_Name(WebDriver driver){

		element = driver.findElement(By.name("EndDate"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SLUTDATUM
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning_Id = "Description"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning_Id(WebDriver driver){

		element = driver.findElement(By.id("Description"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SPARA
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenSpara_Id = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenSpara_Id(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
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

	//MIN PROFIL - PUBLIKATIONER - L�GG TILL
	public static final String MinProfil_Publikationer_L�ggTill_Css = "#PublicationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Publikationer_L�ggTill_Css(WebDriver driver){

		element = driver.findElement(By.cssSelector("#PublicationManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONSTYP
	public static final String MinProfil_Publikationer_Publikationstyp_Id = "PublicationType"; {
	}
	public static WebElement MinProfil_Publikationer_Publikationstyp_Id(WebDriver driver){

		element = driver.findElement(By.id("PublicationType"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static final String MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown_Id = "PublicationFormPeerReviewed"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown_Id(WebDriver driver){

		element = driver.findElement(By.id("PublicationFormPeerReviewed"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION -  INTE FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static final String MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id = "PublicationFormNotPeerReviewed"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id(WebDriver driver){

		element = driver.findElement(By.id("PublicationFormNotPeerReviewed"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - TITEL
	public static final String MinProfil_Publikationer_VetenskapligPublikationTitel_Id = "Title"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationTitel_Id (WebDriver driver){

		element = driver.findElement(By.id("Title"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp_Id = "btnAuthorAdd"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp_Id (WebDriver driver){

		element = driver.findElement(By.id("btnAuthorAdd"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-F�RNAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn_Id = "Authors_0__FirstName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn_Id(WebDriver driver){

		element = driver.findElement(By.id("Authors_0__FirstName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-EFTERNAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn_Id = "Authors_0__LastName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn_Id(WebDriver driver){

		element = driver.findElement(By.id("Authors_0__LastName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - NAMN P� TIDSKRIFT
	public static final String MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift_Id = "JournalName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift_Id(WebDriver driver){

		element = driver.findElement(By.id("JournalName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VOLYM
	public static final String MinProfil_Publikationer_VetenskapligPublikationVolym_Id = "Volume"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationVolym_Id(WebDriver driver){

		element = driver.findElement(By.id("Volume"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTF�RDANDENUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer_Id = "IssueNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer_Id(WebDriver driver){

		element = driver.findElement(By.id("IssueNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKT�R-KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp_Id = "btnEditorAdd"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp_Id(WebDriver driver){

		element = driver.findElement(By.id("btnEditorAdd"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKT�R-NAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn_Id = "Editors_0__Name"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn_Id(WebDriver driver){

		element = driver.findElement(By.id("Editors_0__Name"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RLAG
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rlag_Id = "PublishingHouse"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rlag_Id(WebDriver driver){

		element = driver.findElement(By.id("PublishingHouse"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RLAGSPLATS
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats_Id = "PublishingPlace"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats_Id(WebDriver driver){

		element = driver.findElement(By.id("PublishingPlace"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RSTA SIDNUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer_Id = "FirstPageNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer_Id(WebDriver driver){

		element = driver.findElement(By.id("FirstPageNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SISTA SIDNUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer_Id = "LastPageNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer_Id(WebDriver driver){

		element = driver.findElement(By.id("LastPageNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - ISBN
	public static final String MinProfil_Publikationer_VetenskapligPublikationISBN_Id = "Isbn"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationISBN_Id(WebDriver driver){

		element = driver.findElement(By.id("Isbn"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOI
	public static final String MinProfil_Publikationer_VetenskapligPublikationDOI_Id = "Doi"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationDOI_Id(WebDriver driver){

		element = driver.findElement(By.id("Doi"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTGIVARE-STATUS(DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationStatus_Id = "MagazineStatus"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationStatus_Id(WebDriver driver){

		element = driver.findElement(By.id("MagazineStatus"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - K�LLA F�R PUBLIKATION (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation_Id = "SourceImportedDocument"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation_Id(WebDriver driver){

		element = driver.findElement(By.id("SourceImportedDocument"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - K�LLA ID
	public static final String MinProfil_Publikationer_VetenskapligPublikationK�llaID_Id = "Source"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationK�llaID_Id(WebDriver driver){

		element = driver.findElement(By.id("Source"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VAR TEXTEN PUBLICERAD I OPEN ACCESS (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown_Id = "OpenAccessStatus"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown_Id(WebDriver driver){

		element = driver.findElement(By.id("OpenAccessStatus"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - L�NK/EXTERN L�NK F�R PUBLICERING
	public static final String MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering_Id = "LinkExternal"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering_Id(WebDriver driver){

		element = driver.findElement(By.id("LinkExternal"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FORM AV OA (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationFormAvOA_Id = "OAForm"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFormAvOA_Id(WebDriver driver){

		element = driver.findElement(By.id("OAForm"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOKUMENTVERSION (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationDokumentversion_Id = "DocumentVersion"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationDokumentversion_Id(WebDriver driver){

		element = driver.findElement(By.id("DocumentVersion"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SAMMANFATTNING
	public static final String MinProfil_Publikationer_VetenskapligPublikationSammanfattning_Id = "Abstract"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSammanfattning_Id(WebDriver driver){

		element = driver.findElement(By.id("Abstract"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SPARA KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationSpara_Id = "Submitter"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSpara_Id(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
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

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - L�GG TILL KNAPP
	public static final String MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill_Css = "#associateProfessorManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill_Css(WebDriver driver){

		element = driver.findElement(By.cssSelector("#associateProfessorManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - S�K ORGANISATION
	public static final String MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation_Name = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation_Name(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - SPARA S�KT ORGANISATION
	public static final String MinProfil_MeriterOchUtm�rkelser_DocenturSparaS�ktOrganisation_Tagname = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_DocenturSparaS�ktOrganisation_Tagname(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �MNE1
	public static final String MinProfil_MeriterOchUtm�rkelser_Docentur�mne1_Id = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Docentur�mne1_Id(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �MNE2
	public static final String MinProfil_MeriterOchUtm�rkelser_Docentur�mne2_Id = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Docentur�mne2_Id(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �R
	public static final String MinProfil_MeriterOchUtm�rkelser_Docentur�r_Id = "Year"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Docentur�r_Id(WebDriver driver){

		element = driver.findElement(By.id("Year"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - SPARA
	public static final String MinProfil_MeriterOchUtm�rkelser_DocenturSpara_Id = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_DocenturSpara_Id(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - L�GG TILL ENSKILD PERSON KNAPP
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp_Css = "#supervisedPersonManagementSectionId > div.row-fluid.button-wrapper > div > a:nth-child(1)"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp_Css(WebDriver driver){

		element = driver.findElement(By.cssSelector("#supervisedPersonManagementSectionId > div.row-fluid.button-wrapper > div > a:nth-child(1)"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - S�K L�ROS�TE HANDLEDARE
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationHandledare_Name = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationHandledare_Name(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA S�KT L�ROS�TE HANDLEDARE
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationHandledare_Tagname = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationHandledare_Tagname(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - S�K L�ROS�TE STUDENT/DOKTORAND/POSTDOK
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationStudent_Name = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationStudent_Name(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA S�KT L�ROS�TE STUDENT
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationStudent_Tagname = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationStudent_Tagname(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - F�RNAMN
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn_Id = "FirstName"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn_Id(WebDriver driver){

		element = driver.findElement(By.id("FirstName"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - F�RNAMN
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn_Id = "LastName"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn_Id(WebDriver driver){

		element = driver.findElement(By.id("LastName"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SLUT�R
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r_Id = "SupervisionEndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r_Id(WebDriver driver){

		element = driver.findElement(By.id("SupervisionEndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - TYP AV HANDLEDDA PERSONER
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson_Id = "TypeId"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson_Id(WebDriver driver){

		element = driver.findElement(By.id("TypeId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - ROLL
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll_Id = "RoleId"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll_Id(WebDriver driver){

		element = driver.findElement(By.id("RoleId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA ENSKILD PERSON
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson_Id = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson_Id(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}


	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens_XpathXpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - L�GG TILL
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensL�ggTill_Css = "#ResearchGrantsAwardedInCompetitionManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensL�ggTill_Css(WebDriver driver){

		element = driver.findElement(By.cssSelector("#ResearchGrantsAwardedInCompetitionManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - FINANSI�R DROPDOWN 1
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown1_Name = "FunderId_select_0"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown1_Name(WebDriver driver){

		element = driver.findElement(By.name("FunderId_select_0"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - FINANSI�R DROPDOWN 2
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown2_Name = "FunderId_select_1"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown2_Name(WebDriver driver){

		element = driver.findElement(By.name("FunderId_select_1"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - PROJEKTLEDARE
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjektledare_Id = "Applicant"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjektledare_Id(WebDriver driver){

		element = driver.findElement(By.id("Applicant"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - LAND
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensLand_Id = "OtherCountry"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensLand_Id(WebDriver driver){

		element = driver.findElement(By.id("OtherCountry"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - PROJEKTTITEL
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjekttitel_Id = "ProjectTitle"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjekttitel_Id(WebDriver driver){

		element = driver.findElement(By.id("ProjectTitle"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - DNR
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDnr_Id = "DiaryNumber"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDnr_Id(WebDriver driver){

		element = driver.findElement(By.id("DiaryNumber"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - START�R
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensStart�r_Id = "PeriodStartYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensStart�r_Id(WebDriver driver){

		element = driver.findElement(By.id("PeriodStartYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - SLUT�R
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSlut�r_Id = "PeriodEndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSlut�r_Id(WebDriver driver){

		element = driver.findElement(By.id("PeriodEndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - DIN ROLL
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDinRoll_Id = "RoleId"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDinRoll_Id(WebDriver driver){

		element = driver.findElement(By.id("RoleId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - TOTALT BELOPP (KR)
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensTotaltBeloppKr_Id = "Amount"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensTotaltBeloppKr_Id(WebDriver driver){

		element = driver.findElement(By.id("Amount"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - SPARA
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSpara_Id = "Create"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSpara_Id(WebDriver driver){

		element = driver.findElement(By.id("Create"));
		return element;
	}




	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser_XpathXpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - L�GG TILL
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserL�ggTill_Css= "#AwardAndDistinctionManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserL�ggTill_Css(WebDriver driver){

		element = driver.findElement(By.cssSelector("#AwardAndDistinctionManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - �R
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser�r_Id= "YearOfAward"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser�r_Id(WebDriver driver){

		element = driver.findElement(By.id("YearOfAward"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - LAND
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserLand_Id= "selectedCountryDropDown"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserLand_Id(WebDriver driver){

		element = driver.findElement(By.id("selectedCountryDropDown"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - NAMN P� PRISET/UTM�RKELSEN
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserNamnP�Priset_Id= "Award"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserNamnP�Priset_Id(WebDriver driver){

		element = driver.findElement(By.id("Award"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - UTF�RDARE
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserUtf�rdare_Id= "Issuer"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserUtf�rdare_Id(WebDriver driver){

		element = driver.findElement(By.id("Issuer"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - BESKRIVNING
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserBeskrivning_Id= "Description"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserBeskrivning_Id(WebDriver driver){

		element = driver.findElement(By.id("Description"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - SPARA
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserSpara_Id= "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserSpara_Id(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}




	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - L�GG TILL
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterL�ggTill_Css = "#RelevantAndOtherMeritsManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterL�ggTill_Css(WebDriver driver){

		element = driver.findElement(By.cssSelector("#RelevantAndOtherMeritsManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - START�R
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterStart�r_Id = "StartYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterStart�r_Id(WebDriver driver){

		element = driver.findElement(By.id("StartYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - SLUT�R
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r_Id = "EndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r_Id(WebDriver driver){

		element = driver.findElement(By.id("EndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - TYP AV MERIT
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit_Name = "OtherMerits"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit_Name(WebDriver driver){

		element = driver.findElement(By.name("OtherMerits"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - BESKRIVNING
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning_Id = "RelevantMerits"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning_Id(WebDriver driver){

		element = driver.findElement(By.name("RelevantMerits"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - SPARA
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara_Id = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara_Id(WebDriver driver){

		element = driver.findElement(By.name("Submitter"));
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

	//MIN PROFIL - IMMATERIALR�TT - L�GG TILL
	public static final String MinProfil_Immaterialr�ttL�ggTill_Css = "#patentManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Immaterialr�ttL�ggTill_Css(WebDriver driver){

		element = driver.findElement(By.cssSelector("#patentManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - TYP
	public static final String MinProfil_Immaterialr�ttTyp_Id = "Type"; {
	}
	public static WebElement MinProfil_Immaterialr�ttTyp_Id(WebDriver driver){

		element = driver.findElement(By.id("Type"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - ID
	public static final String MinProfil_Immaterialr�ttId_Id = "IPNumber"; {
	}
	public static WebElement MinProfil_Immaterialr�ttId_Id(WebDriver driver){

		element = driver.findElement(By.id("IPNumber"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - DATUM F�R BEVILJANDE
	public static final String MinProfil_Immaterialr�ttDatumF�rBeviljande_Name = "DateApproved"; {
	}
	public static WebElement MinProfil_Immaterialr�ttDatumF�rBeviljande_Name(WebDriver driver){

		element = driver.findElement(By.name("DateApproved"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - PRODUKTKLASSIFICERING 1
	public static final String MinProfil_Immaterialr�ttProduktKlassificering1_Name = "ProductClassificationId_select_0"; {
	}
	public static WebElement MinProfil_Immaterialr�ttProduktKlassificering1_Name(WebDriver driver){

		element = driver.findElement(By.name("ProductClassificationId_select_0"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - PRODUKTKLASSIFICERING 2
	public static final String MinProfil_Immaterialr�ttProduktKlassificering2_Name = "ProductClassificationId_select_1"; {
	}
	public static WebElement MinProfil_Immaterialr�ttProduktKlassificering2_Name(WebDriver driver){

		element = driver.findElement(By.name("ProductClassificationId_select_1"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - LICENSIERAD TILL ANNAN
	public static final String MinProfil_Immaterialr�ttLicensieradTillAnnan_Id = "LicensedToOtherPart"; {
	}
	public static WebElement MinProfil_Immaterialr�ttLicensieradTillAnnan_Id(WebDriver driver){

		element = driver.findElement(By.id("LicensedToOtherPart"));
		return element;
	}
	
	//MIN PROFIL - IMMATERIALR�TT - LICENSIERAD TILL ANNAN DROPDOWN
		public static final String MinProfil_Immaterialr�ttLicensieradTillAnnanDropwDown_Id = "LicensedToOtherTypeId"; {
		}
		public static WebElement MinProfil_Immaterialr�ttLicensieradTillAnnanDropwDown_Id(WebDriver driver){

			element = driver.findElement(By.id("LicensedToOtherTypeId"));
			return element;
		}

		//MIN PROFIL - IMMATERIALR�TT - SPARA
				public static final String MinProfil_Immaterialr�ttSpara_Id = "Submitter"; {
				}
				public static WebElement MinProfil_Immaterialr�ttSpara_Id(WebDriver driver){

					element = driver.findElement(By.id("Submitter"));
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

