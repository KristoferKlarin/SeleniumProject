package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdminMinProfil {
	private static WebElement element = null;
	

	//MIN PROFIL - KNAPPEN
	public static final String MinProfilButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfileInternalUser > a"; {
	}
	public static WebElement MinProfilButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfileInternalUser > a"));
		return element;
	}

	//MIN PROFIL - INST�LLNINGAR
	public static final String MinProfilButton_Inst�llningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement MinProfilButton_Inst�llningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//MIN PROFIL - SWAMID-KONTO
	public static final String MinProfilButton_SWAMID_KONTO_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement MinProfilButton_SWAMID_KONTO_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}




}




