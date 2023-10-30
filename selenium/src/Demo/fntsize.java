package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fntsize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String tag = driver.findElement(By.linkText("Forgotten password?")).getTagName();
		System.out.println(tag);
	}
}
