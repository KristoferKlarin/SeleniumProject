package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class PortalLoggedInAsUserAns�kningarOchBidrag {
	private static By element = null;


	//ANS�KNINGAR OCH BIDRAG - KNAPPEN
	public static By Ans�kningarOchBidragButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuApplicationsAndGrants");
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - UTLYSNINGAR
	public static By Ans�kningarOchBidragUtlysningarButton(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ANS�KNINGAR
	public static By Ans�kningarOchBidragAnsokningar(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - BIDRAG
	public static By Ans�kningarOchBidragBidrag(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a");
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ANS�KAN OM ETIKPR�VNING
	public static By Ans�kningarOchBidragAns�kOmEtikpr�vning(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[1]/div/a");
		return element;
	}

	//ANS�KNINGAR OCH BIDRAG - ETIKPR�VNINGSANS�KNINGAR
	public static By Ans�kningarOchBidragEtikpr�vningsans�kningar(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[2]/div/a");
		return element;
	}
	
	//ANS�KNINGAR OCH BIDRAG - �NDRINGSANS�KNINGAR
		public static By Ans�kningarOchBidrag�ndringsans�kningar(){
			By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[3]/div/a");
			return element;
		}


}
