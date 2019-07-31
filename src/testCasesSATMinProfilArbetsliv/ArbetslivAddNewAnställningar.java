package testCasesSATMinProfilArbetsliv;


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



public class ArbetslivAddNewAnst�llningar extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Anst�llning UTAN att kopiera redan tillagd post.";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddAnst�llning() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_L�ggTill()).click();
	}

	@Test (dependsOnMethods={"AddAnst�llning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare()).sendKeys(universitet);

		Thread.sleep(500);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare()).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare()).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		if (driver.getPageSource().contains("Anst�llningar"))
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_SparaS�kArbetsgivare()).click();
		}
		else if (driver.getPageSource().contains("Employments")) 
		{
			driver.findElement(By.xpath("//button[contains(text(), 'Save choice')]")).click();	
		}
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void Anst�llningDropDown() {

		Select Anst�llning = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown());
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = Anst�llning.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llning.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void Anst�llningsFormDropDown() {

		Select Anst�llningsForm = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Anst�llningsForm.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anst�llningsForm.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void DelAvForskningIAnst�llningenBaseradP�Heltid() {

		String DelAvForskningIAnst�llningenBaseradP�Heltid = "100";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid()).sendKeys(DelAvForskningIAnst�llningenBaseradP�Heltid);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid()).getAttribute("value") != DelAvForskningIAnst�llningenBaseradP�Heltid)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid()).sendKeys(DelAvForskningIAnst�llningenBaseradP�Heltid);
		}
	}

	@Test (dependsOnMethods={"DelAvForskningIAnst�llningenBaseradP�Heltid"})
	public void Anst�llningensStartAndEndYear() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear());
		Select Anst�llningensB�rjanYear = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear());
		Random randomOption = new Random();  
		int endOption = Anst�llningensB�rjanYear.getOptions().size(); 
		int number = randomOption.nextInt(endOption);  
		Anst�llningensB�rjanYear.selectByIndex(number);
		
		Select Anst�llningensEndYear = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear());
		Anst�llningensEndYear.selectByIndex(number + 1);
	}
	
	@Test (dependsOnMethods={"Anst�llningensStartAndEndYear"})
	public void Anst�llningensB�rjanMonth() {

		Select Anst�llningensB�rjanMonth = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth());
		Random randomOption = new Random();  
		int endOption = Anst�llningensB�rjanMonth.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		Anst�llningensB�rjanMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Anst�llningensB�rjanMonth"})
	public void Anst�llningensSlutMonth() {

		Select Anst�llningensSlutMonth = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth());
		Random randomOption = new Random();  
		int endOption = Anst�llningensSlutMonth.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		Anst�llningensSlutMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Anst�llningensSlutMonth"})
	public void �vrigInformation() {

		String �vrigInformation = "Mycket bra �vrig information";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation()).sendKeys(�vrigInformation);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation()).getAttribute("value") != �vrigInformation);
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation()).sendKeys(�vrigInformation);
		}
	}

	@Test (dependsOnMethods={"�vrigInformation"})
	public void SparaAnst�llning() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning()).click();
	}
}









