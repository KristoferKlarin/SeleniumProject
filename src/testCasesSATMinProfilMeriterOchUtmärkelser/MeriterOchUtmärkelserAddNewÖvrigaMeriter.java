package testCasesSATMinProfilMeriterOchUtm�rkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtm�rkelserAddNew�vrigaMeriter extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en �vriga meriter";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}
	
	@Test
	public void LoginAsUser() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
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
		int endOptionStart�r = Start�r.getOptions().size(); 
		int numberStart�r = randomOptionStart�r .nextInt(endOptionStart�r);  
		Start�r.selectByIndex(numberStart�r);
		
//		WebElement Start�rSelect = Start�r.getFirstSelectedOption();
//		String Start�rSelectValue = Start�rSelect.getText();
//		System.out.println("Start�r = " + Start�rSelectValue); 

		Select Slut�r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r)));
		Slut�r.selectByIndex(numberStart�r + 1);
		
//		WebElement Slut�rSelect = Slut�r.getFirstSelectedOption();
//		String Slut�rSelectValue = Slut�rSelect.getText();
//		System.out.println("Slut�r = " + Slut�rSelectValue); 
	}

	@Test (dependsOnMethods={"Start�rAndSlut�r"})
	public void TypAvMerit() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit(driver).sendKeys("Test123");

//		String TypAvMeritString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit(driver).getAttribute("value");
//		System.out.println("Typ av merit = " + TypAvMeritString); 
	}

	@Test (dependsOnMethods={"TypAvMerit"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning(driver).sendKeys("En bra beskrivning");
		
//		String BeskrivningString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning(driver).getAttribute("value");
//		System.out.println("Beskrivning = " + BeskrivningString); 
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara(driver).click();
	}
}
