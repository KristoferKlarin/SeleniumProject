package testCasesSAT;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ArbetslivAddNewINTEFackGranskadRecensionArtikel extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en INTE fackgranskad Konferensbidrag";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		driver.manage().window().maximize();
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickPublikationer"})
	public void L�ggTillPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_L�ggTill_Css(driver).click();
	}

	@Test (dependsOnMethods={"L�ggTillPublikationer"})
	public void V�ljPublikationsTyp() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp_Id)));
		Publikationstyp.selectByIndex(2);
	}

	@Test (dependsOnMethods={"V�ljPublikationsTyp"})
	public void DropDownRecensionArtikel() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id)));
		Publikationstyp.selectByIndex(4);
	}

	@Test (dependsOnMethods={"DropDownRecensionArtikel"})
	public void RecensionArtikelF�rfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp_Id(driver).click();
	}

	@Test (dependsOnMethods={"RecensionArtikelF�rfattareKnapp"})
	public void RecensionArtikelTitel() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id(driver).sendKeys("TestTitel123");

	}

	@Test (dependsOnMethods={"RecensionArtikelTitel"})
	public void RecensionArtikelF�rfattareF�rnamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn_Id(driver).sendKeys("F�rnamn");
	}

	@Test (dependsOnMethods={"RecensionArtikelF�rfattareF�rnamn"})
	public void RecensionArtikelF�rfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn_Id(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"RecensionArtikelF�rfattareEfternamn"})
	public void RecensionArtikelNamnP�Tidskrift() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift_Id(driver).sendKeys("Tidsskrift");
	}
	
	@Test (dependsOnMethods={"RecensionArtikelNamnP�Tidskrift"})
	public void RecensionArtikelVolym() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym_Id(driver).sendKeys("10");
	}
	
	@Test (dependsOnMethods={"RecensionArtikelVolym"})
	public void RecensionArtikelUtf�rdandenummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer_Id(driver).sendKeys("287");
	}
	
	@Test (dependsOnMethods={"RecensionArtikelUtf�rdandenummer"})
	public void RecensionArtikelF�rstaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer_Id(driver).sendKeys("1");
	}
	
	@Test (dependsOnMethods={"RecensionArtikelF�rstaSidnummer"})
	public void RecensionArtikelSistaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer_Id(driver).sendKeys("99");
	}

	@Test (dependsOnMethods={"RecensionArtikelSistaSidnummer"})
	public void RecensionArtikelDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI_Id(driver).sendKeys("123456");
	}

	@Test (dependsOnMethods={"RecensionArtikelDOI"})
	public void RecensionArtikelK�llaF�rPublikation() {

		Select K�llaF�rPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation_Id)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		K�llaF�rPublikation.selectByIndex(number);
	}
	
	@Test (dependsOnMethods={"RecensionArtikelK�llaF�rPublikation"})
	public void RecensionArtikelStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus_Id)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"RecensionArtikelStatus"})
	public void RecensionArtikelK�llaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID_Id(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"RecensionArtikelK�llaID"})
	public void RecensionArtikelVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown_Id)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"RecensionArtikelVarTextenPubliceradIOpenAcessJa"})
	public void RecensionArtikelL�nkExternL�nkF�rPublicering() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering_Id(driver).sendKeys("Testl�nk");
	}

	@Test (dependsOnMethods={"RecensionArtikelL�nkExternL�nkF�rPublicering"})
	public void RecensionArtikelOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RecensionArtikelOpenAccessFormAvOA"})
	public void RecensionArtikelOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RecensionArtikelOpenAccessDokumentVersion"})
	public void RecensionArtikelOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning_Id(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"RecensionArtikelOpenAcessSammanfattning"})
	public void RecensionArtikelSpara() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara_Id(driver).click();
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, "//button[contains(text(), 'Ok')]");
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}
