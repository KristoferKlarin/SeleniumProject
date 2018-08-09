package testCasesSATMinProfilImmaterialr�tt;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class Immaterialr�ttAddNewImmaterialR�tt extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Immaterialr�tt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickImmaterialr�tt() {

		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�tt(driver).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialr�tt"})
	public void L�ggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttL�ggTill(driver).click();
	}

	@Test (dependsOnMethods={"L�ggTill"})
	public void Typ() {

		Select Typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttTyp)));
		Random randomOptionTyp = new Random();  
		int startOptionTyp = 1;
		int endOptionTyp = Typ.getOptions().size(); 
		int numberTyp = startOptionTyp + randomOptionTyp .nextInt(endOptionTyp - startOptionTyp);  
		Typ.selectByIndex(numberTyp);

		WebElement TypSelect = Typ.getFirstSelectedOption();
		String TypValue = TypSelect.getText();
		System.out.println("Typ = " + TypValue ); 
	}

	@Test (dependsOnMethods={"Typ"})
	public void Id() {

		String id = "123456";
		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId(driver).sendKeys(id);
		if (PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId(driver).getAttribute("value") != id)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId(driver).sendKeys(id);
		}	

		String IdString = PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttId(driver).getAttribute("value");
		System.out.println("Id = " + IdString); 
	}

	@Test (dependsOnMethods={"Id"})
	public void DatumF�rBeviljande() {

		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljande(driver).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalender�rDropDown));

		Select �r = new Select (driver.findElement(By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalender�rDropDown)));
		Random random�r = new Random();  
		int endOption = �r.getOptions().size(); 
		int number�r = random�r .nextInt(endOption);  
		�r.selectByIndex(number�r);

		Select M�nad = new Select (driver.findElement(By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljandeKalenderM�nadDropDown)));
		Random randomM�nad = new Random();  
		int endOptionM�nad = M�nad.getOptions().size(); 
		int numberM�nad = randomM�nad .nextInt(endOptionM�nad);  
		M�nad.selectByIndex(numberM�nad);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();

		String DatumF�rBeviljandeString = PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttDatumF�rBeviljande(driver).getAttribute("value");
		System.out.println("Datum f�r beviljande = " + DatumF�rBeviljandeString); 
	}

	@Test (dependsOnMethods={"DatumF�rBeviljande"})
	public void ProduktKlassificering() {

		Select ProduktKlassificering1 = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttProduktKlassificering1)));
		Random randomOptionProduktKlassificering1 = new Random();  
		int startOptionProduktKlassificering1 = 1;
		int endOptionProduktKlassificering1 = ProduktKlassificering1.getOptions().size(); 
		int numberProduktKlassificering1 = startOptionProduktKlassificering1 + randomOptionProduktKlassificering1 .nextInt(endOptionProduktKlassificering1 - startOptionProduktKlassificering1);  
		ProduktKlassificering1.selectByIndex(numberProduktKlassificering1);

		WebElement ProduktKlassificering1Select = ProduktKlassificering1.getFirstSelectedOption();
		String ProduktKlassificering1StringValue1 = ProduktKlassificering1Select.getText();
		System.out.println("ProduktKlassificering 1 = " + ProduktKlassificering1StringValue1 ); 

		Select ProduktKlassificering2 = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttProduktKlassificering2)));
		Random randomOptionProduktKlassificering2 = new Random();  
		int startOptionProduktKlassificering2 = 1;
		int endOptionProduktKlassificering2 = ProduktKlassificering2.getOptions().size(); 
		int numberProduktKlassificering2 = startOptionProduktKlassificering2 + randomOptionProduktKlassificering2 .nextInt(endOptionProduktKlassificering2 - startOptionProduktKlassificering2);  
		ProduktKlassificering2.selectByIndex(numberProduktKlassificering2);

		WebElement ProduktKlassificering2Select = ProduktKlassificering2.getFirstSelectedOption();
		String ProduktKlassificering2StringValue2 = ProduktKlassificering2Select.getText();
		System.out.println("ProduktKlassificering 2 = " + ProduktKlassificering2StringValue2 ); 
	}

	@Test (dependsOnMethods={"ProduktKlassificering"})
	public void LicensieradTillAnnan() {

		Select LicensieradTillAnnan = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttLicensieradTillAnnan)));
		LicensieradTillAnnan.selectByIndex(0);

		if (driver.getPageSource().contains("Immaterialr�tt"))  
		{
			LicensieradTillAnnan.selectByVisibleText("Ja");
		}
		else if (driver.getPageSource().contains("Intellectual property"))
		{
			LicensieradTillAnnan.selectByVisibleText("Yes");
		}

		WebElement LicensieradTillAnnanSelect = LicensieradTillAnnan.getFirstSelectedOption();
		String LicensieradTillAnnanValue = LicensieradTillAnnanSelect.getText();
		System.out.println("LicensieradTillAnnan = " + LicensieradTillAnnanValue); 

	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void LicensieradTillAnnanDropDown() {

		Select LicensieradTillAnnanDropDown = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttLicensieradTillAnnanDropwDown)));
		Random randomOptionLicensieradTillAnnanDropDown = new Random();  
		int startOptionLicensieradTillAnnanDropDown = 1;
		int endOptionLicensieradTillAnnanDropDown = LicensieradTillAnnanDropDown.getOptions().size(); 
		int numberLicensieradTillAnnanDropDown = startOptionLicensieradTillAnnanDropDown + randomOptionLicensieradTillAnnanDropDown .nextInt(endOptionLicensieradTillAnnanDropDown - startOptionLicensieradTillAnnanDropDown);  
		LicensieradTillAnnanDropDown.selectByIndex(numberLicensieradTillAnnanDropDown);

		WebElement LicensieradTillAnnanDropDownSelect = LicensieradTillAnnanDropDown.getFirstSelectedOption();
		String LicensieradTillAnnanDropDownValue = LicensieradTillAnnanDropDownSelect.getText();
		System.out.println("LicensieradTillAnnanDropDown = " + LicensieradTillAnnanDropDownValue); 
	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialr�ttSpara(driver).click();
	}
}