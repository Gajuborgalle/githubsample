package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class css{
public static void main(String[] args) {
	System.setProperty("webdriver.edge.diver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.cssSelector("//input[@id=\"login1\"]")).sendKeys("admin");
	driver.findElement(By.cssSelector("//input[@id=\"password\"]")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		
	

}
}
