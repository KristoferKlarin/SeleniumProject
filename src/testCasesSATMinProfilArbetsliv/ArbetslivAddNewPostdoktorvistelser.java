package testCasesSATMinProfilArbetsliv;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewPostdoktorvistelser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Postdoktorvistelser";
	}

	@Test
	public void LoginAsUser3() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser3"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddPostdoktorvistelser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserL�ggTill()).click();
	}

	@Test (dependsOnMethods={"AddPostdoktorvistelser"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation()).sendKeys(universitet);

		Thread.sleep(500);

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation()).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserS�kOrganisation()).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSparaS�ktOrganisation()).click();	
	}


	@Test (dependsOnMethods={"SelectOrganization"})
	public void �mneDropDown() {

		Select �mne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser�mne1());

		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

		Select �mne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser�mne2());

		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

		Select �mne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser�mne3());

		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"�mneDropDown"})
	public void PeriodStartOchSlutYear() {

		Select PeriodStartYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear());

		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartYear.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartYear.selectByIndex(number);

		Select PeriodEndYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear());
		PeriodEndYear.selectByIndex(number + 1);

	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth());

		Random randomOption = new Random();  
		int endOption = PeriodStartMonth.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		PeriodStartMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth());

		Random randomOption = new Random();  
		int endOption = PeriodEndMonth.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		PeriodEndMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaPostdoktorvistelser() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSpara()).click();
	}
}