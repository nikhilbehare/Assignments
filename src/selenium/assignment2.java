package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class assignment2 {
	WebDriver driver;
  @Test
  public void test() throws InterruptedException {
	  Thread.sleep(1000);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,250)", "");
	  Thread.sleep(2000);
	  WebElement drag=driver.findElement(By.id("draggable"));
	  WebElement drop=driver.findElement(By.id("droppable"));
	  Thread.sleep(2000);
	  Actions action=new Actions(driver);
	  action.dragAndDrop(drag,drop).build().perform();
	  Thread.sleep(1000);
  }
  @BeforeMethod
  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/droppable/");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
