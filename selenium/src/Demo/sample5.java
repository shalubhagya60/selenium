package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("tester123@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("pass")).sendKeys("tester@123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}

}
