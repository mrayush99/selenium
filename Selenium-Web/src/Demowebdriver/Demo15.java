package Demowebdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {

	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		//cdriver.manage().deleteAllCookies();
		cdriver.get("https://opensource-demo.orangehrmlive.com/");
		File fexcel=new File("C:\\SeleniumFiles\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(fexcel);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		int rowcount=sheet.getLastRowNum();
		for (int i=0;i<=rowcount;i++)
		{
		String data1=sheet.getRow(i).getCell(0).getStringCellValue();
		//System.out.println(data1);
		String data2=sheet.getRow(i).getCell(1).getStringCellValue();
		//System.out.println(data2);
		cdriver.findElement(By.id("txtUsername")).sendKeys(data1);
		cdriver.findElement(By.id("txtPassword")).sendKeys(data2);
		cdriver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		cdriver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		cdriver.findElement(By.xpath("//*[@id='welcome-menu']/ul[1]/li[3]/a")).click();
		
		
	}
		wb.close();
		cdriver.close();
}
}