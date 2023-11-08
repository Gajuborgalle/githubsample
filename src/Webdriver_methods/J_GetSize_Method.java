package Webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class J_GetSize_Method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");	
	Dimension d1 = driver.manage().window().getSize();
	System.out.println(d1);
	driver.manage().window().maximize();
	Dimension d2 = driver.manage().window().getSize();
	System.out.println(d2);
	
	


}

}
