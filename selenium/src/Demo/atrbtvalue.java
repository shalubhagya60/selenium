package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class atrbtvalue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[text()='English']"));
	}
}
