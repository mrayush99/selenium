package Demowebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		//cdriver.manage().deleteAllCookies();
		cdriver.get("https://www.google.com/");
		JavascriptExecutor js= (JavascriptExecutor)cdriver;
		js.executeScript("alert('welcome to training')");
		Thread.sleep(3000);
		Alert alert=cdriver.switchTo().alert();
		alert.accept();
//cdriver.switchTo().alert().accept();
		 js.executeScript("confirm('Enter the details')");
	        Thread.sleep(3000);
	        String text=alert.getText();
	        System.out.println(text);
	        alert.dismiss();	        
	        /*
	         String alertmessage=cdriver.switchTo().alert().getText();
	         */
	        js.executeScript("prompt('enter the credentials','enter yes/no')");
	        Thread.sleep(3000);
	        alert.sendKeys("yes");
	        Thread.sleep(3000);
	        alert.accept();
	        
	}

}
