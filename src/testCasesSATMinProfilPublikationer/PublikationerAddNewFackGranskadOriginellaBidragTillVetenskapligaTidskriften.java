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


public class PublikationerAddNewFackGranskadOriginellaBidragTillVetenskapligaTidskriften extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad Originella bidrag till vetenskapliga tidskriften";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
//	public void LoginAsUser() {
//
//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
//	}
//
//	@Test (dependsOnMethods={"LoginAsUser"})
//	public void ClickPublikationer() {
//
//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer()).click();
//	}
//
//	@Test (dependsOnMethods={"ClickPublikationer"})
//	public void L�ggTillPublikationer() {
//
//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_L�ggTill()).click();
//	}
//
//	@Test (dependsOnMethods={"L�ggTillPublikationer"})
//	public void V�ljPublikationsTyp() {
//
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
//	}
//
//	@Test (dependsOnMethods={"V�ljPublikationsTyp"})
	public void DropDownOriginellaBidragTillVetenskapligaTidskriften() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Originella bidrag till vetenskapliga tidskriften");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Original contribution to science journal");
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareKnapp"})
	public void OriginellaBidragTillVetenskapligaTidskriftenTitel() {

		String Titel = "TestTitel123";
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Titel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != Titel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Titel);
		}
	}
	
	@Test (dependsOnMethods={"DropDownOriginellaBidragTillVetenskapligaTidskriften"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareKnapp() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp()).click();
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenTitel"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareF�rnamn() {

		String F�rnamn = "F�rnamn";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).sendKeys(F�rnamn);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).getAttribute("value") != F�rnamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).sendKeys(F�rnamn);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareF�rnamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareEfternamn() {

		String Efternamn = "Efternamn";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).sendKeys(Efternamn);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).getAttribute("value") != Efternamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).sendKeys(Efternamn);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareEfternamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenNamnP�Tidskrift() {

		String NamnP�Tidskrift = "Tidskrift";
				
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift()).sendKeys(NamnP�Tidskrift);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift()).getAttribute("value") != NamnP�Tidskrift)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift()).sendKeys(NamnP�Tidskrift);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenNamnP�Tidskrift"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVolym() {

		String Volym = "145";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).sendKeys(Volym);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).getAttribute("value") != Volym)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).sendKeys(Volym);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVolym"})
	public void OriginellaBidragTillVetenskapligaTidskriftenUtf�rdandenummer() {

		String Utf�rdandenummer = "276";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer()).sendKeys(Utf�rdandenummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer()).getAttribute("value") != Utf�rdandenummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer()).sendKeys(Utf�rdandenummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenUtf�rdandenummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rstaSidnummer() {

		String F�rstaSidnummer = "1";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).sendKeys(F�rstaSidnummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).getAttribute("value") != F�rstaSidnummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).sendKeys(F�rstaSidnummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rstaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer() {

		String SistaSidnummer = "999";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(SistaSidnummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).getAttribute("value") != SistaSidnummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(SistaSidnummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenDOI() {

		String DOI = "123456";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).getAttribute("value") != DOI)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenK�llaF�rPublikation"})
	public void OriginellaBidragTillVetenskapligaTidskriftenStatus() {

		Select Status = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus());
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenDOI"})
	public void OriginellaBidragTillVetenskapligaTidskriftenK�llaF�rPublikation() {

		Select K�llaF�rPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation());

		Random randomOption = new Random();  
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		K�llaF�rPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenStatus"})
	public void OriginellaBidragTillVetenskapligaTidskriftenK�llaID() {

		String K�llaId = "1234";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).sendKeys(K�llaId);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).getAttribute("value") != K�llaId)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).sendKeys(K�llaId);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenK�llaID"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown());
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessL�nkExternL�nkF�rPublicering() {

		String L�nkF�rPublicering = "Testl�nk";
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).sendKeys(L�nkF�rPublicering);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).getAttribute("value") != L�nkF�rPublicering)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).sendKeys(L�nkF�rPublicering);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessL�nkExternL�nkF�rPublicering"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessFormAvOA() {

		Select FormAvOA = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessFormAvOA"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessDokumentVersion() {

		Select DokumentVersion = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);

	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessDokumentVersion"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning() {

		String Sammanfattning = "En riktigt bra sammanfattning";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).getAttribute("value") != Sammanfattning)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}