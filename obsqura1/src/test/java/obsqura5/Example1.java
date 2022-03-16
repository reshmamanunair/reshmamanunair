package obsqura5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Example1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("index.php"));
	  driver.findElement(By.name(""));
	  driver.findElement(By.name(""));
	  driver.findElement(By.name(""));
	  driver.findElement(By.name(""));
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium(shilpa mam)\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/index.php");
	  driver.manage().window().maximize();
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
