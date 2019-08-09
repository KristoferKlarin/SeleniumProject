package testCasesSATMinProfilPublikationer;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class PublikationerAddNewFackGranskadBidragTillBok extends BeforeAfterTestBrowsers {

	//TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad Bidrag till Bok";

	@Test
	public void DropDownBidragTillEnBok() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		Select VetenskapligPublikation = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Bidrag till en bok");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Contribution to a book");
		}
	}

	@Test (dependsOnMethods = {"DropDownBidragTillEnBok"})
	public void FackgranskadBidragTillBokResten() throws InterruptedException {

		GemensammaMetoder.TitelOchF�rfattare(driver);
		GemensammaMetoder.Redakt�r(driver);
		GemensammaMetoder.F�rlagOchPlats(driver);
		GemensammaMetoder.Sidnummer(driver);
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}