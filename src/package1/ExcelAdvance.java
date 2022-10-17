package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelAdvance {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ArrayList<String> al=new ArrayList<String>();
		
		//read the data
		for(int i=0;i<4;i++) {
			FileInputStream file= new FileInputStream("C:\\Users\\91787\\Desktop\\sss.xlsx");
			String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			al.add(value);	
		}
		System.out.print(al.size());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\Desktop\\selenium\\105chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		for(int j=0;j<al.size();j++) {
			driver.get(al.get(j));
			String title=driver.getTitle();
			System.out.println(al.get(j)+"==>"+title);
		}
		
		
	}

}
