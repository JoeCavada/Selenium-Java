package PageLogin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helpers.helper;

public class pageInformation {
	private WebDriver driver;
	private By titleText;
	private By propPara;
	//select amenidades
	private By amenidad;
	private By amenidad1;
	private By buttonUpdate;
	
	public pageInformation(WebDriver driver) {
		
		this.driver = driver;	
		propPara = By.xpath("/html/body/app-root/div/app-profile/div/div[1]/div/div[2]/app-profile-preferences/app-block-profile-preferences/div/div[2]/div[1]/div/div[3]");
		titleText = By.xpath("/html/body/app-root/div/app-profile/div/div[1]/div/div[2]/app-profile-preferences/app-block-profile-preferences/div/h4\r\n"
				+ "");
		
		amenidad = By.xpath("//angular2-multiselect/div/div/div");
		amenidad1 = By.xpath("//li[4]/label");
		
		buttonUpdate = By.xpath("/html/body/app-root/div/app-profile/div/div[1]/div/div[2]/app-profile-preferences/app-block-profile-preferences/div/div[2]/div[14]/div/a\r\n"
				+ "");
	
		
	}

	public void information() {
		
		driver.findElement(titleText).click();
		driver.findElement(propPara).click();		
		driver.findElement(amenidad).click();
		driver.findElement(amenidad1).click();
		driver.findElement(buttonUpdate).click();
		 
		
		helper helpers = new helper(); 	 	 
		helpers.sleepSeconds(4);
		
		
	}




}
