package seleniumprojects;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//path of the driver
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
//invoking the browser
		ChromeDriver driver=new ChromeDriver();
//accessing the url
driver.get("http://www.google.co.in/");
//or
driver.navigate().to("http://www.google.co.in/");
//closing the browser
driver.close();

	}

}
