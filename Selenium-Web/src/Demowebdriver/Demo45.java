package Demowebdriver;

import java.util.List;

//import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
//import org.openqa.selenium.remote.server.handler.FindElements;

public class Demo45 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
WebDriver cdriver=new ChromeDriver();
cdriver.get("http://newtours.demoaut.com/mercurywelcome.php");
Thread.sleep(4000);

cdriver.manage().window().maximize();
String underconstitle="Under Construction: Mercury Tours";
List <WebElement> links=cdriver.findElements(By.tagName("a"));

String[] linktext= new String[links.size()];
int i=0;
//ext text of each link element
for(WebElement e:links)
{
	linktext[i]=e.getText();
	i++;
}
for (String t:linktext)
{
	cdriver.findElement(By.linkText(t)).click();
	if (cdriver.getTitle().equals(underconstitle))
	{
		System.out.println("\""+ t +"\"+ is underconstruction");
	}
	else
	{
		System.out.println("\""+ t +"\"+ is working");
	}
	cdriver.navigate().back();
}
cdriver.close();
}
}