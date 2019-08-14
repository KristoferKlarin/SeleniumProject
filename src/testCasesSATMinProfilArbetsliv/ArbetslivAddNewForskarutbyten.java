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

public class ArbetslivAddNewForskarutbyten extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till ett Forskarutbyte";
	}

	@Test
	public void LoginAsUser4() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser4"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddForskarUbyten() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenL�ggTill());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenL�ggTill()).click();
	}

	@Test (dependsOnMethods={"AddForskarUbyten"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation()).sendKeys(universitet);

		Thread.sleep(500);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation()).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation()).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSparaS�ktOrganisation()).click();
	}


	@Test (dependsOnMethods={"SelectOrganization"})
	public void �mne() {

		Select �mne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyte�mne1());

		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

		Select �mne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyte�mne2());

		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

		Select �mne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyte�mne3());

		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"�mne"})
	public void Typ() {

		Select Typ = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteTyp());

		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Typ.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Typ.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Typ"})
	public void PeriodStartOchSlutYear() {

		Select PeriodStartYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear());

		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartYear.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartYear.selectByIndex(number);

		Select PeriodEndYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear());
		PeriodEndYear.selectByIndex(number + 1);
	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth());

		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth());

		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodEndMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodEndMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaForskarUbyte() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSpara()).click();
	}
}

