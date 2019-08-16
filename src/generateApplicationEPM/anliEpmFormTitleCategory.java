package generateApplicationEPM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsAdminAndUserLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT_EPM.EPM_applicationFormElements;
import reusableMethods.DriverWaitExpectedConditions;

public class anliEpmFormTitleCategory extends BeforeAfterTestSetup{
	
	String titelEPM;
	String ans�kansKategori;
	
	@Parameters({"projectTitle"})	
	@BeforeClass 
	public void skapaTitel(@Optional String projectTitle) {
		
		titelEPM = projectTitle;
		System.out.println("Ans�kans titel: " + titelEPM);
	}
	
	@Parameters({"applicationType"})
	@BeforeClass 
	public void definieraKategori(@Optional String applicationType) {
		
		ans�kansKategori = applicationType;
		System.out.println("Ans�kanstyp: " + ans�kansKategori);
	}
	
	@Test
	public void Utlysning() throws AWTException, InterruptedException, IOException  {
		driver.get("https://testaprismaepm.vr.se/EthicalReviewUniqueKeyRow"); 
		System.out.println("Utlysning vald");
	}

	@Test (dependsOnMethods={"Utlysning"})
	public void Ans�kanOmEtikPr�vning() {
		driver.get("https://testaprismaepm.vr.se/EthicalReviewUniqueKeyRow"); 
	}

	@Test (dependsOnMethods={"Ans�kanOmEtikPr�vning"})
	public void NyAns�kan() {
		driver.findElement(By.xpath("//*[@id=\"UniqueKeyRowGrid\"]/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();
		System.out.println("Skapar ny ans�kan");
		
	}
	
	@Test (dependsOnMethods={"NyAns�kan"})
	public void Projekttitel() {
	
		driver.findElement(By.id("ProjectTitleSV")).sendKeys(titelEPM);

		if (driver.findElement(By.id("ProjectTitleSV")).getAttribute("value") != titelEPM);

		{
			driver.findElement(By.id("ProjectTitleSV")).clear();
			driver.findElement(By.id("ProjectTitleSV")).sendKeys(titelEPM);
		}
		System.out.println("Nu �r titeln satt (" + titelEPM + ") och ans�kanskategorin �r " + ans�kansKategori);
	}
	
	@Test (dependsOnMethods={"Projekttitel"})
	public void SkapaEtikpr�vning() {

		System.out.println("metod SkapaEtikpr�vning");
		driver.findElement(By.id("Submitter")).click();
	}

	@Test (dependsOnMethods={"SkapaEtikpr�vning"})
	public void BytFokusTillFormul�r() throws AWTException, InterruptedException, IOException {

		System.out.println("metod BytFokusTillFormul�r");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		if (driver.getPageSource().contains("Spara")) {
			System.out.println("jag ser spara");
		}
		else {
			Assert.fail("Hittar inte spara-knappen");
			reusableMethods.GetCurrentUrl.GetUrlAndPrintInConsole(driver);
		}
		Thread.sleep(2000);
		
//		// spara 
//		driver.findElement(By.name("Submitter")).click();
//		Thread.sleep(3000);
//		System.out.println("Utkast sparat med 'by.name('Submitter').");
//		System.out.println("Nu pausar vi p� f�rsta sidan av ans�kan.");
	}

}
