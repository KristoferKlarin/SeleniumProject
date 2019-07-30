package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SAT_Home_Page_Not_Logged_In {
	private static By element = null;


	//LOGGA IN KNAPPEN P� STARTSIDAN
	public static By LoginButtonChrome(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > div:nth-child(1) > div > a.btn.btn-discreet.btn-login-left.show-modal");
		return element;
	}

	//F�LTET D�R MAN SKRIVER IN EMAIL N�R MAN LOGGAR IN
	public static By EnterUserName(){

		By element = By.id("Email");
		return element;
	}

	//F�LTET D�R MAN SKRIVER IN L�SENORD N�R MAN LOGGAR IN
	public static By EnterPassword(){

		By element = By.id("Password");
		return element;
	}

	//LOGGA IN KNAPPEN SOM FINNS I MODALEN D�R MAN SKRIVER EMAIL OCH L�SENORD.
	public static By SubmitUserNameAndPassword(){

		By element = By.id("Submitter");
		return element;
	}

	//KNAPP F�R ATT �NDRA SPR�KET TILL ENGELSKA
	public static By InEnglishButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a");
		return element;
	}

	//KNAPP F�R ATT �NDRA SPR�KET TILL SVENSKA
	public static By P�SvenskaButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a");
		return element;
	}

	//KNAPP F�R ATT �PPNA BEHANDLING AV PERSONUPPGIFTER
	public static By BehandlingAvPersonuppgifterButton(){

		By element = By.cssSelector("#processingofpersonaldata");
		return element;
	}

	//BEHANDLING AV PERSONUPPGIFTER - MODAL
	public static By BehandlingAvPersonuppgifterModal(){

		By element = By.cssSelector("#editDialogBody > section > div > div.accordion-heading.greenTop > h1");
		return element;
	}

	//KNAPP F�R ATT �PPNA INFORMATION 
	public static By InformationButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > a");
		return element;
	}

	//KNAPP F�R ATT �PPNA OM PRISMA (INFORMATION) 
	public static By InformationOmPrismaButton(){

		By element = By.cssSelector("#aboutprisma");
		return element;
	}

	//OM PRISMA - MODAL (INFORMATION) 
	public static By InformationOmPrismaModal(){

		By element = By.id("editDialog");
		return element;
	}

	//KNAPP F�R ATT �PPNA OM WEBBPLATSEN (INFORMATION) 
	public static By InformationOmWebbplatsenButton(){

		By element = By.cssSelector("#aboutwebsite");
		return element;
	}

	//OM WEBBPLATSEN - MODAL (INFORMATION) 
	public static By InformationOmWebbplatsenModal(){

		By element = By.cssSelector("#editDialogBody > section > div");
		return element;
	}

	//KNAPP F�R ATT �PPNA OM DRIFTINFORMATION (INFORMATION) 
	public static By InformationDriftinformationButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > ul > li:nth-child(2) > a");
		return element;
	}

	//KNAPP F�R ATT �PPNA OM SWAMID (INFORMATION) 
	public static By InformationSWAMIDButton(){

		By element = By.id("swamid");
		return element;
	}

	//SWAMID - MODAL (INFORMATION) 
	public static By InformationSWAMIDModal(){

		By element = By.id("#editDialogBody");
		return element;
	}

	//KNAPP F�R ATT �PPNA OM ORCID (INFORMATION) 
	public static By InformationORCIDButton(){

		By element = By.id("orcid");
		return element;
	}

	//ORCID - MODAL (INFORMATION) 
	public static By InformationORCIDModal(){

		By element = By.id("#editDialogBody");
		return element;
	}

	//KNAPP F�R ATT �PPNA ANV�NDARST�DET (HJ�LP) 
	public static By Hj�lpButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(2) > a");
		return element;
	}

	//KNAPP F�R ATT �PPNA DRIFTINFORMATION
	public static By DriftinformationButton(){

		By element = By.cssSelector("#start-page > section > div > div:nth-child(1) > div.span3 > div.operation-information > div > p:nth-child(2) > strong > a");
		return element;
	}
}








