package ErrorSSL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ErrorDePolitica {
	private WebDriver driver;
	
	@Before
	public void Inicio() {
		
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		
		
		//Global Profile
		DesiredCapabilities dc = new DesiredCapabilities();		
		//dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions coptions = new ChromeOptions(); 
		coptions.merge(dc);
		
		driver = new ChromeDriver(coptions);//objeto
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		
	
		
	}
	@Test
	public void proceso() {
		
		driver.findElement(By.xpath("/html/body/div[1]/h1")).click();
		
	}
	
	@After
	public void cierre() {
		driver.close();
	}

}
