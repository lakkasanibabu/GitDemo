import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[text()='Add Account']")).click();
		
		//xpath
		
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("reddybabu789@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("lordbalaji");
				driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
				
				//*[text()='Add Account']
				
				//css
				
				//driver.findElement(By.cssSelector("//*[id='email']")).sendKeys("reddybabu789@gmail.com");
				//driver.findElement(By.cssSelector("//*[id='pass']")).sendKeys("reddybabu789@gmail.com");
				//driver.findElement(By.cssSelector("//*[id=\"u_0_b\"]")).sendKeys("reddybabu789@gmail.com");
				
				
				//driver.findElement(By.id("email")).sendKeys("reddybabu789@gmail.com");
				//driver.findElement(By.id("pass")).sendKeys("lordbalaji");
				
				//driver.findElement(By.linkText("Forgotten account?")).click();
				
				//driver.findElement(By.id("loginbutton")).click();
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
				//driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
				//input[@id='email']
		
		
		
	}

}
