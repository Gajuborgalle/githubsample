package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_Attribute {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.rediffmail.com/");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("manager");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	
}
}
