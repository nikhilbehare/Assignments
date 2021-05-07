package Assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class assignment2 {
	WebDriver driver;
  @Test
  public void test() {
	  driver.findElement(By.linkText("Medical Records")).click();
	  driver.findElement(By.linkText("Search Patient")).click();
	  Select type=new Select(driver.findElement(By.id("search_type")));
	  type.selectByIndex(2);
	  driver.findElement(By.id("search_patient")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
