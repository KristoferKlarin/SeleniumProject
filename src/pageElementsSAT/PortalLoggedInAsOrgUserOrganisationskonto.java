package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsOrgUserOrganisationskonto {
	private static WebElement element = null;

	//ORGANISATIONSKONTO - KNAPPEN
	public static final String Organisationskonto = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right"; {
	}
	public static WebElement Organisationskonto(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right"));
		return element;
	}
	//ORGANISATIONSKONTO - INST�LLNINGAR
	public static final String Organisationskonto_Inst�llningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement Organisationskonto_Inst�llningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}
	//ORGANISATIONSKONTO - ANS�KNINGAR OCH BIDRAG
	public static final String Organisationskonto_Ans�kningarOchBidrag = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement Organisationskonto_Ans�kningarOchBidrag(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - NEDLADDNING
	public static final String Organisationskonto_Nedladdning = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement Organisationskonto_Nedladdning(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR
	public static final String Organisationskonto_Struktur = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement Organisationskonto_Struktur(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N
	public static final String Organisationskonto_Struktur_RedigeraH�gstaNiv�n = "#contentBody > section > div.content > form > div > div > div > ul > li > div > div.span5 > div > div > a"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraH�gstaNiv�n(WebDriver driver){

		element = driver.findElement(By.cssSelector("#contentBody > section > div.content > form > div > div > div > ul > li > div > div.span5 > div > div > a"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N - SVENSKT NAMN
	public static final String Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet = "OrganizationStructure_Name"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(WebDriver driver){

		element = driver.findElement(By.id("OrganizationStructure_Name"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N - ENGELSKT NAMN
	public static final String Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet = "OrganizationStructure_NameEN"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(WebDriver driver){

		element = driver.findElement(By.id("OrganizationStructure_NameEN"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N - L�GG TILL (KNAPP)
	public static final String Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetKnapp = "#editDialogBodyFormId > div.row-fluid.button-wrapper > div"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetKnapp(WebDriver driver){

		element = driver.findElement(By.cssSelector("#editDialogBodyFormId > div.row-fluid.button-wrapper > div"));
		return element;
	}





	//ORGANISATIONSKONTO - ANV�NDARE
	public static final String Organisationskonto_Anv�ndare = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement Organisationskonto_Anv�ndare(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - BYT HEMVIST
	public static final String Organisationskonto_Byt_Hemvist = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement Organisationskonto_Byt_Hemvist(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - F�RESLAGEN HEMVIST
	public static final String Organisationskonto_F�reslagen_Hemvist = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"; {
	}
	public static WebElement Organisationskonto_F�reslagen_Hemvist(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGS�VERSIKT
	public static final String Organisationskonto_Rapporterings�versikt = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"; {
	}
	public static WebElement Organisationskonto_Rapporterings�versikt(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSSTRUKTUR
	public static final String Organisationskonto_Rapporteringsstruktur = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a"; {
	}
	public static WebElement Organisationskonto_Rapporteringsstruktur(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGS�VERSIKT
	public static final String Organisationskonto_Signerings�versikt = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a"; {
	}
	public static WebElement Organisationskonto_Signerings�versikt(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSSTRUKTUR
	public static final String Organisationskonto_Signeringsstruktur = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a"; {
	}
	public static WebElement Organisationskonto_Signeringsstruktur(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSUTLYSNINGAR
	public static final String Organisationskonto_Organisationsutlysningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a"; {
	}
	public static WebElement Organisationskonto_Organisationsutlysningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSANS�KNINGAR
	public static final String Organisationskonto_Organisationsans�kningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a"; {
	}
	public static WebElement Organisationskonto_Organisationsans�kningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - UTBETALNINGAR
	public static final String Organisationskonto_Utbetalningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a"; {
	}
	public static WebElement Organisationskonto_Utbetalningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a"));
		return element;
	}


}
