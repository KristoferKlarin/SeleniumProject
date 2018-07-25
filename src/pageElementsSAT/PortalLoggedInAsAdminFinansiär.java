package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdminFinansi�r {
	private static WebElement element = null;


	//FINANSI�RKNAPPEN
	public static final String Finansi�rButton = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)"; {
	}
	public static WebElement Finansi�rButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET
	public static final String KarolinskaInstitutet = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"; {
	}
	public static WebElement KarolinskaInstitutet(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - FINANSI�RSINT�LLNINGAR
	public static final String KarolinskaInstitutetFinansi�rsinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement KarolinskaInstitutetFinansi�rsinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - GRANSKARPOOLINST�LLNINGAR
	public static final String KarolinskaInstitutetGranskarpoolinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement KarolinskaInstitutetGranskarpoolinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - INTERNA ANV�NDARE
	public static final String KarolinskaInstitutetInternaAnv�ndare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement KarolinskaInstitutetInternaAnv�ndare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ARVODESINST�LLNINGAR
	public static final String KarolinskaInstitutetArvodesinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement KarolinskaInstitutetArvodesinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - SINK-ADMINISTRATION
	public static final String KarolinskaInstitutetSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement KarolinskaInstitutetSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - S�KNYCKLAR
	public static final String KarolinskaInstitutetS�knycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement KarolinskaInstitutetS�knycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ORGANISATIONSKONTOANS�KNINGAR
	public static final String KarolinskaInstitutetOrganisationskontoans�kningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement KarolinskaInstitutetOrganisationskontoans�kningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - ORGANISATIONSKONTON
	public static final String KarolinskaInstitutetOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement KarolinskaInstitutetOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - KAROLINSKA INSTITUTET - INTERNA F�RFR�GNINGAR
	public static final String KarolinskaInstitutetInternaF�rfr�ningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement KarolinskaInstitutetInternaF�rfr�ningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - FORMAS
	public static final String Formas = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"; {
	}
	public static WebElement Formas(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - FINANSI�RSINT�LLNINGAR
	public static final String FormasFinansi�rsinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement FormasFinansi�rsinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - FORMAS - GRANSKARPOOLINST�LLNINGAR
	public static final String FormasGranskarpoolinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement FormasGranskarpoolinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - INTERNA ANV�NDARE
	public static final String FormasInternaAnv�ndare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement FormasInternaAnv�ndare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - ARVODESINST�LLNINGAR
	public static final String FormasArvodesinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement FormasArvodesinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - SINK-ADMINISTRATION
	public static final String FormasSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement FormasSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - S�KNYCKLAR
	public static final String FormasS�knycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement FormasS�knycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - ORGANISATIONSKONTOANS�KNINGAR
	public static final String FormasOrganisationskontoans�kningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement FormasOrganisationskontoans�kningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - ORGANISATIONSKONTON
	public static final String FormasOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement FormasOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - FORMAS - INTERNA F�RFR�GNINGAR
	public static final String FormasInternaF�rfr�ningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement FormasInternaF�rfr�ningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET
	public static final String Vetenskapsr�det = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"; {
	}
	public static WebElement Vetenskapsr�det(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - FINANSI�RSINT�LLNINGAR
	public static final String Vetenskapsr�detFinansi�rsinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement Vetenskapsr�detFinansi�rsinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - GRANSKARPOOLINST�LLNINGAR
	public static final String Vetenskapsr�detGranskarpoolinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement Vetenskapsr�detGranskarpoolinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - INTERNA ANV�NDARE
	public static final String Vetenskapsr�detInternaAnv�ndare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement Vetenskapsr�detInternaAnv�ndare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ARVODESINST�LLNINGAR
	public static final String Vetenskapsr�detArvodesinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement Vetenskapsr�detArvodesinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - SINK-ADMINISTRATION
	public static final String Vetenskapsr�detSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement Vetenskapsr�detSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - S�KNYCKLAR
	public static final String Vetenskapsr�detS�knycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement Vetenskapsr�detS�knycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ORGANISATIONSKONTOANS�KNINGAR
	public static final String Vetenskapsr�detOrganisationskontoans�kningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement Vetenskapsr�detOrganisationskontoans�kningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - ORGANISATIONSKONTON
	public static final String Vetenskapsr�detOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement Vetenskapsr�detOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - VETENSKAPSR�DET - INTERNA F�RFR�GNINGAR
	public static final String Vetenskapsr�detInternaF�rfr�ningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement Vetenskapsr�detInternaF�rfr�ningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - FORTE
	public static final String Forte = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"; {
	}
	public static WebElement Forte(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - FORTE - FINANSI�RSINT�LLNINGAR
	public static final String ForteFinansi�rsinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement ForteFinansi�rsinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - FORTE - GRANSKARPOOLINST�LLNINGAR
	public static final String ForteGranskarpoolinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement ForteGranskarpoolinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - FORTE - INTERNA ANV�NDARE
	public static final String ForteInternaAnv�ndare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement ForteInternaAnv�ndare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - FORTE - ARVODESINST�LLNINGAR
	public static final String ForteArvodesinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement ForteArvodesinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - FORTE - SINK-ADMINISTRATION
	public static final String ForteSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement ForteSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - FORTE - S�KNYCKLAR
	public static final String ForteS�knycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement ForteS�knycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - FORTE - ORGANISATIONSKONTOANS�KNINGAR
	public static final String ForteOrganisationskontoans�kningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement ForteOrganisationskontoans�kningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - FORTE - ORGANISATIONSKONTON
	public static final String ForteOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement ForteOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - FORTE - INTERNA F�RFR�GNINGAR
	public static final String ForteInternaF�rfr�ningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement ForteInternaF�rfr�ningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI
	public static final String Skolfi = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"; {
	}
	public static WebElement Skolfi(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - FINANSI�RSINT�LLNINGAR
	public static final String SkolfiFinansi�rsinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement SkolfiFinansi�rsinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - GRANSKARPOOLINST�LLNINGAR
	public static final String SkolfiGranskarpoolinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement SkolfiGranskarpoolinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - INTERNA ANV�NDARE
	public static final String SkolfiInternaAnv�ndare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement SkolfiInternaAnv�ndare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - ARVODESINST�LLNINGAR
	public static final String SkolfiArvodesinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement SkolfiArvodesinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - SINK-ADMINISTRATION
	public static final String SkolfiSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement SkolfiSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - S�KNYCKLAR
	public static final String SkolfiS�knycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement SkolfiS�knycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - ORGANISATIONSKONTOANS�KNINGAR
	public static final String SkolfiOrganisationskontoans�kningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement SkolfiOrganisationskontoans�kningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - ORGANISATIONSKONTON
	public static final String SkolfiOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement SkolfiOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - SKOLFI - INTERNA F�RFR�GNINGAR
	public static final String SkolfiInternaF�rfr�ningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement SkolfiInternaF�rfr�ningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;

	}
	//FINANSI�R - EPN
	public static final String EPN = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"; {
	}
	public static WebElement EPN(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - EPN - FINANSI�RSINT�LLNINGAR
	public static final String EPNFinansi�rsinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement EPNFinansi�rsinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSI�R - EPN - GRANSKARPOOLINST�LLNINGAR
	public static final String EPNGranskarpoolinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement EPNGranskarpoolinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSI�R - EPN - INTERNA ANV�NDARE
	public static final String EPNInternaAnv�ndare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement EPNInternaAnv�ndare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSI�R - EPN - ARVODESINST�LLNINGAR
	public static final String EPNArvodesinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement EPNArvodesinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSI�R - EPN - SINK-ADMINISTRATION
	public static final String EPNSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement EPNSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSI�R - EPN - S�KNYCKLAR
	public static final String EPNS�knycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement EPNS�knycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSI�R - EPN - ORGANISATIONSKONTOANS�KNINGAR
	public static final String EPNOrganisationskontoans�kningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement EPNOrganisationskontoans�kningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSI�R - EPN - ORGANISATIONSKONTON
	public static final String EPNOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement EPNOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSI�R - EPN - INTERNA F�RFR�GNINGAR
	public static final String EPNInternaF�rfr�ningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement EPNInternaF�rfr�ningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSI�R - EPN - AVGIFTSKATEGORIER
	public static final String EPNAvgiftskategorier = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement EPNAvgiftskategorier(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}



}
