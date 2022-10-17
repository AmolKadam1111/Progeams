package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowsAndColumn {
	public static FileInputStream file;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to get number of rows
	file= new FileInputStream("C:\\Users\\91787\\Desktop\\Sheet1.xlsx");
	int rows=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	System.out.println("number of rows "+rows);
	
	  //to get number of columns
	file=new FileInputStream("C:\\Users\\91787\\Desktop\\Sheet1.xlsx");
	int cols= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	System.out.println(cols);
	
	//to get row and columns data from excel
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			file=new FileInputStream("C:\\Users\\91787\\Desktop\\Sheet1.xlsx");
			String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}

}
}