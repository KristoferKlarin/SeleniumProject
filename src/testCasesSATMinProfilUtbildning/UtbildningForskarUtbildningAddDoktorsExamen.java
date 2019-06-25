package testCasesSATMinProfilUtbildning;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class UtbildningForskarUtbildningAddDoktorsExamen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Doktorsexamen";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning(driver).click();
	}


	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickForskarUtbildning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning(driver).click();
	}


	@Test (dependsOnMethods={"ClickForskarUtbildning"})
	public void AddForskarUtbildning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning(driver).click();
	}


	@Test (dependsOnMethods={"AddForskarUtbildning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).sendKeys(universitet);

		Thread.sleep(800);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).sendKeys(Keys.DOWN);

		Thread.sleep(800);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).sendKeys(Keys.ENTER);

		Thread.sleep(800);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp(driver).click();

//		String NamnP�Universitet = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).getAttribute("value");
//		System.out.println("Namn P� Universitet = " + NamnP�Universitet); 

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void TypAvForskarUtbildningAddDoktorsexamen() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning));
		driver.findElement(By.id("Type")).click();

		Select typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning)));


		if (driver.getPageSource().contains("Forskarutbildning"))  
		{
			typ.selectByVisibleText("Doktorsexamen");
		}
		else if (driver.getPageSource().contains("Research education"))
		{
			typ.selectByVisibleText("PhD degree");
		}

//		WebElement Typ1 = typ.getFirstSelectedOption();
//		String Value = Typ1.getText();
//		System.out.println("Typ = " + Value );
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningAddDoktorsexamen"})
	public void Examensdatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum(driver).sendKeys("2018-04-21");

//		String Examensdatum = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum(driver).getAttribute("value");
//		System.out.println("Examensdatum = " + Examensdatum); 

	}

	@Test (dependsOnMethods={"Examensdatum"})
	public void TypAvForskarUtbildningSelectSubjects() {

		//V�LJER SLUMPM�SSIGT I F�RSTA DROPDOWN
		Select �mne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne1DropDownForskarUtbildning)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

//		WebElement �mneEtt = �mne1.getFirstSelectedOption();
//		String Value1 = �mneEtt.getText();
//		System.out.println("�mne 1 = " + Value1 ); 


		//V�LJER SLUMPM�SSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne2DropDownForskarUtbildning));
		Select �mne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne2DropDownForskarUtbildning)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

//		WebElement �mneTv� = �mne2.getFirstSelectedOption();
//		String Value2 = �mneTv�.getText();
//		System.out.println("�mne 2 = " + Value2 ); 


		//V�LJER SLUMPM�SSIGT I TREDJE DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne3DropDownForskarUtbildning));
		Select �mne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne3DropDownForskarUtbildning)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);

//		WebElement �mneTre = �mne3.getFirstSelectedOption();
//		String Value3 = �mneTre.getText();
//		System.out.println("�mne 3 = " + Value3 ); 

	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningSelectSubjects"})
	public void WriteAvhandlingensTitelOrginalSpr�k() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k(driver).sendKeys("Test av avhandling");

//		String Avhandlingenstiteloriginalspr�k  = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k(driver).getAttribute("value");
//		System.out.println("Avhandlingens titel (originalspr�k)  = " + Avhandlingenstiteloriginalspr�k ); 

	}

	@Test (dependsOnMethods={"WriteAvhandlingensTitelOrginalSpr�k"})
	public void WriteAvhandlingensTitelEngelska() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska(driver).sendKeys("Test Dissertation title");

//		String Avhandlingenstitelengelska = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska(driver).getAttribute("value");
//		System.out.println("Avhandlingens titel (engelska)  = " + Avhandlingenstitelengelska ); 

	}


	@Test (dependsOnMethods={"WriteAvhandlingensTitelEngelska"})
	public void ISSNISBNNummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer(driver).sendKeys("12345678");

//		String ISSNISBNNummer = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer(driver).getAttribute("value");
//		System.out.println("ISSNISBNNummer  = " + ISSNISBNNummer );


	}


	@Test (dependsOnMethods={"ISSNISBNNummer"})
	public void F�rnamnHandledare() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare(driver).sendKeys("Per");

//		String F�rnamnHandledare = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare(driver).getAttribute("value");
//		System.out.println("F�rnamn Handledare  = " + F�rnamnHandledare );

	}


	@Test (dependsOnMethods={"F�rnamnHandledare"})
	public void EfternamnHandledare() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare(driver).sendKeys("Persson");

//		String EfternamnHandledare = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare(driver).getAttribute("value");
//		System.out.println("Efternamn Handledare  = " + EfternamnHandledare );

	}


	@Test (dependsOnMethods={"EfternamnHandledare"})
	public void SparaForskarutbildningKnapp() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_SparaForskarUtbildningButton(driver).click();


	}
}
