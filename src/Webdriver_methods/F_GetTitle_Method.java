package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class F_GetTitle_Method {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	String Title = driver.getTitle();//Return type
	System.out.println(Title);
	


}

}
