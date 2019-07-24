package Demowebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("http://realestate.upskills.in/wp-admin/");
		cdriver.manage().window().maximize();
		cdriver.findElement(By.id("user_login")).sendKeys("admin");
		cdriver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		Actions MO= new Actions(cdriver);
		MO.sendKeys("ENTER");
		MO.sendKeys(Keys.ENTER).perform();
		WebElement link=cdriver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		MO.contextClick(link).build().perform();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		//MO.sendKeys(Keys.DOWN).perform();
	//	MO.sendKeys(Keys.ENTER).perform();
		

		
		
	}

}
