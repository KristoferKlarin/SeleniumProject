package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class PortalLoggedInAsAdminFinansi�r {
	private static By element = null;


	//FINANSI�RKNAPPEN
	public static By Finansi�rButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET
	public static By KarolinskaInstitutet(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - FINANSI�RSINT�LLNINGAR
	public static By KarolinskaInstitutetFinansi�rsinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - GRANSKARPOOLINST�LLNINGAR
	public static By KarolinskaInstitutetGranskarpoolinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - INTERNA ANV�NDARE
	public static By KarolinskaInstitutetInternaAnv�ndare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ARVODESINST�LLNINGAR
	public static By KarolinskaInstitutetArvodesinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - SINK-ADMINISTRATION
	public static By KarolinskaInstitutetSINKAdministration(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - S�KNYCKLAR
	public static By KarolinskaInstitutetS�knycklar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ORGANISATIONSKONTOANS�KNINGAR
	public static By KarolinskaInstitutetOrganisationskontoans�kningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ORGANISATIONSKONTON
	public static By KarolinskaInstitutetOrganisationskonton(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - INTERNA F�RFR�GNINGAR
	public static By KarolinskaInstitutetInternaF�rfr�ningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSI�R - FORMAS
	public static By Formas(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSI�R - FORMAS - FINANSI�RSINT�LLNINGAR
	public static By FormasFinansi�rsinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSI�R - FORMAS - GRANSKARPOOLINST�LLNINGAR

	public static By FormasGranskarpoolinst�llningar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSI�R - FORMAS - INTERNA ANV�NDARE
	public static By FormasInternaAnv�ndare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSI�R - FORMAS - ARVODESINST�LLNINGAR
	public static By FormasArvodesinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSI�R - FORMAS - SINK-ADMINISTRATION
	public static By FormasSINKAdministration(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSI�R - FORMAS - S�KNYCKLAR
	public static By FormasS�knycklar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSI�R - FORMAS - ORGANISATIONSKONTOANS�KNINGAR
	public static By FormasOrganisationskontoans�kningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSI�R - FORMAS - ORGANISATIONSKONTON
	public static By FormasOrganisationskonton(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSI�R - FORMAS - INTERNA F�RFR�GNINGAR
	public static By FormasInternaF�rfr�ningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET
	public static By Vetenskapsr�det(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - FINANSI�RSINT�LLNINGAR
	
	public static By Vetenskapsr�detFinansi�rsinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - GRANSKARPOOLINST�LLNINGAR
	public static By Vetenskapsr�detGranskarpoolinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - INTERNA ANV�NDARE
	public static By Vetenskapsr�detInternaAnv�ndare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ARVODESINST�LLNINGAR
	public static By Vetenskapsr�detArvodesinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - SINK-ADMINISTRATION
	public static By Vetenskapsr�detSINKAdministration(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - S�KNYCKLAR
	public static By Vetenskapsr�detS�knycklar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ORGANISATIONSKONTOANS�KNINGAR
	public static By Vetenskapsr�detOrganisationskontoans�kningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ORGANISATIONSKONTON
	public static By Vetenskapsr�detOrganisationskonton(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - INTERNA F�RFR�GNINGAR
	public static By Vetenskapsr�detInternaF�rfr�ningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSI�R - FORTE
	public static By Forte(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSI�R - FORTE - FINANSI�RSINT�LLNINGAR
	
	public static By ForteFinansi�rsinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSI�R - FORTE - GRANSKARPOOLINST�LLNINGAR
	public static By ForteGranskarpoolinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSI�R - FORTE - INTERNA ANV�NDARE
	public static By ForteInternaAnv�ndare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSI�R - FORTE - ARVODESINST�LLNINGAR
	public static By ForteArvodesinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSI�R - FORTE - SINK-ADMINISTRATION

	public static By ForteSINKAdministration(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSI�R - FORTE - S�KNYCKLAR
	public static By ForteS�knycklar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSI�R - FORTE - ORGANISATIONSKONTOANS�KNINGAR
	public static By ForteOrganisationskontoans�kningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSI�R - FORTE - ORGANISATIONSKONTON
	public static By ForteOrganisationskonton(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSI�R - FORTE - INTERNA F�RFR�GNINGAR
	public static By ForteInternaF�rfr�ningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSI�R - SKOLFI
	public static By Skolfi(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSI�R - SKOLFI - FINANSI�RSINT�LLNINGAR
	public static By SkolfiFinansi�rsinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSI�R - SKOLFI - GRANSKARPOOLINST�LLNINGAR
	public static By SkolfiGranskarpoolinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSI�R - SKOLFI - INTERNA ANV�NDARE
	public static By SkolfiInternaAnv�ndare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSI�R - SKOLFI - ARVODESINST�LLNINGAR
	public static By SkolfiArvodesinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSI�R - SKOLFI - SINK-ADMINISTRATION
	public static By SkolfiSINKAdministration(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSI�R - SKOLFI - S�KNYCKLAR
	public static By SkolfiS�knycklar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSI�R - SKOLFI - ORGANISATIONSKONTOANS�KNINGAR
	public static By SkolfiOrganisationskontoans�kningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSI�R - SKOLFI - ORGANISATIONSKONTON
	public static By SkolfiOrganisationskonton(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;				 
	}

	//FINANSI�R - SKOLFI - INTERNA F�RFR�GNINGAR
	public static By SkolfiInternaF�rfr�ningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}
	
	//FINANSI�R - EPM
	public static By EPN(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSI�R - EPM - FINANSI�RSINT�LLNINGAR

	public static By EPNFinansi�rsinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSI�R - EPN - GRANSKARPOOLINST�LLNINGAR
	public static By EPNGranskarpoolinst�llningar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSI�R - EPN - INTERNA ANV�NDARE
	public static By EPNInternaAnv�ndare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSI�R - EPN - ARVODESINST�LLNINGAR
	public static By EPNArvodesinst�llningar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSI�R - EPN - SINK-ADMINISTRATION
	public static By EPNSINKAdministration(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSI�R - EPN - S�KNYCKLAR
	public static By EPNS�knycklar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSI�R - EPN - ORGANISATIONSKONTOANS�KNINGAR
	public static By EPNOrganisationskontoans�kningar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSI�R - EPN - ORGANISATIONSKONTON

	public static By EPNOrganisationskonton(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSI�R - EPN - INTERNA F�RFR�GNINGAR
	public static By EPNInternaF�rfr�ningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSI�R - EPN - AVGIFTSKATEGORIER
	public static By EPNAvgiftskategorier(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(10) > a");
		return element;
	}



}
