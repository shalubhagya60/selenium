package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		driver.findElement(By.xpath("//td[text()='300 Crore']/../../tr[2]/td[1]")).click();
		
		
		
	}

}
