package TestNG_Programms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 1)
public void TC1() {
	Reporter.log("I am TC1",true);
}
@Test(priority = 2)
public void TC2() {
	Reporter.log("I am TC2",true);
}
@Test(priority = 3)
public void TC3() {
	Reporter.log("I am TC3",true);
}
}