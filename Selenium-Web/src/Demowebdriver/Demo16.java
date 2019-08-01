package Demowebdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo16 {

	public static void main(String[] args) throws IOException {
		File fexcel=new File("C:\\SeleniumFiles\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(fexcel);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		for (int i=0;i<=rowcount;i++)
		{
			int columncount=sheet.getRow(i).getLastCellNum();
			System.out.println(columncount);
			for(int j=0;j<columncount;j++)
			{
				System.out.println("value of"+ i +"row"+ j  +"column"+ sheet.getRow(i).getCell(j));
			}
		}
		wb.close();
	}

}
