package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdminFinansi�r {
	private static WebElement element = null;


	//FINANSI�RKNAPPEN
	public static final String Finansi�rButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)"; {
	}
	public static WebElement Finansi�rButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET
	public static final String KarolinskaInstitutet_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"; {
	}
	public static WebElement KarolinskaInstitutet_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - FINANSI�RSINT�LLNINGAR
	public static final String KarolinskaInstitutetFinansi�rsinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement KarolinskaInstitutetFinansi�rsinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - GRANSKARPOOLINST�LLNINGAR
	public static final String KarolinskaInstitutetGranskarpoolinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement KarolinskaInstitutetGranskarpoolinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - INTERNA ANV�NDARE
	public static final String KarolinskaInstitutetInternaAnv�ndare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement KarolinskaInstitutetInternaAnv�ndare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ARVODESINST�LLNINGAR
	public static final String KarolinskaInstitutetArvodesinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement KarolinskaInstitutetArvodesinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - SINK-ADMINISTRATION
	public static final String KarolinskaInstitutetSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement KarolinskaInstitutetSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - S�KNYCKLAR
	public static final String KarolinskaInstitutetS�knycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement KarolinskaInstitutetS�knycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ORGANISATIONSKONTOANS�KNINGAR
	public static final String KarolinskaInstitutetOrganisationskontoans�kningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement KarolinskaInstitutetOrganisationskontoans�kningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ORGANISATIONSKONTON
	public static final String KarolinskaInstitutetOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement KarolinskaInstitutetOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - INTERNA F�RFR�GNINGAR
	public static final String KarolinskaInstitutetInternaF�rfr�ningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement KarolinskaInstitutetInternaF�rfr�ningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - FORMAS
	public static final String Formas_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"; {
	}
	public static WebElement Formas_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - FINANSI�RSINT�LLNINGAR
	public static final String FormasFinansi�rsinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement FormasFinansi�rsinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - FORMAS - GRANSKARPOOLINST�LLNINGAR
	public static final String FormasGranskarpoolinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement FormasGranskarpoolinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - INTERNA ANV�NDARE
	public static final String FormasInternaAnv�ndare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement FormasInternaAnv�ndare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - ARVODESINST�LLNINGAR
	public static final String FormasArvodesinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement FormasArvodesinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - SINK-ADMINISTRATION
	public static final String FormasSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement FormasSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - S�KNYCKLAR
	public static final String FormasS�knycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement FormasS�knycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - ORGANISATIONSKONTOANS�KNINGAR
	public static final String FormasOrganisationskontoans�kningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement FormasOrganisationskontoans�kningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - ORGANISATIONSKONTON
	public static final String FormasOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement FormasOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - INTERNA F�RFR�GNINGAR
	public static final String FormasInternaF�rfr�ningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement FormasInternaF�rfr�ningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET
	public static final String Vetenskapsr�det_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"; {
	}
	public static WebElement Vetenskapsr�det_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - FINANSI�RSINT�LLNINGAR
	public static final String Vetenskapsr�detFinansi�rsinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement Vetenskapsr�detFinansi�rsinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - GRANSKARPOOLINST�LLNINGAR
	public static final String Vetenskapsr�detGranskarpoolinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement Vetenskapsr�detGranskarpoolinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - INTERNA ANV�NDARE
	public static final String Vetenskapsr�detInternaAnv�ndare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement Vetenskapsr�detInternaAnv�ndare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ARVODESINST�LLNINGAR
	public static final String Vetenskapsr�detArvodesinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement Vetenskapsr�detArvodesinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - SINK-ADMINISTRATION
	public static final String Vetenskapsr�detSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement Vetenskapsr�detSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - S�KNYCKLAR
	public static final String Vetenskapsr�detS�knycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement Vetenskapsr�detS�knycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ORGANISATIONSKONTOANS�KNINGAR
	public static final String Vetenskapsr�detOrganisationskontoans�kningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement Vetenskapsr�detOrganisationskontoans�kningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ORGANISATIONSKONTON
	public static final String Vetenskapsr�detOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement Vetenskapsr�detOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - INTERNA F�RFR�GNINGAR
	public static final String Vetenskapsr�detInternaF�rfr�ningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement Vetenskapsr�detInternaF�rfr�ningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - FORTE
	public static final String Forte_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"; {
	}
	public static WebElement Forte_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - FORTE - FINANSI�RSINT�LLNINGAR
	public static final String ForteFinansi�rsinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement ForteFinansi�rsinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - FORTE - GRANSKARPOOLINST�LLNINGAR
	public static final String ForteGranskarpoolinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement ForteGranskarpoolinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - FORTE - INTERNA ANV�NDARE
	public static final String ForteInternaAnv�ndare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement ForteInternaAnv�ndare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - FORTE - ARVODESINST�LLNINGAR
	public static final String ForteArvodesinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement ForteArvodesinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - FORTE - SINK-ADMINISTRATION
	public static final String ForteSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement ForteSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - FORTE - S�KNYCKLAR
	public static final String ForteS�knycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement ForteS�knycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - FORTE - ORGANISATIONSKONTOANS�KNINGAR
	public static final String ForteOrganisationskontoans�kningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement ForteOrganisationskontoans�kningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - FORTE - ORGANISATIONSKONTON
	public static final String ForteOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement ForteOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - FORTE - INTERNA F�RFR�GNINGAR
	public static final String ForteInternaF�rfr�ningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement ForteInternaF�rfr�ningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI
	public static final String Skolfi_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"; {
	}
	public static WebElement Skolfi_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - FINANSI�RSINT�LLNINGAR
	public static final String SkolfiFinansi�rsinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement SkolfiFinansi�rsinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - GRANSKARPOOLINST�LLNINGAR
	public static final String SkolfiGranskarpoolinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement SkolfiGranskarpoolinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - INTERNA ANV�NDARE
	public static final String SkolfiInternaAnv�ndare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement SkolfiInternaAnv�ndare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - ARVODESINST�LLNINGAR
	public static final String SkolfiArvodesinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement SkolfiArvodesinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - SINK-ADMINISTRATION
	public static final String SkolfiSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement SkolfiSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - S�KNYCKLAR
	public static final String SkolfiS�knycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement SkolfiS�knycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - ORGANISATIONSKONTOANS�KNINGAR
	public static final String SkolfiOrganisationskontoans�kningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement SkolfiOrganisationskontoans�kningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - ORGANISATIONSKONTON
	public static final String SkolfiOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement SkolfiOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - INTERNA F�RFR�GNINGAR
	public static final String SkolfiInternaF�rfr�ningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement SkolfiInternaF�rfr�ningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;

	}
	//FINANSI�R - EPN
	public static final String EPN_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"; {
	}
	public static WebElement EPN_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - EPN - FINANSI�RSINT�LLNINGAR
	public static final String EPNFinansi�rsinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement EPNFinansi�rsinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - EPN - GRANSKARPOOLINST�LLNINGAR
	public static final String EPNGranskarpoolinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement EPNGranskarpoolinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - EPN - INTERNA ANV�NDARE
	public static final String EPNInternaAnv�ndare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement EPNInternaAnv�ndare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - EPN - ARVODESINST�LLNINGAR
	public static final String EPNArvodesinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement EPNArvodesinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - EPN - SINK-ADMINISTRATION
	public static final String EPNSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement EPNSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - EPN - S�KNYCKLAR
	public static final String EPNS�knycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement EPNS�knycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - EPN - ORGANISATIONSKONTOANS�KNINGAR
	public static final String EPNOrganisationskontoans�kningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement EPNOrganisationskontoans�kningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - EPN - ORGANISATIONSKONTON
	public static final String EPNOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement EPNOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - EPN - INTERNA F�RFR�GNINGAR
	public static final String EPNInternaF�rfr�ningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement EPNInternaF�rfr�ningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - EPN - AVGIFTSKATEGORIER
	public static final String EPNAvgiftskategorier_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement EPNAvgiftskategorier_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}



}
