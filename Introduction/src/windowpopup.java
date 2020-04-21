

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("basic auth")).click();
		
	}

}
