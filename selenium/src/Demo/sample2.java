package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
