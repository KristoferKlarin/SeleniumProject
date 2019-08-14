package testCasesSATMinProfilImmaterialr�tt;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.RandomDropDownOptionSelect;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class Immaterialr�ttAddNewImmaterialR�tt extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = 
				"Loggar in som en projektledare och l�gger till en Immaterialr�tt";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickImmaterialr�tt() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt()).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialr�tt"})
	public void L�ggTill() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttL�ggTill());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttL�ggTill()).click();
	}

	@Test (dependsOnMethods={"L�ggTill"})
	public void Typ() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttTyp());

		Select Typ = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttTyp());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Typ, 1, 0);

	}

	@Test (dependsOnMethods={"Typ"})
	public void Id() {

		String id = "123456";
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId()).sendKeys(id);

		if (driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId()).getAttribute("value") != id)
		{
			driver.findElement(
					PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId()).clear();
			driver.findElement(
					PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId()).sendKeys(id);
		}	
	}

	@Test (dependsOnMethods={"Id"})
	public void DatumF�rBeviljande() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljande()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalender�rDropDown());

		Select �r = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalender�rDropDown());

		RandomDropDownOptionSelect.RandomOptionInDropDown(�r, 0, 0);

		Select M�nad = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalenderM�nadDropDown());

		RandomDropDownOptionSelect.RandomOptionInDropDown(M�nad, 0, 0);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();
	}

	@Test (dependsOnMethods={"DatumF�rBeviljande"})
	public void ProduktKlassificering() {

		Select ProduktKlassificering1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttProduktKlassificering1());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ProduktKlassificering1, 1, 0);

		Select ProduktKlassificering2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttProduktKlassificering2());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ProduktKlassificering2, 1, 0);

	}

	@Test (dependsOnMethods={"ProduktKlassificering"})
	public void LicensieradTillAnnan() {

		Select LicensieradTillAnnan = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttLicensieradTillAnnan());

		if (driver.getPageSource().contains("Immaterialr�tt"))  
		{
			LicensieradTillAnnan.selectByVisibleText("Ja");
		}
		else if (driver.getPageSource().contains("Intellectual property"))
		{
			LicensieradTillAnnan.selectByVisibleText("Yes");
		}
	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void LicensieradTillAnnanDropDown() {

		Select LicensieradTillAnnanDropDown = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttLicensieradTillAnnanDropwDown());

		RandomDropDownOptionSelect.RandomOptionInDropDown(LicensieradTillAnnanDropDown, 1, 0);

	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttSpara()).click();
	}
}