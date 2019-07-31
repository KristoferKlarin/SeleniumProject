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

public class PublikationerAddNewFackGranskad�vrigLitteratur extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l�gger till en fackgranskad �vrigLitteratur";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginV�ljKlickaPublikation() {

		GemensammaMetoder.LoggainPublikation(driver);
	}

	@Test (dependsOnMethods={"LoginV�ljKlickaPublikation"})
	public void DropDown�vrigLitteratur() {

		GemensammaMetoder.PublikationFackgranskad(driver);
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("�vrig litteratur");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Other literature");
		}
	}

	@Test (dependsOnMethods={"DropDown�vrigLitteratur"})
	public void TitleAuthor() {

		GemensammaMetoder.TitelOchF�rfattare(driver);
	}

	@Test (dependsOnMethods={"TitleAuthor"})
	public void Publisher() {

		GemensammaMetoder.F�rlagOchPlats(driver);
	}

	@Test (dependsOnMethods={"Publisher"})
	public void InfoUtgivare() {
		// ISBN och �vrigt
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
	}

	@Test (dependsOnMethods={"InfoUtgivare"})
	public void InfoOpenAccess() {

		GemensammaMetoder.OpenAccess(driver);
	}

	@Test (dependsOnMethods = {"InfoOpenAccess"})
	public void Spara() {
		GemensammaMetoder.Spara(driver);
	}
}
