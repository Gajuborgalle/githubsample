package Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class G_GetTitle1_Method {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");	
	String actTitle = driver.getTitle();
	String expTitle = driver.getTitle();
	if(actTitle.equalsIgnoreCase(expTitle));
{
	System.out.println("Navigated to Current WebPage");
	}
{
	System.out.println("Navigated to wrong WebPage");
}
}
}
