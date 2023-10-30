package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locamazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		int count = images.size();
		System.out.println(count);
		for (WebElement image : images) {
			String location = image.getAttribute("src");
			System.out.println(location);
		}
			
	}
}
