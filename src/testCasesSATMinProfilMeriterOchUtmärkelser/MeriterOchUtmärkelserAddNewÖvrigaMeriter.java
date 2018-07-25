package testCasesSATMinProfilMeriterOchUtm�rkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtm�rkelserAddNew�vrigaMeriter extends BeforeAfterTestBrowsers {
	
	
	
	String TestCaseInfo = "Loggar in som en projektledare och l�gger till en �vriga meriter";


	@Test
	public void LoginAsUser() {
		
		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedCssSelectorLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm�rkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser(driver).click();
	}
	
	@Test (dependsOnMethods={"ClickMeriterOchUtm�rkelser"})
	public void L�ggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterL�ggTill(driver).click();
	}
	
	@Test (dependsOnMethods={"L�ggTill"})
	public void Start�rAndSlut�r() {

		Select Start�r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterStart�r)));
		Random randomOptionStart�r = new Random();  
		int startOptionStart�r = 0;
		int endOptionStart�r = Start�r.getOptions().size(); 
		int numberStart�r = startOptionStart�r + randomOptionStart�r .nextInt(endOptionStart�r - startOptionStart�r);  
		Start�r.selectByIndex(numberStart�r);
		
		Select Slut�r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r)));
		Slut�r.selectByIndex(numberStart�r + 1);
	}
	
	@Test (dependsOnMethods={"Start�rAndSlut�r"})
	public void TypAvMerit() {

	PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit(driver).sendKeys("Test123");
		
	}
	
	@Test (dependsOnMethods={"TypAvMerit"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning(driver).sendKeys("En bra beskrivning");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara(driver).click();
	}
}
