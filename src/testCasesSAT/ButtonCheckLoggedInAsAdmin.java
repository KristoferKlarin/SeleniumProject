package testCasesSAT;


import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsAdmin;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ButtonCheckLoggedInAsAdmin extends BeforeAfterTestBrowsers {

	@Test 
	public void LoginAsAdminUser() {

		//Loggar in som anv�ndare kkprisma@yahoo.com
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.KristoferKlarinAdminUserNameSAT, UserCredentials.KristoferKlarinAdminPasswordSAT);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsAdmin.LoggaUt_Xpath);
		
	}

	@Test (dependsOnMethods={"LoginAsAdminUser"})
	public void ClickMyProfileButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER MIN PROFIL
		PortalLoggedInAsAdmin.MinProfilButton_Xpath(driver).click();
		PortalLoggedInAsAdmin.MinProfilButton_Inst�llningar_Xpath(driver).click();
		PortalLoggedInAsAdmin.MinProfilButton_SWAMID_KONTO_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickMyProfileButton"})
	public void ClickIntressentregisterButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER INTRESSENTREGISTER
		PortalLoggedInAsAdmin.IntressentregisterButton_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Personkonto_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Organisationskonto_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_OrganisationsAns�kningar_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Beredningsgruppsmedlemmar_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Granskarpool_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Arbetsgivare_Xpath(driver).click();	
	}

	@Test (dependsOnMethods={"ClickIntressentregisterButton"})
	public void ClickBeredningsgrupperButton() {

		//KLICKAR P� ALLA RUBRIKER UNDER BEREDNINGSGRUPPER
		PortalLoggedInAsAdmin.BeredningsgrupperButton_Xpath(driver).click();
		PortalLoggedInAsAdmin.BeredningsgrupperButton_Beredningsgrupper_Xpath(driver).click();
		PortalLoggedInAsAdmin.BeredningsgrupperButton_Arvodeshantering_Xpath(driver).click();

	}

	//FORTS�TT H�RIFR�N P� M�NDAG! G� IGENOM ALLA KNAPPAR OCH S�
	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormul�rButton() {

		//KLICKAR P� FORMUL�R
		PortalLoggedInAsAdmin.Formul�rButton_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickFormul�rButton"})
	public void ClickFinansi�rButton() {

		//KLICKAR P� FINANSI�R
		PortalLoggedInAsAdmin.Finansi�rButton_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickFinansi�rButton"})
	public void ClickPortaladministrationButton() {

		//KLICKAR P� PORTALADMINISTRATION
		PortalLoggedInAsAdmin.PortaladministrationButton_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsAdmin.LoggaUt_Xpath(driver).click();

	}


}


