package Propertyfile;

import java.io.FileInputStream;
import java.util.Properties;

public class NotepadFetching {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\DRIVERS\\Credentials.properties");
	Properties p=new Properties();
	p.load(fis);
	String UN = p.getProperty("un");
	System.out.println(UN);
	String PWD = p.getProperty("pwd");
	System.out.println(PWD);
	String URL = p.getProperty("url");
	System.out.println(URL);
	String BROWSER = p.getProperty("browser");
	System.out.println(BROWSER);
	
	
	
	
		
}

}
