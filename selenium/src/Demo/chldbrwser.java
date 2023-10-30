package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class chldbrwser {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blog']"));
		Actions act=new Actions(driver);
		Robot r=new Robot();
		act.contextClick(ele1).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		act.contextClick(ele2).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		act.contextClick(ele3).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		act.contextClick(ele4).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		act.contextClick(ele5).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> arrid = new ArrayList<String>(allid);
		for (String id : arrid) {
			driver.switchTo().window(id);
		}
		
		
	}
}
