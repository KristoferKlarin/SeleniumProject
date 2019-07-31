package driverAndCommands;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageElementsSAT.PortalLoggedInAsUserLoggaUt;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class GeneralSetup {

	public WebDriver driver; long startTime; long duration; long startTimeSuite; long durationSuite; 

	@Parameters({"browser",  "Username", "Password", "Environment", "Language", "projectTitle"})

	@BeforeClass
	public void Setup(@Optional String browser, @Optional String Username , @Optional String Password, @Optional String Environment, @Optional String Language, @Optional String projectTitle) {



		if (browser.equalsIgnoreCase("Chrome")) {

			//System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//startTime = System.currentTimeMillis();
			driver.get(Environment);
			GetCurrentUrl.GetUrlAndPrintInConsole(driver);

			//GetCurrentUrl.GetUrlAndPrintInConsole(driver, "This test case is performed on the following URL ");

			//�ndrade loginlogiken s� allt g�rs fr�n en annan klass.. Prolemet �r hur man ska hantera parametern f�r olika milj�er. Kolla med Anna-Maja p� m�ndag 2019-07-22
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);


			//			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			//			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));
			//			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);
			//
			//			DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(PortalLoggedInAsUserLoggaUt.LoggaUt));

			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		}


		if (browser.equalsIgnoreCase("ChromeNotLoggedIn")) {

			//System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTime = System.currentTimeMillis();
			driver.get(Environment);
			//			GetCurrentUrl.GetUrlAndPrintInConsole(driver, "This test case is performed on the following URL");
		}

		if (browser.equalsIgnoreCase("FireFox")) {

			System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			LogManager.getLogManager().reset();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTime = System.currentTimeMillis();
			driver.get(Environment);
			GetCurrentUrl.GetUrlAndPrintInConsole(driver);
			driver.findElement(SAT_Home_Page_Not_Logged_In.LoginButtonChrome()).click();
			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, SAT_Home_Page_Not_Logged_In.EnterUserName());
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);

			DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, PortalLoggedInAsUserLoggaUt.LoggaUt());
			
			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		}

		if (browser.equalsIgnoreCase("IExplorer")) {

			System.setProperty("webdriver.ie.driver","C:\\Selenium 3.12.0\\IEDriver\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			DriverGetWebsite.OpenSatPortal(driver);
			driver.findElement(SAT_Home_Page_Not_Logged_In.LoginButtonChrome()).click();
			LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, Username, Password);
		}

		if (browser.equalsIgnoreCase("Headless")) {

			//System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized", "--headless");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTime = System.currentTimeMillis();
			driver.get(Environment);
			//GetCurrentUrl.GetUrlAndPrintInConsole(driver, "This test case is performed on the following URL ");
			driver.findElement(SAT_Home_Page_Not_Logged_In.LoginButtonChrome()).click();
			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, SAT_Home_Page_Not_Logged_In.EnterUserName());
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);

			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserLoggaUt.LoggaUt());

			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		}
	}

}
