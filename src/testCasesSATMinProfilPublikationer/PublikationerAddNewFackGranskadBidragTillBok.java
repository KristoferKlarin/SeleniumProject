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


public class PublikationerAddNewFackGranskadBidragTillBok extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad Bidrag till Bok";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void DropDownBidragTillEnBok() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select VetenskapligPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Bidrag till en bok");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Contribution to a book");
		}
	}

	@Test (dependsOnMethods = {"DropDownBidragTillEnBok"})
	public void BidragTillBokResten() throws InterruptedException {
		BidragTillBok.RestenAvEnBok(driver);

	}

	//	@Test (dependsOnMethods={"DropDownBidragTillEnBok"})
	//	public void BidragTillEnBokTitel() {
	//
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
	//
	//		String Boktitel = "TestTitel123";
	//		
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Boktitel);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != Boktitel)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Boktitel);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokTitel"})
	//	public void BidragTillEnBokF�rfattareKnapp() {
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp()).click();
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokF�rfattareKnapp"})
	//	public void BidragTillEnBokF�rfattareF�rnamn() {
	//
	//		String F�rnamn = "F�rnamntest";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).sendKeys(F�rnamn);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).getAttribute("value") != F�rnamn)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).sendKeys(F�rnamn);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokF�rfattareF�rnamn"})
	//	public void BidragTillEnBokF�rfattareEfternamn() {
	//
	//		String Efternamn = "TestEfternamn";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).sendKeys(Efternamn);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).getAttribute("value") != Efternamn)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).sendKeys(Efternamn);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokF�rfattareEfternamn"})
	//	public void BidragTillEnBokRedakt�rKnapp() {
	//
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp());
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp()).click();
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokRedakt�rKnapp"})
	//	public void BidragTillEnBokRedakt�rNamn() {
	//
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn());
	//		String Redakt�rnamn = "Testredakt�rnamn";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn()).sendKeys(Redakt�rnamn);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn()).getAttribute("value") != Redakt�rnamn)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn()).sendKeys(Redakt�rnamn);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokRedakt�rNamn"})
	//	public void BidragTillEnBokUtgivareF�rlag() {
	//
	//		String F�rlag = "Testf�rlag";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag()).sendKeys(F�rlag);
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag()).getAttribute("value") != F�rlag)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag()).sendKeys(F�rlag);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareF�rlag"})
	//	public void BidragTillEnBokUtgivareF�rlagsplats() {
	//
	//		String F�rlagsplats = "F�rlagsaplatsTest";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats()).sendKeys(F�rlagsplats);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats()).getAttribute("value") != F�rlagsplats)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats()).sendKeys(F�rlagsplats);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareF�rlagsplats"})
	//	public void BidragTillEnBokUtgivareF�rstaSidnummer() {
	//
	//		String F�rstaSidnummer = "1";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).sendKeys(F�rstaSidnummer);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).getAttribute("value") != F�rstaSidnummer)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).sendKeys(F�rstaSidnummer);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareF�rstaSidnummer"})
	//	public void BidragTillEnBokUtgivareSistaSidnummer() {
	//
	//		String Sistasidnummer = "99";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(Sistasidnummer);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).getAttribute("value") != Sistasidnummer)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(Sistasidnummer);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareSistaSidnummer"})
	//	public void BidragTillEnBokUtgivareISBN() {
	//
	//		String ISBN = "98989";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).sendKeys(ISBN);
	//
	//		if(driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).getAttribute("value") != ISBN)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).sendKeys(ISBN);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareISBN"})
	//	public void BidragTillEnBokUtgivareDOI() {
	//
	//		String DOI = "1234567";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).getAttribute("value") != DOI)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareDOI"})
	//	public void BidragTillEnBokUtgivareStatus() {
	//
	//		Select Status = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus());
	//		Status.selectByIndex(0);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareStatus"})
	//	public void BidragTillEnBokUtgivareK�llaF�rPublikation() {
	//
	//		Select K�llaF�rPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation());
	//		Random randomOption = new Random();  
	//		int endOption = K�llaF�rPublikation.getOptions().size(); 
	//		int number = randomOption .nextInt(endOption);  
	//		K�llaF�rPublikation.selectByIndex(number);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareK�llaF�rPublikation"})
	//	public void BidragTillEnBokUtgivareK�llaID() {
	//
	//		String K�llaId = "1234";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).sendKeys(K�llaId);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).getAttribute("value") != K�llaId)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).sendKeys(K�llaId);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareK�llaID"})
	//	public void BidragTillEnBokVarTextenPubliceradIOpenAcessJa() {
	//
	//		Select TextenPubliceradIOpenAcess = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown());
	//		TextenPubliceradIOpenAcess.selectByIndex(1);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokVarTextenPubliceradIOpenAcessJa"})
	//	public void BidragTillEnBokOpenAccessL�nkExternL�nkF�rPublicering() {
	//
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering());
	//
	//		String ExternL�nkF�rPublicering = "Testl�nk";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).sendKeys(ExternL�nkF�rPublicering);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).getAttribute("value") != ExternL�nkF�rPublicering)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).sendKeys(ExternL�nkF�rPublicering);
	//		}
	//
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessL�nkExternL�nkF�rPublicering"})
	//	public void BidragTillEnBokOpenAccessFormAvOA() {
	//
	//		Select FormAvOA = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA());
	//		Random randomOption = new Random();  
	//		int startOption = 1;
	//		int endOption = FormAvOA.getOptions().size(); 
	//		int number = startOption + randomOption .nextInt(endOption - startOption);  
	//		FormAvOA.selectByIndex(number);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessFormAvOA"})
	//	public void BidragTillEnBokOpenAccessDokumentVersion() {
	//
	//		Select DokumentVersion = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion());
	//		Random randomOption = new Random();  
	//		int startOption = 1;
	//		int endOption = DokumentVersion.getOptions().size(); 
	//		int number = startOption + randomOption .nextInt(endOption - startOption);  
	//		DokumentVersion.selectByIndex(number);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessDokumentVersion"})
	//	public void BidragTillEnBokOpenAcessSammanfattning() {
	//
	//		String Sammanfattning = "Jag skriver en riktigt bra sammanfattning";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).getAttribute("value") != Sammanfattning)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokOpenAcessSammanfattning"})
	//	public void BidragTillEnBokSpara() {
	//		
	//		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
	//		
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara()).click();
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
	//		
	//		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	//		
	//	}
	//



}