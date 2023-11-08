package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class H_Get_URL {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	
	





}

}
