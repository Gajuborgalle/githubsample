package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D_Navigate_Method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(5000);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
	
}

}
