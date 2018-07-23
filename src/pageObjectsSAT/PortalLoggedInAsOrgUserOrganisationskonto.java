package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsOrgUserOrganisationskonto {
	private static WebElement element = null;

	//ORGANISATIONSKONTO - KNAPPEN
	public static final String Organisationskonto_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right"; {
	}
	public static WebElement Organisationskonto_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right"));
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


}
