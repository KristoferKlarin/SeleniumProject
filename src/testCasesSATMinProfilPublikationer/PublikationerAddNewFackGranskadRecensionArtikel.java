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


public class PublikationerAddNewFackGranskadRecensionArtikel extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Recension artikel";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	//	@Test
	/*LoginAsUser, ClickPublikationer, L�ggTillPublikationer
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

	// V�ljPublikationstyp = Fackgranskad
	/*
	@Test (dependsOnMethods={"L�ggTillPublikationer"})
	public void V�ljPublikationsTyp() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp)));

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - fackgranskade");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Scientific publication - peer-reviewed");
		}
	}
	 */
	
	@Test (dependsOnMethods={"LoginV�ljKlickaPublikation"})
	public void DropDownRecensionArtikel() {
		
		GemensammaMetoder.PublikationFackgranskad(driver);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Recension artikel");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Review Article");
		}
	}

	//	@Test (dependsOnMethods={"DropDownRecensionArtikel"})
	/* Titel, F�rfattareKnapp, F�rfattareF�rnamn, F�rfattareEfternamn
	public void RecensionArtikelF�rfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"RecensionArtikelF�rfattareKnapp"})
	public void RecensionArtikelTitel() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys("TestTitel123");

	}

	@Test (dependsOnMethods={"RecensionArtikelTitel"})
	public void RecensionArtikelF�rfattareF�rnamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys("F�rnamn");
	}

	@Test (dependsOnMethods={"RecensionArtikelF�rfattareF�rnamn"})
	public void RecensionArtikelF�rfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys("Efternamn");
	}
	 */

	@Test (dependsOnMethods={"DropDownRecensionArtikel"})
	public void TitleAuthor() throws InterruptedException {

		GemensammaMetoder.TitelOchF�rfattare(driver);
	}

	//	@Test (dependsOnMethods={"DropDownRecensionArtikel"})
	/* RecensionArtikelNamnP�Tidskrift,RecensionArtikelVolym,RecensionArtikelUtf�rdandenummer, f�rsta/sista sidnummer
	 * 
	public void RecensionArtikelNamnP�Tidskrift() {

		String TitelTidskrift = "Tidskrift";
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift()).sendKeys(TitelTidskrift);
	}

	@Test (dependsOnMethods={"RecensionArtikelNamnP�Tidskrift"})
	public void RecensionArtikelVolym() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).sendKeys("10");
	}

	@Test (dependsOnMethods={"RecensionArtikelVolym"})
	public void RecensionArtikelUtf�rdandenummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).sendKeys("287");
	}

	@Test (dependsOnMethods={"RecensionArtikelUtf�rdandenummer"})
	public void RecensionArtikelF�rstaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).sendKeys("1");
	}

	@Test (dependsOnMethods={"RecensionArtikelF�rstaSidnummer"})
	public void RecensionArtikelSistaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys("99");
	}

	 */

	@Test (dependsOnMethods={"TitleAuthor"})
	public void TidskriftNamnVolymUtf�rdandenrSidnr() {

		GemensammaMetoder.Tidskrifter(driver);
		GemensammaMetoder.Sidnummer(driver);
	}

	// @Test (dependsOnMethods={"RecensionArtikelSistaSidnummer"})
	/*DOI, Status, K�lla f�r publikation, K�llaID
	 * public void RecensionArtikelDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys("123456");
	}

	@Test (dependsOnMethods={"RecensionArtikelDOI"})
	public void RecensionArtikelK�llaF�rPublikation() {

		Select K�llaF�rPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		K�llaF�rPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RecensionArtikelK�llaF�rPublikation"})
	public void RecensionArtikelStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"RecensionArtikelStatus"})
	public void RecensionArtikelK�llaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys("1234");
	}

	 */

	@Test (dependsOnMethods={"TidskriftNamnVolymUtf�rdandenrSidnr"})
	public void InfoUtgivare() {

		GemensammaMetoder.Utgivare(driver);
	}

//	@Test (dependsOnMethods={"RecensionArtikelK�llaID"})
	/* Publicerad open access JA, Extern l�nk f�r publicering, Form av OA, Dokumentversion och OASammanfattning
	 * 
public void RecensionArtikelVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"RecensionArtikelVarTextenPubliceradIOpenAcessJa"})
	public void RecensionArtikelL�nkExternL�nkF�rPublicering() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys("Testl�nk");
	}

	@Test (dependsOnMethods={"RecensionArtikelL�nkExternL�nkF�rPublicering"})
	public void RecensionArtikelOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RecensionArtikelOpenAccessFormAvOA"})
	public void RecensionArtikelOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RecensionArtikelOpenAccessDokumentVersion"})
	public void RecensionArtikelOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	 */

	@Test (dependsOnMethods={"InfoUtgivare"})
	public void InfoOpenAccess() {

		GemensammaMetoder.OpenAccess(driver);
	}

//	@Test (dependsOnMethods={"RecensionArtikelOpenAcessSammanfattning"})
	/*
	 * public void RecensionArtikelSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
	 */
	
	@Test (dependsOnMethods = {"InfoOpenAccess"})
	public void Spara() {
		GemensammaMetoder.Spara(driver);
	}
}
