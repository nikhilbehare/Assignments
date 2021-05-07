package Assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class assignment1 {
	WebDriver driver;
  @Test
  public void test() {
	  WebElement firstName=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
	  WebElement lastName=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	  WebElement userName=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	  WebElement password=driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
	  WebElement confirm=driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
	  
	  if(firstName.getAttribute("type").equals("text") && lastName.getAttribute("type").equals("text")){
		  firstName.sendKeys("amit");
		  lastName.sendKeys("gupta");
	  }
	  if(userName.getAttribute("type").equals("email")) {
		  userName.sendKeys("amitgupta1334");
	  }
	  if(password.getAttribute("type").equals("password") && confirm.getAttribute("type").equals("password")) {
		  password.sendKeys("amit@123");
		  confirm.sendKeys("amit@123");
	  }
	  driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[2]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.quit();
  }

}
