package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;

import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class GemensammaMetoder extends BeforeAfterTestBrowsers {

	public static void LoggainPublikation (WebDriver driver) {
		//	ers�tter public void LoginAsUser(), public void ClickPublikationer(), public void L�ggTillPublikationer()

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
		System.out.println("Klickat Min profil");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer()).click();
		System.out.println("Klickat Publikationer");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_L�ggTill()).click();
		System.out.println("Klickat L�gg till publikationer.");
	}

	public static void PublikationFackgranskad (WebDriver driver) {

		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp());
		System.out.println("Dropdown Publikationstyp");

		if (driver.getPageSource().contains("Publikationer")){
			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - fackgranskade");
		}
		else if (driver.getPageSource().contains("Publications")) {
			Publikationstyp.selectByVisibleText("Scientific publication - peer-reviewed");
		}
		System.out.println("Valt Vetenskaplig publikation - fackgranskad.");
	}

	public static void PublikationIckeFackgranskad(WebDriver driver) {

		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp());
		System.out.println("Dropdown Publikationstyp");
		
		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - inte fackgranskade");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Scientific publication - not peer-reviewed");
		}
		
	}
	
	public static void DropdownPublikationstyp (WebDriver driver) {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
	}

	// ers�tter metoderna f�r klicka f�rfattare-knapp samt f�r- och efternamn
	public static void TitelOchF�rfattare(WebDriver driver) throws InterruptedException{
		// ers�tter metoderna f�r klicka f�rfattare-knapp samt f�r- och efternamn

		String F�rfattareF�rnamn = "F�rnamn";
		String F�rfattareEfternamn = "Efternamn";
		String titel = "Testtitel";

		// s�tter titeln
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != titel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);
		}

		// anger f�rfattare f�r- och efternamn
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).sendKeys(F�rfattareF�rnamn);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).getAttribute("value") != F�rfattareF�rnamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn()).sendKeys(F�rfattareF�rnamn);
		}

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).sendKeys(F�rfattareEfternamn);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).getAttribute("value") != F�rfattareEfternamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn()).sendKeys(F�rfattareEfternamn);
		}
	}


	public static void Titel(WebDriver driver) {

		String titel = "Testtitel Allm�n";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != titel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);
		}
	}
	
	
	public static void Redakt�r(WebDriver driver){

		String EditorName = "F�rnamn Efternamn";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn()).sendKeys(EditorName);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn()).getAttribute("value") != EditorName)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn()).sendKeys(EditorName);
		}
	}

	public static void F�rlagOchPlats(WebDriver driver) {

		String F�rlag = "Testf�rlag";
		String F�rlagsplats = "F�rlagsaplatsTest";

		// anger f�rlag
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag()).sendKeys(F�rlag);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag()).getAttribute("value") != F�rlag)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag()).sendKeys(F�rlag);
		}

		// anger f�rlagsplats
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats()).sendKeys(F�rlagsplats);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats()).getAttribute("value") != F�rlagsplats)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats()).sendKeys(F�rlagsplats);
		}
	}

	public static void Status (WebDriver driver) {

		Select Status = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus());
		Status.selectByIndex(0);
	}
	
	public static void Tidskrifter (WebDriver driver) {
		// ers�tter metoderna f�r namn, volym och utf�rdandenummer
		String Volym = "145";
		String Utf�rdandenummer = "276";
		String TitelTidskrift = "Tidskrift";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift()).sendKeys(TitelTidskrift);

		// volym
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).sendKeys(Volym);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).getAttribute("value") != Volym)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).sendKeys(Volym);
		}

		// utf�rdandenummer
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer()).sendKeys(Utf�rdandenummer);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer()).getAttribute("value") != Utf�rdandenummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer()).sendKeys(Utf�rdandenummer);
		}

	}

	public static void Sidnummer (WebDriver driver) {
		// ers�tter metoderna f�rsta/sista sidnummer
		String F�rstaSidnummer = "1";
		String SistaSidnummer = "999";

		// f�rsta sidnummer
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).sendKeys(F�rstaSidnummer);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).getAttribute("value") != F�rstaSidnummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer()).sendKeys(F�rstaSidnummer);
		}

		// sista sidnummer
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(SistaSidnummer);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).getAttribute("value") != SistaSidnummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(SistaSidnummer);
		}
	}

	public static void ISBN_publikation (WebDriver driver) {

		String ISBN = "98989";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).sendKeys(ISBN);

		if(driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).getAttribute("value") != ISBN)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).sendKeys(ISBN);
		}
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareISBN"})
	public static void Utgivare(WebDriver driver) {
		// ers�tter DOI, Status, K�lla f�r publikation, K�llaID

		String DOI = "1234567";
		String K�llaId = "1234";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).getAttribute("value") != DOI)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
		}

		Select Status = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus());
		Status.selectByIndex(0);

		Select K�llaF�rPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation());
		Random randomOption = new Random();  
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		K�llaF�rPublikation.selectByIndex(number);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).sendKeys(K�llaId);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).getAttribute("value") != K�llaId)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID()).sendKeys(K�llaId);
		}
	}

	public static void OpenAccess(WebDriver driver) {
		// ers�tter Publicerad open access JA, Extern l�nk f�r publicering, Form av OA, Dokumentversion och OASammanfattning

		String ExternL�nkF�rPublicering = "Testl�nk";
		String Sammanfattning = "Jag skriver en riktigt bra sammanfattning";

		Select TextenPubliceradIOpenAcess = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown());
		TextenPubliceradIOpenAcess.selectByIndex(1);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).sendKeys(ExternL�nkF�rPublicering);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).getAttribute("value") != ExternL�nkF�rPublicering)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering()).sendKeys(ExternL�nkF�rPublicering);
		}

		Select FormAvOA = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);

		Select DokumentVersion = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion());
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = DokumentVersion.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		DokumentVersion.selectByIndex(number2);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).getAttribute("value") != Sammanfattning)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
		}
	}

	public static void Spara(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}
