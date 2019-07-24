package Demowebdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.FindElements;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
WebDriver cdriver=new ChromeDriver();
cdriver.get("http://newtours.demoaut.com/mercurywelcome.php");
Thread.sleep(4000);

cdriver.manage().window().maximize();
ArrayList str = new ArrayList();

// 1st link

cdriver.findElement(By.linkText("Home")).click();	
////*[contains(text(),'Home')]
String ActualtitleHome=cdriver.getTitle();
String ExpectedtitleHome="Welcome: Mercury Tours";

if (ExpectedtitleHome.equals(ActualtitleHome))
{
	str.add("Home Link is UP");
}

//2nd link 

cdriver.findElement(By.linkText("Flights")).click();
Thread.sleep(4000);
String ActualtitleFlights=cdriver.getTitle();
String ExpectedtitleFlights="Welcome: Mercury Tours";

if (ExpectedtitleFlights.equals(ActualtitleFlights))
{
str.add("Flight Link is UP");
}
//3rd link
cdriver.findElement(By.linkText("Hotels")).click();
Thread.sleep(4000);

String ActualtitleHotel=cdriver.getTitle();
String ExpectedtitleHotel="Under Construction: Mercury Tours";

if (ExpectedtitleHotel.equals(ActualtitleHotel))
{
str.add("Hotel Link is DOWN");
}

//4th Link

cdriver.findElement(By.linkText("Car Rentals")).click();
Thread.sleep(4000);

String ActualtitleCars=cdriver.getTitle();
String ExpectedtitleCars="Under Construction: Mercury Tours";

if (ExpectedtitleCars.equals(ActualtitleCars))
{
str.add("Car Rentals Link is DOWN");
}

//5th Link
cdriver.findElement(By.linkText("Cruises")).click();
Thread.sleep(4000);

String ActualtitleCruises=cdriver.getTitle();
String ExpectedtitleCruises="Cruises: Mercury Tours";

if (ExpectedtitleCruises.equals(ActualtitleCruises))
{
str.add("Cruises Link is UP");
}

//6th Link
cdriver.findElement(By.linkText("Destinations")).click();
Thread.sleep(4000);

String ActualtitleDestine=cdriver.getTitle();
String ExpectedtitleDestine="Under Construction: Mercury Tours";

if (ExpectedtitleDestine.equals(ActualtitleDestine))
{
str.add("Destinations Link is DOWN");
}

//7th Link
cdriver.findElement(By.linkText("Vacations")).click();
Thread.sleep(4000);

String ActualtitleVacations=cdriver.getTitle();
String Expectedtitlevacations="Under Construction: Mercury Tours";

if (Expectedtitlevacations.equals(ActualtitleVacations))
{
str.add("Destinations Link is DOWN");
}

//print statement
for(int i=0;i<str.size();i++)
{
System.out.println(str.get(i));
}
cdriver.close();

}
}
