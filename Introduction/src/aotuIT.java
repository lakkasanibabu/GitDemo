import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class aotuIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		
		
	    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("profile.default_content_settings.popups", 0);
	    chromePrefs.put("download.default_directory", downloadpath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.sejda.com/pdf-editor");
		driver.findElement(By.xpath("//form[@id='fileUploadForm']")).click();
		Thread.sleep(6000);
		//call fileupload.exe using runtime is a class in java into your test case
		Runtime.getRuntime().exec("C:\\Users\\Lakki\\Documents\\Zoom\\fileupload.exe");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='save-pdf-btn']")));
		driver.findElement(By.xpath("//button[@id='save-pdf-btn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@id='taskResultsFrame']")));
		
		driver.findElement(By.xpath("//iframe[@id='taskResultsFrame']")).click();
		Thread.sleep(4000);
		File f=new File(downloadpath+"/converted.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
			System.out.println("File Found");
			
			
			if(f.delete())
				System.out.println("file deleted");
			
		}
				
				
	}

}
