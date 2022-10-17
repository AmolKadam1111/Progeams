package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLogin {
	public static FileInputStream file;
	public static void main(String[] args) throws EncryptedDocumentException, InterruptedException, IOException {

		//launch browse

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91787\\Desktop\\selenium\\chrome\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get all data from excel sheet

		for(int i=0;i<3;i++) {

		 file=new FileInputStream("C:\\Users\\91787\\Desktop\\Flipkart.xlsx");

		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();

		System.out.println(data);
		}
		
		file=new FileInputStream("C:\\Users\\91787\\Desktop\\Flipkart.xlsx");

		String url = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		driver.get(url);
		
		file=new FileInputStream("C:\\Users\\91787\\Desktop\\Flipkart.xlsx");

		String mobnum = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

		WebElement username=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));

		username.sendKeys(mobnum);
		
		file =new FileInputStream("C:\\Users\\91787\\Desktop\\Flipkart.xlsx");

		String password=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		//Thread.sleep(2000);

		WebElement loginbtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));

	    loginbtn.click();

	    Thread.sleep(2000);
	    		
	}

	}
