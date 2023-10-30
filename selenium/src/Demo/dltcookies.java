package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dltcookies {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	driver.manage().deleteAllCookies();
	}

}
