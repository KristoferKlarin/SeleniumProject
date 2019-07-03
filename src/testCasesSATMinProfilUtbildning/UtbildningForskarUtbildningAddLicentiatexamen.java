package testCasesSATMinProfilUtbildning;


import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class UtbildningForskarUtbildningAddLicentiatexamen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Licentiatexamen";
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

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_S�kOrganisation(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_SparaS�ktOrganisationKnapp(driver).click();

//		System.out.println("Organisation = " + universitet);

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void TypAvForskarUtbildningAddLicentiatexamen() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning));
		driver.findElement(By.id("Type")).click();

		Select typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning)));
		
		if (driver.getPageSource().contains("Forskarutbildning"))  
		{
			typ.selectByVisibleText("Licentiatexamen");
		}
		if (driver.getPageSource().contains("Research education"))
		{
			typ.selectByVisibleText("Licentiate degree");
		}

//		WebElement TypAvExamen = typ.getFirstSelectedOption();
//		String Value = TypAvExamen.getText();
//		System.out.println("Typ av examen = " + Value);
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void Examensdatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum(driver).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum�rDropdown));

		Select �r = new Select (driver.findElement(By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum�rDropdown)));
		Random random�r = new Random();  
		int endOption = �r.getOptions().size(); 
		int number�r = random�r .nextInt(endOption);  
		�r.selectByIndex(number�r);

		Select M�nad = new Select (driver.findElement(By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumM�nadDropdown)));
		Random randomM�nad = new Random();  
		int endOptionM�nad = M�nad.getOptions().size(); 
		int numberM�nad = randomM�nad .nextInt(endOptionM�nad);  
		M�nad.selectByIndex(numberM�nad);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();

//		String Examensdatum = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum(driver).getAttribute("value");
//		System.out.println("Datum f�r examen = " + Examensdatum);

	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void TypAvForskarUtbildningSelectSubjects() {

		//V�LJER SLUMPM�SSIGT I F�RSTA DROPDOWN
		Select �mne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne1DropDownForskarUtbildning)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = �mne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		�mne1.selectByIndex(number);

//		WebElement F�rst�mne = �mne1.getFirstSelectedOption();
//		String Value�mne1 = F�rst�mne.getText();
//		System.out.println("�mne 1 = " + Value�mne1);

		//V�LJER SLUMPM�SSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne2DropDownForskarUtbildning));
		Select �mne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne2DropDownForskarUtbildning)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = �mne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		�mne2.selectByIndex(number2);

//		WebElement Andra�mne = �mne2.getFirstSelectedOption();
//		String Value�mne2 = Andra�mne.getText();
//		System.out.println("�mne 2 = " + Value�mne2);

		//V�LJER SLUMPM�SSIGT I TREDJE DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne3DropDownForskarUtbildning));
		Select �mne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_�mne3DropDownForskarUtbildning)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = �mne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		�mne3.selectByIndex(number3);

//		WebElement Tredje�mne = �mne3.getFirstSelectedOption();
//		String Value�mne3 = Tredje�mne.getText();
//		System.out.println("�mne 3 = " + Value�mne3);
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningSelectSubjects"})
	public void WriteAvhandlingensTitelOrginalSpr�k() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k(driver).sendKeys("Test av avhandling");
		
//		String Orginalspr�k = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelOrginalspr�k(driver).getAttribute("value");
//		System.out.println("Avhandlingens titel p� orginalspr�k �r = " + Orginalspr�k);

	}

	@Test (dependsOnMethods={"WriteAvhandlingensTitelOrginalSpr�k"})
	public void WriteAvhandlingensTitelEngelska() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska(driver).sendKeys("Test Dissertation title");
		
//		String Engelska = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_AvhandlingensTitelEngelska(driver).getAttribute("value");
//		System.out.println("Avhandlingens titel p� engelska �r = " + Engelska);

	}


	@Test (dependsOnMethods={"WriteAvhandlingensTitelEngelska"})
	public void ISSNISBNNummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer(driver).sendKeys("12345678");
		
//		String ISBN = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_IssIsBnNummer(driver).getAttribute("value");
//		System.out.println("ISBN-Nummer �r = " + ISBN);

	}

	@Test (dependsOnMethods={"ISSNISBNNummer"})
	public void F�rnamnHandledare() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare(driver).sendKeys("Per");
		
//		String F�rnamnHandledare = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_F�rnamnHandledare(driver).getAttribute("value");
//		System.out.println("Handledarens f�rnamn �r = " + F�rnamnHandledare);

	}

	@Test (dependsOnMethods={"F�rnamnHandledare"})
	public void EfternamnHandledare() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare(driver).sendKeys("Persson");
		
//		String EfternamnHandledare = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_EfternamnHandledare(driver).getAttribute("value");
//		System.out.println("Handledarens efternamn �r = " + EfternamnHandledare);

	}

	@Test (dependsOnMethods={"EfternamnHandledare"})
	public void SparaForskarutbildningKnapp() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_L�ggTillForskarutbildning_SparaForskarUtbildningButton(driver).click();
	}


}
