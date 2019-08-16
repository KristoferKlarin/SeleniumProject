package testCasesSATMinProfilMeriterOchUtm�rkelser;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.driverSelect;

public class MeriterOchUtm�rkelserAddNewHandleddaPersonerEnskildPerson extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Enskild handledd person";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm�rkelser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelser"})
	public void L�ggTillHandleddaPersonerEnskildPerson() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp()).click();
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPerson"})
	public void L�ggTillHandleddaPersonerEnskildPersonF�rnamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn()).sendKeys("F�rnamn3");
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonF�rnamn"})
	public void L�ggTillHandleddaPersonerEnskildPersonEfternamn() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn()).sendKeys("Efternamn3");
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonEfternamn"})
	public void L�ggTillHandleddaPersonerEnskildPersonSlut�r() {

		Select Slut�r = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Slut�r, 0, 0);

	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonSlut�r"})
	public void L�ggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner() {

		Select TypAvHandleddaPersoner = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson());

		RandomDropDownOptionSelect.RandomOptionInDropDown(TypAvHandleddaPersoner, 1, 0);

	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner"})
	public void L�ggTillHandleddaPersonerEnskildPersonRoll() {

		Select Roll = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Roll, 1, 0);

	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonRoll"})
	public void L�ggTillHandleddaPersonerEnskildPersonRollSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson()).click();
	}


}