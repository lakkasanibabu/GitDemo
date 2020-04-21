import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforcee2e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("babu");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("kakak");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	
	}

}
