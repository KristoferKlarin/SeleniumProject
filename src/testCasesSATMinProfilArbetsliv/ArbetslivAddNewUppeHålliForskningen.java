package testCasesSATMinProfilArbetsliv;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewUppeH�lliForskningen extends BeforeAfterTestBrowsers {
	
	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och l�gger till ett Uppeh�ll i forskningen";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {
		
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void Uppeh�llIForskningenL�ggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenL�ggTill(driver).click();
	}

	@Test (dependsOnMethods={"Uppeh�llIForskningenL�ggTill"})
	public void StartDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum(driver).sendKeys("2017-05-19");
		
//		String StartDatumUppehall = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum(driver).getAttribute("value");
//		System.out.println("Start Datum Uppeh�ll = " + StartDatumUppehall); 
	}

	@Test (dependsOnMethods={"StartDatum"})
	public void SlutDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum(driver).sendKeys("2018-06-17");
		
//		String SlutDatumUppehall = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum(driver).getAttribute("value");
//		System.out.println("Slut Datum Uppeh�ll = " + SlutDatumUppehall); 
	}

	@Test (dependsOnMethods={"SlutDatum"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning(driver).sendKeys("test");
		
//		String Beskrivning = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning(driver).getAttribute("value");
//		System.out.println("Beskrivning fritext = " + Beskrivning); 
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void SparaVal() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenSpara(driver).click();
	}
}
