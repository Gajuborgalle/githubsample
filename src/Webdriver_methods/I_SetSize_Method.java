package Webdriver_methods;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class I_SetSize_Method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");	
	Thread.sleep(3000);
	Dimension d=new Dimension(600,500);
	//driver.manage().window().setSize(d);
	System.out.println(d);
	
	
	
	
	
	
	
}

}
