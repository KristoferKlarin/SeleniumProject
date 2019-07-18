package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationOmWebbplatsen extends BeforeAfterTestBrowsers {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "�ppnar SAT startsidan och verfierar att knappen Om Webbplatsen fungerar som t�nkt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
		Url = driver.getCurrentUrl();

	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.LoginButtonChrome)); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickInformation() {

		SAT_Home_Page_Not_Logged_In.InformationButton(driver).click();
	}


	@Test (dependsOnMethods={"ClickInformation"})
	public void ClickOmWebbplatsen() {

		SAT_Home_Page_Not_Logged_In.InformationOmWebbplatsenButton(driver).click();
	}


	@Test (dependsOnMethods={"ClickOmWebbplatsen"})
	public void VerifyURL() {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.InformationOmWebbplatsenModal));

		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#aboutwebsite")))
		{
			Assert.fail("Url st�mmer inte");
		} 

	}
}
