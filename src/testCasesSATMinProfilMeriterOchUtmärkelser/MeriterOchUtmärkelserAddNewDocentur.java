package testCasesSATMinProfilMeriterOchUtm�rkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtm�rkelserAddNewDocentur extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Docentur";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm�rkelser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelser"})
	public void L�ggTillDocentur() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturL�ggTill()).click();
	}

	@Test (dependsOnMethods={"L�ggTillDocentur"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation()).sendKeys(universitet);
		Thread.sleep(500);
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation()).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturS�kOrganisation()).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturSparaS�ktOrganisation()).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void �mne() {

		Select �mne1 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne1());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne2());

		Select �mne2 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�mne2());
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);
	}

	@Test (dependsOnMethods={"�mne"})
	public void �r() {

		Select �r = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_Docentur�r());
		Random randomOption3 = new Random();  
		int startOption3 = 0;
		int endOption3 = �r.getOptions().size(); 
		int number = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�r.selectByIndex(number); 
	}

	@Test (dependsOnMethods={"�r"})
	public void SparaDocentur() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_DocenturSpara()).click();
	}
}

