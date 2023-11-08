package Webdriver_methods;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class K_SetPosition_Method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");	
	Thread.sleep(3000);
	Point p=new Point(100,200);
	//driver.manage().window().setPosition(p);
	System.out.println(p);
	
	
	
	
	
	
}

}
