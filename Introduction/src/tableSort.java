import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th[2]")).click();
		//xpath ; //tr/td[2]
		List<WebElement> firstcolumnlist=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList=new ArrayList<String>();
		
		for(int i=0;i<firstcolumnlist.size();i++)
		{
			//System.out.println(firstcolumnlist.get(i).getText());
			originalList.add(firstcolumnlist.get(i).getText());
		}
		
		ArrayList<String> CopylList=new ArrayList<String>();
		
		for(int i=0;i<originalList.size();i++)
		{
			CopylList.add(originalList.get(i));
		}
		
		Collections.sort(CopylList);
		
		//Collections.reverse(CopylList); descending
		
		for(String s:CopylList)
		{
			System.out.println(s);
		}
		
		Assert.assertTrue(originalList.equals(CopylList));
		
		
		
		
	}

}
