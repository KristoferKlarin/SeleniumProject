package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationOmPrisma extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "�ppnar SAT startsidan och verfierar att knappen " + "information Om Prisma " + "fungerar som t�nkt";
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
	public void ClicOmPrisma() {

		SAT_Home_Page_Not_Logged_In.OmPrismaButton(driver).click();
	}
	
	
	@Test (dependsOnMethods={"ClicOmPrisma"})
	public void VerifyInformation() {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.OmPrismaModal));
		
		if (driver.getPageSource().contains("Prisma �r ett ans�knings- och �rendehanteringssystem. Systemet riktar sig till svenska forskningsutf�rare, s�som universitet och h�gskolor, samt till enskilda forskare"))
		{
			System.out.println("Informationstexten Om Prisma visas korrekt. Testet har lyckats");
		} else {
			System.out.println("Informationstexten Om Prisma visas INTE korrekt. Testet har misslyckats");
			Assert.fail();
		}
			
	}
}
