package testCasesSATMinProfilUtbildning;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class UtbildningAddUtbildningP�GrundOchAvanceradNiv� extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Utbildning p� grund- och avancerad niv�";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedCssSelectorLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {


		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning(driver).click();
	}

	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickUtbildningP�GrundOchAvanceradNiv�() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�(driver).click();
	}

	@Test (dependsOnMethods={"ClickUtbildningP�GrundOchAvanceradNiv�"})
	public void UtbildningP�GrundOchAvanceradNiv�Add() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillUtbildningP�GrundOchAvanceradNiv�(driver).click();
	}

	@Test (dependsOnMethods={"UtbildningP�GrundOchAvanceradNiv�Add"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp(driver).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void �rF�rExamen() {

		Select �r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_UtbildningP�GrundOchAvanceradNiv��rF�rExamen)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = �r.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�r.selectByIndex(number);
	}

	@Test (dependsOnMethods={"�rF�rExamen"})
	public void ExamensinriktningSelectSubjects() {

		//V�LJER SLUMPM�SSIGT I F�RSTA DROPDOWN
		Select �mne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne1UtbildningP�GrundOchAvanceradNiv�)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

		//V�LJER SLUMPM�SSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�);
		Select �mne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

		//V�LJER SLUMPM�SSIGT I TREDJE DROPDOWN
		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�);
		Select �mne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"ExamensinriktningSelectSubjects"})
	public void Examen() {

		Select TypAvExamen = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Examen)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = TypAvExamen.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		TypAvExamen.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Examen"})
	public void Specialistkompetens() {

		Select Specialistkompetens = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Specialistkompetens.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Specialistkompetens.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Specialistkompetens"})
	public void Specialistkompetens�r() {

		Select Specialistkompetens�r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Specialistkompetens�r.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Specialistkompetens�r.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Specialistkompetens�r"})
	public void Omr�deBeskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Omr�deBeskrivning(driver).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"Specialistkompetens�r"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�SparaKnapp(driver).click();
	}

}
