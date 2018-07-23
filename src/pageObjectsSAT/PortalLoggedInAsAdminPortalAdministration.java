package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminPortalAdministration {
	private static WebElement element = null;


	//PORTALADMINISTRATION
	public static final String PortaladministrationButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a"; {
	}
	public static WebElement PortaladministrationButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a"));
		return element;
	}

	//PORTALADMINISTRATION - WEBBPLATSINST�LLNINGAR
	public static final String Webbplatinst�llningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a"; {
	}
	public static WebElement Webbplatinst�llningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - PORTALANV�NDARE
	public static final String Portalanv�ndare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a"; {
	}
	public static WebElement Portalanv�ndare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - FINANSI�RER
	public static final String Finansi�rer_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a"; {
	}
	public static WebElement Finansi�rer_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - UNDERH�LLSTABELLER
	public static final String Underh�llstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a"; {
	}
	public static WebElement Underh�llstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - HIERARKISKA UNDERH�LLSTABELLER
	public static final String HierarkiskaUnderh�llstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a"; {
	}
	public static WebElement HierarkiskaUnderh�llstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - SPR�K
	public static final String Spr�k_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a"; {
	}
	public static WebElement Spr�k_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - MEDDELANDEN
	public static final String Meddelanden_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"; {
	}
	public static WebElement Meddelanden_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - DRIFTSTATUS
	public static final String Driftstatus_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a"; {
	}
	public static WebElement Driftstatus_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - STATISTIK
	public static final String Statistik_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a"; {
	}
	public static WebElement Statistik_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a"));
		return element;
	}



}
