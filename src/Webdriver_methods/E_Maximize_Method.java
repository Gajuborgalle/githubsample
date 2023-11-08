package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class E_Maximize_Method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(5000);
	driver.manage().window().fullscreen();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	
	
	
	
}

}
