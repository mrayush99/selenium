package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("http://retail.upskills.in/admin/");
		
		cdriver.findElement(By.name("username")).sendKeys("admin");
		cdriver.findElement(By.name("password")).sendKeys("admin@123");
		
		
		//cdriver.findElement(By.name("userName")).sendKeys("sunil");
		//cdriver.findElement(By.name("password")).sendKeys("sunil");
		
		//cdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		//cdriver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		Actions MO= new Actions(cdriver);
		MO.sendKeys(Keys.ENTER).perform();
		
		cdriver.findElement(By.xpath("//*[@id=\"menu-catalog\"]")).click();
		
		//MO.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();
		//Action mouseover=MO.moveToElement("//*[@id='btnLogin']"):
		
		
		
		
		
	}

}
