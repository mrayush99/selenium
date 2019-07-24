package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.handler.FindElements;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
WebDriver cdriver=new ChromeDriver();
//FirefoxDriver driver = new FirefoxDriver();
cdriver.get("http://newtours.demoaut.com/mercurywelcome.php");
WebElement username =cdriver.findElement(By.name("userName"));

if (username.isEnabled())
{
	username.sendKeys("sunil");
	username.clear();
	username.sendKeys("sunil");

}
if (username.isDisplayed())
{
	String UN=username.getAttribute("value");
	System.out.println(UN);
}







	}

}
