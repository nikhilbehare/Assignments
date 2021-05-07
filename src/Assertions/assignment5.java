package Assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class assignment5 {
	WebDriver driver;
  @Test
  public void test() {
	  List<String> list=new ArrayList<String>();
	  WebElement table=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody"));
	  List<WebElement>rows=table.findElements(By.tagName("tr"));
	  for (int i = 3,j=0; i < rows.size()-2; i++,j++) {
		List<WebElement>col=rows.get(i).findElements(By.tagName("td"));
		list.add(col.get(2).getText());
	}
	  int j=0;
	  for(String value:list) {
		  int n=0;
		  for(String value1:list) {
			  if(value.equals(value1)) 
				  j=++n;
		  }
			  System.out.println(j);
		  }
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://chennaiiq.com/chennai/pincode-by-name.php");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
