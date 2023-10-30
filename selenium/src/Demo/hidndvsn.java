package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidndvsn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/fileupload.html");
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("");
}
}
