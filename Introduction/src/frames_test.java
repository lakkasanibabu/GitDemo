import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElements(By.tagName("iframe")).size();//frameset also tag
		//driver.switchTo().frame(1);//by id, index.. not preffered, if developer adds one more frame then it will go wrong. u can give frame(2)
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	
		
		Actions drag=new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		
		drag.dragAndDrop(src, dest).build().perform();
		driver.switchTo().defaultContent();// comes out of frame
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		
			
		
	}

}
