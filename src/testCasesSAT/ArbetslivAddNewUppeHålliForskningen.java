package testCasesSAT;


import org.testng.annotations.Test;

import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ArbetslivAddNewUppeH�lliForskningen extends BeforeAfterTestBrowsers {
	String TestCaseInfo = "Loggar in som en projektledare och l�gger till ett Uppeh�ll i forskningen";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void Uppeh�llIForskningenL�ggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenL�ggTill_Css(driver).click();
	}

	@Test (dependsOnMethods={"Uppeh�llIForskningenL�ggTill"})
	public void StartDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenStartDatum_Name(driver).sendKeys("2017-05-19");
	}

	@Test (dependsOnMethods={"StartDatum"})
	public void SlutDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenSlutDatum_Name(driver).sendKeys("2018-06-17");
	}

	@Test (dependsOnMethods={"SlutDatum"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenBeskrivning_Id(driver).sendKeys("test");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void SparaVal() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Uppeh�llIForskningenSpara_Id(driver).click();
	}
}
