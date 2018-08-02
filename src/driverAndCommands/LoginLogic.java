package driverAndCommands;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class LoginLogic {

	//DENNA SKRIVER IN ANV�NDARUPPGIFTER MED SENDKEYS. OM TEXTEN �R FELAKTIG S� K�R DEN EN CLEAR OCH SENDKEYS P� NYTT. 
	public static WebElement InputUntilUsernameAndPasswordIsFilled(WebDriver driver, String AnyUsername, String AnyPassword){

		SAT_Home_Page_Not_Logged_In.EnterUserName(driver).sendKeys(AnyUsername);

		if  (SAT_Home_Page_Not_Logged_In.EnterUserName(driver).getAttribute("value") == AnyUsername)                       
		{ 
			SAT_Home_Page_Not_Logged_In.EnterPassword(driver).sendKeys(AnyPassword);
		} 
		else {
			SAT_Home_Page_Not_Logged_In.EnterUserName(driver).clear();
			SAT_Home_Page_Not_Logged_In.EnterPassword(driver).clear();
			SAT_Home_Page_Not_Logged_In.EnterUserName(driver).sendKeys(AnyUsername);
			SAT_Home_Page_Not_Logged_In.EnterPassword(driver).sendKeys(AnyPassword);

		} 
		SAT_Home_Page_Not_Logged_In.SubmitUserNameAndPassword(driver).click();

		return null;
	}


	//DENNA ANV�NDER JAVASCRIPT F�R ATT DIREKT FYLLA I ANV�NDARNAMN OCH L�SENORD. DET G�R SNABBARE �N ATT K�RA SENDKEYS.
	public static WebElement InputUserNameAndPassWordUsingJavaScript (WebDriver driver, String AnyUsername, String AnyPassword){

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", SAT_Home_Page_Not_Logged_In.EnterUserName(driver), AnyUsername);
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", SAT_Home_Page_Not_Logged_In.EnterPassword(driver), AnyPassword);

		String UsernameValue = SAT_Home_Page_Not_Logged_In.EnterUserName(driver).getAttribute("value");
		System.out.println("Anv�ndare f�r detta testfall �r = " + UsernameValue); 
		
		String PassWordValue = SAT_Home_Page_Not_Logged_In.EnterPassword(driver).getAttribute("value");
		System.out.println("Anv�ndarens l�senord �r = " + PassWordValue); 
		
		SAT_Home_Page_Not_Logged_In.SubmitUserNameAndPassword(driver).click();

		return null;
	}
}


