package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class PublikationerAddNewINTEFackGranskadRedakt�rerAntologi extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en INTE fackgranskad Redakt�rerAntologi";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer(driver).click();
	}

	@Test (dependsOnMethods={"ClickPublikationer"})
	public void L�ggTillPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_L�ggTill(driver).click();
	}

	@Test (dependsOnMethods={"L�ggTillPublikationer"})
	public void V�ljPublikationsTyp() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp)));
		Publikationstyp.selectByIndex(2);
	}

	@Test (dependsOnMethods={"V�ljPublikationsTyp"})
	public void DropDownRedakt�rerAntologi() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown)));
		Publikationstyp.selectByIndex(5);
	}

	@Test (dependsOnMethods={"DropDownRedakt�rerAntologi"})
	public void Redakt�rerAntologiTitel() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys("TestTitel123");
	}



	@Test (dependsOnMethods={"Redakt�rerAntologiTitel"})
	public void Redakt�rerAntologiRedakt�rKnapp() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp(driver).click();
	}



	@Test (dependsOnMethods={"Redakt�rerAntologiRedakt�rKnapp"})
	public void Redakt�rerAntologiRedakt�rNamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn(driver).sendKeys("NamnTest");
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiRedakt�rNamn"})
	public void Redakt�rerAntologiF�rlag() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag(driver).sendKeys("TestF�rlag");
	}


	@Test (dependsOnMethods={"Redakt�rerAntologiF�rlag"})
	public void Redakt�rerAntologiF�rlagsplats() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(driver).sendKeys("F�rlagsplats");
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiF�rlagsplats"})
	public void Redakt�rerAntologiISBN() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiISBN"})
	public void Redakt�rerAntologiDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys("123456");
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiDOI"})
	public void Redakt�rerAntologiK�llaF�rPublikation() {

		Select K�llaF�rPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		K�llaF�rPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiK�llaF�rPublikation"})
	public void Redakt�rerAntologiStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiStatus"})
	public void Redakt�rerAntologiK�llaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiK�llaID"})
	public void Redakt�rerAntologiVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiVarTextenPubliceradIOpenAcessJa"})
	public void Redakt�rerAntologiOpenAccessL�nkExternL�nkF�rPublicering() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys("Testl�nk");
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiOpenAccessL�nkExternL�nkF�rPublicering"})
	public void Redakt�rerAntologiOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiOpenAccessFormAvOA"})
	public void Redakt�rerAntologiOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiOpenAccessDokumentVersion"})
	public void Redakt�rerAntologiOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiOpenAcessSammanfattning"})
	public void Redakt�rerAntologiSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();


	}
}