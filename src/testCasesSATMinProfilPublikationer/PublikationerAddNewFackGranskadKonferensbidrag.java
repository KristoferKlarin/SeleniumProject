package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class PublikationerAddNewFackGranskadKonferensbidrag extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad Konferensbidrag";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
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

	@Test (dependsOnMethods={"L�ggTillPublikationer"})
	public void V�ljPublikationsTyp() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp)));
		Publikationstyp.selectByIndex(1);
	}

	@Test (dependsOnMethods={"V�ljPublikationsTyp"})
	public void DropDownKonferensbidrag() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown)));
		Publikationstyp.selectByIndex(3);
		
	
	}

	@Test (dependsOnMethods={"DropDownKonferensbidrag"})
	public void KonferensbidragF�rfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"KonferensbidragF�rfattareKnapp"})
	public void KonferensbidragTitel() {

		String KonferensbidragTitel = "Testtitel123";
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(KonferensbidragTitel);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value") != KonferensbidragTitel)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(KonferensbidragTitel);
		}
		String KonferensbidragTitelValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value");
		System.out.println("Titel = " + KonferensbidragTitelValue); 

	}

	@Test (dependsOnMethods={"KonferensbidragTitel"})
	public void KonferensbidragF�rfattareF�rnamn() {

		String F�rfattareF�rnamn = "F�rnamn";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys(F�rfattareF�rnamn);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).getAttribute("value") != F�rfattareF�rnamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).sendKeys(F�rfattareF�rnamn);
		}
		String F�rfattareF�rnamnValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareF�rNamn(driver).getAttribute("value");
		System.out.println("F�rnamn = " + F�rfattareF�rnamnValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragF�rfattareF�rnamn"})
	public void KonferensbidragF�rfattareEfternamn() {

		String F�rfattareEfternamn = "Efternamn";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys(F�rfattareEfternamn);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).getAttribute("value") != F�rfattareEfternamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).sendKeys(F�rfattareEfternamn);
		}
		String F�rfattareEfternamnValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rfattareEfterNamn(driver).getAttribute("value");
		System.out.println("Efternamn = " + F�rfattareEfternamnValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragF�rfattareEfternamn"})
	public void KonferensbidragNamnP�Tidskrift() {

		String NamnP�Tidsskrift = "Tidsskrift";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).sendKeys(NamnP�Tidsskrift);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).getAttribute("value") != NamnP�Tidsskrift)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).sendKeys(NamnP�Tidsskrift);
		}
		String NamnP�TidsskriftValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnP�Tidskrift(driver).getAttribute("value");
		System.out.println("Namn p� tidsskrift = " + NamnP�TidsskriftValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragNamnP�Tidskrift"})
	public void KonferensbidragVolym() {

		String Volym = "10";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).sendKeys(Volym);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).getAttribute("value") != Volym)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).sendKeys(Volym);
		}
		String VolymValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).getAttribute("value");
		System.out.println("Volym = " + VolymValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragVolym"})
	public void KonferensbidragUtf�rdandenummer() {

		String Utf�rdandenummer = "2786";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).sendKeys(Utf�rdandenummer);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).getAttribute("value") != Utf�rdandenummer)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).sendKeys(Utf�rdandenummer);
		}
		String Utf�rdandenummerValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtf�rdandenummer(driver).getAttribute("value");
		System.out.println("Utf�rdandenummer = " + Utf�rdandenummerValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragUtf�rdandenummer"})
	public void KonferensbidragF�rstaSidnummer() {

		String F�rstaSidnummer = "1";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).sendKeys(F�rstaSidnummer);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).getAttribute("value") != F�rstaSidnummer)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).sendKeys(F�rstaSidnummer);
		}
		String F�rstaSidnummerValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationF�rstaSidnummer(driver).getAttribute("value");
		System.out.println("F�rsta sidnummer = " + F�rstaSidnummerValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragF�rstaSidnummer"})
	public void KonferensbidragSistaSidnummer() {

		String Sistasidnummer = "199";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys(Sistasidnummer);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).getAttribute("value") != Sistasidnummer)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys(Sistasidnummer);
		}
		String SistasidnummerValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).getAttribute("value");
		System.out.println("Sista sidnummer = " + SistasidnummerValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragSistaSidnummer"})
	public void KonferensbidragDOI() {

		String DOI = "1234";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).getAttribute("value") != DOI)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);
		}
		String DOIValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).getAttribute("value");
		System.out.println("DOI = " + DOIValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragDOI"})
	public void KonferensbidragK�llaF�rPublikation() {

		Select K�llaF�rPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaF�rPublikation)));
		Random randomOption = new Random();  
		int endOption = K�llaF�rPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		K�llaF�rPublikation.selectByIndex(number);
		
		WebElement K�llaF�rPublikationSelect = K�llaF�rPublikation.getFirstSelectedOption();
		String K�llaF�rPublikationSelectValue = K�llaF�rPublikationSelect.getText();
		System.out.println("K�lla f�r publikation = " + K�llaF�rPublikationSelectValue);
	}

	@Test (dependsOnMethods={"KonferensbidragK�llaF�rPublikation"})
	public void KonferensbidragStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
		
		WebElement StatusSelect = Status.getFirstSelectedOption();
		String StatusSelectValue = StatusSelect.getText();
		System.out.println("Status = " + StatusSelectValue);
	}

	@Test (dependsOnMethods={"KonferensbidragStatus"})
	public void KonferensbidragK�llaID() {

		String K�llaId = "1234";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys(K�llaId);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).getAttribute("value")  != K�llaId)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).sendKeys(K�llaId);
		}
		String K�llaIdValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationK�llaID(driver).getAttribute("value");
		System.out.println("K�lla id = " + K�llaIdValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragK�llaID"})
	public void KonferensbidragVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
		
	}

	@Test (dependsOnMethods={"KonferensbidragVarTextenPubliceradIOpenAcessJa"})
	public void KonferensbidragOpenAccessL�nkExternL�nkF�rPublicering() {

		String L�nkF�rPublicering = "Testl�nk";
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys(L�nkF�rPublicering);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).getAttribute("value") != L�nkF�rPublicering)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).sendKeys(L�nkF�rPublicering);
		}
		String L�nkF�rPubliceringValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationL�nkExternL�nkF�rPublicering(driver).getAttribute("value");
		System.out.println("L�nk f�r publicering = " + L�nkF�rPubliceringValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragOpenAccessL�nkExternL�nkF�rPublicering"})
	public void KonferensbidragOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
		
		WebElement FormAvOASelect = FormAvOA.getFirstSelectedOption();
		String FormAvOASelectValue = FormAvOASelect.getText();
		System.out.println("Form av OA = " + FormAvOASelectValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragOpenAccessFormAvOA"})
	public void KonferensbidragOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
		
		WebElement DokumentVersionSelect = DokumentVersion.getFirstSelectedOption();
		String DokumentVersionSelectValue = DokumentVersionSelect.getText();
		System.out.println("Dokumentversion = " + DokumentVersionSelectValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragOpenAccessDokumentVersion"})
	public void KonferensbidragOpenAcessSammanfattning() {

		String OpenAccessSammanfattning = "Jag skriver en riktigt bra sammanfattning";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(OpenAccessSammanfattning);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).getAttribute("value") != OpenAccessSammanfattning)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(OpenAccessSammanfattning);
		}
		String OpenAccessSammanfattningValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).getAttribute("value");
		System.out.println("Sammanfattning = " + OpenAccessSammanfattningValue); 
	}

	@Test (dependsOnMethods={"KonferensbidragOpenAcessSammanfattning"})
	public void KonferensbidragSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}