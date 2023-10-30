package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alrtconfrm {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/");
driver.findElement(By.name("emailid")).sendKeys("12345@gmail.com");
driver.findElement(By.name("btnLogin")).click();
Alert alt = driver.switchTo().alert();
String txt = alt.getText();
System.out.println(txt);
}
}
