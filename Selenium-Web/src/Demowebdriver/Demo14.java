package Demowebdriver;

import com.google.common.collect.Table.Cell;

//import java.awt.Label;\
//import jxl.Cell;
import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.write.Label;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class Demo14 {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		File fexel=new File("C:\\SeleniumFiles\\Test1.xls");
		//create workbook in excel sheet
		WritableWorkbook writebook=Workbook.createWorkbook(fexel);
		//create sheet
		writebook.createSheet("ayush", 0);
		//passing data to sheet
		WritableSheet writesheet=writebook.getSheet(0);
		Label testdata =new Label(0,0,"IBM");
		writesheet.addCell(testdata);
		Label td2=new Label(0,1,"TCS");
		writesheet.addCell(td2);
		//new sheet
		writebook.createSheet("ayush1",1);
		WritableSheet writesheet1=writebook.getSheet(1);
		Label testdata1 =new Label(0,4,"abc");
		writesheet1.addCell(testdata1);
		Label td3=new Label(0,5,"efg");
		writesheet1.addCell(td3);
		writebook.write();
		writebook.close();
		
		
		// Workbook workbook = Workbook.CreateWorkbook(new File("C:\\Test1.xls"));
		Workbook workbook=Workbook.getWorkbook(new File("C:\\SeleniumFiles\\Test1.xls"));
		Sheet sheet = null;
        //number of sheets in the workbook
        int noofsheets = workbook.getNumberOfSheets();
        jxl.Cell cell=null;
        for(int p=0;p<noofsheets;p++)
        {
            sheet = workbook.getSheet(p);
            //fetch the data of rows and column
            int noofrows = sheet.getRows();
            int noofcolumns = sheet.getColumns();
            //print the data
            System.out.println(sheet.getRows() + "\t" + sheet.getColumns());
            //sheet name
            System.out.println("data from sheet" + p);
            // fetch the data inside the sheets
            for(int i=0;i<noofrows;i++)
                for(int j=0;j<noofcolumns;j++)
                {
                    cell = sheet.getCell(j,i);
                    //condition to check data is present
                    if(cell.getContents().length()>0)
                    {
                        System.out.println(cell.getContents());
                    }
                }
        
}
}
}