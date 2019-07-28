package Demowebdriver;

import java.util.ArrayList;
//import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		//cdriver.manage().deleteAllCookies();
				
		
		
		cdriver.get("https://www.toolsqa.com/");
		Thread.sleep(3000);
		cdriver.manage().deleteAllCookies();
		Thread.sleep(3000);
		String parentwindow=cdriver.getWindowHandle();
		System.out.println("parent window"+ parentwindow);
		WebElement clickbutton=cdriver.findElement(By.id("button1"));
		for (int i=0;i<3;i++)
		{
			clickbutton.click();
			Thread.sleep(3000);
		}
		ArrayList<String> childwindow = new ArrayList<>(cdriver.getWindowHandles());
        System.out.println("childwindow -->" + childwindow );
        
        String lastwindow="";
        //switch between my child window
        for(int i=1;i<childwindow.size();i++)
        {
            cdriver.switchTo().window(childwindow.get(1));
            //driver.manage().window().maximize();
            cdriver.navigate().to("https://www.google.com");
            //it will identify my last window handle
            lastwindow = childwindow.get(i).toString();
        }
        
        cdriver.switchTo().window(parentwindow);
        cdriver.navigate().to("http://newtours.demoaut.com/");
        String titleparent = cdriver.getTitle();
        System.out.println(titleparent);
        Thread.sleep(3000);
        cdriver.close();
        cdriver.switchTo().window(lastwindow);
        cdriver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        cdriver.quit();

		
	}

}
