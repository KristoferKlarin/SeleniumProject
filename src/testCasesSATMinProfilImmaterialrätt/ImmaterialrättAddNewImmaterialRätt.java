package testCasesSATMinProfilImmaterialr�tt;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class Immaterialr�ttAddNewImmaterialR�tt extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Immaterialr�tt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickImmaterialr�tt() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt()).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialr�tt"})
	public void L�ggTill() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttL�ggTill()).click();
	}

	@Test (dependsOnMethods={"L�ggTill"})
	public void Typ() {

		Select Typ = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttTyp());
		Random randomOptionTyp = new Random();  
		int startOptionTyp = 1;
		int endOptionTyp = Typ.getOptions().size(); 
		int numberTyp = startOptionTyp + randomOptionTyp .nextInt(endOptionTyp - startOptionTyp);  
		Typ.selectByIndex(numberTyp);
	}

	@Test (dependsOnMethods={"Typ"})
	public void Id() {

		String id = "123456";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId()).sendKeys(id);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId()).getAttribute("value") != id)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId()).sendKeys(id);
		}	
	}

	@Test (dependsOnMethods={"Id"})
	public void DatumF�rBeviljande() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljande()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalender�rDropDown());

		Select �r = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalender�rDropDown());
		Random random�r = new Random();  
		int endOption = �r.getOptions().size(); 
		int number�r = random�r .nextInt(endOption);  
		�r.selectByIndex(number�r);

		Select M�nad = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalenderM�nadDropDown());
		Random randomM�nad = new Random();  
		int endOptionM�nad = M�nad.getOptions().size(); 
		int numberM�nad = randomM�nad .nextInt(endOptionM�nad);  
		M�nad.selectByIndex(numberM�nad);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();
	}

	@Test (dependsOnMethods={"DatumF�rBeviljande"})
	public void ProduktKlassificering() {

		Select ProduktKlassificering1 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttProduktKlassificering1());
		Random randomOptionProduktKlassificering1 = new Random();  
		int startOptionProduktKlassificering1 = 1;
		int endOptionProduktKlassificering1 = ProduktKlassificering1.getOptions().size(); 
		int numberProduktKlassificering1 = startOptionProduktKlassificering1 + randomOptionProduktKlassificering1 .nextInt(endOptionProduktKlassificering1 - startOptionProduktKlassificering1);  
		ProduktKlassificering1.selectByIndex(numberProduktKlassificering1);

		Select ProduktKlassificering2 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttProduktKlassificering2());
		Random randomOptionProduktKlassificering2 = new Random();  
		int startOptionProduktKlassificering2 = 1;
		int endOptionProduktKlassificering2 = ProduktKlassificering2.getOptions().size(); 
		int numberProduktKlassificering2 = startOptionProduktKlassificering2 + randomOptionProduktKlassificering2 .nextInt(endOptionProduktKlassificering2 - startOptionProduktKlassificering2);  
		ProduktKlassificering2.selectByIndex(numberProduktKlassificering2);
	}

	@Test (dependsOnMethods={"ProduktKlassificering"})
	public void LicensieradTillAnnan() {

		Select LicensieradTillAnnan = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttLicensieradTillAnnan());
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

		Select LicensieradTillAnnanDropDown = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttLicensieradTillAnnanDropwDown());
		Random randomOptionLicensieradTillAnnanDropDown = new Random();  
		int startOptionLicensieradTillAnnanDropDown = 1;
		int endOptionLicensieradTillAnnanDropDown = LicensieradTillAnnanDropDown.getOptions().size(); 
		int numberLicensieradTillAnnanDropDown = startOptionLicensieradTillAnnanDropDown + randomOptionLicensieradTillAnnanDropDown .nextInt(endOptionLicensieradTillAnnanDropDown - startOptionLicensieradTillAnnanDropDown);  
		LicensieradTillAnnanDropDown.selectByIndex(numberLicensieradTillAnnanDropDown);
	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttSpara()).click();
	}
}