package Demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class scrnsht {
public static void get_photo(WebDriver driver)
{
	Date d = new Date();
			String dat = d.toString();
	String date1 = dat.replaceAll(":","_");
TakesScreenshot tss = (TakesScreenshot) driver;
	File temp = tss.getScreenshotAs(OutputType.FILE);
	File pmt = new File("./photos/"+date1+".jpg");
	try
	{
		FileHandler.copy(temp, pmt);
	}
	catch(IOException e)
	{
		System.out.println("photo not capture");
	}
}

}
