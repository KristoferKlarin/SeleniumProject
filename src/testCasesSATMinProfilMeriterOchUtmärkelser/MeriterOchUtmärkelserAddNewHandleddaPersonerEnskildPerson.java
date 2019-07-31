package testCasesSATMinProfilMeriterOchUtm�rkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtm�rkelserAddNewHandleddaPersonerEnskildPerson extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en Enskild handledd person";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm�rkelser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelser"})
	public void L�ggTillHandleddaPersonerEnskildPerson() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerL�ggTillEnskildPersonKnapp()).click();
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPerson"})
	public void L�ggTillHandleddaPersonerEnskildPersonF�rnamn() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerF�rnamn()).sendKeys("F�rnamn3");
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonF�rnamn"})
	public void L�ggTillHandleddaPersonerEnskildPersonEfternamn() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerEfternamn()).sendKeys("Efternamn3");
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonEfternamn"})
	public void L�ggTillHandleddaPersonerEnskildPersonSlut�r() {

		Select Slut�r = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSlut�r());
		Random randomOption = new Random();  
		int endOption = Slut�r.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		Slut�r.selectByIndex(number);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonSlut�r"})
	public void L�ggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner() {

		Select TypAvHandleddaPersoner = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerTypAvHandleddaPerson());
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = TypAvHandleddaPersoner.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		TypAvHandleddaPersoner.selectByIndex(number2);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner"})
	public void L�ggTillHandleddaPersonerEnskildPersonRoll() {

		Select Roll = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerRoll());
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = Roll.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		Roll.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"L�ggTillHandleddaPersonerEnskildPersonRoll"})
	public void L�ggTillHandleddaPersonerEnskildPersonRollSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_HandleddaPersonerSparaEnskildPerson()).click();
	}


}