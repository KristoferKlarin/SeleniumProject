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

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Licentiatexamen";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();

	}

	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickForskarUtbildning() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning()).click();
	}


	@Test (dependsOnMethods={"ClickForskarUtbildning"})
	public void AddForskarUtbildning() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning()).click();
	}


	@Test (dependsOnMethods={"AddForskarUtbildning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation()).sendKeys(universitet);
		Thread.sleep(500);
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation()).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation()).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp()).click();

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void TypAvForskarUtbildningAddLicentiatexamen() {


		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning()).click();
		Select typ = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning());

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

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum�rDropdown());

		Select �r = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum�rDropdown());
		Random random�r = new Random();  
		int endOption = �r.getOptions().size(); 
		int number�r = random�r .nextInt(endOption);  
		�r.selectByIndex(number�r);

		Select M�nad = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumM�nadDropdown());
		Random randomM�nad = new Random();  
		int endOptionM�nad = M�nad.getOptions().size(); 
		int numberM�nad = randomM�nad .nextInt(endOptionM�nad);  
		M�nad.selectByIndex(numberM�nad);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void TypAvForskarUtbildningSelectSubjects() {

		Select �mne1 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne1DropDownForskarUtbildning());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne2DropDownForskarUtbildning());
		Select �mne2 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne2DropDownForskarUtbildning());
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne3DropDownForskarUtbildning());
		Select �mne3 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne3DropDownForskarUtbildning());
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningSelectSubjects"})
	public void WriteAvhandlingensTitelOrginalSpr�k() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k()).sendKeys("Test av avhandling");
	}

	@Test (dependsOnMethods={"WriteAvhandlingensTitelOrginalSpr�k"})
	public void WriteAvhandlingensTitelEngelska() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska()).sendKeys("Test Dissertation title");
	}


	@Test (dependsOnMethods={"WriteAvhandlingensTitelEngelska"})
	public void ISSNISBNNummer() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer()).sendKeys("12345678");
	}

	@Test (dependsOnMethods={"ISSNISBNNummer"})
	public void F�rnamnHandledare() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare()).sendKeys("Per");
	}

	@Test (dependsOnMethods={"F�rnamnHandledare"})
	public void EfternamnHandledare() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare()).sendKeys("Persson");
	}

	@Test (dependsOnMethods={"EfternamnHandledare"})
	public void SparaForskarutbildningKnapp() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_SparaForskarUtbildningButton()).click();
	}
}
