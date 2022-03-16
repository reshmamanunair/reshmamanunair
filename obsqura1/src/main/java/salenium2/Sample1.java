package salenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium(shilpa mam)\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");

String n=driver.getCurrentUrl();
System.out.println(n);
String d=driver.getPageSource();
System.out.println(d);
driver.close();
driver.quit();


	}
	

}
