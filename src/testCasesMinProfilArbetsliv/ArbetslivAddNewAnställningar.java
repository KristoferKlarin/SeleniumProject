package testCasesMinProfilArbetsliv;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewAnst�llningar extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Anst�llning UTAN att kopiera redan tillagd post";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddAnst�llning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_L�ggTill(driver).click();
	}

	@Test (dependsOnMethods={"AddAnst�llning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_SparaS�kArbetsgivare(driver).click();
		
		String NamnP�Universitet = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare(driver).getAttribute("value");
		System.out.println("Namn P� Universitet = " + NamnP�Universitet); 

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void Anst�llningDropDown() {

		Select Anst�llning = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown)));
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = Anst�llning.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llning.selectByIndex(number);

		WebElement Anst�llningsNamn = Anst�llning.getFirstSelectedOption();
		String Value = Anst�llningsNamn.getText();
		System.out.println("Anst�llning = " + Value ); 

		
	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void Anst�llningsFormDropDown() {

		Select Anst�llningsForm = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Anst�llningsForm.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llningsForm.selectByIndex(number);
		
		
		WebElement Anst�llningsForm1 = Anst�llningsForm.getFirstSelectedOption();
		String Value = Anst�llningsForm1.getText();
		System.out.println("Anst�llningsform = " + Value ); 
	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void DelAvForskningIAnst�llningenBaseradP�Heltid() {

		String DelAvForskningIAnst�llningenBaseradP�Heltid = "100";
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid(driver).sendKeys(DelAvForskningIAnst�llningenBaseradP�Heltid);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid(driver).getAttribute("value") != DelAvForskningIAnst�llningenBaseradP�Heltid)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid(driver).sendKeys(DelAvForskningIAnst�llningenBaseradP�Heltid);
	
			String DelAvForskningIAnst�llningenBaseradP�Heltid1 = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid(driver).getAttribute("value");
			System.out.println("Del av forskning = " + DelAvForskningIAnst�llningenBaseradP�Heltid1 + "%"); 
		}
	}

	@Test (dependsOnMethods={"DelAvForskningIAnst�llningenBaseradP�Heltid"})
	public void Anst�llningensB�rjanOchSlutYear() {

		//ANST�LLNINGENS B�RJAN �R. PLOCKAS SLUMPM�SSIGT
		Select Anst�llningensB�rjanYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear)));
		Random randomOption = new Random();  
		int endOption = Anst�llningensB�rjanYear.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		Anst�llningensB�rjanYear.selectByIndex(number);
		
		WebElement Anst�llningensB�rjanAr = Anst�llningensB�rjanYear.getFirstSelectedOption();
		String Value = Anst�llningensB�rjanAr.getText();
		System.out.println("Anst�llning �r = " + Value ); 

		//ANST�LLNINGENS SLUT �T. H�MTAR START�R OCH L�GGER TILL 1 �R 
		Select Anst�llningensSlutYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear))); 
		Anst�llningensSlutYear.selectByIndex(number + 1);
		
		WebElement Anst�llningensSlutjanAr = Anst�llningensSlutYear.getFirstSelectedOption();
		String Value2 = Anst�llningensSlutjanAr.getText();
		System.out.println("Anst�llning slut �r = " + Value2 ); 
	}

	@Test (dependsOnMethods={"Anst�llningensB�rjanOchSlutYear"})
	public void Anst�llningensB�rjanMonth() {

		Select Anst�llningensB�rjanMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = Anst�llningensB�rjanMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llningensB�rjanMonth.selectByIndex(number);
		
		WebElement Anst�llningensB�rjanManad = Anst�llningensB�rjanMonth.getFirstSelectedOption();
		String Value = Anst�llningensB�rjanManad.getText();
		System.out.println("Anst�llning m�nad = " + Value ); 
	}

	@Test (dependsOnMethods={"Anst�llningensB�rjanMonth"})
	public void Anst�llningensSlutMonth() {

		Select Anst�llningensSlutMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth)));
		Random randomOption = new Random();  
		int endOption = Anst�llningensSlutMonth.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		Anst�llningensSlutMonth.selectByIndex(number);
		
		WebElement Anst�llningensSlutManad = Anst�llningensSlutMonth.getFirstSelectedOption();
		String Value = Anst�llningensSlutManad.getText();
		System.out.println("Anst�llning slut m�nad = " + Value ); 
	}

	@Test (dependsOnMethods={"Anst�llningensSlutMonth"})
	public void �vrigInformation() {

		String �vrigInformation = "Mycket bra �vrig information";
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation(driver).sendKeys(�vrigInformation);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation(driver).getAttribute("value") != �vrigInformation);
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation(driver).sendKeys(�vrigInformation);
			
			String �vrigInformation1 = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation(driver).getAttribute("value");
			System.out.println("�vrig information = " + �vrigInformation1); 
		}

	}

	@Test (dependsOnMethods={"�vrigInformation"})
	public void SparaAnst�llning() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning(driver).click();	

	}
}









