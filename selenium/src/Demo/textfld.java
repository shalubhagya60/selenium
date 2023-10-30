package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfld {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/textfield.html");
		List<WebElement> textfields = driver.findElements(By.xpath("//input"));
		for (WebElement textfield : textfields) {
			textfield.sendKeys("hi");
		}
			
		}
		
}
