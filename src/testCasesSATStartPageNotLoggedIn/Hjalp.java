package testCasesSATStartPageNotLoggedIn;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class Hjalp extends BeforeAfterTestBrowsers {
	

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "�ppnar SAT startsidan och verfierar att knappen Hj�lp fungerar som t�nkt";
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, SAT_Home_Page_Not_Logged_In.LoginButtonChrome()); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickHj�lp() {
		
		driver.findElement(SAT_Home_Page_Not_Logged_In.Hj�lpButton()).click();
	}

	@Test (dependsOnMethods={"ClickHj�lp"})
	public void VerifyURL() {

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		String Url = driver.getCurrentUrl();

		if (!Url.equals(("https://prismasupport.research.se/")))
		{
			Assert.fail("Url st�mmer inte");
		} 

	}
}
