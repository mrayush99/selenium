package Demowebdriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
				
		cdriver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor js= (JavascriptExecutor)cdriver;
		String title=js.executeScript("return document.title").toString();
		System.out.println(title);
		String URL =js.executeScript("return document.URL").toString();
		System.out.println(URL);
		String Domain =js.executeScript("return document.domain").toString();
        System.out.println(Domain);
        Thread.sleep(3000);
        js.executeScript("document.getElementById('txtUsername').value='Admin'");
        js.executeScript("history.go(0)");
        js.executeScript("document.getElementById('txtUsername').value='Admin'");
        
        WebElement ele=(WebElement)js.executeScript("return document.getElementById('txtUsername')");
        String value= ele.getAttribute("value");
        System.out.println(value);
        js.executeScript("document.getElementById('txtPassword').value='admin123'");
        js.executeScript("document.getElementById('btnLogin').click()");
        Thread.sleep(3000);
        js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
        Thread.sleep(3000);
        js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
        js.executeScript("window.scrollBy(0,800)");
       // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        //different ways to scroll down
        js.executeScript("window.scrollTo(0,screenTop)");
        //js.executeScript("window.scrollTo(0,0)");
        //js.executeScript("window.scrollTo(0,-600)");
        //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        //to get all table text
        //System.out.println(cdriver.findElement(By.id("resultTable")).getText());
        String Table=js.executeScript("return document.getElementById('resultTable').innerText").toString();
        System.out.println(Table);
        //alert popups
        //simple alert with a  message
        js.executeScript("alert('welcome to selenium')");
//        js.executeScript("alert('Welcome to Selenium Training')");

        Thread.sleep(3000);
        //alert confirm
        js.executeScript("confirm('Enter the details')");
        Thread.sleep(3000);
        //alert prompt
        js.executeScript("prompt('enter the credentials','enter yes/no')");
        Thread.sleep(3000);
	}

}
