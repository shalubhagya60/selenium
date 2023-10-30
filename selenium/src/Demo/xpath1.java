package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/instagram.html");
	driver.findElement(By.xpath("//a[contains(test(),'instagram')]")).click();		
		
	}

}
