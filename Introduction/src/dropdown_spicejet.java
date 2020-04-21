import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class dropdown_spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	//	System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				
		
		//css regular expression used
		//driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click(); - normal css path
		
		//driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		
		// selecting locations from and to
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		
		
		//calander selection from date if single trip
		
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();//current date selection
		
		// if i want to select future month and date... just pass the parameters in test case and it should run for that dates
		
		// logic is.. grab the common attribute of the day, put it into list and iterate
		
		
		List<WebElement> dates=driver.findElements(By.className("ui-state-default"));
		
		int count=driver.findElements(By.className("ui-state-default")).size();
		
		for(int i=0;i<count;i++)
		{
			
			String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
			
			if(text.equalsIgnoreCase("15"))
			{
				driver.findElements(By.className("ui-state-default")).get(i).click();	
				break;
			}
			
			
		}
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		List<WebElement> date=driver.findElements(By.className("ui-state-default"));
		
		int count1=driver.findElements(By.className("ui-state-default")).size();
		
		for(int j=0;j<count1;j++)
		{
			
			String text1=driver.findElements(By.className("ui-state-default")).get(j).getText();
			
			if(text1.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("ui-state-default")).get(j).click();	
				break;
			}
			
			
		}
		
			//selecting childs-adults-infants
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		Select Adult=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Adult.selectByValue("4");
			
		
		
		Select Child=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		Child.selectByValue("4");
		
		
		Select Infant=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		Infant.selectByValue("4");
		
	
		Select Currency=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Currency.selectByValue("USD");	
		
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		//if click  "+" symbol
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
			i++;
		}*/
		
		/*for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		}*/
	
		
		
		
	}

}
