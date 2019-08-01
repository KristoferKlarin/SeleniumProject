package testCasesSATMinProfilPublikationer;

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


public class PublikationerAddNewFackGranskadRedakt�rerAntologi extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad Redakt�rerAntologi";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	//	@Test
	/*LoginAsUser, ClickPublikationer, L�ggTillPublikationer
	 * 
	@Test
	public void LoginAsUser() {

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
	 */
	
	@Test
	public void LoginV�ljKlickaPublikation() {

		GemensammaMetoder.LoggainPublikation(driver);
	}

	//	@Test (dependsOnMethods={"LoginV�ljKlickaPublikation"})
	//	public void V�ljPublikationsTyp() {
	//
	//		GemensammaMetoder.PublikationFackgranskad(driver);
	//	}

	@Test (dependsOnMethods={"LoginV�ljKlickaPublikation"})
	public void DropDownRedakt�rerAntologi() {

		GemensammaMetoder.PublikationFackgranskad(driver);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Redakt�rer (antologi)");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Editors (anthology)");
		}
	}

	@Test (dependsOnMethods={"DropDownRedakt�rerAntologi"})
	public void Redakt�rerAntologiTitel() {

		String titel = "Testtitel Antologi";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != titel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);
		}
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiTitel"})
	public void Redakt�rerAntologiRedakt�rNamn() {

		GemensammaMetoder.Redakt�r(driver);
	}

	//	@Test (dependsOnMethods={"Redakt�rerAntologiRedakt�rNamn"})
	/*F�rlag och f�rlagsplats
	 * public void Redakt�rerAntologiF�rlag() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag(driver).sendKeys("TestF�rlag");
	}

	@Test (dependsOnMethods={"Redakt�rerAntologiF�rlag"})
	public void Redakt�rerAntologiF�rlagsplats() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(driver).sendKeys("F�rlagsplats");
	}
	 */

	@Test (dependsOnMethods={"Redakt�rerAntologiRedakt�rNamn"})
	public void Publisher() {

		GemensammaMetoder.F�rlagOchPlats(driver);
	}

	//	@Test (dependsOnMethods={"Redakt�rerAntologiISBN"})
	/* DOI, Status, K�llaPub, K�llaID
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

	 * 
	 */

	@Test (dependsOnMethods={"Publisher"})
	public void InfoUtgivare() {
		// ISBN och �vrigt
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
	}

	//	@Test (dependsOnMethods={"Redakt�rerAntologiK�llaID"})
	/* Publicerad open access JA, Extern l�nk f�r publicering, Form av OA, Dokumentversion och OASammanfattning
	 * public void Redakt�rerAntologiVarTextenPubliceradIOpenAcessJa() {

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

	 */

	@Test (dependsOnMethods={"InfoUtgivare"})
	public void InfoOpenAccess() {

		GemensammaMetoder.OpenAccess(driver);
	}

	@Test (dependsOnMethods = {"InfoOpenAccess"})
	public void Spara() {
		GemensammaMetoder.Spara(driver);
	}
	//	@Test (dependsOnMethods={"Redakt�rerAntologiOpenAcessSammanfattning"})
	//	public void Redakt�rerAntologiSpara() {
	//
	//		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
	//
	//		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
	//		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();


}


