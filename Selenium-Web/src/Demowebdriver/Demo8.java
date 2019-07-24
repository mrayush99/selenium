package Demowebdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
WebDriver cdriver=new ChromeDriver();
cdriver.manage().window().maximize();
cdriver.get("https://www.google.com/");
cdriver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
Thread.sleep(3000);
ArrayList<String> tabs = new ArrayList<>(cdriver.getWindowHandles());
System.out.println("tabs-->"+tabs.size());
cdriver.switchTo().window(tabs.get(1));
String title=cdriver.getTitle();
System.out.println(title);
cdriver.switchTo().window(tabs.get(0));
String title1=cdriver.getTitle();
System.out.println(title1);

	}

}
