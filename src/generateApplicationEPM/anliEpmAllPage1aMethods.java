package generateApplicationEPM;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageElementsSAT_EPM.EPM_applicationFormElements;


public class anliEpmAllPage1aMethods extends anliEpmFormTitle01 {

	@Parameters({"applicationType"})

	@Test
	//	public void s1a_Ans�kanEndastPersonuppgifter() throws InterruptedException {
	public static WebElement s1a_Ans�kanEndastPersonuppgifter(WebDriver driver) {

		// kontroll om vi �ht �r p� r�tt sida
		if (driver.getPageSource().contains("Utkast")){

			// anger antal forskningshuvudm�n: EN
			Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationFormElements.AntalFoHuvudman))); 
			AntalFoHuvudman.selectByVisibleText("En");

			//Anger l�kemedelspr�vning: NEJ. 
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.KliniskL�kemedelspr�vning)));				
			Select KliniskL�kemedelsPr�vning = new Select (driver.findElement(By.id(EPM_applicationFormElements.KliniskL�kemedelspr�vning)));
			KliniskL�kemedelsPr�vning.selectByVisibleText("Nej");

			// Endast bef uppgifter: JA
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			wait2.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
			Select PersUppg= new Select (driver.findElement(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
			PersUppg.selectByVisibleText("Ja");

			// ans�kanskategori, spara val2
			WebDriverWait wait2b = new WebDriverWait(driver, 10);
			wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.Ans�kanskategoriSparaVal2)));
			driver.findElement(By.id(EPM_applicationFormElements.Ans�kanskategoriSparaVal2)).click();

			// R�dgivande yttrande: NEJ 
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.R�dgivandeYttrande)));
			Select R�dGivande = new Select (driver.findElement(By.id(EPM_applicationFormElements.R�dgivandeYttrande)));
			R�dGivande.selectByVisibleText("Nej");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("s1a_Ans�kanEndastPersonuppgifter fr�n anliEpmAllPage1aMethods");
		return null;

		//
		//	// om det g�ller ans�kan En huvudman endast befintliga personuppgifter
		//	if (applicationType.equalsIgnoreCase("anliEpmForm01PersuppgEnHuvudman")) {
		//
		//		// anger antal forskningshuvudm�n: EN
		//		Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationFormElements.AntalFoHuvudman))); 
		//		AntalFoHuvudman.selectByVisibleText("En");
		//
		//		//Anger l�kemedelspr�vning: NEJ. 
		//		WebDriverWait wait = new WebDriverWait(driver, 10);
		//		wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.KliniskL�kemedelspr�vning)));				
		//		Select KliniskL�kemedelsPr�vning = new Select (driver.findElement(By.id(EPM_applicationFormElements.KliniskL�kemedelspr�vning)));
		//		KliniskL�kemedelsPr�vning.selectByVisibleText("Nej");
		//
		//		// Endast bef uppgifter: JA
		//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		//		wait2.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
		//		Select PersUppg= new Select (driver.findElement(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
		//		PersUppg.selectByVisibleText("Ja");
		//
		//		// ans�kanskategori, spara val2
		//		WebDriverWait wait2b = new WebDriverWait(driver, 10);
		//		wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.Ans�kanskategoriSparaVal2)));
		//		driver.findElement(By.id(EPM_applicationFormElements.Ans�kanskategoriSparaVal2)).click();
		//
		//		// R�dgivande yttrande: NEJ 
		//		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		//		wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.R�dgivandeYttrande)));
		//		Select R�dGivande = new Select (driver.findElement(By.id(EPM_applicationFormElements.R�dgivandeYttrande)));
		//		R�dGivande.selectByVisibleText("Nej");
		//
		//	}
		//
		//	else {
		//		System.out.println("Fail");
		//	}


	}

	public static WebElement s1a2_Ans�kanEnFohuvL�k(WebDriver driver) {
		// En huvudman, l�kemedelspr�vning

		if (driver.getPageSource().contains("Utkast")){

			// anger antal forskningshuvudm�n: EN
			Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationFormElements.AntalFoHuvudman))); 
			AntalFoHuvudman.selectByVisibleText("En");

			//Anger l�kemedelspr�vning: JA. 
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.KliniskL�kemedelspr�vning)));				
			Select KliniskL�kemedelsPr�vning = new Select (driver.findElement(By.id(EPM_applicationFormElements.KliniskL�kemedelspr�vning)));
			KliniskL�kemedelsPr�vning.selectByVisibleText("Ja");

			// ans�kanskategori, spara val
			WebDriverWait wait2b = new WebDriverWait(driver, 10);
			wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.Ans�kanskategoriSparaVal)));
			driver.findElement(By.id(EPM_applicationFormElements.Ans�kanskategoriSparaVal)).click();

			// R�dgivande yttrande: NEJ 
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.R�dgivandeYttrande)));
			Select R�dGivande = new Select (driver.findElement(By.id(EPM_applicationFormElements.R�dgivandeYttrande)));
			R�dGivande.selectByVisibleText("Nej");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("sektion 1a f�r L�kemedel, en huvudman (fr�n anliEpmAllPage1aMethods");
		return null;
	}


}

