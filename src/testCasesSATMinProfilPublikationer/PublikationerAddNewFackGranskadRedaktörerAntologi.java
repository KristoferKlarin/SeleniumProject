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


public class PublikationerAddNewFackGranskadRedakt�rerAntologi extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad Redakt�rerAntologi";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test 
	public void DropDownRedakt�rerAntologi() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select VetenskapligPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
 
		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Redakt�rer (antologi)");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Editors (anthology)");
		}
	}

	@Test (dependsOnMethods={"DropDownRedakt�rerAntologi"})
	public void Redakt�rerAntologiResten() {

		GemensammaMetoder.Titel(driver);
		GemensammaMetoder.Redakt�r(driver);
		GemensammaMetoder.F�rlagOchPlats(driver);
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}


