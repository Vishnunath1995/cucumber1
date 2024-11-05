package org.base;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static WebDriver browser(String bname) {
		if(bname.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{
			if(bname.contains("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
		}
return driver;
	}
	
	
	public static void launchurl(String url) {
		driver.get(url);

	}
	public static void maxwindow()
	{
		driver.manage().window().maximize();
	}
	public static String currentUrl()
	{
			  driver.getCurrentUrl();
	return currentUrl();
	 
	  
	 
	}
	public static void sendkeys(WebElement e, String text) {
		e.sendKeys(text);
		

	
		

	}
	
	public static void btnClick(WebElement e)
	{
		e.click();
	}
	public static void waitt() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
