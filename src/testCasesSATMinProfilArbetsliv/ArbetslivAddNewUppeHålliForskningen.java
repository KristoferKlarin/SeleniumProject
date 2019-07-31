package testCasesSATMinProfilArbetsliv;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewUppeH�lliForskningen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till ett Uppeh�ll i forskningen";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void Uppeh�llIForskningenL�ggTill() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenL�ggTill()).click();
	}

	@Test (dependsOnMethods={"Uppeh�llIForskningenL�ggTill"})
	public void StartDatum() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum()).sendKeys("2017-06-18");
	}

	@Test (dependsOnMethods={"StartDatum"})
	public void SlutDatum() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum()).sendKeys("2018-06-18");
	}

	@Test (dependsOnMethods={"SlutDatum"})
	public void Beskrivning() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning()).sendKeys("test");
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void SparaVal() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenSpara()).click();	
	}
}
