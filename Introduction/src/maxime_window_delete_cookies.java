import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxime_window_delete_cookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asd");
		driver.manage().deleteCookie(null);
		driver.manage().addCookie(null);
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		
		
	}

}
