import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Actions act=new Actions(driver);// now the driver have capability of interaction with Actions class and its methods
		
		//lets build composite action, this actually moves to specific element
		//(driver.findElement(By.cssSelector("#nav-link-accountList")) - this argument actually have web element, let put in a variable
		
		WebElement list= driver.findElement(By.cssSelector("#nav-link-accountList"));
		WebElement txtbox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		
		
		//act.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphoneX").build().perform();
		//act.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		
		act.moveToElement(txtbox).click().keyDown(Keys.SHIFT).sendKeys("iphoneX").doubleClick().build().perform();
		
		//how to grab the text entered in search box - doubleclick
		
		
		
		act.moveToElement(list).contextClick().build().perform();
		
		
//after giving .build it just build this step that means the step is ready (element is find). now to run after build add perform method
		
		
		
	}

}
