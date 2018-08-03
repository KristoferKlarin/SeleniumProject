package testCasesSATMinProfilGranskarkompetens;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class GranskarkompetensKID extends BeforeAfterTestBrowsers {
	

	@Test
	public void LoginAsUser() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickGranskarkompetens() {

		PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens(driver).click();
	}
	
	@Test (dependsOnMethods={"ClickGranskarkompetens"})
	public void Forskningsomr�de1() {

		Select Forskningsomr�de1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de1)));
		Random randomOptionForskningsomr�de1 = new Random();  
		int startOptionForskningsomr�de1 = 1;
		int endOptionForskningsomr�de1 = Forskningsomr�de1.getOptions().size(); 
		int numberForskningsomr�de1 = startOptionForskningsomr�de1 + randomOptionForskningsomr�de1 .nextInt(endOptionForskningsomr�de1 - startOptionForskningsomr�de1);  
		Forskningsomr�de1.selectByIndex(numberForskningsomr�de1);

		WebElement Forskningsomr�deEtt = Forskningsomr�de1.getFirstSelectedOption();
		String Value = Forskningsomr�deEtt.getText();
		System.out.println("Forskingsomr�de1 = " + Value ); 

	}
	
	@Test (dependsOnMethods={"Forskningsomr�de1"})
	public void Forskningsomr�de2() {

		Select Forskningsomr�de2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de2)));
		Random randomOptionForskningsomr�de2 = new Random();  
		int startOptionForskningsomr�de2 = 1;
		int endOptionForskningsomr�de2 = Forskningsomr�de2.getOptions().size(); 
		int numberForskningsomr�de2 = startOptionForskningsomr�de2 + randomOptionForskningsomr�de2 .nextInt(endOptionForskningsomr�de2 - startOptionForskningsomr�de2);  
		Forskningsomr�de2.selectByIndex(numberForskningsomr�de2);
		
		WebElement Forskningsomr�deTv� = Forskningsomr�de2.getFirstSelectedOption();
		String Value = Forskningsomr�deTv�.getText();
		System.out.println("Forskningsomr�de2 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Forskningsomr�de2"})
	public void Forskningsomr�de3() {

		Select Forskningsomr�de3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de3)));
		Random randomOptionForskningsomr�de3 = new Random();  
		int startOptionForskningsomr�de3 = 1;
		int endOptionForskningsomr�de3 = Forskningsomr�de3.getOptions().size(); 
		int numberForskningsomr�de3 = startOptionForskningsomr�de3 + randomOptionForskningsomr�de3 .nextInt(endOptionForskningsomr�de3 - startOptionForskningsomr�de3);  
		Forskningsomr�de3.selectByIndex(numberForskningsomr�de3);
		
		WebElement Forskningsomr�deTre = Forskningsomr�de3.getFirstSelectedOption();
		String Value = Forskningsomr�deTre.getText();
		System.out.println("Forskningsomr�de3 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Forskningsomr�de3"})
	public void Forskningsomr�de4() {

		Select Forskningsomr�de4 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de4)));
		Random randomOptionForskningsomr�de4 = new Random();  
		int startOptionForskningsomr�de4 = 1;
		int endOptionForskningsomr�de4 = Forskningsomr�de4.getOptions().size(); 
		int numberForskningsomr�de4 = startOptionForskningsomr�de4 + randomOptionForskningsomr�de4 .nextInt(endOptionForskningsomr�de4 - startOptionForskningsomr�de4);  
		Forskningsomr�de4.selectByIndex(numberForskningsomr�de4);
		
		WebElement Forskningsomr�deFyra = Forskningsomr�de4.getFirstSelectedOption();
		String Value = Forskningsomr�deFyra.getText();
		System.out.println("Forskningsomr�de4 = " + Value ); 
		
		
	}
	
	@Test (dependsOnMethods={"Forskningsomr�de4"})
	public void Forskningsomr�de5() {

		Select Forskningsomr�de5 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsomr�de5)));
		Random randomOptionForskningsomr�de5 = new Random();  
		int startOptionForskningsomr�de5 = 1;
		int endOptionForskningsomr�de5 = Forskningsomr�de5.getOptions().size(); 
		int numberForskningsomr�de5 = startOptionForskningsomr�de5 + randomOptionForskningsomr�de5 .nextInt(endOptionForskningsomr�de5 - startOptionForskningsomr�de5);  
		Forskningsomr�de5.selectByIndex(numberForskningsomr�de5);
		
		WebElement Forskningsomr�deFem = Forskningsomr�de5.getFirstSelectedOption();
		String Value = Forskningsomr�deFem.getText();
		System.out.println("Forskningsomr�de5 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Forskningsomr�de5"})
	public void Metod1() {

		Select Metod1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod1)));
		Random randomOptionMetod1 = new Random();  
		int startOptionMetod1 = 1;
		int endOptionMetod1 = Metod1.getOptions().size(); 
		int numberMetod1 = startOptionMetod1 + randomOptionMetod1 .nextInt(endOptionMetod1 - startOptionMetod1);  
		Metod1.selectByIndex(numberMetod1);
		
		WebElement MetodEtt = Metod1.getFirstSelectedOption();
		String Value = MetodEtt.getText();
		System.out.println("Metod1 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod1"})
	public void Metod2() {

		Select Metod2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod2)));
		Random randomOptionMetod2 = new Random();  
		int startOptionMetod2 = 1;
		int endOptionMetod2 = Metod2.getOptions().size(); 
		int numberMetod2 = startOptionMetod2 + randomOptionMetod2 .nextInt(endOptionMetod2 - startOptionMetod2);  
		Metod2.selectByIndex(numberMetod2);
		
		WebElement MetodTv� = Metod2.getFirstSelectedOption();
		String Value = MetodTv�.getText();
		System.out.println("Metod2 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod2"})
	public void Metod3() {

		Select Metod3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod3)));
		Random randomOptionMetod3 = new Random();  
		int startOptionMetod3 = 1;
		int endOptionMetod3 = Metod3.getOptions().size(); 
		int numberMetod3 = startOptionMetod3 + randomOptionMetod3 .nextInt(endOptionMetod3 - startOptionMetod3);  
		Metod3.selectByIndex(numberMetod3);
		
		WebElement MetodTre = Metod3.getFirstSelectedOption();
		String Value = MetodTre.getText();
		System.out.println("Metod3 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod3"})
	public void Metod4() {

		Select Metod4 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod4)));
		Random randomOptionMetod4 = new Random();  
		int startOptionMetod4 = 1;
		int endOptionMetod4 = Metod4.getOptions().size(); 
		int numberMetod4 = startOptionMetod4 + randomOptionMetod4 .nextInt(endOptionMetod4 - startOptionMetod4);  
		Metod4.selectByIndex(numberMetod4);
		
		WebElement MetodFyra = Metod4.getFirstSelectedOption();
		String Value = MetodFyra.getText();
		System.out.println("Metod4 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod4"})
	public void Metod5() {

		Select Metod5 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod5)));
		Random randomOptionMetod5 = new Random();  
		int startOptionMetod5 = 1;
		int endOptionMetod5 = Metod5.getOptions().size(); 
		int numberMetod5 = startOptionMetod5 + randomOptionMetod5 .nextInt(endOptionMetod5 - startOptionMetod5);  
		Metod5.selectByIndex(numberMetod5);
		
		WebElement MetodFem = Metod5.getFirstSelectedOption();
		String Value = MetodFem.getText();
		System.out.println("Metod5 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Metod5"})
	public void Nyckelord1() {

		Select Nyckelord1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord1)));
		Random randomOptionNyckelord1 = new Random();  
		int startOptionNyckelord1 = 1;
		int endOptionNyckelord1 = Nyckelord1.getOptions().size(); 
		int numberNyckelord1 = startOptionNyckelord1 + randomOptionNyckelord1 .nextInt(endOptionNyckelord1 - startOptionNyckelord1);  
		Nyckelord1.selectByIndex(numberNyckelord1);
		
		WebElement NyckelordEtt = Nyckelord1.getFirstSelectedOption();
		String Value = NyckelordEtt.getText();
		System.out.println("Nyckelord1 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord1"})
	public void Nyckelord2() {

		Select Nyckelord2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord2)));
		Random randomOptionNyckelord2 = new Random();  
		int startOptionNyckelord2 = 1;
		int endOptionNyckelord2 = Nyckelord2.getOptions().size(); 
		int numberNyckelord2 = startOptionNyckelord2 + randomOptionNyckelord2 .nextInt(endOptionNyckelord2 - startOptionNyckelord2);  
		Nyckelord2.selectByIndex(numberNyckelord2);
		
		WebElement NyckelordTv� = Nyckelord2.getFirstSelectedOption();
		String Value = NyckelordTv�.getText();
		System.out.println("Nyckelord2 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord2"})
	public void Nyckelord3() {

		Select Nyckelord3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord3)));
		Random randomOptionNyckelord3 = new Random();  
		int startOptionNyckelord3 = 1;
		int endOptionNyckelord3 = Nyckelord3.getOptions().size(); 
		int numberNyckelord3 = startOptionNyckelord3 + randomOptionNyckelord3 .nextInt(endOptionNyckelord3 - startOptionNyckelord3);  
		Nyckelord3.selectByIndex(numberNyckelord3);
		
		WebElement NyckelordTre = Nyckelord3.getFirstSelectedOption();
		String Value = NyckelordTre.getText();
		System.out.println("Nyckelord3 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord3"})
	public void Nyckelord4() {

		Select Nyckelord4 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord4)));
		Random randomOptionNyckelord4 = new Random();  
		int startOptionNyckelord4 = 1;
		int endOptionNyckelord4 = Nyckelord4.getOptions().size(); 
		int numberNyckelord4 = startOptionNyckelord4 + randomOptionNyckelord4 .nextInt(endOptionNyckelord4 - startOptionNyckelord4);  
		Nyckelord4.selectByIndex(numberNyckelord4);
		
		WebElement NyckelordFyra = Nyckelord4.getFirstSelectedOption();
		String Value = NyckelordFyra.getText();
		System.out.println("Nyckelord4 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord4"})
	public void Nyckelord5() {

		Select Nyckelord5 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord5)));
		Random randomOptionNyckelord5 = new Random();  
		int startOptionNyckelord5 = 1;
		int endOptionNyckelord5 = Nyckelord5.getOptions().size(); 
		int numberNyckelord5 = startOptionNyckelord5 + randomOptionNyckelord5 .nextInt(endOptionNyckelord5 - startOptionNyckelord5);  
		Nyckelord5.selectByIndex(numberNyckelord5);
		
		WebElement NyckelordFem = Nyckelord5.getFirstSelectedOption();
		String Value = NyckelordFem.getText();
		System.out.println("Nyckelord5 = " + Value ); 
	}
	
	@Test (dependsOnMethods={"Nyckelord5"})
	public void Spara() {
		
		PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDSpara(driver).click();
	}
	
	@Test (dependsOnMethods={"Spara"})
	public void ConfirmSave() {
		
		driver.switchTo().alert().accept();
	}
	
	
}