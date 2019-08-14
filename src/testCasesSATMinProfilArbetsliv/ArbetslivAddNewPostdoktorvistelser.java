package testCasesSATMinProfilArbetsliv;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.RandomDropDownOptionSelect;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewPostdoktorvistelser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Postdoktorvistelser";
	}

	@Test
	public void LoginAsUser3() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser3"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
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

		RandomDropDownOptionSelect.RandomOptionInDropDown(�mne1, 1, 0);

		Select �mne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser�mne2());

		RandomDropDownOptionSelect.RandomOptionInDropDown(�mne2, 1, 0);

		Select �mne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser�mne3());

		RandomDropDownOptionSelect.RandomOptionInDropDown(�mne3, 1, 0);

	}

	@Test (dependsOnMethods={"�mneDropDown"})
	public void PeriodStartOchSlutYear() {

		Select PeriodStartYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear());

		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodStartYear, 1, 1);

		Select PeriodEndYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear());

		RandomDropDownOptionSelect.RandomOptionInDropdownPreviousDropDownPlusOne(PeriodEndYear);


	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth());

		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodStartMonth, 0, 0);

	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth());

		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodEndMonth, 0, 0);

	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaPostdoktorvistelser() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSpara()).click();
	}
}