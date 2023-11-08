package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class B_Cose_Method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
	
	
	
	
}

}
