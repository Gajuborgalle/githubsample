package TestNG_Programms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
@Test(timeOut = 10)
public void TC1() {
	Reporter.log("I am TC1",true);
}
@Test
public void TC2() {
	Reporter.log("I am TC2",true);
	}
@Test
public void TC3() {
	Reporter.log("I am TC3",true);	
	
}
}
