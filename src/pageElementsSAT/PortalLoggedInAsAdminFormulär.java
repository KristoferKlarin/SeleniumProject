package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class PortalLoggedInAsAdminFormul�r {
	private static By element = null;

	//FORMUL�RKNAPPEN
	public static By Formul�rButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(6)");
		return element;	
	}

	//FORMUL�R - KAROLINSKA UNIVERSITET
	public static By KarolinskaInstitutet(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a");
		return element;	
	}

	//FORMUL�R - KAROLINSKA UNIVERSITET - FORMUL�R
	public static By KarolinskaInstitutetFormul�r(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;	
	}

	//FORMUL�R - KAROLINSKA UNIVERSITET - SIDMALLAR
	public static By KarolinskaInstitutetSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMUL�R - KAROLINSKA UNIVERSITET - AVSNITTSMALLAR
	public static By KarolinskaAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMUL�R - KAROLINSKA UNIVERSITET - UNDERH�LLSTABELLER
	public static By KarolinskaUnderh�llstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMUL�R - KAROLINSKA UNIVERSITET - DATAINST�LLNINGAR
	public static By KarolinskaDataInst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMUL�R - KAROLINSKA UNIVERSITET - KONTROLLER

	public static By KarolinskaKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMUL�R - FORMAS
	public static By Formas(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMUL�R - FORMAS - FORMUL�R

	public static By FormasFormul�r(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMUL�R - FORMAS - SIDMALLAR
	public static By FormasSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMUL�R - FORMAS - AVSNITTSMALLAR
	public static By FormasAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMUL�R - FORMAS - UNDERH�LLSTABELLER

	public static By FormasUnderh�llstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMUL�R - FORMAS - DATAINST�LLNINGAR

	public static By FormasDatainst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMUL�R - FORMAS - KONTROLLER

	public static By FormasKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}


	//FORMUL�R - VETENSKAPSR�DET
	public static By Vetenskapsr�det(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMUL�R - VETENSKAPSR�DET - FORMUL�R
	public static By Vetenskapsr�detFormul�r(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMUL�R - VETENSKAPSR�DET - SIDMALLAR
	public static By Vetenskapsr�detSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMUL�R - VETENSKAPSR�DET - AVSNITTSMALLAR
	public static By Vetenskapsr�detAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMUL�R - VETENSKAPSR�DET - UNDERH�LLSTABELLER
	public static By Vetenskapsr�detUnderh�llstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMUL�R - VETENSKAPSR�DET - DATAINST�LLNINGAR

	public static By Vetenskapsr�detDataInst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMUL�R - VETENSKAPSR�DET - KONTROLLER
	public static By Vetenskapsr�detKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMUL�R - FORTE

	public static By Forte(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMUL�R - FORTE - FORMUL�R
	public static By ForteFormul�r(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMUL�R - FORTE - SIDMALLAR
	public static By ForteSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMUL�R - FORTE - AVSNITTSMALLAR
	public static By ForteAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMUL�R - FORTE - UNDERH�LLSTABELLER
	public static By ForteUnderh�llstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMUL�R - FORTE - DATAINST�LLNINGAR
	public static By ForteDatainst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMUL�R - FORTE - KONTROLLER
	public static By ForteKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMUL�R - SKOLFI
	public static By Skolfi(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMUL�R - SKOLFI - FORMUL�R

	public static By SkolfiFormul�r(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMUL�R - SKOLFI - SIDMALLAR
	public static By SkolfiSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMUL�R - SKOLFI - AVSNITTSMALLAR
	public static By SkolfiAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMUL�R - SKOLFI - UNDERH�LLSTABELLER
	public static By SkolfiUnderh�llstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMUL�R - SKOLFI - DATAINST�LLNINGAR
	public static By SkolfiDatainst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMUL�R - SKOLFI - KONTROLLER
	public static By SkolfiKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMUL�R - EPN
	public static By EPN(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a");
		return element;
	}

	//FORMUL�R - EPN - FORMUL�R
	public static By EPNFormul�r(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMUL�R - EPN - SIDMALLAR
	public static By EPNSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMUL�R - EPN - AVSNITTSMALLAR
	public static By EPNAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMUL�R - EPN - UNDERH�LLSTABELLER
	public static By EPNUnderh�llstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMUL�R - EPN - DATAINST�LLNINGA
	public static By EPNDatainst�llningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMUL�R - EPN - KONTROLLER
	public static By EpnKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}


}
