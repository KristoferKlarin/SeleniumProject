package testCasesSATMinProfilUtbildning;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.RandomDropDownOptionSelect;
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
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(�r, 0, 0);
		
	}

	@Test (dependsOnMethods={"�rF�rExamen"})
	public void ExamensinriktningSelectSubjects() {

		Select �mne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne1UtbildningP�GrundOchAvanceradNiv�());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(�mne1, 1, 0);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�());
		
		Select �mne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne2UtbildningP�GrundOchAvanceradNiv�());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(�mne2, 1, 0);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�());
		
		Select �mne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_L�ggTillUtbildning_�mne3UtbildningP�GrundOchAvanceradNiv�());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(�mne3, 1, 0);
		
	}

	@Test (dependsOnMethods={"ExamensinriktningSelectSubjects"})
	public void Examen() {

		Select TypAvExamen = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Examen());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(TypAvExamen, 2, 0);
		
	}

	@Test (dependsOnMethods={"Examen"})
	public void Specialistkompetens() {

		Select Specialistkompetens = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Specialistkompetens, 1, 0);
		
	}

	@Test (dependsOnMethods={"Specialistkompetens"})
	public void Specialistkompetens�r() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R());

		Select Specialistkompetens�r = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Specialistkompetens�R());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Specialistkompetens�r, 1, 0);

	}

	@Test (dependsOnMethods={"Specialistkompetens�r"})
	public void Omr�deBeskrivning() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�Omr�deBeskrivning()).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"Specialistkompetens�r"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningP�GrundOchAvanceradNiv�SparaKnapp()).click();
	}
}
