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

public class ArbetslivAddNewAnst�llningar extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Anst�llning UTAN att kopiera redan tillagd post";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {


		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddAnst�llning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_L�ggTill_CSS(driver).click();
	}

	@Test (dependsOnMethods={"AddAnst�llning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare_NAME(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare_NAME(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare_NAME(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_SparaS�kArbetsgivare_xpath(driver).click();

	}

	@Test (dependsOnMethods={"AddAnst�llning"})
	public void Anst�llningDropDown() {

		Select Anst�llning = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown_ID)));
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = Anst�llning.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llning.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void Anst�llningsFormDropDown() {

		Select Anst�llningsForm = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Anst�llningsForm.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llningsForm.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void DelAvForskningIAnst�llningenBaseradP�Heltid() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid_ID(driver).sendKeys("100");
	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void Anst�llningensB�rjanOchSlutYear() {

		//ANST�LLNINGENS B�RJAN �R. PLOCKAS SLUMPM�SSIGT
		Select Anst�llningensB�rjanYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear_NAME)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Anst�llningensB�rjanYear.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llningensB�rjanYear.selectByIndex(number);

		//ANST�LLNINGENS SLUT �T. H�MTAR START�R OCH L�GGER TILL 1 �R 
		Select Anst�llningensSlutYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear_NAME))); 
		Anst�llningensSlutYear.selectByIndex(number + 1);
	}

	@Test (dependsOnMethods={"Anst�llningensB�rjanOchSlutYear"})
	public void Anst�llningensB�rjanMonth() {

		Select Anst�llningensB�rjanMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth_NAME)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = Anst�llningensB�rjanMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llningensB�rjanMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Anst�llningensB�rjanMonth"})
	public void Anst�llningensSlutMonth() {

		Select Anst�llningensSlutMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth_NAME)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = Anst�llningensSlutMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llningensSlutMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Anst�llningensSlutMonth"})
	public void �vrigInformation() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation_ID(driver).sendKeys("Mycket Bra �vrig information");

	}
	
	@Test (dependsOnMethods={"�vrigInformation"})
	public void SparaAnst�llning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning_ID(driver).click();

	}


}
