package testCasesSATMinProfilGranskarkompetens;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.driverSelect;


public class GranskarkompetensKID extends BeforeAfterTestSetup {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och v�ljer slumpm�ssiga v�rden i KID dropdowns under granskarkompetens";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickGranskarkompetens() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens()).click();
	}

	@Test (dependsOnMethods={"ClickGranskarkompetens"})
	public void Forskningsomr�de1() {
		
		Select Forskningsomr�de1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de1());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsomr�de1, 1, 0);
	}

	@Test (dependsOnMethods={"Forskningsomr�de1"})
	public void Forskningsomr�de2() {
		
		Select Forskningsomr�de2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de2());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsomr�de2, 1, 0);

	}

	@Test (dependsOnMethods={"Forskningsomr�de2"})
	public void Forskningsomr�de3() {

		Select Forskningsomr�de3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de3());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsomr�de3, 1, 0);

	}

	@Test (dependsOnMethods={"Forskningsomr�de3"})
	public void Forskningsomr�de4() {

		Select Forskningsomr�de4 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de4());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsomr�de4, 1, 0);
	
	}

	@Test (dependsOnMethods={"Forskningsomr�de4"})
	public void Forskningsomr�de5() {

		Select Forskningsomr�de5 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de5());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsomr�de5, 1, 0);
		
	}

	@Test (dependsOnMethods={"Forskningsomr�de5"})
	public void Metod1() {

		Select Metod1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod1());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod1, 1, 0);
	
	}

	@Test (dependsOnMethods={"Metod1"})
	public void Metod2() {

		Select Metod2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod2());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod2, 1, 0);
	
	}

	@Test (dependsOnMethods={"Metod2"})
	public void Metod3() {

		Select Metod3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod3());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod3, 1, 0);
		
	}

	@Test (dependsOnMethods={"Metod3"})
	public void Metod4() {

		Select Metod4 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod4());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod4, 1, 0);
	
	}

	@Test (dependsOnMethods={"Metod4"})
	public void Metod5() {

		Select Metod5 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod5());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod5, 1, 0);
	
	}

	@Test (dependsOnMethods={"Metod5"})
	public void Nyckelord1() {

		Select Nyckelord1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord1());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord1, 1, 0);
	
	}

	@Test (dependsOnMethods={"Nyckelord1"})
	public void Nyckelord2() {

		Select Nyckelord2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord2());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord2, 1, 0);

	}

	@Test (dependsOnMethods={"Nyckelord2"})
	public void Nyckelord3() {

		Select Nyckelord3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord3());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord3, 1, 0);
		
	}

	@Test (dependsOnMethods={"Nyckelord3"})
	public void Nyckelord4() {

		Select Nyckelord4 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord4());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord4, 1, 0);
		
	}

	@Test (dependsOnMethods={"Nyckelord4"})
	public void Nyckelord5() {

		Select Nyckelord5 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord5());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord5, 1, 0);
	
	}

	@Test (dependsOnMethods={"Nyckelord5"})
	public void Spara() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDSpara()).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void ConfirmSave() {

		driver.switchTo().alert().accept();
	}


}