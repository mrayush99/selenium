package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
WebDriver cdriver=new ChromeDriver();
cdriver.get("http://elearning.upskills.in/");
Thread.sleep(3000);
cdriver.findElement(By.name("login")).sendKeys("admin");
cdriver.findElement(By.name("password")).sendKeys("admin@123");
cdriver.findElement(By.name("submitAuth")).click();
Thread.sleep(3000);
cdriver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
Thread.sleep(3000);
cdriver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\AyushSingh\\Desktop\\test.csv");


	}

}
