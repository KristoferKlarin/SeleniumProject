package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminPortalAdministration {
	private static WebElement element = null;


	//PORTALADMINISTRATION
	public static final String PortaladministrationButton = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a"; {
	}
	public static WebElement PortaladministrationButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a"));
		return element;
	}

	//PORTALADMINISTRATION - WEBBPLATSINST�LLNINGAR
	public static final String Webbplatinst�llningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a"; {
	}
	public static WebElement Webbplatinst�llningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - PORTALANV�NDARE
	public static final String Portalanv�ndare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a"; {
	}
	public static WebElement Portalanv�ndare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - FINANSI�RER
	public static final String Finansi�rer = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a"; {
	}
	public static WebElement Finansi�rer(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - UNDERH�LLSTABELLER
	public static final String Underh�llstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a"; {
	}
	public static WebElement Underh�llstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - HIERARKISKA UNDERH�LLSTABELLER
	public static final String HierarkiskaUnderh�llstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a"; {
	}
	public static WebElement HierarkiskaUnderh�llstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - SPR�K
	public static final String Spr�k = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a"; {
	}
	public static WebElement Spr�k(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - MEDDELANDEN
	public static final String Meddelanden = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"; {
	}
	public static WebElement Meddelanden(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - DRIFTSTATUS
	public static final String Driftstatus = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a"; {
	}
	public static WebElement Driftstatus(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - STATISTIK
	public static final String Statistik = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a"; {
	}
	public static WebElement Statistik(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a"));
		return element;
	}



}
