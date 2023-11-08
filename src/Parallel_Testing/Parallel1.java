package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void m1() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver(1).exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.com");

}

}
