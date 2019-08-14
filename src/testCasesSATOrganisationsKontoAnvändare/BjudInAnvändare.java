package testCasesSATOrganisationsKontoAnv�ndare;

import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageElementsSAT.PortalLoggedInAsUserGranskning;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class BjudInAnv�ndare extends BeforeAfterTestBrowsers {

	@BeforeClass 	
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in och skickar en inbjudan till en anv�ndare. Efter genomf�rt test s� raderas �ven posten i PP.";
	}

	@Test
	public void CheckForOrganisationButton() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
	}


	@Test (dependsOnMethods={"CheckForOrganisationButton"})
	public void ClickAnv�ndareButton() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare());

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare()).click();
	}


	@Test (dependsOnMethods={"ClickAnv�ndareButton"})
	public void BjudInAnv�ndareButton() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In());

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In()).click();
	}


	@Test (dependsOnMethods={"BjudInAnv�ndareButton"})
	public void BjudInAnv�ndareButtonF�rnamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_F�rnamn());

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_F�rnamn()), "F�rnamn"); 
	}


	@Test (dependsOnMethods={"BjudInAnv�ndareButtonF�rnamn"})
	public void BjudInAnv�ndareButtonEfternamn() {

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Efternamn()), "Efternamn"); 
	}


	@Test (dependsOnMethods={"BjudInAnv�ndareButtonEfternamn"})
	public void BjudInAnv�ndareButtonEmail() {

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Email()), "email1@vr.se"); 
	}

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonEmail"})
	public void BjudInAnv�ndareButtonRoll() {

		Select ResponsibilityType = driverSelect.DropDown(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Roll());

		Random randomOption = new Random();  
		int endOption = ResponsibilityType.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		ResponsibilityType.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonRoll"})
	public void ClickAnv�ndareButtonSkicka() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Skicka()).click();	
	}


	@Test (dependsOnMethods={"ClickAnv�ndareButtonSkicka"})
	public void AccepteraAlert() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				By.xpath("//button[contains(text(), 'Ok')]"));

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

	@Test (dependsOnMethods={"AccepteraAlert"})
	public void CheckThatInvitationIsSent()  {

		if (driver.getPageSource().contains("Inbjudan skickad") || driver.getPageSource().contains("Invitation sent"))  
		{

		}
		else
		{
			Assert.fail();
		}
	} 	

	@Test (dependsOnMethods={"CheckThatInvitationIsSent"})
	public void ClickCheckBox() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Checkbox_Radera());

		WebElement test = driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Checkbox_Radera()); ((JavascriptExecutor) driver).executeScript("arguments[0].click();", test);
	}

	@Test (dependsOnMethods={"ClickCheckBox"})
	public void ClickTaBortButton() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Ta_Bort()).click();

		driver.switchTo().alert().accept();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}


