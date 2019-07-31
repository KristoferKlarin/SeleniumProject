package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalLoggedInAsUserMinProfil {
	static By element = null;


	//MIN PROFIL - KNAPPEN
	public static By MinProfil(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfile.active > a");
		return element;
	}

	//MIN PROFIL - START
	public static By MinProfil_Start(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}

	//MIN PROFIL - PERSONUPPGIFTER
	public static By MinProfil_Personuppgifter(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}

	//MIN PROFIL - UTBILDNING
	public static By MinProfil_Utbildning(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING
	public static By MinProfil_Utbildning_Forskarutbildning(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[1]/a");
		return element;

	}
	//MIN PROFIL - UTBILDNING - KNAPP F�R ATT L�GGA TILL FORSKARUTBILDNING
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning(){

		By element = By.cssSelector("#researchEducationManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - UTBILDNING - KNAPP F�R ATT L�GGA TILL FORSKARUTBILDNING - S�K ORGANISATION
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - UTBILDNING - L�GG TILL FORSKARUTBILDNING - KNAPP F�R ATT SPARA S�KT ORGANISATION
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp() {

		By element = By.tagName("button");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING TYP (DROPDOWN SELECT) 
	public static By MinProfil_Utbildning_TypDropDownForskarUtbildning() {
		By element = By.id("Type");
		return element;

	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum() {

		By element = By.name("DateDoctorsDegree");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM - �R (DROPDOWN)
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum�rDropdown() {

		By element = By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM - M�NAD (DROPDOWN)
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumM�nadDropdown() {

		By element = By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- DATUM F�R N�R FORSKNINGSKOMPETENS UPPN�TTS
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumN�rForskningskompetensUppn�tts() {

		By element = By.name("CompetenceAchievedDate");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - SVENSKA
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV() {

		By element = By.id("DescriptionCompetenceSV");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - ENGELSKA
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN() {

		By element = By.id("DescriptionCompetenceEN");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne1 (DROPDOWN SELECT) 
	public static By MinProfil_Utbildning_�mne1DropDownForskarUtbildning() {

		By element = By.id("SubjectId_select_0");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne2 (DROPDOWN SELECT) 
	public static By MinProfil_Utbildning_�mne2DropDownForskarUtbildning() {

		By element = By.id("SubjectId_select_1");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING �mne3 (DROPDOWN SELECT) 
	public static By MinProfil_Utbildning_�mne3DropDownForskarUtbildning() {

		By element = By.id("SubjectId_select_2");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ORGINALSPR�K)
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k() {

		By element = By.id("TitleDoctorsDegree");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ENGELSKA)
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska() {

		By element = By.id("TitleDoctorsDegreeEN");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - ISSN/ISBN-NUMMER
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer() {

		By element = By.id("IsbnNumber");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - F�RNAMN HANDLEDARE
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare() {

		By element = By.id("FirstNameSupervisorDoctorsDegree");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - EFTERNAMN HANDLEDARE
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare() {

		By element = By.id("LastNameSupervisorDoctorsDegree");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - SPARA FORSKARUTBILDNINGKNAPP
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_SparaForskarUtbildningButton() {

		By element = By.id("CreateExamPost");
		return element;
	}
	
	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - SPARA ForskningskompetensMotsvarandeDoktorsexamenKNAPP
	public static By MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamenButton() {

		By element = By.id("CreateCompetencePost");
		return element;
	}
	
	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV�	
	public static By MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.active.menuItem-educationalhistory > div > ul > li:nth-child(2) > a");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - KNAPP F�R ATT L�GGA TILL L�GG TILL
	public static By MinProfil_Utbildning_L�ggTillUtbildningP�GrundOchAvanceradNiv�(){

		By element = By.cssSelector("#basicEducationManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - �R F�R EXAMEN
	public static By MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv��rF�rExamen(){

		By element = By.id("YearBasicDegree");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE1 (DROPDOWN SELECT) 
	public static By MinProfil_L�ggTillUtbildning_�mne1UtbildningP�GrundOchAvanceradNiv�(){

		By element = By.id("BasicTrainingId_select_0");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE 2 (DROPDOWN SELECT) 
	public static By MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�(){

		By element = By.id("BasicTrainingId_select_1");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMENSINRIKTNING - �MNE 3 (DROPDOWN SELECT) 
	public static By MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�(){

		By element = By.id("BasicTrainingId_select_2");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - EXAMEN
	public static By MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Examen(){

		By element = By.id("BasicEducationDegree");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - SPECIALISTKOMPETENS
	public static By MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens(){

		By element = By.id("SpecialistTrainingId");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - SPECIALISTKOMPETENS �R
	public static By MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R(){

		By element = By.id("SpecialistTrainingYear");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� - OMR�DE/BESKRIVNING
	public static By MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Omr�deBeskrivning(){

		By element = By.name("SpecialistTrainingDescription");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING P� GRUND OCH AVANCERAD NIV� -SPARAKNAPP
	public static By MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�SparaKnapp(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - KNAPP
	public static By MinProfil_Arbetsliv(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR
	public static By MinProfil_Arbetsliv_Anst�llningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[1]/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - KNAPP L�GG TILL ANST�LLNING
	public static By MinProfil_Arbetsliv_Anst�llningar_L�ggTill(){

		By element = By.cssSelector("#employmentManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - S�K ARBETSGIVARE
	public static By MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - SPARA S�KT ARBETSGIVARE
	public static By MinProfil_Arbetsliv_Anst�llningar_SparaS�kArbetsgivare (){

		By element = By.xpath("//button[contains(text(), 'Spara val')]");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNING DROPDOWN
	public static By MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown (){

		By element = By.id("Position");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGSFORM DROPDOWN
	public static By MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown (){

		By element = By.id("FormOfEmployment");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - DEL AV FORSKNING I ANST�LLNINGEN BASERAD P� HELTID (%)*
	public static By MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid(){

		By element = By.id("PartOfResearchInEmployment");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS B�RJAN (YEAR)
	public static By MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear(){

		By element = By.name("StartDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS B�RJAN (MONTH)
	public static By MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth(){

		By element = By.name("StartDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS SLUT (YEAR)
	public static By MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear(){

		By element = By.name("EndDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - ANST�LLNINGENS SLUT (MONTH)
	public static By MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth(){

		By element = By.name("EndDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - �VRIG INFORMATION
	public static By MinProfil_Arbetsliv_Anst�llningar_�vrigInformation(){

		By element = By.id("OtherInformation");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANST�LLNINGAR - SPARA ANST�LLNING
	public static By MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning(){

		By element = By.name("Submitter");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser
	public static By MinProfil_Arbetsliv_Postdoktorvistelser(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - L�GG TILL KNAPP
	public static By MinProfil_Arbetsliv_PostdoktorvistelserL�ggTill(){

		By element = By.cssSelector("#postDoctorialManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - S�K ORGANISATION
	public static By MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA S�Kt ORGANISATION
	public static By MinProfil_Arbetsliv_PostdoktorvistelserSparaS�ktOrganisation(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 1 (DROPDOWN)
	public static By MinProfil_Arbetsliv_Postdoktorvistelser�mne1(){

		By element = By.id("SubjectId_select_0");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 2 (DROPDOWN)
	public static By MinProfil_Arbetsliv_Postdoktorvistelser�mne2(){

		By element = By.id("SubjectId_select_1");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - �MNE 3 (DROPDOWN)
	public static By MinProfil_Arbetsliv_Postdoktorvistelser�mne3(){

		By element = By.id("SubjectId_select_2");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART �R
	public static By MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear(){

		By element = By.name("PeriodStartDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT �R
	public static By MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear(){

		By element = By.name("PeriodStopDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART M�NAD
	public static By MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth(){

		By element = By.name("PeriodStartDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT M�NAD
	public static By MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth(){

		By element = By.name("PeriodStopDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA Postdoktorvistelser
	public static By MinProfil_Arbetsliv_PostdoktorvistelserSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN
	public static By MinProfil_Arbetsliv_Forskarutbyten(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - L�GG TILL KNAPP
	public static By MinProfil_Arbetsliv_ForskarutbytenL�ggTill(){

		By element = By.cssSelector("#ResearchExchangeManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - S�K ORGANISATION
	public static By MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA S�KT ORGANISATION
	public static By MinProfil_Arbetsliv_ForskarutbytenSparaS�ktOrganisation(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 1 (DROPDOWN)
	public static By MinProfil_Arbetsliv_Forskarutbyte�mne1(){

		By element = By.id("ScbTableId_select_0");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 2 (DROPDOWN)
	public static By MinProfil_Arbetsliv_Forskarutbyte�mne2(){

		By element = By.id("ScbTableId_select_1");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - �MNE 3 (DROPDOWN)
	public static By MinProfil_Arbetsliv_Forskarutbyte�mne3(){

		By element = By.id("ScbTableId_select_2");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - TYP (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbyteTyp(){

		By element = By.id("Type");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (YEAR) (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear(){

		By element = By.name("StartDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (MONTH) (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth(){

		By element = By.name("StartDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (YEAR) (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear(){

		By element = By.name("StopDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (MONTH) (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth(){

		By element = By.name("StopDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA FORSKARUTBYTE
	public static By MinProfil_Arbetsliv_ForskarutbytenSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN
	public static By MinProfil_Arbetsliv_Uppeh�llIForskningen(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - L�GG TILL KNAPP
	public static By MinProfil_Arbetsliv_Uppeh�llIForskningenL�ggTill(){

		By element = By.cssSelector("#InterruptionInResearchManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - STARTDATUM
	public static By MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum (){

		By element = By.name("StartDate");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SLUTDATUM
	public static By MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum(){

		By element = By.name("EndDate");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SLUTDATUM
	public static By MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning(){

		By element = By.id("Description");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEH�LL I FORSKNINGEN - SPARA
	public static By MinProfil_Arbetsliv_Uppeh�llIForskningenSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER
	public static By MinProfil_Publikationer(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONER
	public static By MinProfil_Publikationer_Publikationer(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/ul/li/a");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - L�GG TILL
	public static By MinProfil_Publikationer_L�ggTill(){

		By element = By.cssSelector("#PublicationManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONSTYP
	public static By MinProfil_Publikationer_Publikationstyp(){

		By element = By.id("PublicationType");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static By MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown(){

		By element = By.id("PublicationFormPeerReviewed");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION -  INTE FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static By MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown(){

		By element = By.id("PublicationFormNotPeerReviewed");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - TITEL
	public static By MinProfil_Publikationer_VetenskapligPublikationTitel (){

		By element = By.id("Title");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-KNAPP
	public static By MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp (){

		By element = By.id("btnAuthorAdd");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-F�RNAMN
	public static By MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(){

		By element = By.id("Authors_0__FirstName");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RFATTARE-EFTERNAMN
	public static By MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(){

		By element = By.id("Authors_0__LastName");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - NAMN P� TIDSKRIFT
	public static By MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(){

		By element = By.id("JournalName");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VOLYM
	public static By MinProfil_Publikationer_VetenskapligPublikationVolym(){

		By element = By.id("Volume");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTF�RDANDENUMMER
	public static By MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(){

		By element = By.id("IssueNumber");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKT�R-KNAPP
	public static By MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp(){

		By element = By.id("btnEditorAdd");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKT�R-NAMN
	public static By MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn(){

		By element = By.id("Editors_0__Name");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RLAG
	public static By MinProfil_Publikationer_VetenskapligPublikationF�rlag(){

		By element = By.id("PublishingHouse");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RLAGSPLATS
	public static By MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(){

		By element = By.id("PublishingPlace");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - F�RSTA SIDNUMMER
	public static By MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(){

		By element = By.id("FirstPageNumber");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SISTA SIDNUMMER
	public static By MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(){

		By element = By.id("LastPageNumber");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - ISBN
	public static By MinProfil_Publikationer_VetenskapligPublikationISBN(){

		By element = By.id("Isbn");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOI
	public static By MinProfil_Publikationer_VetenskapligPublikationDOI(){

		By element = By.id("Doi");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTGIVARE-STATUS(DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationStatus(){

		By element = By.id("MagazineStatus");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - K�LLA F�R PUBLIKATION (DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation(){

		By element = By.id("SourceImportedDocument");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - K�LLA ID
	public static By MinProfil_Publikationer_VetenskapligPublikationK�llaID(){

		By element = By.id("Source");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VAR TEXTEN PUBLICERAD I OPEN ACCESS (DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown(){

		By element = By.id("OpenAccessStatus");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - L�NK/EXTERN L�NK F�R PUBLICERING
	public static By MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(){

		By element = By.id("LinkExternal");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FORM AV OA (DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationFormAvOA(){

		By element = By.id("OAForm");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOKUMENTVERSION (DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationDokumentversion(){

		By element = By.id("DocumentVersion");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SAMMANFATTNING
	public static By MinProfil_Publikationer_VetenskapligPublikationSammanfattning(){

		By element = By.id("Abstract");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SPARA KNAPP
	public static By MinProfil_Publikationer_VetenskapligPublikationSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER
	public static By MinProfil_MeriterOchUtm�rkelser(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR
	public static By MinProfil_MeriterOchUtm�rkelser_Docentur(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[1]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - L�GG TILL KNAPP
	public static By MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill(){

		By element = By.cssSelector("#associateProfessorManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - S�K ORGANISATION
	public static By MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - SPARA S�KT ORGANISATION
	public static By MinProfil_MeriterOchUtm�rkelser_DocenturSparaS�ktOrganisation(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �MNE1
	public static By MinProfil_MeriterOchUtm�rkelser_Docentur�mne1(){

		By element = By.id("SubjectId_select_0");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �MNE2
	public static By MinProfil_MeriterOchUtm�rkelser_Docentur�mne2(){

		By element = By.id("SubjectId_select_1");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - �R
	public static By MinProfil_MeriterOchUtm�rkelser_Docentur�r(){

		By element = By.id("Year");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - DOCENTUR - SPARA
	public static By MinProfil_MeriterOchUtm�rkelser_DocenturSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersoner(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - L�GG TILL ENSKILD PERSON KNAPP
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp(){

		By element = By.cssSelector("#supervisedPersonManagementSectionId > div.row-fluid.button-wrapper > div > a:nth-child(1)");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - S�K L�ROS�TE HANDLEDARE
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationHandledare(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA S�KT L�ROS�TE HANDLEDARE
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationHandledare(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - S�K L�ROS�TE STUDENT/DOKTORAND/POSTDOK
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerS�kOrganisationStudent(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA S�KT L�ROS�TE STUDENT
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaS�kOrganisationStudent(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - F�RNAMN
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn(){

		By element = By.id("FirstName");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - F�RNAMN
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn(){

		By element = By.id("LastName");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SLUT�R
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r(){

		By element = By.id("SupervisionEndYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - TYP AV HANDLEDDA PERSONER
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson(){

		By element = By.id("TypeId");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - ROLL
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll(){

		By element = By.id("RoleId");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - HANDLEDDA PERSONER - SPARA ENSKILD PERSON
	public static By MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson(){

		By element = By.id("Submitter");
		return element;
	}


	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrens(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - L�GG TILL
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensL�ggTill(){

		By element = By.cssSelector("#ResearchGrantsAwardedInCompetitionManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - FINANSI�R DROPDOWN 1
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown1(){

		By element = By.name("FunderId_select_0");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - FINANSI�R DROPDOWN 2
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensFinansi�rDropDown2(){

		By element = By.name("FunderId_select_1");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - PROJEKTLEDARE
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjektledare(){

		By element = By.id("Applicant");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - LAND
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensLand(){

		By element = By.id("OtherCountry");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - PROJEKTTITEL
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensProjekttitel(){

		By element = By.id("ProjectTitle");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - DNR
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDnr(){

		By element = By.id("DiaryNumber");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - START�R
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensStart�r(){

		By element = By.id("PeriodStartYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - SLUT�R
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSlut�r(){

		By element = By.id("PeriodEndYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - DIN ROLL
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensDinRoll(){

		By element = By.id("RoleId");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - TOTALT BELOPP (KR)
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensTotaltBeloppKr(){

		By element = By.id("Amount");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - BIDRAG ERH�LLNA I KONKURRENS - SPARA
	public static By MinProfil_MeriterOchUtm�rkelser_BidragErH�llnaiKonkurrensSpara(){

		By element = By.id("Create");
		return element;
	}




	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER
	public static By MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - L�GG TILL
	public static By MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserL�ggTill(){

		By element = By.cssSelector("#AwardAndDistinctionManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - �R
	public static By MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelser�r(){

		By element = By.id("YearOfAward");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - LAND
	public static By MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserLand(){

		By element = By.id("selectedCountryDropDown");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - NAMN P� PRISET/UTM�RKELSEN
	public static By MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserNamnP�Priset(){

		By element = By.id("Award");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - UTF�RDARE
	public static By MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserUtf�rdare(){

		By element = By.id("Issuer");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - BESKRIVNING
	public static By MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserBeskrivning(){

		By element = By.id("Description");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - PRISER OCH UTM�RKELSER - SPARA
	public static By MinProfil_MeriterOchUtm�rkelser_PriserOchUtM�rkelserSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER
	public static By MinProfil_MeriterOchUtm�rkelser_�vrigaMeriter(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - L�GG TILL
	public static By MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterL�ggTill(){

		By element = By.cssSelector("#RelevantAndOtherMeritsManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - START�R
	public static By MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterStart�r(){

		By element = By.id("StartYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - SLUT�R
	public static By MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r(){

		By element = By.id("EndYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - TYP AV MERIT
	public static By MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit(){

		By element = By.name("OtherMerits");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - BESKRIVNING
	public static By MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning(){

		By element = By.name("RelevantMerits");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTM�RKELSER - �VRIGA MERITER - SPARA
	public static By MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara(){

		By element = By.name("Submitter");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT
	public static By MinProfil_Immaterialr�tt(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - IMMATERIALR�TT
	public static By MinProfil_Immaterialr�tt_Immaterialr�tt(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/ul/li/a");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - L�GG TILL
	public static By MinProfil_Immaterialr�ttL�ggTill(){

		By element = By.cssSelector("#patentManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - TYP
	public static By MinProfil_Immaterialr�ttTyp(){

		By element = By.id("Type");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - ID
	public static By MinProfil_Immaterialr�ttId(){

		By element = By.id("IPNumber");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - DATUM F�R BEVILJANDE
	public static By MinProfil_Immaterialr�ttDatumF�rBeviljande(){

		By element = By.name("DateApproved");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - DATUM F�R BEVILJANDE - �R DROPDOWN I KALENDER
	public static By MinProfil_Immaterialr�ttDatumF�rBeviljandeKalender�rDropDown(){

		By element = By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - DATUM F�R BEVILJANDE - M�nad DROPDOWN I KALENDER
	public static By MinProfil_Immaterialr�ttDatumF�rBeviljandeKalenderM�nadDropDown(){

		By element = By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - PRODUKTKLASSIFICERING 1
	public static By MinProfil_Immaterialr�ttProduktKlassificering1(){

		By element = By.name("ProductClassificationId_select_0");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - PRODUKTKLASSIFICERING 2
	public static By MinProfil_Immaterialr�ttProduktKlassificering2(){

		By element = By.name("ProductClassificationId_select_1");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - LICENSIERAD TILL ANNAN
	public static By MinProfil_Immaterialr�ttLicensieradTillAnnan(){

		By element = By.id("LicensedToOtherPart");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - LICENSIERAD TILL ANNAN DROPDOWN
	public static By MinProfil_Immaterialr�ttLicensieradTillAnnanDropwDown(){

		By element = By.id("LicensedToOtherTypeId");
		return element;
	}

	//MIN PROFIL - IMMATERIALR�TT - SPARA
	public static By MinProfil_Immaterialr�ttSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS
	public static By MinProfil_Granskarkompetens(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 1
	public static By MinProfil_GranskarkompetensKIDForskningsomr�de1(){

		By element = By.id("competenceSelectors_0__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 2
	public static By MinProfil_GranskarkompetensKIDForskningsomr�de2(){

		By element = By.id("competenceSelectors_1__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 3
	public static By MinProfil_GranskarkompetensKIDForskningsomr�de3(){

		By element = By.id("competenceSelectors_2__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 4
	public static By MinProfil_GranskarkompetensKIDForskningsomr�de4(){

		By element = By.id("competenceSelectors_3__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMR�DE 5
	public static By MinProfil_GranskarkompetensKIDForskningsomr�de5(){

		By element = By.id("competenceSelectors_4__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 1
	public static By MinProfil_GranskarkompetensKIDMetod1(){

		By element = By.id("competenceSelectors_5__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 2
	public static By MinProfil_GranskarkompetensKIDMetod2(){

		By element = By.id("competenceSelectors_6__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 3
	public static By MinProfil_GranskarkompetensKIDMetod3(){

		By element = By.id("competenceSelectors_7__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 4
	public static By MinProfil_GranskarkompetensKIDMetod4(){

		By element = By.id("competenceSelectors_8__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 5
	public static By MinProfil_GranskarkompetensKIDMetod5(){

		By element = By.id("competenceSelectors_9__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 1
	public static By MinProfil_GranskarkompetensKIDNyckelord1(){

		By element = By.id("competenceSelectors_10__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 2
	public static By MinProfil_GranskarkompetensKIDNyckelord2(){

		By element = By.id("competenceSelectors_11__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 3
	public static By MinProfil_GranskarkompetensKIDNyckelord3(){

		By element = By.id("competenceSelectors_12__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 4
	public static By MinProfil_GranskarkompetensKIDNyckelord4(){

		By element = By.id("competenceSelectors_13__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 5
	public static By MinProfil_GranskarkompetensKIDNyckelord5(){

		By element = By.id("competenceSelectors_14__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - SPARA
	public static By MinProfil_GranskarkompetensKIDSpara(){

		By element = By.id("Submitter");
		return element;
	}
}


