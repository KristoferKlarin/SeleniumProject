package testCasesSATMinProfilArbetsliv;

import java.sql.Driver;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;


public class ArbetslivAddNewAnställningar extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Anställning UTAN att kopiera redan tillagd post.";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		//		WebDriverWait wait = new WebDriverWait(driver, 40);
		//		wait.until(ExpectedConditions.elementToBeClickable(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver)));

		//		WebDriverWait wait = new WebDriverWait(driver, 40);
		//		wait.until(ExpectedConditions.elementToBeClickable(PortalLoggedInAsUserMinProfil.MinProfilBy()));

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfilBy());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfilBy()).click();

		//PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddAnställning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_LäggTill(driver).click();
	}

	@Test (dependsOnMethods={"AddAnställning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		if (driver.getPageSource().contains("Anställningar"))
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaSökArbetsgivare(driver).click();
		}
		else if (driver.getPageSource().contains("Employments")) 
		{
			driver.findElement(By.xpath("//button[contains(text(), 'Save choice')]")).click();	
		}

		//		String NamnPåUniversitet = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(driver).getAttribute("value");
		//		System.out.println("Namn På Universitet = " + NamnPåUniversitet); 

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void AnställningDropDown() {

		Select Anställning = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningDropDown)));
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = Anställning.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anställning.selectByIndex(number);

		//		WebElement AnställningsNamn = Anställning.getFirstSelectedOption();
		//		String Value = AnställningsNamn.getText();
		//		System.out.println("Anställning = " + Value ); 


	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void AnställningsFormDropDown() {

		Select AnställningsForm = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningsFormDropDown)));

		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = AnställningsForm.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		AnställningsForm.selectByIndex(number);


		//		WebElement AnställningsForm1 = AnställningsForm.getFirstSelectedOption();
		//		String Value = AnställningsForm1.getText();
		//		System.out.println("Anställningsform = " + Value ); 
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void DelAvForskningIAnställningenBaseradPåHeltid() {

		String DelAvForskningIAnställningenBaseradPåHeltid = "100";
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).sendKeys(DelAvForskningIAnställningenBaseradPåHeltid);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).getAttribute("value") != DelAvForskningIAnställningenBaseradPåHeltid)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).sendKeys(DelAvForskningIAnställningenBaseradPåHeltid);

			//			String DelAvForskningIAnställningenBaseradPåHeltid1 = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).getAttribute("value");
			//			System.out.println("Del av forskning = " + DelAvForskningIAnställningenBaseradPåHeltid1 + "%"); 
		}
	}

	@Test (dependsOnMethods={"DelAvForskningIAnställningenBaseradPåHeltid"})
	public void AnställningensBörjanOchSlutYear() {


		//DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear));

		//ANSTÄLLNINGENS BÖRJAN ÅR. PLOCKAS SLUMPMÄSSIGT
		Select AnställningensBörjanYear = new Select (PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear(driver));

		//(driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear)));

		Random randomOption = new Random();  
		int endOption = AnställningensBörjanYear.getOptions().size(); 
		int number = randomOption.nextInt(endOption);  
		AnställningensBörjanYear.selectByIndex(number);

		//		WebElement AnställningensBörjanAr = AnställningensBörjanYear.getFirstSelectedOption();
		//		String Value = AnställningensBörjanAr.getText();
		//		System.out.println("Anställning år = " + Value ); 

		//ANSTÄLLNINGENS SLUT ÅT. HÄMTAR STARTÅR OCH LÄGGER TILL 1 ÅR 
		//		Select AnställningensSlutYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutYear))); 
		//		AnställningensSlutYear.selectByIndex(number + 1);

		//		WebElement AnställningensSlutjanAr = AnställningensSlutYear.getFirstSelectedOption();
		//		String Value2 = AnställningensSlutjanAr.getText();
		//		System.out.println("Anställning slut år = " + Value2); 
	}

	@Test (dependsOnMethods={"AnställningensBörjanOchSlutYear"})
	public void AnställningensBörjanMonth() {

		Select AnställningensBörjanMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanMonth)));
		Random randomOption = new Random();  
		int endOption = AnställningensBörjanMonth.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		AnställningensBörjanMonth.selectByIndex(number);

		//		WebElement AnställningensBörjanManadSelect = AnställningensBörjanMonth.getFirstSelectedOption();
		//		String AnställningensBörjanManadSelectValue = AnställningensBörjanManadSelect.getText();
		//		System.out.println("Anställnings startmånad = " + AnställningensBörjanManadSelectValue ); 
	}

	@Test (dependsOnMethods={"AnställningensBörjanMonth"})
	public void AnställningensSlutMonth() {

		Select AnställningensSlutMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutMonth)));
		Random randomOption = new Random();  
		int endOption = AnställningensSlutMonth.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		AnställningensSlutMonth.selectByIndex(number);

		//		WebElement AnställningensSlutMonthSelect = AnställningensSlutMonth.getFirstSelectedOption();
		//		String AnställningensSlutMonthValue = AnställningensSlutMonthSelect.getText();
		//		System.out.println("Anställnings slutmånad = " + AnställningensSlutMonthValue );  	
	}

	@Test (dependsOnMethods={"AnställningensSlutMonth"})
	public void ÖvrigInformation() {

		String ÖvrigInformation = "Mycket bra övrig information";
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).sendKeys(ÖvrigInformation);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).getAttribute("value") != ÖvrigInformation);
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).sendKeys(ÖvrigInformation);

			//			String ÖvrigInformation1 = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).getAttribute("value");
			//			System.out.println("Övrig information = " + ÖvrigInformation1); 
		}

	}

	@Test (dependsOnMethods={"ÖvrigInformation"})
	public void SparaAnställning() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaAnställning(driver).click();	

	}
}









