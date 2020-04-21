import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remote {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//if you want to run tests in multple browserss - cross browser testing
		
		//write different test case as below
		
		//DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setBrowserName("forefox"); //properties
		//dc.setPlatform(Platform.WINDOWS); //properties
		//WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		
		//DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setBrowserName("IE"); //properties
		//dc.setPlatform(Platform.linux); //properties
		//WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome"); //properties
		dc.setPlatform(Platform.WINDOWS); //properties
		
	//WebDriver driver=new ChromeDriver(); if you want to run your tests in local
		
		//if you want to run in remote
		WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);// we are giving information like on what browser and what os tests shld run
		driver.get("www.google.com");
		
	}
	

}
