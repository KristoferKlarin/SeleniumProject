package testCasesSATOrganisationsKontoAnv�ndare;

import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class BjudInAnv�ndareNegativtTest extends BeforeAfterTestBrowsers{


	@BeforeClass
	public void beforeClass() {

		String TestCaseInfo = "Loggar in och f�rs�ker skicka en inbjudan till en anv�ndare. Utel�mnar dock samtliga f�lt och ska d� f� felmeddelanden.";
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

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				driver.findElement(
						PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_F�rnamn()), ""); 
	}

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonF�rnamn"})
	public void BjudInAnv�ndareButtonEfternamn() {

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				driver.findElement(
						PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Efternamn()), ""); 
	}

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonEfternamn"})
	public void BjudInAnv�ndareButtonEmail() {

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				driver.findElement(
						PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Email()), ""); 
	}

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonEmail"})
	public void ClickAnv�ndareButtonSkicka() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Skicka()).click();	
	}

	@Test (dependsOnMethods={"ClickAnv�ndareButtonSkicka"})
	public void CheckErrorMessages()  {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span"));

		if (driver.getPageSource().contains("'F�rnamn' kr�vs") && 
				(driver.getPageSource().contains("'Efternamn' kr�vs")) && 
				(driver.getPageSource().contains("'E-postadress' kr�vs"))) {
		} else if (driver.getPageSource().contains("'First name' is required") && 
				(driver.getPageSource().contains("'Last name' is required")) && 
				(driver.getPageSource().contains("'E-mail' is required"))) {
		} else {
			org.testng.Assert.fail();
		}
	}
}


