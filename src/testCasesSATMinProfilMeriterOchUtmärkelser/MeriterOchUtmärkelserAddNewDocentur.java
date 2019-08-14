package testCasesSATMinProfilMeriterOchUtm�rkelser;

import java.util.Random;
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

public class MeriterOchUtm�rkelserAddNewDocentur extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Docentur";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm�rkelser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelser"})
	public void L�ggTillDocentur() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill()).click();
	}

	@Test (dependsOnMethods={"L�ggTillDocentur"})
	public void SelectOrganization() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation());

		String universitet = "Uppsala Universitet";
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation()).sendKeys(universitet);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation()).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation()).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturSparaS�ktOrganisation()).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void �mne() {

		Select �mne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne1());

		RandomDropDownOptionSelect.RandomOptionInDropDown(�mne1, 1, 0);


		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne2());

		Select �mne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne2());

		RandomDropDownOptionSelect.RandomOptionInDropDown(�mne2, 1, 0);

	}

	@Test (dependsOnMethods={"�mne"})
	public void �r() {

		Select �r = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�r());

		RandomDropDownOptionSelect.RandomOptionInDropDown(�r, 0, 0);

	}

	@Test (dependsOnMethods={"�r"})
	public void SparaDocentur() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturSpara()).click();
	}
}

