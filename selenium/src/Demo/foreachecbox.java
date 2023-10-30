package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class foreachecbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/checkbox.html");
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input"));
		int count = checkboxs.size();
		System.out.println(count);
		for (WebElement checkbox : checkboxs) {
			checkbox.click();
		}
			
		for(int i=count-1;i>=0;i--)
		{
			WebElement checkbox = checkboxs.get(i);
			checkbox.click();
			
			
		}
	}
		

}
