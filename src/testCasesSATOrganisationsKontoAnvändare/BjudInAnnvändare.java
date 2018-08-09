package testCasesSATOrganisationsKontoAnv�ndare;

import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

		String BjudInAnv�ndareButtonF�rnamn = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_F�rnamn(driver).getAttribute("value");
		System.out.println("F�rnamn = " + BjudInAnv�ndareButtonF�rnamn); 
	}

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonF�rnamn"})
	public void BjudInAnv�ndareButtonEfternamn() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Efternamn(driver).sendKeys("Efternamn");

		String BjudInAnv�ndareButtonEfternamn = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Efternamn(driver).getAttribute("value");
		System.out.println("Efternamn = " + BjudInAnv�ndareButtonEfternamn);

	}

	@Test (dependsOnMethods={"BjudInAnv�ndareButtonEfternamn"})
	public void BjudInAnv�ndareButtonEmail() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Email(driver).sendKeys("email1@vr.se");

		String BjudInAnv�ndareButtonEmail = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Email(driver).getAttribute("value");
		System.out.println("Email = " + BjudInAnv�ndareButtonEmail);
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
	public void CheckThatInvitationIsSent()  {

		if (driver.getPageSource().contains("Inbjudan skickad"))
		{ 
			System.out.println("Testet lyckats");

		} else {
			System.out.println("Testet misslyckats");
			Assert.fail();
			
		}
	}

	@Test (dependsOnMethods={"CheckThatInvitationIsSent"})
	public void ClickCheckBox() {

		WebElement test = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Checkbox_Radera(driver);


		((JavascriptExecutor) driver).executeScript("arguments[0].click();", test);

	}

	@Test (dependsOnMethods={"ClickCheckBox"})
	public void ClickTaBortButton() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Ta_Bort));
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Ta_Bort(driver).click();
	
		driver.switchTo().alert().accept();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}


