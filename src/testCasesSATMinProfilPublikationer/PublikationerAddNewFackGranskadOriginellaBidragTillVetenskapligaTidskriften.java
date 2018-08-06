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


public class PublikationerAddNewFackGranskadOriginellaBidragTillVetenskapligaTidskriften extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad Originella bidrag till vetenskapliga tidskriften";
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
		Publikationstyp.selectByIndex(1);
	}

	@Test (dependsOnMethods={"V�ljPublikationsTyp"})
	public void DropDownOriginellaBidragTillVetenskapligaTidskriften() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown)));
		Publikationstyp.selectByIndex(4);
	}

	@Test (dependsOnMethods={"DropDownOriginellaBidragTillVetenskapligaTidskriften"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareKnapp"})
	public void OriginellaBidragTillVetenskapligaTidskriftenTitel() {

		String Titel = "TestTitel123";
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(Titel);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value") != Titel)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(Titel);
		}

	}
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenTitel"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareF�rnamn() {

		String F�rnamn = "F�rnamn";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys(F�rnamn);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).getAttribute("value") != F�rnamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys(F�rnamn);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareF�rnamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rfattareEfternamn() {

		String Efternamn = "Efternamn";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys(Efternamn);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).getAttribute("value") !=Efternamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys(Efternamn);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rfattareEfternamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenNamnP�Tidskrift() {

		String NamnP�Tidskrift = "Tidsskrift";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).sendKeys(NamnP�Tidskrift);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).getAttribute("value") != NamnP�Tidskrift)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).sendKeys(NamnP�Tidskrift);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenNamnP�Tidskrift"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVolym() {

		String Volym = "145";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).sendKeys(Volym);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).getAttribute("value") != Volym)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).sendKeys(Volym);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVolym"})
	public void OriginellaBidragTillVetenskapligaTidskriftenUtf�rdandenummer() {

		String Utf�rdandenummer = "276";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).sendKeys(Utf�rdandenummer);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).getAttribute("value") != Utf�rdandenummer)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).sendKeys(Utf�rdandenummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenUtf�rdandenummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenF�rstaSidnummer() {

		String F�rstasidnummer = "1";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).sendKeys(F�rstasidnummer);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).getAttribute("value") != F�rstasidnummer)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).sendKeys(F�rstasidnummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenF�rstaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer() {

		String Sistasidnummer = "999";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys(Sistasidnummer);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).getAttribute("value") != Sistasidnummer)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys(Sistasidnummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenDOI() {

		String DOI = "123456";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).getAttribute("value") != DOI)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenDOI"})
	public void OriginellaBidragTillVetenskapligaTidskriftenK�llaF�rPublikation() {

		Select K�llaF�rPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation)));
		Random randomOption = new Random();  
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		K�llaF�rPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenK�llaF�rPublikation"})
	public void OriginellaBidragTillVetenskapligaTidskriftenStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenStatus"})
	public void OriginellaBidragTillVetenskapligaTidskriftenK�llaID() {

		String K�llaId = "1234";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys(K�llaId);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).getAttribute("value") != K�llaId)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys(K�llaId);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenK�llaID"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessL�nkExternL�nkF�rPublicering() {

		String L�nkF�rPublicering = "Testl�nk";
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys(L�nkF�rPublicering);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).getAttribute("value") !=L�nkF�rPublicering)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys(L�nkF�rPublicering);
		}
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

		String Sammanfattning = "En riktigt bra sammanfattning";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(Sammanfattning);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).getAttribute("value") !=Sammanfattning)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(Sammanfattning);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}