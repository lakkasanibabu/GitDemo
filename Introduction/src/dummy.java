import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		//div[@id='ui-datepicker-div'] //div[@class='ui-datepicker-group ui-datepicker-group-last']
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		List<WebElement> dates=driver.findElements(By.className("ui-state-default"));
		
		int count=driver.findElements(By.className("ui-state-default")).size();
		
		for(int i=0;i<count;i++)
		{
			
			String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
			
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("ui-state-default")).get(i).click();	
				break;
			}
			
			
		}
	}

}
