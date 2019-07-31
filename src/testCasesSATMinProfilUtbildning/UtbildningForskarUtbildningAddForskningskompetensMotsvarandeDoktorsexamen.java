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


public class UtbildningForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Forskningskompetens Motsvarande Doktorsexamen";
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
	public void TypAvForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning()).click();
		Select typ = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning());

		if (driver.getPageSource().contains("Forskarutbildning"))  
		{
			typ.selectByVisibleText("Forskningskompetens motsvarande Doktorsexamen");
		}
		else if (driver.getPageSource().contains("Research education"))
		{
			typ.selectByVisibleText("Research competence corresponding to PhD degree");
		}
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen"})
	public void Examensdatum() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumN�rForskningskompetensUppn�tts()).sendKeys("2018-05-15");

	}

	@Test (dependsOnMethods={"Examensdatum"})
	public void TypAvForskarUtbildningSelectSubjects() throws InterruptedException {

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
	public void BeskrivningAvKompetensSvenska() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV()).sendKeys("TestSvenska");
	}

	@Test (dependsOnMethods={"BeskrivningAvKompetensSvenska"})
	public void BeskrivningAvKompetensEngelska() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN()).sendKeys("TestEngelska");
	}
	
	@Test (dependsOnMethods={"BeskrivningAvKompetensEngelska"})
	public void SparaForskarutbildningKnapp() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamenButton()).click();
	}
}