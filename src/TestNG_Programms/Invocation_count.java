package TestNG_Programms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count {
@Test(invocationCount = 10)
public void TC1() {
	Reporter.log("Running TC1",true);
}

}
