package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PortalLoggedInAsOrgUserOrganisationskonto {
	private static By element = null;

	//ORGANISATIONSKONTO - KNAPPEN
	public static By Organisationskonto(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right");
		return element;
	}
	//ORGANISATIONSKONTO - INST�LLNINGAR
	public static By Organisationskonto_Inst�llningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}
	//ORGANISATIONSKONTO - ANS�KNINGAR OCH BIDRAG
	public static By Organisationskonto_Ans�kningarOchBidrag(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - NEDLADDNING
	public static By Organisationskonto_Nedladdning(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR
	public static By Organisationskonto_Struktur(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N
	public static By Organisationskonto_Struktur_RedigeraH�gstaNiv�n(){

		By element = By.cssSelector("#contentBody > section > div.content > form > div > div > div > ul > li > div > div.span5 > div > div > a");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N - SVENSKT NAMN
	public static By Organisationskonto_Struktur_RedigeraH�gstaNiv�nSvensktNamnP�NyEnhet(){

		By element = By.id("OrganizationStructure_Name");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N - ENGELSKT NAMN
	public static By Organisationskonto_Struktur_RedigeraH�gstaNiv�nEngelsktNamnP�NyEnhet(){

		By element = By.id("OrganizationStructure_NameEN");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N - L�GG TILL (KNAPP)
	public static By Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetKnapp(){

		By element = By.cssSelector("#editDialogBodyFormId > div.row-fluid.button-wrapper > div");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA H�GSTA NIV�N - ST�NG (KNAPP)
	public static By Organisationskonto_Struktur_RedigeraH�gstaNiv�nL�ggTillNyEnhetSt�ng(){

		By element = By.cssSelector("#editDialogBody > section > div > div:nth-child(2) > div > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//ORGANISATIONSKONTO - ANV�NDARE
	public static By Organisationskonto_Anv�ndare(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - ANV�NDARE - BJUD IN ANV�NDARE
	public static By Organisationskonto_Anv�ndare_Bjud_In(){

		By element = By.cssSelector("#organizationUserIndexSectionIdFormId > div > div.content > div.pull-right > a.btn.btn-primary.show-modal");
		return element;
	}

	//ORGANISATIONSKONTO - ANV�NDARE - BJUD IN ANV�NDARE - F�RNAMN
	public static By Organisationskonto_Anv�ndare_Bjud_In_F�rnamn(){

		By element = By.id("FirstName");
		return element;
	}	

	//ORGANISATIONSKONTO - ANV�NDARE - BJUD IN ANV�NDARE - EFTERNAMN
	public static By Organisationskonto_Anv�ndare_Bjud_In_Efternamn(){

		By element = By.id("LastName");
		return element;
	}	

	//ORGANISATIONSKONTO - ANV�NDARE - BJUD IN ANV�NDARE - EPOST
	public static By Organisationskonto_Anv�ndare_Bjud_In_Email(){

		By element = By.id("Email");
		return element;
	}	

	//ORGANISATIONSKONTO - ANV�NDARE - BJUD IN ANV�NDARE - ROLL
	public static By Organisationskonto_Anv�ndare_Bjud_In_Roll(){

		By element = By.id("selectedResponsibilityType");
		return element;
	}	

	//ORGANISATIONSKONTO - ANV�NDARE - BJUD IN ANV�NDARE - SKICKA
	public static By Organisationskonto_Anv�ndare_Bjud_In_Skicka(){

		By element = By.id("Submitter");
		return element;
	}	

	//ORGANISATIONSKONTO - ANV�NDARE - BJUD IN ANV�NDARE - CHECKBOX F�R RADERA
	public static By Organisationskonto_Anv�ndare_Bjud_In_Checkbox_Radera(){

		By element = By.cssSelector("#userModels_3__IsChecked");
		return element;
	}

	//ORGANISATIONSKONTO - ANV�NDARE - BJUD IN ANV�NDARE - TA BORT KNAPP
	public static By Organisationskonto_Anv�ndare_Ta_Bort(){

		By element = By.id("DeleteUsers");
		return element;
	}

	//ORGANISATIONSKONTO - BYT HEMVIST
	public static By Organisationskonto_Byt_Hemvist(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - F�RESLAGEN HEMVIST
	public static By Organisationskonto_F�reslagen_Hemvist(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGS�VERSIKT
	public static By Organisationskonto_Rapporterings�versikt(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSSTRUKTUR
	public static By Organisationskonto_Rapporteringsstruktur(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGS�VERSIKT
	public static By Organisationskonto_Signerings�versikt(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSSTRUKTUR
	public static By Organisationskonto_Signeringsstruktur(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSUTLYSNINGAR
	public static By Organisationskonto_Organisationsutlysningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSANS�KNINGAR
	public static By Organisationskonto_Organisationsans�kningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - UTBETALNINGAR
	public static By Organisationskonto_Utbetalningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a");
		return element;
	}


}
