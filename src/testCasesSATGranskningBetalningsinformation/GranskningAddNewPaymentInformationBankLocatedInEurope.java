package testCasesSATGranskningBetalningsinformation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserGranskning;

public class GranskningAddNewPaymentInformationBankLocatedInEurope extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till ny betalningsinformation p� sidan Granskning f�r land i Europa (Frankrike)";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickGranskningsfliken() {

		PortalLoggedInAsUserGranskning.GranskningButton(driver).click();
	}

	@Test (dependsOnMethods={"ClickGranskningsfliken"})
	public void Betalningsinformation() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformation(driver).click();
	}

	@Test (dependsOnMethods={"Betalningsinformation"})
	public void BankensLand() {

		Select BankensLand = new Select (driver.findElement(By.id(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensLand)));
		
		if (driver.getPageSource().contains("Betalningsinformation"))
		{
			BankensLand.selectByVisibleText("Frankrike");
		}
		else if (driver.getPageSource().contains("Payment information")) 
		{
			BankensLand.selectByVisibleText("France");
		}

		WebElement Anst�llningsNamnSelect = BankensLand.getFirstSelectedOption();
		String SelectValue = Anst�llningsNamnSelect.getText();
		System.out.println("Bankens land �r = " + SelectValue ); 

	}

	@Test (dependsOnMethods={"BankensLand"})
	public void BankensNamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn));
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).sendKeys("Frankrikes st�rsta bank");

		String BankensnamnString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).getAttribute("value");
		System.out.println("Bankens namn �r = " + BankensnamnString); 
	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Kontoinnehavare() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).sendKeys("BankmanTest");

		String KontoinnehavareString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).getAttribute("value");
		System.out.println("Kontoinnehavare = " + KontoinnehavareString); 
	}


	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void IBAN() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationIBAN(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationIBAN(driver).sendKeys("9943595");

		String IBANString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationIBAN(driver).getAttribute("value");
		System.out.println("IBAN = " + IBANString); 
	}

	@Test (dependsOnMethods={"IBAN"})
	public void SWIFTBIC() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(driver).sendKeys("Abc1234567");

		String SWIFTBICString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(driver).getAttribute("value");
		System.out.println("SWIFT = " + SWIFTBICString); 
	}

	@Test (dependsOnMethods={"SWIFTBIC"})
	public void TIN() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).sendKeys("12134234");

		String TINString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).getAttribute("value");
		System.out.println("TIN = " + TINString); 
	}

	@Test (dependsOnMethods={"TIN"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSpara(driver).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void AccepteraAlert() {

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();


	}
}