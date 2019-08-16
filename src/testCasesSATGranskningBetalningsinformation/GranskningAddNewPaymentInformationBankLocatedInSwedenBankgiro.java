package testCasesSATGranskningBetalningsinformation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import reusableMethods.CombineClearAndSendkeys;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.driverSelect;

public class GranskningAddNewPaymentInformationBankLocatedInSwedenBankgiro extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till ny betalningsinformation p� sidan Granskning f�r Sverige (BANKGIRO)";
	}

	@Test 
	public void ClickGranskningsfliken() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningButton()).click();

	}

	@Test (dependsOnMethods={"ClickGranskningsfliken"})
	public void Betalningsinformation() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformation());

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformation()).click();
	}

	@Test (dependsOnMethods={"Betalningsinformation"})
	public void BankensLand() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensLand());

		Select BankensLand = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensLand());

		if (driver.getPageSource().contains("Betalningsinformation"))
		{
			BankensLand.selectByVisibleText("Sverige");}

		else if (driver.getPageSource().contains("Payment information")) 
		{
			BankensLand.selectByVisibleText("Sweden");}
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void Betalningstyp() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBetalningstyp());

		Select Betalningstyp = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBetalningstyp());

		if (driver.getPageSource().contains("Betalningstyp"))
		{
			Betalningstyp.selectByVisibleText("Bankgiro");}

		else if (driver.getPageSource().contains("Payment account type")) 
		{
			Betalningstyp.selectByVisibleText("Bank giro");}
	}

	@Test (dependsOnMethods={"Betalningstyp"})
	public void Bankgiro() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankgiro_Id());
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankgiro_Id(), "1234-1234");

	}

	@Test (dependsOnMethods={"Bankgiro"})
	public void Skatteprocent() {
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(), "35");
		
	}

	@Test (dependsOnMethods={"Skatteprocent"})
	public void TIN() {
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(), "1234567");
	
	}

	@Test (dependsOnMethods={"TIN"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSpara()).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void AcceptAlert() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				By.xpath("//button[contains(text(), 'Ok')]"));

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}
