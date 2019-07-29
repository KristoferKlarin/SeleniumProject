package pageElementsSAT_EPM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class EPM_applicationTestData {
	private static WebElement element = null;

	//Text med radbrytningar
	public static final String TextMedRadbrytningar = "Git �r ett verktyg f�r versionshantering. "
			+ "Det g�r det m�jligt f�r flera personer att arbeta p� samma projekt. Git g�r att k�ra genom gr�nssnittet, genom Eclipse eller genom command promt. "
			+ "Vi har valt att anv�nda command promt eftersom att det var mest stabilt och mycket enklare �n Eclipse egen hantering f�r Git. "
			+ "Mer information om att arbeta med Git kommer senare i dokumentet."
			+ "Eclipse �r den utvecklingsmilj� som vi har valt att anv�nda f�r detta projekt. "
			+ "Det finns ett flertal andra alternativ men vi valde att arbeta med Eclipse eftersom att det �r den vanligaste utvecklingsmilj�n som anv�nds tillsammans med Selenium. "
			+ "Det finns mycket information och tips ang�ende Eclipse och Selenium p� Google." 
			+ "En detaljerad guide f�r att installera Eclipse och Selenium finns p�: "
			+ "https://www.guru99.com/installing-selenium-webdriver.html" 
			+ Keys.ENTER + "Git �r ett verktyg f�r versionshantering. Det g�r det m�jligt f�r flera personer att arbeta p� samma projekt. "
			+ "Git g�r att k�ra genom gr�nssnittet, genom Eclipse eller genom command promt. "
			+ "Vi har valt att anv�nda command promt eftersom att det var mest stabilt och mycket enklare �n Eclipse egen hantering f�r Git. "
			+ "Mer information om att arbeta med Git kommer senare i dokumentet." 
			+ Keys.ENTER + "En detaljerad guide f�r att installera Eclipse och Selenium finns p�: www.guru99.com/installing-selenium-webdriver.html"
			+ Keys.ENTER + Keys.ENTER + "Nu �r texten slut."; 
	
	/*public static WebElement InmatningTextJavascript (WebDriver driver){

		WebDriverWait wait3a = new WebDriverWait(driver, 10);
		wait3a.until(ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"tinymce\"]"))));

		driver.switchTo().frame(0);
		((JavascriptExecutor) driver).executeScript	
		("arguments[0].setAttribute('value', arguments[1])",driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))), "Test.");

		System.out.println("Text med javascript - check.");
		return null;
	}
	*/	

	// Byta teckensnitt och storlek
	public static void BytaTeckensnittOchStorlek (WebDriver driver){

		WebDriverWait wait_s3a = new WebDriverWait (driver, 10);
		wait_s3a.until(ExpectedConditions.elementToBeClickable(By.id("mceu_16-open")));

		// byter till Times New Roman
		driver.findElement(By.id("mceu_16-open")).click();
		driver.findElement(By.id("mceu_164-text")).click();
		// byter till 12 pt
		driver.findElement(By.id("mceu_17-open")).click();
		driver.findElement(By.id("mceu_174-text")).click();
	}	
}
