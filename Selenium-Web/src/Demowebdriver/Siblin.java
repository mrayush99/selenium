package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		//cdriver.manage().deleteAllCookies();
		cdriver.get("C:\\Users\\AyushSingh\\Desktop\\sample.html");		
		String phno=cdriver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//preceding-sibling::td[1]")).getText();
		System.out.println(phno);
		
		
	}

}
