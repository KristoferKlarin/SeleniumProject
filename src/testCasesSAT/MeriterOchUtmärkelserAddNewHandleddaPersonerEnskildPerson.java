package testCasesSAT;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class MeriterOchUtm�rkelserAddNewHandleddaPersonerEnskildPerson extends BeforeAfterTestBrowsers {



	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Enskild handledd person";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		driver.manage().window().maximize();
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm�rkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelser"})
	public void L�ggTillHandleddaPersonerEnskildPerson() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp_Css(driver).click();
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPerson"})
	public void L�ggTillHandleddaPersonerEnskildPersonF�rnamn() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn_Id(driver).sendKeys("F�rnamn3");
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonF�rnamn"})
	public void L�ggTillHandleddaPersonerEnskildPersonEfternamn() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn_Id(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonEfternamn"})
	public void L�ggTillHandleddaPersonerEnskildPersonSlut�r() {

		Select Slut�r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r_Id)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = Slut�r.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Slut�r.selectByIndex(number);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonSlut�r"})
	public void L�ggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner() {

		Select TypAvHandleddaPersoner = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson_Id)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = TypAvHandleddaPersoner.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		TypAvHandleddaPersoner.selectByIndex(number2);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner"})
	public void L�ggTillHandleddaPersonerEnskildPersonRoll() {

		Select Roll = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll_Id)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = Roll.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		Roll.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonRoll"})
	public void L�ggTillHandleddaPersonerEnskildPersonRollSpara() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson_Id(driver).click();
	}


}