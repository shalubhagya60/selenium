package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascrptexctr {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Desktop/dsbled.html");
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("document.getelementById('a1'), value='abc'");
	jse.executeAsyncScript("document.getelementById('a1'), value=' '");

}
}
