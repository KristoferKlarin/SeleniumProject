package testCasesSATMinProfilMeriterOchUtm�rkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtm�rkelserAddNewHandleddaPersonerEnskildPerson extends BeforeAfterTestBrowsers {

	@BeforeTest
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Enskild handledd person";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm�rkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser(driver).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelser"})
	public void L�ggTillHandleddaPersonerEnskildPerson() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp(driver).click();
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPerson"})
	public void L�ggTillHandleddaPersonerEnskildPersonF�rnamn() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn(driver).sendKeys("F�rnamn3");
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonF�rnamn"})
	public void L�ggTillHandleddaPersonerEnskildPersonEfternamn() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonEfternamn"})
	public void L�ggTillHandleddaPersonerEnskildPersonSlut�r() {

		Select Slut�r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = Slut�r.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Slut�r.selectByIndex(number);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonSlut�r"})
	public void L�ggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner() {

		Select TypAvHandleddaPersoner = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = TypAvHandleddaPersoner.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		TypAvHandleddaPersoner.selectByIndex(number2);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner"})
	public void L�ggTillHandleddaPersonerEnskildPersonRoll() {

		Select Roll = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = Roll.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		Roll.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonRoll"})
	public void L�ggTillHandleddaPersonerEnskildPersonRollSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson(driver).click();
	}


}