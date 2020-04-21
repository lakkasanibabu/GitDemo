import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mutiple_windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		System.out.println(driver.getTitle());
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parntID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());	
		
		//what ever you perform the test after this step it will go and perform in child window
		
		driver.switchTo().window(parntID);
		System.out.println("Back to homepage");
		System.out.println(driver.getTitle());
		
	}

}
