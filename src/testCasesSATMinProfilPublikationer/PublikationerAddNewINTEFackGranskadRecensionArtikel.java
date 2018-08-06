package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class PublikationerAddNewINTEFackGranskadRecensionArtikel extends BeforeAfterTestBrowsers {
	
	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en INTE fackgranskad Recension artikel";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}
	
	@Test
	public void LoginAsUser() {

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
	public void DropDownRecensionArtikel() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown)));
		Publikationstyp.selectByIndex(4);
	}

	@Test (dependsOnMethods={"DropDownRecensionArtikel"})
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

	@Test (dependsOnMethods={"RecensionArtikelF�rfattareEfternamn"})
	public void RecensionArtikelNamnP�Tidskrift() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).sendKeys("Tidsskrift");
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

	@Test (dependsOnMethods={"RecensionArtikelSistaSidnummer"})
	public void RecensionArtikelDOI() {

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

	@Test (dependsOnMethods={"RecensionArtikelK�llaID"})
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

	@Test (dependsOnMethods={"RecensionArtikelOpenAcessSammanfattning"})
	public void RecensionArtikelSpara() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}
