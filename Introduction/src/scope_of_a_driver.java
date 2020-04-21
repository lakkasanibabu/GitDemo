import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope_of_a_driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		//Give me the count of links on page
		// tag starts with <a.. if it is link		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of inks in footer section
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//count of links in first column
		WebElement column=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		
		//click on each link and check if the pages are opening
		
		for(int i=1;i<column.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);// this will open link in new tab
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		}// opens all tabs
		
			//getting title of child tab
			Thread.sleep(5000);
			Set<String> titles=driver.getWindowHandles();
			Iterator<String> child1=titles.iterator();
			
			while(child1.hasNext())
			{
				driver.switchTo().window(child1.next());
				System.out.println(driver.getTitle());
			}
			
			
		}
		
	}


