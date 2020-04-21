import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clicking_tab_by_tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/ul/li[1]")).click();
		//driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/ul/li[2]")).click();
		//driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/ul/li[3]")).click();
		//driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/ul/li[4]")).click();
	}

}
