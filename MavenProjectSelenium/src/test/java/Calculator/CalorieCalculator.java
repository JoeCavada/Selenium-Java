package Calculator;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helpers.Helper;
import pages.CalorieCalculatorPage;

public class CalorieCalculator {
	private WebDriver driver;
	//Anotaciones
	@Before
	public void Inicio() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();//objeto
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		//Manda llamar del package helpers de la clase Helper (try catch)
		Helper helpers = new Helper();
		helpers.sleepSeconds(4);
						
	}
	
	@Test
	public void Ejecuta() {
		
		driver.findElement(By.xpath("/html/body/div[4]/div/table/tbody/tr/td[2]/ul/li[2]/a\r\n"
				+ "")).click();
		
		Helper helpers = new Helper();
		helpers.sleepSeconds(5);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/ul/li[1]/a\r\n"
				+ "")).click();
		
		helpers.sleepSeconds(4);	
		
		//Accion para seleccionar el id del imput
		//Campo de texto edad
		WebElement click = driver.findElement(By.name("cage"));		
		click.clear();		
		click.sendKeys("25");	
		helpers.sleepSeconds(4);
		//Seleccionar Sexo Radio Button
		
		WebElement sexo = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/table[1]/tbody/tr[2]/td[2]/label[2]/span\r\n"
		+ ""));
		sexo.click();
		helpers.sleepSeconds(4);
				
				
		//Heigth/Altura/pies
				
	    driver.findElement(By.id("cheightfeet")).click();
		driver.findElement(By.id("cheightfeet")).clear();
		driver.findElement(By.id("cheightfeet")).sendKeys("25");
		helpers.sleepSeconds(4);
		
		//pulgadas/inches
		 driver.findElement(By.id("cheightinch")).click();
		 driver.findElement(By.id("cheightinch")).clear();
		 driver.findElement(By.id("cheightinch")).sendKeys("50");
		 helpers.sleepSeconds(4);
		 
		
		//Anchura/Weigth
		 driver.findElement(By.id("cpound")).click();
		 driver.findElement(By.id("cpound")).clear();
		 driver.findElement(By.id("cpound")).sendKeys("75");
		 helpers.sleepSeconds(4);
		 
		 
		 //Seleccionar un elemento de check list
		 
		 driver.findElement(By.id("cactivity")).click();
		  new Select(driver.findElement(By.id("cactivity"))).selectByVisibleText("Extra Active: very intense exercise daily, or physical job");
		  driver.findElement(By.id("cactivity")).click();
		 
		 /*Select actividad = new Select (driver.findElement(By.name("cactivity")));
		 actividad.selectByVisibleText("Moderate: exercise 4-5 times/week");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */
		 //Click a Boton
		 
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/table[4]/tbody/tr[3]/td[2]/input[2]\r\n"
		 		+ "")).click();
		 helpers.sleepSeconds(4);		
		
		 	
		
	}
	



	@After
	public void End() {
		driver.close();
	}

}
