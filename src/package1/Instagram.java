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

public class Instagram {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91787\\Desktop\\selenium\\chrome\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.instagram.com/accounts/login/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //create object of FileInputStreame class with path of Excel sheet
	    FileInputStream file=new FileInputStream("C:\\Users\\91787\\Desktop\\Sheet1.xlsx");
	    
	    String val=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    System.out.println(val);
	    
	    WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	    username.sendKeys(val);
	    
	    
	    FileInputStream file1=new FileInputStream("C:\\Users\\91787\\Desktop\\Sheet1.xlsx");
	    
	     String value=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	     System.out.println(value);
	     
	     WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
	     password.sendKeys(value);
	
	     WebElement loginbtn = driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']"));
	     loginbtn.click();
	     
	    WebElement logout = driver.findElement(By.xpath("//body[@class='_a3wf system-fonts--body segoe']"));
	     logout.click();
	    
	}

}
