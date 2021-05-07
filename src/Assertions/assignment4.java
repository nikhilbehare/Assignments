package Assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class assignment4 {
	WebDriver driver;
  @Test
  public void test() throws IOException, InterruptedException {
	  String filePath="C:\\Users\\Admin\\Documents\\loginCredentials.xlsx";
	  FileInputStream file=new FileInputStream(filePath);
	  XSSFWorkbook workbook=new XSSFWorkbook(file);
	  XSSFSheet sheet=workbook.getSheet("Sheet1");
	  int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	  for (int i = 1; i <=rowcount; i++) {
		String username=sheet.getRow(i).getCell(0).getStringCellValue();
		String password=sheet.getRow(i).getCell(1).getStringCellValue();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passContainer")).sendKeys(password);
		driver.findElement(By.id("u_0_d_74")).click();
	}
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
