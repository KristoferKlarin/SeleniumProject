package testCasesSATMinProfilUtbildning;

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


public class UtbildningAddUtbildningP�GrundOchAvanceradNiv� extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Utbildning p� grund- och avancerad niv�";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();
	}

	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickUtbildningP�GrundOchAvanceradNiv�() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�()).click();
	}

	@Test (dependsOnMethods={"ClickUtbildningP�GrundOchAvanceradNiv�"})
	public void UtbildningP�GrundOchAvanceradNiv�Add() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillUtbildningP�GrundOchAvanceradNiv�());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillUtbildningP�GrundOchAvanceradNiv�()).click();
	}

	@Test (dependsOnMethods={"UtbildningP�GrundOchAvanceradNiv�Add"})
	public void SelectOrganization() throws InterruptedException {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation());

		String universitet = "Uppsala Universitet";
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation()).sendKeys(universitet);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation()).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation()).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp()).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void �rF�rExamen() {

		Select �r = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv��rF�rExamen());
		
		Random randomOption = new Random();  
		int endOption = �r.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		�r.selectByIndex(number);
	}

	@Test (dependsOnMethods={"�rF�rExamen"})
	public void ExamensinriktningSelectSubjects() {

		Select �mne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne1UtbildningP�GrundOchAvanceradNiv�());
		
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�());
		
		Select �mne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�());
		
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�());
		
		Select �mne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�());
		
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"ExamensinriktningSelectSubjects"})
	public void Examen() {

		Select TypAvExamen = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Examen());
		
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = TypAvExamen.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		TypAvExamen.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Examen"})
	public void Specialistkompetens() {

		Select Specialistkompetens = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens());
		
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Specialistkompetens.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Specialistkompetens.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Specialistkompetens"})
	public void Specialistkompetens�r() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R());

		Select Specialistkompetens�r = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R());
		
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Specialistkompetens�r.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Specialistkompetens�r.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Specialistkompetens�r"})
	public void Omr�deBeskrivning() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Omr�deBeskrivning()).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"Specialistkompetens�r"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�SparaKnapp()).click();
	}
}
