package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class PublikationerAddNewINTEFackGranskadBidragTillBok extends BeforeAfterTestBrowsers {


	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en INTE fackgranskad Bidrag till Bok";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedCssSelectorLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil);
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

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp)));
		Publikationstyp.selectByIndex(2);
	}

	@Test (dependsOnMethods={"V�ljPublikationsTyp"})
	public void DropDownBidragTillEnBok() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown)));
		Publikationstyp.selectByIndex(1);
	}

	@Test (dependsOnMethods={"DropDownBidragTillEnBok"})
	public void BidragTillEnBokTitel() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys("TestTitel123");

	}

	@Test (dependsOnMethods={"BidragTillEnBokTitel"})
	public void BidragTillEnBokF�rfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp(driver).click();

	}

	@Test (dependsOnMethods={"BidragTillEnBokF�rfattareKnapp"})
	public void BidragTillEnBokF�rfattareF�rnamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys("F�rnamn");
	}

	@Test (dependsOnMethods={"BidragTillEnBokF�rfattareF�rnamn"})
	public void BidragTillEnBokF�rfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"BidragTillEnBokF�rfattareEfternamn"})
	public void BidragTillEnBokRedakt�rKnapp() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rKnapp(driver).click();
	}

	@Test (dependsOnMethods={"BidragTillEnBokRedakt�rKnapp"})
	public void BidragTillEnBokRedakt�rNamn() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedakt�rNamn(driver).sendKeys("NamnTest");
	}

	@Test (dependsOnMethods={"BidragTillEnBokRedakt�rNamn"})
	public void BidragTillEnBokUtgivareF�rlag() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlag(driver).sendKeys("TestF�rlag");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareF�rlag"})
	public void BidragTillEnBokUtgivareF�rlagsplats() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rlagsplats(driver).sendKeys("F�rlagsaplatsTest");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareF�rlagsplats"})
	public void BidragTillEnBokUtgivareF�rstaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).sendKeys("1");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareF�rstaSidnummer"})
	public void BidragTillEnBokUtgivareSistaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys("99");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareSistaSidnummer"})
	public void BidragTillEnBokUtgivareISBN() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareISBN"})
	public void BidragTillEnBokUtgivareDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareDOI"})
	public void BidragTillEnBokUtgivareStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareStatus"})
	public void BidragTillEnBokUtgivareK�llaF�rPublikation() {

		Select K�llaF�rPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		K�llaF�rPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareK�llaF�rPublikation"})
	public void BidragTillEnBokUtgivareK�llaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareK�llaID"})
	public void BidragTillEnBokVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"BidragTillEnBokVarTextenPubliceradIOpenAcessJa"})
	public void BidragTillEnBokOpenAccessL�nkExternL�nkF�rPublicering() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys("Testl�nk");
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessL�nkExternL�nkF�rPublicering"})
	public void BidragTillEnBokOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessFormAvOA"})
	public void BidragTillEnBokOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessDokumentVersion"})
	public void BidragTillEnBokOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAcessSammanfattning"})
	public void BidragTillEnBokSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, "//button[contains(text(), 'Ok')]");
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}


