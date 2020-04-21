import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22648/rsa-vs-eng-1st-test-england-tour-of-south-africa-2019-20");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//parent to parent xpath
		
		WebElement table=driver.findElement(By.xpath("//body/div[@class='page']/div[@id='page-wrapper']/div[@class='cb-col cb-col-100 cb-bg-white']/div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/div[@id='innings_1']/div[1]"));
	
	//	System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size());
		
		
		
		int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
				
		for(int i=0;i<count-2;i++)
		{
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int integervalue=Integer.parseInt(value);
			
			sum=sum+integervalue;			
		}
	//	System.out.println(sum);
		
		//parent to parent xpath ends
		
		//child to sibling
		
		String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extravalues=Integer.parseInt(extras);
		
		int actualscore=sum+extravalues;
		//System.out.println(actualscore);
			
		//System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());	
		
		
		String scoreexpected=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int totalscore=Integer.parseInt(scoreexpected);
		
		if(actualscore==totalscore)
		{
			System.out.println("Expected result");
		}
		
		else
			
			System.out.println("Unexpected result");
		
	}

}

