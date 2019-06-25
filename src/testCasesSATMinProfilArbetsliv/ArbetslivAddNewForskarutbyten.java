package testCasesSATMinProfilArbetsliv;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewForskarutbyten extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till ett Forskarutbyte";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser4() {

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

		if (driver.getPageSource().contains("Forskarutbyten")) 
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSparaS�ktOrganisation(driver).click();
		}
		else if (driver.getPageSource().contains("Post doctoral assignments")) 
		{
			driver.findElement(By.xpath("//button[contains(text(), 'Save choice')]")).click();	
		}

//		String NamnP�Universitet = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenS�kOrganisation(driver).getAttribute("value");
//		System.out.println("Namn P� Universitet = " + NamnP�Universitet); 
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

//		WebElement �mneEtt = �mne1.getFirstSelectedOption();
//		String Value1 = �mneEtt.getText();
//		System.out.println("�mne 1 = " + Value1 ); 


		//V�LJER SLUMPM�SSIGT I ANDRA DROPDOWN
		Select �mne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyte�mne2)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

//		WebElement �mneTv� = �mne2.getFirstSelectedOption();
//		String Value2 = �mneTv�.getText();
//		System.out.println("�mne 2 = " + Value2 ); 


		//V�LJER SLUMPM�SSIGT I TREDJE DROPDOWN
		Select �mne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyte�mne3)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);

//		WebElement �mneTre = �mne3.getFirstSelectedOption();
//		String Value3 = �mneTre.getText();
//		System.out.println("�mne 3 = " + Value3 ); 

	}

	@Test (dependsOnMethods={"�mne"})
	public void Typ() {

		Select Typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteTyp)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Typ.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Typ.selectByIndex(number);

//		WebElement Typ1 = Typ.getFirstSelectedOption();
//		String Value = Typ1.getText();
//		System.out.println("Typ = " + Value ); 

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

//		WebElement PeriodStartAr = PeriodStartYear.getFirstSelectedOption();
//		String Value = PeriodStartAr.getText();
//		System.out.println("Periodstart �r = " + Value ); 

		//PERIODSLUT H�MTAR START�R OCH L�GGER TILL 1 �R 
		Select PeriodEndYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear))); 
		PeriodEndYear.selectByIndex(number + 1);

//		WebElement PeriodEndAr = PeriodEndYear.getFirstSelectedOption();
//		String Value1 = PeriodEndAr.getText();
//		System.out.println("Periodslut �r = " + Value1 ); 
	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartMonth.selectByIndex(number);

//		WebElement PeriodStartManad = PeriodStartMonth.getFirstSelectedOption();
//		String Value = PeriodStartManad.getText();
//		System.out.println("Periodstart m�nad = " + Value );
	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodEndMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodEndMonth.selectByIndex(number);

//		WebElement PeriodEndManad = PeriodEndMonth.getFirstSelectedOption();
//		String Value = PeriodEndManad.getText();
//		System.out.println("Periodslut m�nad = " + Value );
	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaForskarUbyte() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSpara(driver).click();
	}
}

