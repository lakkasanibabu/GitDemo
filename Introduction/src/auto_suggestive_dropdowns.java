import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggestive_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		/*driver.findElement(By.xpath("//input[@id='fromCity']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Ben");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ENTER);*/
			
		
		// here we are using the same web element multiple times the code can be written as
		
		WebElement source=driver.findElement(By.id("fromCity"));
		source.click();
		Thread.sleep(2000);
		source.sendKeys("Ben");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		
		
		
	}

}
