package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigates {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.google.com/");//To navigate to the google browser first
	Thread.sleep(5000);//Give the wait of 5sec
	driver.navigate().to("https://www.flipkart.com/");//Again to navigate to the flipkart browser
	Thread.sleep(2000);//Give the wait of 2sec
	driver.navigate().back();//Go back to the google browser
	Thread.sleep(2000);//Give the wait of 2sec
	driver.navigate().forward();//Go front to the browser
	Thread.sleep(2000);//Give the wait of 2sec
	driver.navigate().refresh();//Now it will refresh the page
	
	
}
}
