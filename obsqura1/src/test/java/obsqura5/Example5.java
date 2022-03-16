package obsqura5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Example5 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 WebElement user=driver.findElement(By.name("userName"));
	 user.sendKeys("tutorial");
	 String v=user.getTagName();
	 System.out.println("The tag name is"+v);
	 Thread.sleep(2000);
	 WebElement pass=driver.findElement(By.name("password"));
	 pass.sendKeys("tutorial");
	 String p=pass.getAttribute("valid pass");
	 System.out.println("The password is"+p);
	 
	  
      Thread.sleep(2000);
	  
	  WebElement sub=driver.findElement(By.name("submit"));
	  sub.click();
	 // String s=getlocation();
	  Thread.sleep(2000);
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
