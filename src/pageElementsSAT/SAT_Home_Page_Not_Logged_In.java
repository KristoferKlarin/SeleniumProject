package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SAT_Home_Page_Not_Logged_In {

	private static WebElement element = null;


	//LOGGA IN KNAPPEN P� STARTSIDAN
	public static final String LoginButtonChrome = "body > div.page-container > div.container > div.row.header-row > header > div > div:nth-child(1) > div > a.btn.btn-discreet.btn-login-left.show-modal"; {
	}
	public static WebElement LoginButtonChrome(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > div:nth-child(1) > div > a.btn.btn-discreet.btn-login-left.show-modal"));
		return element;
	}

	//F�LTET D�R MAN SKRIVER IN EMAIL N�R MAN LOGGAR IN
	public static final String EnterUserName = "Email"; {	
	}
	public static WebElement EnterUserName(WebDriver driver){

		element = driver.findElement(By.id("Email"));
		return element;
	}

	//F�LTET D�R MAN SKRIVER IN L�SENORD N�R MAN LOGGAR IN
	public static final String EnterPassword = "Password"; {	
	}
	public static WebElement EnterPassword(WebDriver driver){

		element = driver.findElement(By.id("Password"));
		return element;
	}

	//LOGGA IN KNAPPEN SOM FINNS I MODALEN D�R MAN SKRIVER EMAIL OCH L�SENORD.
	public static final String SubmitUserNameAndPassword = "Submitter"; {	
	}
	public static WebElement SubmitUserNameAndPassword(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//KNAPP F�R ATT �NDRA SPR�KET TILL ENGELSKA
	public static final String InEnglishButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"; {	
	}
	public static WebElement InEnglishButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"));
		return element;
	}

	//KNAPP F�R ATT �NDRA SPR�KET TILL SVENSKA
	public static final String P�SvenskaButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"; {	
	}
	public static WebElement P�SvenskaButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"));
		return element;
	}

	//KNAPP F�R ATT �PPNA BEHANDLING AV PERSONUPPGIFTER
	public static final String BehandlingAvPersonuppgifterButton = "#processingofpersonaldata"; {	
	}
	public static WebElement BehandlingAvPersonuppgifterButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#processingofpersonaldata"));
		return element;
	}

	//BEHANDLING AV PERSONUPPGIFTER - MODAL
	public static final String BehandlingAvPersonuppgifterModal = "#editDialogBody > section > div > div.accordion-heading.greenTop > h1"; {	
	}
	public static WebElement BehandlingAvPersonuppgifterModal(WebDriver driver){

		element = driver.findElement(By.cssSelector("#editDialogBody > section > div > div.accordion-heading.greenTop > h1"));
		return element;
	}

	//KNAPP F�R ATT �PPNA INFORMATION 
	public static final String InformationButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > a"; {	
	}
	public static WebElement InformationButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > a"));
		return element;
	}

	//KNAPP F�R ATT �PPNA OM PRISMA (INFORMATION) 
	public static final String InformationOmPrismaButton = "#aboutprisma"; {	
	}
	public static WebElement InformationOmPrismaButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#aboutprisma"));
		return element;
	}

	//OM PRISMA - MODAL (INFORMATION) 
	public static final String InformationOmPrismaModal = "editDialog"; {	
	}
	public static WebElement InformationOmPrismaModal(WebDriver driver){

		element = driver.findElement(By.id("editDialog"));
		return element;
	}

	//KNAPP F�R ATT �PPNA OM WEBBPLATSEN (INFORMATION) 
	public static final String InformationOmWebbplatsenButton = "#aboutwebsite"; {	
	}
	public static WebElement InformationOmWebbplatsenButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#aboutwebsite"));
		return element;
	}

	//OM WEBBPLATSEN - MODAL (INFORMATION) 
	public static final String InformationOmWebbplatsenModal = "#editDialogBody > section > div"; {	
	}
	public static WebElement InformationOmWebbplatsenModal(WebDriver driver){

		element = driver.findElement(By.cssSelector("#editDialogBody > section > div"));
		return element;
	}

	//KNAPP F�R ATT �PPNA OM DRIFTINFORMATION (INFORMATION) 
	public static final String InformationDriftinformationButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > ul > li:nth-child(2) > ae"; {	
	}
	public static WebElement InformationDriftinformationButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//KNAPP F�R ATT �PPNA OM SWAMID (INFORMATION) 
	public static final String InformationSWAMIDButton = "swamid"; {	
	}
	public static WebElement InformationSWAMIDButton(WebDriver driver){

		element = driver.findElement(By.id("swamid"));
		return element;
	}

	//SWAMID - MODAL (INFORMATION) 
	public static final String InformationSWAMIDModal = "#editDialogBody"; {	
	}
	public static WebElement InformationSWAMIDModal(WebDriver driver){

		element = driver.findElement(By.id("#editDialogBody"));
		return element;
	}

	//KNAPP F�R ATT �PPNA OM ORCID (INFORMATION) 
	public static final String InformationORCIDButton = "orcid"; {	
	}
	public static WebElement InformationORCIDButton(WebDriver driver){

		element = driver.findElement(By.id("orcid"));
		return element;
	}

	//ORCID - MODAL (INFORMATION) 
	public static final String InformationORCIDModal = "#editDialogBody"; {	
	}
	public static WebElement InformationORCIDModal(WebDriver driver){

		element = driver.findElement(By.id("#editDialogBody"));
		return element;
	}

	//KNAPP F�R ATT �PPNA ANV�NDARST�DET (HJ�LP) 
	public static final String Hj�lpButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(2) > a"; {	
	}
	public static WebElement Hj�lpButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(2) > a"));
		return element;
	}
	
	//KNAPP F�R ATT �PPNA DRIFTINFORMATION
		public static final String DriftinformationButton = "#start-page > section > div > div:nth-child(1) > div.span3 > div.operation-information > div > p:nth-child(2) > strong > a"; {	
		}
		public static WebElement DriftinformationButton(WebDriver driver){

			element = driver.findElement(By.cssSelector("#start-page > section > div > div:nth-child(1) > div.span3 > div.operation-information > div > p:nth-child(2) > strong > a"));
			return element;
		}





}








