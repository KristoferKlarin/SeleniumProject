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

public class MeriterOchUtm�rkelserAddNewDocentur extends BeforeAfterTestBrowsers {


	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Docentur";


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
	public void L�ggTillDocentur() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill_Css(driver).click();
	}

	@Test (dependsOnMethods={"L�ggTillDocentur"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation_Name(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation_Name(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation_Name(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturSparaS�ktOrganisation_Tagname(driver).click();
	}


	@Test (dependsOnMethods={"SelectOrganization"})
	public void �mne() {

		//V�LJER SLUMPM�SSIGT I F�RSTA DROPDOWN
		Select �mne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne1_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

		//V�LJER SLUMPM�SSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne2_Id);
		Select �mne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne2_Id)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

	}

	@Test (dependsOnMethods={"�mne"})
	public void �r() {

		//V�LJER SLUMPM�SSIGT I F�RSTA DROPDOWN
		Select �r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�r_Id)));
		Random randomOption3 = new Random();  
		int startOption3 = 0;
		int endOption3 = �r.getOptions().size(); 
		int number = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�r.selectByIndex(number);
	}

	@Test (dependsOnMethods={"�r"})
	public void SparaDocentur() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturSpara_Id(driver).click();
	}
}

