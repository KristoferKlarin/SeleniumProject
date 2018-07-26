package testCasesSAT�vrigt;




import org.testng.Assert;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;

public class LoginAsInvalidUser extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "F�rs�ker logga in med felaktiga inloggningsuppgifter. Kontrollerar att felmeddelande visas";

	@Test 
	public void InputUserWithInvalidInfo() {
		
		System.out.println("Testfall = " + TestCaseInfo);

		//F�RS�KER LOGGA IN MED OGILTIGA ANV�NDARUPPGIFTER
		
	}

	@Test (dependsOnMethods={"InputUserWithInvalidInfo"})
	public void CheckThatLogginInWithFalseInfoNotPossible() {

		//KONTROLLERAR OM TEXTEN OM FELAKTIG EPOST-ADRESS VISAS P� SIDAN
		if (driver.getPageSource().contains("Den angivna e-postadressen �r inte korrekt"))
		{ 
			//Testet lyckas
			System.out.println();
			

		} else {
			//Testet misslyckas
			Assert.fail();
			
			

		}
	}

}

