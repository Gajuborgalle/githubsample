package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//To open the application
	driver.findElement(By.id("//input[@type=\"text\"]")).sendKeys("admin");//Enter user name
	driver.findElement(By.name("//input[@type=\"password\"]")).sendKeys("manager");//Enter password
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();//To click
	
	
	
}
}
