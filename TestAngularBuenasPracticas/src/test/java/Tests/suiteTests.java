package Tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helpers.helper;
import PageLogin.pageInformation;
import PageLogin.pageLogin;

public class suiteTests {
	
	private WebDriver driver;
	
	@Before	
	public void Inicio() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();//objeto
		driver.get("https://www.sozu.com/login"
				+ "");
		driver.manage().window().maximize();
		
		helper helpers = new helper();
		helpers.sleepSeconds(4);					
		
		
	}
	@Test
	public void Login() {
		
		pageLogin pagelogin = new pageLogin(driver);
		pageInformation inf = new pageInformation(driver);	
		//login se cargas desde el metodo de login de pageLogin
		pagelogin.login("xim@gmail.com","68290joel");		
		/*El implicitWait es mejor por ejemplo si me login se tardo dos minustos en cargar el IMPLICITWAIT
		 *  va dejar de operar y va continuar con la operacion del programa o si tardo mas tambien me lo va aesperar,
		 *  por eso es mas recomendable  */
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		// helper helpers = new helper();
		//.sleepSeconds(4);
	}
	
	@Test
	public void information() {
		pageLogin pagelogin = new pageLogin(driver);	
		pageInformation inf = new pageInformation(driver);		
		pagelogin.login("xim@gmail.com","68290joel");	
		//pagelogin.assertPage();
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-profile/div/div[1]/div/div[2]/app-profile-preferences/app-block-profile-preferences/div/h4\r\n"
				+ "")).click();
		 		
		
		
	}
	
	@After
	public void cierre() {
		driver.close();
		helper helpers = new helper();
		helpers.sleepSeconds(4);
		//nombre de la clase del page correspondiente
	
	}

}
