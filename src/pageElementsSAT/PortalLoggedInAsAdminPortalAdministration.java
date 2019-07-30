package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PortalLoggedInAsAdminPortalAdministration {
	private static By element = null;


	//PORTALADMINISTRATION
	public static By PortaladministrationButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a");
		return element;
	}

	//PORTALADMINISTRATION - WEBBPLATSINST�LLNINGAR
	public static By Webbplatinst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - PORTALANV�NDARE
	public static By Portalanv�ndare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - FINANSI�RER
	public static By Finansi�rer(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - UNDERH�LLSTABELLER
	public static By Underh�llstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - HIERARKISKA UNDERH�LLSTABELLER
	public static By HierarkiskaUnderh�llstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - SPR�K
	public static By Spr�k(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - MEDDELANDEN
	public static By Meddelanden(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - DRIFTSTATUS
	public static By Driftstatus(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - STATISTIK
	public static By Statistik(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a");
		return element;
	}



}
