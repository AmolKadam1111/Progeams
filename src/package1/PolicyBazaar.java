package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PolicyBazaar {
	static FileInputStream file;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		file=new FileInputStream("C:\\Users\\91787\\Desktop\\Book2.xlsx");
		int row =WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(row);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\Desktop\\selenium\\105chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		for(int i=0;i<=row;i++) {
			file=new FileInputStream("C:\\Users\\91787\\Desktop\\sss.xlsx");
			String value= WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			//WebElement name = driver.findElement(By.xpath("")).sendKeys(value);
			driver.get(value);
		}
		
	}

}
