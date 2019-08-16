package testCasesSATMinProfilMeriterOchUtm�rkelser;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.SearchForOrganizationWhenButtonIdIsUnique;
import reusableMethods.driverSelect;

public class MeriterOchUtm�rkelserAddNewDocentur extends BeforeAfterTestSetup {

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
		
		SearchForOrganizationWhenButtonIdIsUnique.EnterKeyInputs(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation(), "Uppsala Universitet");

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

