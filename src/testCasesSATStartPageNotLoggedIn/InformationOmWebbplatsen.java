package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationOmWebbplatsen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "�ppnar SAT startsidan och verfierar att knappen " + "Om Webbplatsen " + "fungerar som t�nkt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.LoginButtonChrome)); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClicInformation() {

		SAT_Home_Page_Not_Logged_In.InformationButton(driver).click();
	}

	
	@Test (dependsOnMethods={"ClicInformation"})
	public void ClicOmWebbplatsen() {

		SAT_Home_Page_Not_Logged_In.OmWebbplatsenButton(driver).click();
	}
	
	
	@Test (dependsOnMethods={"ClicOmWebbplatsen"})
	public void VerifyInformation() {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.OmWebbplatsenModal));
		
		if (driver.getPageSource().contains("�r uppbyggd f�r att vara tillg�nglig och anv�ndbar f�r s� m�nga som m�jligt. Vi str�var efter att skriva p� enkel och l�ttl�st svenska."))
		{
//			System.out.println("Informationstexten Om Webbplatsen visas korrekt. Testet har lyckats");
		} else {
//			System.out.println("Informationstexten Om Webbplatsen visas INTE korrekt. Testet har misslyckats");
			Assert.fail();
		}
			
	}
}
