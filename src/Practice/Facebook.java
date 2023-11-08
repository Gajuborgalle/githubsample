package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("ewbdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Gajanan");
	driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Borgalle");
	
		
}

}
