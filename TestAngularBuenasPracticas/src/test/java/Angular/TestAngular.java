package Angular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestAngular {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();//objeto
		driver.manage().window().maximize();
		driver.get("https://material.angular.io/components/select/overview");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//mat-select[@id='mat-select-10']/div/div[2]")).click();
	    driver.findElement(By.xpath("//mat-option[@id='mat-option-20']/span")).click();
		Thread.sleep(4000);
		driver.close();
  
	}

}
