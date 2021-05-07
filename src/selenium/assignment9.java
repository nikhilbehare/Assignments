package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class assignment9 {
	WebDriver driver;
  @Test
  public void test() throws IOException {
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  FileInputStream fileinput=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\src\\selenium\\Config.properties");
	  Properties prop=new Properties();
	  prop.load(fileinput);
	  System.out.println(prop.getProperty("url"));
	  driver.get(prop.getProperty("url"));
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
