package testCasesSATMinProfilPublikationer;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.driverSelect;

public class PublikationerAddNewINTEFackGranskad�vrigLitteratur extends BeforeAfterTestSetup {

	//TestCaseInfo = "Loggar in som en projektledare och l�gger till en INTE fackgranskad �vrig Litteratur";

	@Test 
	public void DropDown�vrigLitteratur() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationIckeFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		Select VetenskapligPublikation = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("�vrig litteratur");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Other literature");
		}
	}

	@Test (dependsOnMethods = {"DropDown�vrigLitteratur"})
	public void INTEfackgransk�vrLittResten() throws InterruptedException {

		GemensammaMetoder.TitelOchF�rfattare(driver);
		GemensammaMetoder.F�rlagOchPlats(driver);
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}