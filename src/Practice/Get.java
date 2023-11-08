package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver(1).exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.quit();
	
}
}