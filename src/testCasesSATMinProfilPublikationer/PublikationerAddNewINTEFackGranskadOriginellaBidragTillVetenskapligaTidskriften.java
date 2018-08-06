package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class PublikationerAddNewINTEFackGranskadOriginellaBidragTillVetenskapligaTidskriften extends BeforeAfterTestBrowsers {
	
	@BeforeTest
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en INTE fackgranskad Originella bidrag till vetenskapliga tidskriften";
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
	public void DropDownOriginellaBidragTillVetenskapligaTidskriften() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown)));
		Publikationstyp.selectByIndex(3);
	}

	@Test (dependsOnMethods={"DropDownOriginellaBidragTillVetenskapligaTidskriften"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareKnapp"})
	public void OriginellaBidragTillVetenskapligaTidskriftenTitel() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys("TestTitel123");

	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenTitel"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareF�rnamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys("F�rnamn");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareF�rnamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareEfternamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenNamnP�Tidskrift() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).sendKeys("Tidsskrift");
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenNamnP�Tidskrift"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVolym() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).sendKeys("10");
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVolym"})
	public void OriginellaBidragTillVetenskapligaTidskriftenUtf�rdandenummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).sendKeys("287");
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenUtf�rdandenummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rstaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).sendKeys("1");
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rstaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys("99");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys("123456");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenDOI"})
	public void OriginellaBidragTillVetenskapligaTidskriftenK�llaF�rPublikation() {

		Select K�llaF�rPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		K�llaF�rPublikation.selectByIndex(number);
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenK�llaF�rPublikation"})
	public void OriginellaBidragTillVetenskapligaTidskriftenStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenStatus"})
	public void OriginellaBidragTillVetenskapligaTidskriftenK�llaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenK�llaID"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessL�nkExternL�nkF�rPublicering() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys("Testl�nk");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessL�nkExternL�nkF�rPublicering"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessFormAvOA"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessDokumentVersion"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath( "//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}
