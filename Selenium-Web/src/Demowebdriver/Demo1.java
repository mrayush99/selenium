package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
WebDriver cdriver=new ChromeDriver();
cdriver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

Thread.sleep(3000);
cdriver.navigate().refresh();

cdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
cdriver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
cdriver.findElement(By.xpath("//*[@id='btnLogin']")).click();
/*
cdriver.findElement(By.xpath("//*[@id='welcome']")).click();
Thread.sleep(4000);
cdriver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
*/
String ActualTitle=cdriver.getTitle();
String ExpectedTitle="OrangeHRM";
System.out.println(ActualTitle);
if (ExpectedTitle.equals(ActualTitle))
{
	Thread.sleep(4000);
	cdriver.findElement(By.xpath("//*[@id='welcome']")).click();
	Thread.sleep(4000);
	cdriver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	cdriver.close();
}
cdriver.quit();
//*[@id='btnLogin']
	}

}
