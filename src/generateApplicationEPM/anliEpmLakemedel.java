package generateApplicationEPM;


import static org.testng.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsAdminAndUserLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import pageElementsSAT_EPM.EPM_applicationFormElements;
import reusableMethods.DriverWaitExpectedConditions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class anliEpmLakemedel extends anliEpmFormTitleCategory {

	public static WebElement eudraCTnr(WebDriver driver) throws AWTException, InterruptedException, IOException {

		String eudraCT = "2019-123456-99";

		// kontroll att EudraCT-nr inte finns
		//				if (driver.getPageSource().contains(eudraCT)) {
		//					System.out.println("Finns EudraCT-nr = AVVIKANDE.");
		//					Thread.sleep(10000);
		//				}
		//				else {
		////					Assert.fail("EudraCT har f�rsvunnit");
		//					System.out.println("Finns inget EudraCT-nr. Som f�rv�ntat.");
		//		}

		
		// 15.5.1 EudraCT-nr in med javascript - - - FUNKAR INTE!
//		WebDriverWait wait4b = new WebDriverWait(driver, 10);
//		wait4b.until(ExpectedConditions.elementToBeClickable(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")));
//		((JavascriptExecutor) driver).executeScript("scroll(0, 200)"); 
//		Thread.sleep(10000);
//		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])",
//				driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), eudraCT);

		
		//15.5.1 EudraCT-nr in med sendKeys
		WebDriverWait wait4b = new WebDriverWait(driver, 10);
		wait4b.until(ExpectedConditions.elementToBeClickable(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")));
		((JavascriptExecutor) driver).executeScript("scroll(0, 200)"); 
		Thread.sleep(4000);
		System.out.println("EudraCT-f�ltet, f�rs�k 1.");
		driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")).sendKeys(eudraCT);
		Thread.sleep(2000);

		// spara 
		driver.findElement(By.name("Submitter")).click();
		Thread.sleep(3000);
		System.out.println("Utkast sparat med 'by.name('Submitter').");

		//		// kontroll om numret fyllts i
		//		if (driver.getPageSource().contains(eudraCT)) {
		//			System.out.println("EudraCT �r ifyllt.");
		//		}
		//		else {
		//			Assert.fail("EudraCT har f�rsvunnit");
		//			//		System.out.println("\nEudraCT-nummer �r " + eudraCT + ". Nu har jag k�rt wait4b");
		//			Thread.sleep(5000);
		//		}

		//		//		 om EudraCT-numret inte st�mmer...
		//		if (driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")).getAttribute("value") != eudraCT) {
		//			Thread.sleep(2000);
		//			System.out.println("Det finns inget Eudra-nummer ifyllt.");
		//
		//			//			 ...ta bort numret som st�r och fyll i p� nytt. 
		//			driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")).clear();
		//			Thread.sleep(3000);
		//			System.out.println("Kontroll och clear av EudraCT-f�ltet.");
		//			Thread.sleep(3000);
		//			((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])",
		//					driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), eudraCT);
		//		}
		//
		//		// ...annars felmeddelande i Failure Exception.
		//		else {
		//			Thread.sleep(3000);
		//			Assert.fail("Jag hittar inget EudraCT-nummer.");

		return null;
	}

	public static WebElement bilagorL�kemedel (WebDriver driver) throws AWTException, InterruptedException, IOException {

		String eudraCT = "2019-123456-99";

		// kontroll om numret �r kvar
//		if (driver.getPageSource().contains(eudraCT)) {
//			System.out.println("EudraCT �r kvar.");
//		}
//		else {
//			// Assert.fail("EudraCT har f�rsvunnit");
//			System.out.println("EudraCT har f�rsvunnit.");
//		}

		int test = driver.findElements(By.linkText("V�lj fil att ladda upp")).size();
		System.out.println(test); 

		while (test > 0) {
			System.out.println("Antal filer att ladda upp �r " + test);
			Thread.sleep(4000);
			driver.findElement(By.linkText("V�lj fil att ladda upp")).click();
			Thread.sleep(4000);
			Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
			Thread.sleep(4000);
			System.out.println("Jag har laddat upp en fil.");

			// kontroll om numret �r kvar
//			if (driver.getPageSource().equalsIgnoreCase(eudraCT)) {
//				System.out.println("EudraCT �r kvar.");
//			}
//			else {
//				Assert.fail("EudraCT har f�rsvunnit");
//				//				System.out.println("EudraCT har f�rsvunnit.");
//			}
			test--;
			//			System.out.println(test);
		}

		System.out.println("Alla filer �r uppladdade.");

		// spara 
		Thread.sleep(3000);
		driver.findElement(By.name("Submitter")).click();
		Thread.sleep(3000);
		System.out.println("Utkast med EudraCT och bilagor sparat med 'by.name('Submitter').");

		return null;

	} // h�r avslutas bilagorL�kemedel

}// h�r avslutas anliEpmL�kemedel