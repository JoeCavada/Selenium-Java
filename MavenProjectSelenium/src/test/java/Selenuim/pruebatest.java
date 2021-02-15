package Selenuim;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pruebatest {
private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	}
	@Test 	
	public void test1() throws InterruptedException {
		
		WebElement clic = driver.findElement(By.name("q"));
		
		clic.clear();
		
		clic.sendKeys("Cavada Joel");
		
		clic.submit();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		assertEquals("Cavada Joel",driver.getTitle());	
		Thread.sleep(9000);
		
	}
	@After	
	public void cierre() {
		
		driver.quit();
		
	}

}
