package driverAndCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetCurrentUrl {
	
	
	
  @Test
  public static WebElement GetUrlAndPrintInConsole(WebDriver driver) {
	  
	  String CurrentUrl = driver.getCurrentUrl();
	  System.out.println("Nuvarande url �r " + CurrentUrl);
	  return null;
  }
 
}
