package testCasesMinProfilArbetsliv;


import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewForskarutbyten extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och l�gger till ett Forskarutbyte";


	@Test
	public void LoginAsUser4() {

		System.out.println("Testfall = " + TestCaseInfo);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	
	}

	@Test (dependsOnMethods={"LoginAsUser4"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddForskarUbyten() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenL�ggTill(driver).click();
	}

	@Test (dependsOnMethods={"AddForskarUbyten"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSparaS�ktOrganisation(driver).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void �mne() {

		//V�LJER SLUMPM�SSIGT I F�RSTA DROPDOWN
		Select �mne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyte�mne1)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);


		//V�LJER SLUMPM�SSIGT I ANDRA DROPDOWN
		Select �mne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyte�mne2)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);


		//V�LJER SLUMPM�SSIGT I TREDJE DROPDOWN
		Select �mne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyte�mne3)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);

	}

	@Test (dependsOnMethods={"�mne"})
	public void Typ() {

		Select Typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteTyp)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Typ.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Typ.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Typ"})
	public void PeriodStartOchSlutYear() {

		//V�LJER SLUMPM�SSIGT PERIODSTART
		Select PeriodStartYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartYear.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartYear.selectByIndex(number);

		//PERIODSLUT H�MTAR START�R OCH L�GGER TILL 1 �R 
		Select PeriodEndYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear))); 
		PeriodEndYear.selectByIndex(number + 1);
	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodEndMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodEndMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaForskarUbyte() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSpara(driver).click();
	}
}

