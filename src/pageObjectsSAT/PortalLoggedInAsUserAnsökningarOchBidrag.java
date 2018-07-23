package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsUserAns�kningarOchBidrag {
	private static WebElement element = null;


	//ANS�KNINGAR OCH BIDRAG - KNAPPEN
	public static final String Ans�kningarOchBidragButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuApplicationsAndGrants"; {
	}
	public static WebElement Ans�kningarOchBidragButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuApplicationsAndGrants"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - UTLYSNINGAR
	public static final String Ans�kningarOchBidragUtlysningarButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement Ans�kningarOchBidragUtlysningarButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ANS�KNINGAR
	public static final String Ans�kningarOchBidragAnsokningarButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement Ans�kningarOchBidragAnsokningarButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - BIDRAG
	public static final String Ans�kningarOchBidragBidragButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement Ans�kningarOchBidragBidragButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ANS�KAN OM ETIKPR�VNING
	public static final String Ans�kningarOchBidragAns�kOmEtikpr�vning_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement Ans�kningarOchBidragAns�kOmEtikpr�vning_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ETIKPR�VNINGSANS�KNINGAR
	public static final String Ans�kningarOchBidragEtikpr�vningsans�kningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement Ans�kningarOchBidragEtikpr�vningsans�kningar_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[2]/div/a"));
		return element;
	}


}
