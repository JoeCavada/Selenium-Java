package PageLogin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helpers.helper;

public class pageLogin {

	private WebDriver driver;//como primer paso
	//Constructor de clase
	
	//step 1
	private By userField;
	private By passwordField;
	private By loginButton;
	private By titleText;

		
	
	
	public pageLogin(WebDriver driver) {		
		this.driver = driver;		
		//step2
		userField = By.xpath("/html/body/app-root/div/app-login/div[1]/div/div/div[2]/div/form/div[1]/input\r\n"
				+ "");
		passwordField = By.xpath("/html/body/app-root/div/app-login/div[1]/div/div/div[2]/div/form/div[2]/input\r\n"
				+ "");
		loginButton = By.xpath("/html/body/app-root/div/app-login/div[1]/div/div/div[2]/div/form/div[3]/div/div[1]/div/button\r\n"
				+ "");
		titleText = By.xpath("/html/body/app-root/div/app-profile/div/div[1]/div/div[2]/app-profile-preferences/app-block-profile-preferences/div/h4\r\n"
				+ "");
	
	}
	
	public void login( String user, String pass) {
		 	
		
		driver.findElement(userField).click();
		driver.findElement(userField).click();
		driver.findElement(userField).clear();
		driver.findElement(userField).sendKeys(user);
			
		driver.findElement(passwordField).click();
		driver.findElement(passwordField).click();
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(pass);
						 
				 
		driver.findElement(loginButton).click();		 
		helper helpers = new helper(); 	 	 
		helpers.sleepSeconds(4);
		 
	}
	@Test
	public void assertPage() {
		Assert.assertTrue(driver.findElement(By.xpath("titleText")).getText().contains("Información de perfil"));	
		
	}
	
}
