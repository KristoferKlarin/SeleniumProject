package testCasesSATMinProfilMeriterOchUtmärkelser;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class MeriterOchUtmärkelserAddNewPriserOchUtmärkelser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Priser och Utmärkelser";
	}
	
	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTill() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill()).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void År() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				 PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr());

		Select År = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr());
		
		Random randomOptionÅr = new Random();  
		int endOptionÅr = År.getOptions().size(); 
		int numberÅr = randomOptionÅr .nextInt(endOptionÅr);  
		År.selectByIndex(numberÅr);
	}

	@Test (dependsOnMethods={"År"})
	public void Land() {

		Select Land = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLand());
		
		Random randomOptionLand = new Random();  
		int startOptionLand = 3;
		int endOptionLand = Land.getOptions().size(); 
		int numberLand = startOptionLand + randomOptionLand .nextInt(endOptionLand - startOptionLand);  
		Land.selectByIndex(numberLand);
	}

	@Test (dependsOnMethods={"Land"})
	public void NamnPåPriset() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserNamnPåPriset()).sendKeys("Ett bra namn");
	}

	@Test (dependsOnMethods={"NamnPåPriset"})
	public void Utfärdare() {
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserUtfärdare()).sendKeys("En bra utfärdare");
	}

	@Test (dependsOnMethods={"Utfärdare"})
	public void Beskrivning() {
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserBeskrivning()).sendKeys("En bra beskrivning");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserSpara()).click();
	}
}
