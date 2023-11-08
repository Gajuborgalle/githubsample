package Propertyfile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Vtiger1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://localhost:8888/");
	FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\DRIVERS\\Credentials.properties");
	Properties p=new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	System.out.println(URL);
	driver.get(URL);
	
	
}
}
