import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTS_certifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DesiredCapabilities dc= DesiredCapabilities.chrome();
		dc.acceptInsecureCerts(); //or
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//belongs to your local browser
		ChromeOptions cop=new ChromeOptions();
		cop.merge(dc);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakki\\Desktop\\Selenium Automation\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(cop);
		
		driver.get("facrbook.com");
	}

}
