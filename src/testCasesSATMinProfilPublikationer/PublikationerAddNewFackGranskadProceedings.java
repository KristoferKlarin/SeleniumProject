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


public class PublikationerAddNewFackGranskadProceedings extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad Proceedings";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

//	@Test
//	public void LoginAsUser() {
//
//		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
//	}
//
//	@Test (dependsOnMethods={"LoginAsUser"})
//	public void ClickPublikationer() {
//
//		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer(driver).click();
//	}
//
//	@Test (dependsOnMethods={"ClickPublikationer"})
//	public void L�ggTillPublikationer() {
//
//		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_L�ggTill(driver).click();
//	}

	
	@Test (dependsOnMethods={"L�ggTillPublikationer"})
	public void V�ljPublikationsTyp() {
		
		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);
//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp));
//		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp)));
//
//		if (driver.getPageSource().contains("Publikationer"))
//		{
//			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - fackgranskade");
//		}
//		else if (driver.getPageSource().contains("Publications")) 
//		{
//			Publikationstyp.selectByVisibleText("Scientific publication - peer-reviewed");
//		}
//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp());
//		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp());
//
//		if (driver.getPageSource().contains("Publikationer"))
//		{
//			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - fackgranskade");
//		}
//		else if (driver.getPageSource().contains("Publications")) 
//		{
//			Publikationstyp.selectByVisibleText("Scientific publication - peer-reviewed");
//		}
	}

	@Test (dependsOnMethods={"V�ljPublikationsTyp"})
	public void DropDownProceedings() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown)));
		
		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Proceedings");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Proceedings");
		}
	}

	@Test (dependsOnMethods={"DropDownProceedings"})
	public void ProceedingsF�rfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"ProceedingsF�rfattareKnapp"})
	public void ProceedingsTitel() {

		String titel = "Testtitel";
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(titel);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value") != titel)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(titel);
		}

	}

	@Test (dependsOnMethods={"ProceedingsTitel"})
	public void ProceedingsF�rfattareF�rnamn() {

		String F�rnamn = "F�rnamn";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys(F�rnamn);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).getAttribute("value") != F�rnamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys(F�rnamn);
		}
	}

	@Test (dependsOnMethods={"ProceedingsF�rfattareF�rnamn"})
	public void ProceedingsF�rfattareEfternamn() {

		String Efternamn = "Efternamn";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys(Efternamn);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).getAttribute("value") != Efternamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys(Efternamn);
		}
	}

	@Test (dependsOnMethods={"ProceedingsF�rfattareEfternamn"})
	public void ProceedingsF�rlag() {

		String F�rlag = "Testf�rlag";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag(driver).sendKeys(F�rlag);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag(driver).getAttribute("value") !=F�rlag)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag(driver).sendKeys(F�rlag);
		}
	}

	@Test (dependsOnMethods={"ProceedingsF�rlag"})
	public void ProceedingsF�rlagsplats() {

		String F�rlagsplats = "F�rlagsaplats";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(driver).sendKeys(F�rlagsplats);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(driver).getAttribute("value") != F�rlagsplats)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(driver).sendKeys(F�rlagsplats);
		}
	}

	@Test (dependsOnMethods={"ProceedingsF�rlagsplats"})
	public void ProceedingsDOI() {

		String DOI = "123456";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).getAttribute("value") !=DOI)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);
		}
	}

	@Test (dependsOnMethods={"ProceedingsDOI"})
	public void ProceedingsK�llaF�rPublikation() {

		Select K�llaF�rPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation)));
		Random randomOption = new Random();  
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		K�llaF�rPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ProceedingsK�llaF�rPublikation"})
	public void ProceedingsStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"ProceedingsStatus"})
	public void ProceedingsK�llaID() {

		String K�llaId = "1234";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys(K�llaId);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).getAttribute("value") != K�llaId)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys(K�llaId);
		}
	}

	@Test (dependsOnMethods={"ProceedingsK�llaID"})
	public void ProceedingsVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"ProceedingsVarTextenPubliceradIOpenAcessJa"})
	public void ProceedingsOpenAccessL�nkExternL�nkF�rPublicering() {

		String L�nkF�rPublicering = "Testl�nk";
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys(L�nkF�rPublicering);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).getAttribute("value") != L�nkF�rPublicering)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys(L�nkF�rPublicering);
		}
	}

	@Test (dependsOnMethods={"ProceedingsOpenAccessL�nkExternL�nkF�rPublicering"})
	public void ProceedingsOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ProceedingsOpenAccessFormAvOA"})
	public void ProceedingsOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ProceedingsOpenAccessDokumentVersion"})
	public void ProceedingsOpenAcessSammanfattning() {

		String Sammanfattning = "En riktigt bra sammanfattning";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(Sammanfattning);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).getAttribute("value") != Sammanfattning)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(Sammanfattning);
		}
	}

	@Test (dependsOnMethods={"ProceedingsOpenAcessSammanfattning"})
	public void ProceedingsSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}