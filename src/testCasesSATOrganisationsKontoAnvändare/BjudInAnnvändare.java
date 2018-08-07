package testCasesSATOrganisationsKontoAnv�ndare;

import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class BjudInAnnv�ndare extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Anst�llning UTAN att kopiera redan tillagd post.";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	  
	}


	@Test
	public void CheckForOrganisationButton() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto));
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto(driver).click();
	}
	

	@Test (dependsOnMethods={"CheckForOrganisationButton"})
	public void ClickAnv�ndareButton() {
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare(driver).click();
	}

	
	@Test (dependsOnMethods={"ClickAnv�ndareButton"})
	public void BjudInAnv�ndareButton() {
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In(driver).click();
	}


	@Test (dependsOnMethods={"BjudInAnv�ndareButton"})
	public void BjudInAnv�ndareButtonF�rnamn() {
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_F�rnamn(driver).sendKeys("F�rnamn");
	}

	
	@Test (dependsOnMethods={"BjudInAnv�ndareButtonF�rnamn"})
	public void BjudInAnv�ndareButtonEfternamn() {
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Efternamn(driver).sendKeys("Efternamn");

	}

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonEfternamn"})
	public void BjudInAnv�ndareButtonEmail() {
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Email(driver).sendKeys("email2@vr.se");
	}

	
	@Test (dependsOnMethods={"BjudInAnv�ndareButtonEmail"})
	public void BjudInAnv�ndareButtonRoll() {

		Select ResponsibilityType = new Select (driver.findElement(By.id(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Roll)));
		Random randomOption = new Random();  
		int endOption = ResponsibilityType.getOptions().size(); 
		int number = randomOption .nextInt(endOption );  
		ResponsibilityType.selectByIndex(number);
	}
	

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonRoll"})
	public void ClickAnv�ndareButtonSkicka() {
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Skicka(driver).click();
	}
		
	
	@Test (dependsOnMethods={"ClickAnv�ndareButtonSkicka"})
	public void AccepteraAlert() {

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

	
	@Test (dependsOnMethods={"AccepteraAlert"})
	public void CheckThatInvitationIsSent() {

		if (driver.getPageSource().contains("Inbjudan skickad"))
		{ 

			System.out.println("Testet lyckats");

		} else {
			System.out.println("Testet misslyckats");
			Assert.fail();
		}
	}
}
