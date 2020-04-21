import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors_practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("lakkasani");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("password");
		//driver.findElement(By.cssSelector("[id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		
		
		
		
		
	//	xpath syntax: //tagname[@attribute='value']
	//  Css   syntax:   tagname[attribute='value']	
		
	}

}
