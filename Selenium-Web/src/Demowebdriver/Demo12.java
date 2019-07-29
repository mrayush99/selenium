package Demowebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		//cdriver.manage().deleteAllCookies();
		cdriver.get("https://www.toolsqa.com/iframe-practice-page/");
		List<WebElement> frames1=cdriver.findElements(By.tagName("iframe"));
		System.out.println(frames1.size());
		
		
		for(int i=0;i<frames1.size();i++)
        {
            System.out.println(frames1.get(i).getAttribute("name"));
        }
        Robot robot = new Robot();
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        cdriver.switchTo().frame("iframe1");
        String text = cdriver.findElement(By.xpath("//*[@class='wpb_wrapper']//child::h2/span")).getText();
        System.out.println(text);
        cdriver.switchTo().defaultContent();
        cdriver.switchTo().frame("iframe2");
        cdriver.findElement(By.linkText("Sortable")).click();
		
		

	}

}
