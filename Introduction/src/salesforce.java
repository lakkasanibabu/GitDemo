import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("vignya");
		driver.findElement(By.id("password")).sendKeys("Loveu");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
			
		
	}

}
