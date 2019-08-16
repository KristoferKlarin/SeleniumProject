package testCasesSATMinProfilArbetsliv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.CombineClearAndSendkeys;
import reusableMethods.CountRowsInTable;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.SearchForOrganizationWhenButtonIdIsUnique;
import reusableMethods.driverSelect;

public class ArbetslivAddNewAnst�llningar extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Anst�llning UTAN att kopiera redan tillagd post.";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddAnst�llning() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_L�ggTill());

		CountRowsInTable.CountTable(driver, By.xpath("//*[@id=\"employmentViewSectionIdFormId\"]/table/tbody/tr"));

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_L�ggTill()).click();
	}

	@Test (dependsOnMethods={"AddAnst�llning"})
	public void SelectOrganization() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare());

		SearchForOrganizationWhenButtonIdIsUnique.EnterKeyInputs(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_S�kArbetsgivare(), "Uppsala Universitet");

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void Anst�llningDropDown() {

		Select Anst�llning = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningDropDown()); 

		RandomDropDownOptionSelect.RandomOptionInDropDown(Anst�llning, 2, 0);
	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void Anst�llningsFormDropDown() {

		Select Anst�llningsForm = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningsFormDropDown());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Anst�llningsForm, 1, 0);

	}

	@Test (dependsOnMethods={"Anst�llningDropDown"})
	public void DelAvForskningIAnst�llningenBaseradP�Heltid() {

		CombineClearAndSendkeys.ClearSend(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_DelAvForskningenIAnst�llningenBaseradP�Heltid(), "100");

	}

	@Test (dependsOnMethods={"DelAvForskningIAnst�llningenBaseradP�Heltid"})
	public void Anst�llningensStartAndEndYear() {

		Select	Anst�llningensB�rjanYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanYear());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Anst�llningensB�rjanYear, 0, 1);

		Select	Anst�llningensEndYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutYear());

		RandomDropDownOptionSelect.RandomOptionInDropdownPreviousDropDownPlusOne(Anst�llningensEndYear);
	}

	@Test (dependsOnMethods={"Anst�llningensStartAndEndYear"})
	public void Anst�llningensB�rjanMonth() {

		Select Anst�llningensB�rjanMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensB�rjanMonth());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Anst�llningensB�rjanMonth, 0, 0);
	}

	@Test (dependsOnMethods={"Anst�llningensB�rjanMonth"})
	public void Anst�llningensSlutMonth() {

		Select Anst�llningensSlutMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_Anst�llningensSlutMonth());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Anst�llningensSlutMonth, 0, 0);
	}

	@Test (dependsOnMethods={"Anst�llningensSlutMonth"})
	public void �vrigInformation() {

		CombineClearAndSendkeys.ClearSend(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_�vrigInformation(), "Mycket bra �vrig information");
	}

	@Test (dependsOnMethods={"�vrigInformation"})
	public void SparaAnst�llning() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_SparaAnst�llning()).click();
		
		CountRowsInTable.AddedRow(driver, By.xpath("//*[@id=\"employmentViewSectionIdFormId\"]/table/tbody/tr"), PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anst�llningar_L�ggTill());

	}
}









