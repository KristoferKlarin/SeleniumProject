package driverAndCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedInAsUserSwitchLanguage {


	public static WebElement SwitchLanguageToEnglishLoggedInPage(WebDriver driver) {

		
		if (driver.getPageSource().contains("Min profil"))
		{
			//System.out.println("Detta test genomf�rs p� den engelska versionen av portalen");
			driver.findElement(By.linkText("In English")).click();
		}
		else {
			//System.out.println("Detta test genomf�rs p� den engelska versionen av portalen");
		}
		return null;
	}
	
	public static WebElement SwitchLanguageToSwedishLoggedInPage(WebDriver driver) {

		
		if (driver.getPageSource().contains("My profile"))
		{
			//System.out.println("Detta test genomf�rs p� den svenska versionen av portalen");
			driver.findElement(By.linkText("P� svenska")).click();
		}
		else {
			//System.out.println("Detta test genomf�rs p� den svenska versionen av portalen");
		}
		return null;


	}
}

