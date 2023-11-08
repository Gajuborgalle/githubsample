package TestNG_Programms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_on_Method {
@Test
public void login() {
	Reporter.log("I am TC1",true);
	}
@Test(dependsOnMethods = {"login"})
public void logout() {
	Reporter.log("I am TC2",true);

}
}