package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class PublikationerAddNewINTEFackGranskadBidragTillBok extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en INTE fackgranskad Bidrag till Bok";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}
	
	@Test
	public void DropDownBidragTillEnBokIckeFackgranskad() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationIckeFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());
		Select VetenskapligPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Bidrag till en bok");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Contribution to a book");
		}
	}

	@Test (dependsOnMethods = {"DropDownBidragTillEnBokIckeFackgranskad"})
	public void BidragTillBokResten() throws InterruptedException {
				
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


