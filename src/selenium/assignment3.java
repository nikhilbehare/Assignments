package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class assignment3 {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  driver.findElement(By.id("messageWindowButton")).click();
	  for (String twohandle : driver.getWindowHandles()) {
		  		Thread.sleep(2000);
		  		driver.switchTo().window(twohandle).close();
			    }  
  }
  @BeforeMethod
  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/browser-windows");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
