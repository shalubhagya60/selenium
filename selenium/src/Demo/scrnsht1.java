package Demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scrnsht1 {
public static void main(String[] args) throws IOException {
	Date d = new Date();
	String dat = d.toString();
	String dat1 = dat.replaceAll(":","_");
	System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.xpath("//img[@src=\"https://static.xx.fbcdn.net/rsrc.php/yI/r/4aAhOWlwaXf.svg\"]"));
	File tmp = ele.getScreenshotAs(OutputType.FILE);
	File pmt = new File("./photos/"+dat1+".jpg");
	FileHandler.copy(tmp, pmt);
	
	
}
}
