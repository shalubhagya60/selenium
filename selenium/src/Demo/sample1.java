package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https:www.facebook.com");
}
}
