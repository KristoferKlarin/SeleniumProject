package testCasesSAT;

import java.util.Random;


import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class MeriterOchUtm�rkelserAddNew�vrigaMeriter extends BeforeAfterTestBrowsers {
	
	
	
	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en �vriga meriter";


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
	public void L�ggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterL�ggTill_Css(driver).click();
	}
	
	@Test (dependsOnMethods={"L�ggTill"})
	public void Start�rAndSlut�r() {

		Select Start�r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterStart�r_Id)));
		Random randomOptionStart�r = new Random();  
		int startOptionStart�r = 0;
		int endOptionStart�r = Start�r.getOptions().size(); 
		int numberStart�r = startOptionStart�r + randomOptionStart�r .nextInt(endOptionStart�r - startOptionStart�r);  
		Start�r.selectByIndex(numberStart�r);
		
		Select Slut�r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r_Id)));
		Slut�r.selectByIndex(numberStart�r + 1);
	}
	
	@Test (dependsOnMethods={"Start�rAndSlut�r"})
	public void TypAvMerit() {

	PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit_Name(driver).sendKeys("Test123");
		
	}
	
	@Test (dependsOnMethods={"TypAvMerit"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning_Id(driver).sendKeys("En bra beskrivning");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara_Id(driver).click();
	}
}
