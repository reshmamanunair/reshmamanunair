package obsqura5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Example7 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("userName"));
	  driver.findElement(By.name("password"));
	  driver.findElement(By.name("submit"));
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium(shilpa mam)\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();

  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
