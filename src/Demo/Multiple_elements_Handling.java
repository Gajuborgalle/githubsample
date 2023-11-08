package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_elements_Handling {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
	List<WebElement> allele = driver.findElements(By.xpath("//div"));
	for(WebElement ele:allele) {
		String e = ele.getText();
        System.out.println(e);
	
	
}
}
}
