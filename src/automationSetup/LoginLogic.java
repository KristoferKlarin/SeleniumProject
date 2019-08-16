package automationSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageElementsSAT.PortalLoggedInAsUserLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import reusableMethods.DriverWaitExpectedConditions;

public class LoginLogic {

	//DENNA SKRIVER IN ANV�NDARUPPGIFTER MED SENDKEYS. OM TEXTEN �R FELAKTIG S� K�R DEN EN CLEAR OCH SENDKEYS P� NYTT. 
	public static WebElement InputUntilUsernameAndPasswordIsFilled(WebDriver driver, String AnyUsername, String AnyPassword){

		driver.findElement(SAT_Home_Page_Not_Logged_In.EnterUserName()).sendKeys(AnyUsername);

		if  (driver.findElement(SAT_Home_Page_Not_Logged_In.EnterUserName()).getAttribute("value") == AnyUsername)                      
		{ 
			driver.findElement(SAT_Home_Page_Not_Logged_In.EnterPassword()).sendKeys(AnyPassword);
		} 
		else {
			driver.findElement(SAT_Home_Page_Not_Logged_In.EnterUserName()).clear();
			driver.findElement(SAT_Home_Page_Not_Logged_In.EnterPassword()).clear();
			driver.findElement(SAT_Home_Page_Not_Logged_In.EnterUserName()).sendKeys(AnyUsername);
			driver.findElement(SAT_Home_Page_Not_Logged_In.EnterPassword()).sendKeys(AnyPassword);

		} 
		driver.findElement(SAT_Home_Page_Not_Logged_In.SubmitUserNameAndPassword()).click();
		
		return null;
	}


	//DENNA ANV�NDER JAVASCRIPT F�R ATT DIREKT FYLLA I ANV�NDARNAMN OCH L�SENORD. DET G�R SNABBARE �N ATT K�RA SENDKEYS.
	public static WebElement InputUserNameAndPassWordUsingJavaScript (WebDriver driver, String AnyUsername, String AnyPassword){

		driver.findElement(
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(
				driver, SAT_Home_Page_Not_Logged_In.EnterUserName());
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.EnterUserName()).click();
		
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				driver.findElement(SAT_Home_Page_Not_Logged_In.EnterUserName()), AnyUsername);
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				driver.findElement(SAT_Home_Page_Not_Logged_In.EnterPassword()), AnyPassword);

		driver.findElement(
				SAT_Home_Page_Not_Logged_In.SubmitUserNameAndPassword()).click();
		
		return null;
	}
}


