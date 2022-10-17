package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCountOfProductOnEachPage {
	static FileInputStream file;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ArrayList<String> al=new ArrayList<String>();
		//open the excel file and find the number of rows present
		file=new FileInputStream("C:\\Users\\91787\\Desktop\\Sheet1.xlsx");
		int rows = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(rows);
		
		//open the excel sheet and add values in ArrayList
		for(int i=0;i<rows;i++) {
	    file=new FileInputStream("C:\\Users\\91787\\Desktop\\Sheet1.xlsx");
	    String value1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
	    al.add(value1);
	    }
		
		//launch the browse, maximize window and give wait
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\Desktop\\selenium\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//getting the values from ArrayList and product count also
		for(int j=0;j<al.size();j++) {
			driver.get(al.get(j));
			String count = driver.findElement(By.xpath("//p[@role='status']")).getText();
			System.out.println(al.get(j)+ "==>" + count);
			
		  }
}
}
