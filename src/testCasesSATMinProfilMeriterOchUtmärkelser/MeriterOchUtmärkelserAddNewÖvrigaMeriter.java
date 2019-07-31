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


public class MeriterOchUtm�rkelserAddNew�vrigaMeriter extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en �vriga meriter";
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
	public void L�ggTill() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterL�ggTill()).click();
	}

	@Test (dependsOnMethods={"L�ggTill"})
	public void Start�rAndSlut�r() {

		Select Start�r = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterStart�r());
		Random randomOptionStart�r = new Random();  
		int endOptionStart�r = Start�r.getOptions().size(); 
		int numberStart�r = randomOptionStart�r .nextInt(endOptionStart�r);  
		Start�r.selectByIndex(numberStart�r);

		Select Slut�r = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSlut�r());
		Slut�r.selectByIndex(numberStart�r + 1);
	}

	@Test (dependsOnMethods={"Start�rAndSlut�r"})
	public void TypAvMerit() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterTypAvMerit()).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"TypAvMerit"})
	public void Beskrivning() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterBeskrivning()).sendKeys("En bra beskrivning");
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm�rkelser_�vrigaMeriterSpara()).click();
	}
}
