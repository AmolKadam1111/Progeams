package com.projectname.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utils {
public static FileInputStream file;
	
	
	public static void BorderByJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	
	//capture the Title of Webpage
	public static String TitleByJS(WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
     String title=js.executeScript("return document.title").toString();
     return title;
	}
     //to click on WebElement
	public static void clickbyJS(WebDriver driver,WebElement element) {
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();", element);
     }
	
	//to generate an alert
	public static void AlertByJS(WebDriver driver, String Message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+ Message +"')");
	}
	
	//to refreshing the page
	public static void refreshByJS(WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("history.go(0)");
	}  
	
	//scrolling of the page
	public static void scrollDown(WebDriver driver, int x, int y) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");
	}
	
	//same method for scrolling up also only while calling paramenter should negative
	public static void scrollUp(WebDriver driver, int x, int y) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scroll("+x+","+y+")");
	}
	public static void scrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void getscreenshot(WebDriver driver, String testname) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
		Date d = new Date();
		System.out.println(d);
		String filename =testname+d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File dest = new File ("C:\\Users\\91787\\Desktop\\selenium\\"+filename);
		FileUtils.copyFile(src, dest);
	}
	public static String getExcelsheetData(int row, int coloumn) throws EncryptedDocumentException, IOException {
	
	 file=new FileInputStream("C:\\Users\\91787\\eclipse-workspace\\com.projectname.qa\\Screenshot");
	String value=WorkbookFactory.create(file).getSheet("sheet").getRow(row).getCell(coloumn).getStringCellValue();
    System.out.println(value);
	return value;
}

}
