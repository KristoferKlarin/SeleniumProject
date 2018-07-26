package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsUserMinProfil {
	private static WebElement element = null;


	//MIN PROFIL - KNAPPEN
	public static final String MinProfil = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfile.active > a"; {
	}
	public static WebElement MinProfil(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfile.active > a"));
		return element;
	}

	//MIN PROFIL - START
	public static final String MinProfil_Start = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement MinProfil_Start(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//MIN PROFIL - PERSONUPPGIFTER
	public static final String MinProfil_Personuppgifter = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement MinProfil_Personuppgifter(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING
	public static final String MinProfil_Utbildning = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement MinProfil_Utbildning(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING
	public static final String MinProfil_Utbildning_Forskarutbildning = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_Utbildning_Forskarutbildning(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[1]/a"));
		return element;

	}
	//MIN PROFIL - UTBILDNING - KNAPP F�R ATT L�GGA TILL FORSKARUTBILDNING
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning = "#researchEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning(WebDriver driver){

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
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp= "button"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp(WebDriver driver) {

		element = driver.findElement(By.tagName("button"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING TYP (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_TypDropDownForskarUtbildning = "Type"; {
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum = "DateDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum(WebDriver driver) {

		element = driver.findElement(By.name("DateDoctorsDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM - �R (DROPDOWN)
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum�rDropdown = "#ui-datepicker-div > div > div > select.ui-datepicker-year"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum�rDropdown(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year"));
		return element;
	}
	
	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM - M�NAD (DROPDOWN)
		public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumM�nadDropdown = "#ui-datepicker-div > div > div > select.ui-datepicker-month"; {
		}
		public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumM�nadDropdown(WebDriver driver) {

			element = driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month"));
			return element;
		}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- DATUM F�R N�R FORSKNINGSKOMPETENS UPPN�TTS
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumN�rForskningskompetensUppn�tts = "CompetenceAchievedDate"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumN�rForskningskompetensUppn�tts(WebDriver driver) {

		element = driver.findElement(By.name("CompetenceAchievedDate"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - SVENSKA
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV = "DescriptionCompetenceSV"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV(WebDriver driver) {

		element = driver.findElement(By.id("DescriptionCompetenceSV"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - ENGELSKA
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN = "DescriptionCompetenceEN"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN(WebDriver driver) {

		element = driver.findElement(By.id("DescriptionCompetenceEN"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne1 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne1DropDownForskarUtbildning = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_Utbildning_�mne1DropDownForskarUtbildning(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne2 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne2DropDownForskarUtbildning = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_Utbildning_�mne2DropDownForskarUtbildning(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne3 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_�mne3DropDownForskarUtbildning = "SubjectId_select_2"; {
	}
	public static WebElement MinProfil_Utbildning_�mne3DropDownForskarUtbildning(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_2"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ORGINALSPR�K)
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k = "TitleDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k(WebDriver driver) {

		element = driver.findElement(By.id("TitleDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ENGELSKA)
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska = "TitleDoctorsDegreeEN"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska(WebDriver driver) {

		element = driver.findElement(By.id("TitleDoctorsDegreeEN"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - ISSN/ISBN-NUMMER
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer = "IsbnNumber"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer(WebDriver driver) {

		element = driver.findElement(By.id("IsbnNumber"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - F�RNAMN HANDLEDARE
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare = "FirstNameSupervisorDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare(WebDriver driver) {

		element = driver.findElement(By.id("FirstNameSupervisorDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - EFTERNAMN HANDLEDARE
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare = "LastNameSupervisorDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare(WebDriver driver) {

		element = driver.findElement(By.id("LastNameSupervisorDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - SPARA FORSKARUTBILDNINGKNAPP
	public static final String MinProfil_Utbildning_L�ggTillForskarutbildning_SparaForskarUtbildningButton = "CreateExamPost"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillForskarutbildning_SparaForskarUtbildningButton(WebDriver driver) {

		element = driver.findElement(By.id("CreateExamPost"));
		return element;
	}


	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV�	
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv� = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.active.menuItem-educationalhistory > div > ul > li:nth-child(2) > a"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.active.menuItem-educationalhistory > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - KNAPP F�R ATT L�GGA TILL L�GG TILL
	public static final String MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv� = "#basicEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Utbildning_L�ggTillUtbildningP�GrundOchAvanceradNiv�(WebDriver driver){

		element = driver.findElement(By.cssSelector("#basicEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - �R F�R EXAMEN
	public static final String MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv��rF�rExamen = "YearBasicDegree"; {
	}
	public static WebElement MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv��rF�rExamen(WebDriver driver){

		element = driver.findElement(By.id("YearBasicDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE1 (DROPDOWN SELECT) 
	public static final String MinProfil_L�ggTillUtbildning_�mne1UtbildningP�GrundOchAvanceradNiv� = "BasicTrainingId_select_0"; {
	}
	public static WebElement MinProfil_L�ggTillUtbildning_�mne1UtbildningP�GrundOchAvanceradNiv�(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_0"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE 2 (DROPDOWN SELECT) 
	public static final String MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv� = "BasicTrainingId_select_1"; {
	}
	public static WebElement MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_1"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE 3 (DROPDOWN SELECT) 
	public static final String MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv� = "BasicTrainingId_select_2"; {
	}
	public static WebElement MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_2"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMEN
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Examen = "BasicEducationDegree"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Examen(WebDriver driver){

		element = driver.findElement(By.id("BasicEducationDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - SPECIALISTKOMPETENS
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens = "SpecialistTrainingId"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens(WebDriver driver){

		element = driver.findElement(By.id("SpecialistTrainingId"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - SPECIALISTKOMPETENS �R
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R = "SpecialistTrainingYear"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R(WebDriver driver){

		element = driver.findElement(By.id("SpecialistTrainingYear"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - OMR�DE/BESKRIVNING
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Omr�deBeskrivning = "SpecialistTrainingDescription"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Omr�deBeskrivning(WebDriver driver){

		element = driver.findElement(By.name("SpecialistTrainingDescription"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� -SPARAKNAPP
	public static final String MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�SparaKnapp = "Submitter"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�SparaKnapp(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV
	public static final String MinProfil_Arbetsliv = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement MinProfil_Arbetsliv(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;

	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR
	public static final String MinProfil_Arbetsliv_Anst�llningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[1]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - KNAPP L�GG TILL ANST�LLNING
	public static final String MinProfil_Arbetsliv_Anst�llningar_L�ggTill = "#employmentManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_L�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#employmentManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - S�K ARBETSGIVARE
	public static final String MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - SPARA S�KT ARBETSGIVARE
	public static final String MinProfil_Arbetsliv_Anst�llningar_SparaS�kArbetsgivare = "//button[contains(text(), 'Spara val')]"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_SparaS�kArbetsgivare (WebDriver driver){

		element = driver.findElement(By.xpath("//button[contains(text(), 'Spara val')]"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNING DROPDOWN
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown = "Position"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown (WebDriver driver){

		element = driver.findElement(By.id("Position"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGSFORM DROPDOWN
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown = "FormOfEmployment"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown (WebDriver driver){

		element = driver.findElement(By.id("FormOfEmployment"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - DEL AV FORSKNING I ANST�LLNINGEN BASERAD P� HELTID (%)*
	public static final String MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid = "PartOfResearchInEmployment"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid(WebDriver driver){

		element = driver.findElement(By.id("PartOfResearchInEmployment"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS B�RJAN (YEAR)
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear = "StartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear(WebDriver driver){

		element = driver.findElement(By.name("StartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS B�RJAN (MONTH)
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth = "StartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth(WebDriver driver){

		element = driver.findElement(By.name("StartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS SLUT (YEAR)
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear = "EndDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear(WebDriver driver){

		element = driver.findElement(By.name("EndDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS SLUT (MONTH)
	public static final String MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth = "EndDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth(WebDriver driver){

		element = driver.findElement(By.name("EndDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - �VRIG INFORMATION
	public static final String MinProfil_Arbetsliv_Anst�llningar_�vrigInformation = "OtherInformation"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_�vrigInformation(WebDriver driver){

		element = driver.findElement(By.id("OtherInformation"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - SPARA ANST�LLNING
	public static final String MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning(WebDriver driver){

		element = driver.findElement(By.name("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - L�GG TILL KNAPP
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserL�ggTill = "#postDoctorialManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserL�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#postDoctorialManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - S�K ORGANISATION
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA S�Kt ORGANISATION
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserSparaS�ktOrganisation = "Button"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserSparaS�ktOrganisation(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 1 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser�mne1 = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser�mne1(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 2 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser�mne2 = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser�mne2(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 3 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser�mne3 = "SubjectId_select_2"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser�mne3(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_2"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART �R
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear = "PeriodStartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear(WebDriver driver){

		element = driver.findElement(By.name("PeriodStartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT �R
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear = "PeriodStopDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear(WebDriver driver){

		element = driver.findElement(By.name("PeriodStopDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART M�NAD
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth = "PeriodStartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth(WebDriver driver){

		element = driver.findElement(By.name("PeriodStartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT M�NAD
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth = "PeriodStopDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth(WebDriver driver){

		element = driver.findElement(By.name("PeriodStopDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA Postdoktorvistelser
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN
	public static final String MinProfil_Arbetsliv_Forskarutbyten = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyten(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - L�GG TILL KNAPP
	public static final String MinProfil_Arbetsliv_ForskarutbytenL�ggTill = "#ResearchExchangeManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenL�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#ResearchExchangeManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - S�K ORGANISATION
	public static final String MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA S�KT ORGANISATION
	public static final String MinProfil_Arbetsliv_ForskarutbytenSparaS�ktOrganisation = "Button"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenSparaS�ktOrganisation(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 1 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Forskarutbyte�mne1 = "ScbTableId_select_0"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyte�mne1(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_0"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 2 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Forskarutbyte�mne2 = "ScbTableId_select_1"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyte�mne2(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_1"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 3 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_Forskarutbyte�mne3 = "ScbTableId_select_2"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyte�mne3(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_2"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - TYP (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbyteTyp = "Type"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbyteTyp(WebDriver driver){

		element = driver.findElement(By.id("Type"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (YEAR) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear = "StartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear(WebDriver driver){

		element = driver.findElement(By.name("StartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (MONTH) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth = "StartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth(WebDriver driver){

		element = driver.findElement(By.name("StartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (YEAR) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear = "StopDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear(WebDriver driver){

		element = driver.findElement(By.name("StopDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (MONTH) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth = "StopDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth(WebDriver driver){

		element = driver.findElement(By.name("StopDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA FORSKARUTBYTE
	public static final String MinProfil_Arbetsliv_ForskarutbytenSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningen = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningen(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - L�GG TILL KNAPP
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenL�ggTill = "#InterruptionInResearchManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenL�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#InterruptionInResearchManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - STARTDATUM
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum = "StartDate"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum (WebDriver driver){

		element = driver.findElement(By.name("StartDate"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SLUTDATUM
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum = "EndDate"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum(WebDriver driver){

		element = driver.findElement(By.name("EndDate"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SLUTDATUM
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning = "Description"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning(WebDriver driver){

		element = driver.findElement(By.id("Description"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SPARA
	public static final String MinProfil_Arbetsliv_Uppeh�llIForskningenSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_Uppeh�llIForskningenSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER
	public static final String MinProfil_Publikationer = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement MinProfil_Publikationer(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONER
	public static final String MinProfil_Publikationer_Publikationer = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/ul/li/a"; {
	}
	public static WebElement MinProfil_Publikationer_Publikationer(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/ul/li/a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - L�GG TILL
	public static final String MinProfil_Publikationer_L�ggTill = "#PublicationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Publikationer_L�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#PublicationManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONSTYP
	public static final String MinProfil_Publikationer_Publikationstyp = "PublicationType"; {
	}
	public static WebElement MinProfil_Publikationer_Publikationstyp(WebDriver driver){

		element = driver.findElement(By.id("PublicationType"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static final String MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown = "PublicationFormPeerReviewed"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown(WebDriver driver){

		element = driver.findElement(By.id("PublicationFormPeerReviewed"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION -  INTE FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static final String MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown = "PublicationFormNotPeerReviewed"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown(WebDriver driver){

		element = driver.findElement(By.id("PublicationFormNotPeerReviewed"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - TITEL
	public static final String MinProfil_Publikationer_VetenskapligPublikationTitel = "Title"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationTitel (WebDriver driver){

		element = driver.findElement(By.id("Title"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp = "btnAuthorAdd"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp (WebDriver driver){

		element = driver.findElement(By.id("btnAuthorAdd"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-F�RNAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn = "Authors_0__FirstName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(WebDriver driver){

		element = driver.findElement(By.id("Authors_0__FirstName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-EFTERNAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn = "Authors_0__LastName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(WebDriver driver){

		element = driver.findElement(By.id("Authors_0__LastName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - NAMN P� TIDSKRIFT
	public static final String MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift = "JournalName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(WebDriver driver){

		element = driver.findElement(By.id("JournalName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VOLYM
	public static final String MinProfil_Publikationer_VetenskapligPublikationVolym = "Volume"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationVolym(WebDriver driver){

		element = driver.findElement(By.id("Volume"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTF�RDANDENUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer = "IssueNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(WebDriver driver){

		element = driver.findElement(By.id("IssueNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKT�R-KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp = "btnEditorAdd"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp(WebDriver driver){

		element = driver.findElement(By.id("btnEditorAdd"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKT�R-NAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn = "Editors_0__Name"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn(WebDriver driver){

		element = driver.findElement(By.id("Editors_0__Name"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RLAG
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rlag = "PublishingHouse"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rlag(WebDriver driver){

		element = driver.findElement(By.id("PublishingHouse"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RLAGSPLATS
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats = "PublishingPlace"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(WebDriver driver){

		element = driver.findElement(By.id("PublishingPlace"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RSTA SIDNUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer = "FirstPageNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(WebDriver driver){

		element = driver.findElement(By.id("FirstPageNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SISTA SIDNUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer = "LastPageNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(WebDriver driver){

		element = driver.findElement(By.id("LastPageNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - ISBN
	public static final String MinProfil_Publikationer_VetenskapligPublikationISBN = "Isbn"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationISBN(WebDriver driver){

		element = driver.findElement(By.id("Isbn"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOI
	public static final String MinProfil_Publikationer_VetenskapligPublikationDOI = "Doi"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationDOI(WebDriver driver){

		element = driver.findElement(By.id("Doi"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTGIVARE-STATUS(DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationStatus = "MagazineStatus"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationStatus(WebDriver driver){

		element = driver.findElement(By.id("MagazineStatus"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - K�LLA F�R PUBLIKATION (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation = "SourceImportedDocument"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation(WebDriver driver){

		element = driver.findElement(By.id("SourceImportedDocument"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - K�LLA ID
	public static final String MinProfil_Publikationer_VetenskapligPublikationK�llaID = "Source"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationK�llaID(WebDriver driver){

		element = driver.findElement(By.id("Source"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VAR TEXTEN PUBLICERAD I OPEN ACCESS (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown = "OpenAccessStatus"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown(WebDriver driver){

		element = driver.findElement(By.id("OpenAccessStatus"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - L�NK/EXTERN L�NK F�R PUBLICERING
	public static final String MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering = "LinkExternal"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(WebDriver driver){

		element = driver.findElement(By.id("LinkExternal"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FORM AV OA (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationFormAvOA = "OAForm"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFormAvOA(WebDriver driver){

		element = driver.findElement(By.id("OAForm"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOKUMENTVERSION (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationDokumentversion = "DocumentVersion"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationDokumentversion(WebDriver driver){

		element = driver.findElement(By.id("DocumentVersion"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SAMMANFATTNING
	public static final String MinProfil_Publikationer_VetenskapligPublikationSammanfattning = "Abstract"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSammanfattning(WebDriver driver){

		element = driver.findElement(By.id("Abstract"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SPARA KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER
	public static final String MinProfil_MeriterOchUtm�rkelser = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR
	public static final String MinProfil_MeriterOchUtm�rkelser_Docentur = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Docentur(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[1]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - L�GG TILL KNAPP
	public static final String MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill = "#associateProfessorManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#associateProfessorManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - S�K ORGANISATION
	public static final String MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - SPARA S�KT ORGANISATION
	public static final String MinProfil_MeriterOchUtm�rkelser_DocenturSparaS�ktOrganisation = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_DocenturSparaS�ktOrganisation(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �MNE1
	public static final String MinProfil_MeriterOchUtm�rkelser_Docentur�mne1 = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Docentur�mne1(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �MNE2
	public static final String MinProfil_MeriterOchUtm�rkelser_Docentur�mne2 = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Docentur�mne2(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �R
	public static final String MinProfil_MeriterOchUtm�rkelser_Docentur�r = "Year"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_Docentur�r(WebDriver driver){

		element = driver.findElement(By.id("Year"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - SPARA
	public static final String MinProfil_MeriterOchUtm�rkelser_DocenturSpara = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_DocenturSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - L�GG TILL ENSKILD PERSON KNAPP
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp = "#supervisedPersonManagementSectionId > div.row-fluid.button-wrapper > div > a:nth-child(1)"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp(WebDriver driver){

		element = driver.findElement(By.cssSelector("#supervisedPersonManagementSectionId > div.row-fluid.button-wrapper > div > a:nth-child(1)"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - S�K L�ROS�TE HANDLEDARE
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationHandledare = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationHandledare(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA S�KT L�ROS�TE HANDLEDARE
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationHandledare = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationHandledare(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - S�K L�ROS�TE STUDENT/DOKTORAND/POSTDOK
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationStudent = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationStudent(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA S�KT L�ROS�TE STUDENT
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationStudent = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationStudent(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - F�RNAMN
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn = "FirstName"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn(WebDriver driver){

		element = driver.findElement(By.id("FirstName"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - F�RNAMN
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn = "LastName"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn(WebDriver driver){

		element = driver.findElement(By.id("LastName"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SLUT�R
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r = "SupervisionEndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r(WebDriver driver){

		element = driver.findElement(By.id("SupervisionEndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - TYP AV HANDLEDDA PERSONER
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson = "TypeId"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson(WebDriver driver){

		element = driver.findElement(By.id("TypeId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - ROLL
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll = "RoleId"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll(WebDriver driver){

		element = driver.findElement(By.id("RoleId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA ENSKILD PERSON
	public static final String MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}


	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - L�GG TILL
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensL�ggTill = "#ResearchGrantsAwardedInCompetitionManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensL�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#ResearchGrantsAwardedInCompetitionManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - FINANSI�R DROPDOWN 1
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown1 = "FunderId_select_0"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown1(WebDriver driver){

		element = driver.findElement(By.name("FunderId_select_0"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - FINANSI�R DROPDOWN 2
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown2 = "FunderId_select_1"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown2(WebDriver driver){

		element = driver.findElement(By.name("FunderId_select_1"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - PROJEKTLEDARE
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjektledare = "Applicant"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjektledare(WebDriver driver){

		element = driver.findElement(By.id("Applicant"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - LAND
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensLand = "OtherCountry"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensLand(WebDriver driver){

		element = driver.findElement(By.id("OtherCountry"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - PROJEKTTITEL
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjekttitel = "ProjectTitle"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjekttitel(WebDriver driver){

		element = driver.findElement(By.id("ProjectTitle"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - DNR
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDnr = "DiaryNumber"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDnr(WebDriver driver){

		element = driver.findElement(By.id("DiaryNumber"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - START�R
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensStart�r = "PeriodStartYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensStart�r(WebDriver driver){

		element = driver.findElement(By.id("PeriodStartYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - SLUT�R
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSlut�r = "PeriodEndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSlut�r(WebDriver driver){

		element = driver.findElement(By.id("PeriodEndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - DIN ROLL
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDinRoll = "RoleId"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDinRoll(WebDriver driver){

		element = driver.findElement(By.id("RoleId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - TOTALT BELOPP (KR)
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensTotaltBeloppKr = "Amount"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensTotaltBeloppKr(WebDriver driver){

		element = driver.findElement(By.id("Amount"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - SPARA
	public static final String MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSpara = "Create"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSpara(WebDriver driver){

		element = driver.findElement(By.id("Create"));
		return element;
	}




	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - L�GG TILL
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserL�ggTill = "#AwardAndDistinctionManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserL�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#AwardAndDistinctionManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - �R
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser�r = "YearOfAward"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser�r(WebDriver driver){

		element = driver.findElement(By.id("YearOfAward"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - LAND
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserLand = "selectedCountryDropDown"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserLand(WebDriver driver){

		element = driver.findElement(By.id("selectedCountryDropDown"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - NAMN P� PRISET/UTM�RKELSEN
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserNamnP�Priset= "Award"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserNamnP�Priset(WebDriver driver){

		element = driver.findElement(By.id("Award"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - UTF�RDARE
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserUtf�rdare = "Issuer"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserUtf�rdare(WebDriver driver){

		element = driver.findElement(By.id("Issuer"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - BESKRIVNING
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserBeskrivning = "Description"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserBeskrivning(WebDriver driver){

		element = driver.findElement(By.id("Description"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - SPARA
	public static final String MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserSpara = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}




	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - L�GG TILL
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterL�ggTill = "#RelevantAndOtherMeritsManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterL�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#RelevantAndOtherMeritsManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - START�R
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterStart�r = "StartYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterStart�r(WebDriver driver){

		element = driver.findElement(By.id("StartYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - SLUT�R
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r = "EndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r(WebDriver driver){

		element = driver.findElement(By.id("EndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - TYP AV MERIT
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit = "OtherMerits"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit(WebDriver driver){

		element = driver.findElement(By.name("OtherMerits"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - BESKRIVNING
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning = "RelevantMerits"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning(WebDriver driver){

		element = driver.findElement(By.name("RelevantMerits"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - SPARA
	public static final String MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara(WebDriver driver){

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
	public static final String MinProfil_Immaterialr�ttL�ggTill = "#patentManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Immaterialr�ttL�ggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#patentManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - TYP
	public static final String MinProfil_Immaterialr�ttTyp = "Type"; {
	}
	public static WebElement MinProfil_Immaterialr�ttTyp(WebDriver driver){

		element = driver.findElement(By.id("Type"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - ID
	public static final String MinProfil_Immaterialr�ttId = "IPNumber"; {
	}
	public static WebElement MinProfil_Immaterialr�ttId(WebDriver driver){

		element = driver.findElement(By.id("IPNumber"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - DATUM F�R BEVILJANDE
	public static final String MinProfil_Immaterialr�ttDatumF�rBeviljande = "DateApproved"; {
	}
	public static WebElement MinProfil_Immaterialr�ttDatumF�rBeviljande(WebDriver driver){

		element = driver.findElement(By.name("DateApproved"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - PRODUKTKLASSIFICERING 1
	public static final String MinProfil_Immaterialr�ttProduktKlassificering1 = "ProductClassificationId_select_0"; {
	}
	public static WebElement MinProfil_Immaterialr�ttProduktKlassificering1(WebDriver driver){

		element = driver.findElement(By.name("ProductClassificationId_select_0"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - PRODUKTKLASSIFICERING 2
	public static final String MinProfil_Immaterialr�ttProduktKlassificering2 = "ProductClassificationId_select_1"; {
	}
	public static WebElement MinProfil_Immaterialr�ttProduktKlassificering2(WebDriver driver){

		element = driver.findElement(By.name("ProductClassificationId_select_1"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - LICENSIERAD TILL ANNAN
	public static final String MinProfil_Immaterialr�ttLicensieradTillAnnan = "LicensedToOtherPart"; {
	}
	public static WebElement MinProfil_Immaterialr�ttLicensieradTillAnnan(WebDriver driver){

		element = driver.findElement(By.id("LicensedToOtherPart"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - LICENSIERAD TILL ANNAN DROPDOWN
	public static final String MinProfil_Immaterialr�ttLicensieradTillAnnanDropwDown = "LicensedToOtherTypeId"; {
	}
	public static WebElement MinProfil_Immaterialr�ttLicensieradTillAnnanDropwDown(WebDriver driver){

		element = driver.findElement(By.id("LicensedToOtherTypeId"));
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - SPARA
	public static final String MinProfil_Immaterialr�ttSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Immaterialr�ttSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}



	//MIN PROFIL - GRANSKARKOMPETENS
	public static final String MinProfil_Granskarkompetens = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"; {
	}
	public static WebElement MinProfil_Granskarkompetens(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 1
	public static final String MinProfil_GranskarkompetensKIDForskningsomr�de1 = "competenceSelectors_0__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsomr�de1(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_0__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 2
	public static final String MinProfil_GranskarkompetensKIDForskningsomr�de2 = "competenceSelectors_1__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsomr�de2(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_1__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 3
	public static final String MinProfil_GranskarkompetensKIDForskningsomr�de3 = "competenceSelectors_2__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsomr�de3(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_2__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 4
	public static final String MinProfil_GranskarkompetensKIDForskningsomr�de4 = "competenceSelectors_3__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsomr�de4(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_3__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 5
	public static final String MinProfil_GranskarkompetensKIDForskningsomr�de5 = "competenceSelectors_4__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsomr�de5(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_4__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 1
	public static final String MinProfil_GranskarkompetensKIDMetod1 = "competenceSelectors_5__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod1(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_5__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 2
	public static final String MinProfil_GranskarkompetensKIDMetod2 = "competenceSelectors_6__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod2(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_6__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 3
	public static final String MinProfil_GranskarkompetensKIDMetod3 = "competenceSelectors_7__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod3(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_7__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 4
	public static final String MinProfil_GranskarkompetensKIDMetod4 = "competenceSelectors_8__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod4(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_8__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 5
	public static final String MinProfil_GranskarkompetensKIDMetod5 = "competenceSelectors_9__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod5(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_9__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 1
	public static final String MinProfil_GranskarkompetensKIDNyckelord1 = "competenceSelectors_10__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord1(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_10__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 2
	public static final String MinProfil_GranskarkompetensKIDNyckelord2 = "competenceSelectors_11__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord2(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_11__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 3
	public static final String MinProfil_GranskarkompetensKIDNyckelord3 = "competenceSelectors_12__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord3(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_12__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 4
	public static final String MinProfil_GranskarkompetensKIDNyckelord4 = "competenceSelectors_13__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord4(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_13__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 5
	public static final String MinProfil_GranskarkompetensKIDNyckelord5 = "competenceSelectors_14__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord5(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_14__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - SPARA
	public static final String MinProfil_GranskarkompetensKIDSpara = "//input[@value='Spara']"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDSpara(WebDriver driver){

		element = driver.findElement(By.xpath("//input[@value='Spara']"));
		return element;
	}







}


