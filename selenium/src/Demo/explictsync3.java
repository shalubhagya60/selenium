package Demo;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explictsync3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/");
		driver.findElement(By.name("cusid")).sendKeys("4578");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		String text = wait.until(ExpectedConditions.alertIsPresent()).getText();
	
		
}
}
