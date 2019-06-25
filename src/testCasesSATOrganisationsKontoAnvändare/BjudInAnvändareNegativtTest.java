package testCasesSATOrganisationsKontoAnv�ndare;

import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class BjudInAnv�ndareNegativtTest extends BeforeAfterTestBrowsers{
	String valueEmail;

	@BeforeClass
	public void beforeClass() {

		String TestCaseInfo = "Loggar in och f�rs�ker skicka en inbjudan till en anv�ndare. Utel�mnar dock samtliga f�lt och ska d� f� felmeddelanden.";
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
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_F�rnamn(driver), ""); 
	}


	@Test (dependsOnMethods={"BjudInAnv�ndareButtonF�rnamn"})
	public void BjudInAnv�ndareButtonEfternamn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Efternamn(driver), ""); 
	}


	@Test (dependsOnMethods={"BjudInAnv�ndareButtonEfternamn"})
	public void BjudInAnv�ndareButtonEmail() {
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Anv�ndare_Bjud_In_Email(driver), ""); 
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

	//DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span")) != null)

	@Test (dependsOnMethods={"ClickAnv�ndareButtonSkicka"})
	public void CheckErrorMessagesF�rnamn()  {


		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span"));
		if (driver.getPageSource().contains("Bjud in anv�ndare"))
		{
			//String valueF�rnamn= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
			//System.out.println("Felmeddelande p� Svenska  "+valueF�rnamn + " visas korrekt");
		}

		else if (driver.getPageSource().contains("Invite user"))
		{
			//String valueF�rnamn= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
			//System.out.println("Felmeddelande p� Engelska  "+valueF�rnamn + " visas korrekt");

		}
	}


	@Test (dependsOnMethods={"CheckErrorMessagesF�rnamn"})
	public void CheckErrorMessagesEfternamn()  {


		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span"));
		if (driver.getPageSource().contains("Bjud in anv�ndare"))
		{
			//String valueEfternamn= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
			//System.out.println("Felmeddelande p� Svenska  "+valueEfternamn + " visas korrekt");
		}

		else if (driver.getPageSource().contains("Invite user"))
		{
			//String valueEfternamn= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
			//System.out.println("Felmeddelande p� Engelska  "+valueEfternamn + " visas korrekt");

		}
	}


	@Test (dependsOnMethods={"CheckErrorMessagesEfternamn"})
	public void CheckErrorMessagesEpost()  {


		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span"));
		if (driver.getPageSource().contains("Bjud in anv�ndare"))
		{
//			String valueEpost= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
//			System.out.println("Felmeddelande p� Svenska  "+valueEpost + " visas korrekt");
		}

		else if (driver.getPageSource().contains("Invite user"))
		{
//			String valueEpost= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
//			System.out.println("Felmeddelande p� Engelska  "+valueEpost + " visas korrekt");

		}
	}

}


