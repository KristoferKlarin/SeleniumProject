package testCasesSATMinProfilUtbildning;


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

public class UtbildningForskarUtbildningAddLicentiatexamen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Licentiatexamen";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();

	}

	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickForskarUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning()).click();
	}


	@Test (dependsOnMethods={"ClickForskarUtbildning"})
	public void AddForskarUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning()).click();
	}


	@Test (dependsOnMethods={"AddForskarUtbildning"})
	public void SelectOrganization() throws InterruptedException {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation());

		String universitet = "Uppsala Universitet";
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation()).sendKeys(universitet);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation()).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation()).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SparaSöktOrganisationKnapp()).click();

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void TypAvForskarUtbildningAddLicentiatexamen() {
		
		Select typ = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning());

		if (driver.getPageSource().contains("Forskarutbildning"))  
		{
			typ.selectByVisibleText("Licentiatexamen");
		}
		else if (driver.getPageSource().contains("Research education"))
		{
			typ.selectByVisibleText("Licentiate degree");
		}
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void Examensdatum() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum()).click();

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum()).sendKeys("2019-04-21");
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void TypAvForskarUtbildningSelectSubjects() {

		Select ämne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne1DropDownForskarUtbildning());
		
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning());
		
		Select ämne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning());
		
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning());
		
		Select ämne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning());
		
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningSelectSubjects"})
	public void WriteAvhandlingensTitelOrginalSpråk() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelOrginalspråk()).sendKeys("Test av avhandling");
	}

	@Test (dependsOnMethods={"WriteAvhandlingensTitelOrginalSpråk"})
	public void WriteAvhandlingensTitelEngelska() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelEngelska()).sendKeys("Test Dissertation title");
	}


	@Test (dependsOnMethods={"WriteAvhandlingensTitelEngelska"})
	public void ISSNISBNNummer() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_IssIsBnNummer()).sendKeys("12345678");
	}

	@Test (dependsOnMethods={"ISSNISBNNummer"})
	public void FörnamnHandledare() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_FörnamnHandledare()).sendKeys("Per");
	}

	@Test (dependsOnMethods={"FörnamnHandledare"})
	public void EfternamnHandledare() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_EfternamnHandledare()).sendKeys("Persson");
	}

	@Test (dependsOnMethods={"EfternamnHandledare"})
	public void SparaForskarutbildningKnapp() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SparaForskarUtbildningButton()).click();
	}
}
