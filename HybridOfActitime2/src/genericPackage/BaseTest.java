package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;

public class BaseTest implements IAutoConstant{
	protected static WebDriver driver;
  
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib=new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
		 String url = flib.readPropertyData(PROP_PATH, "Url");
		 if(browserValue.equals("chrome"))
		 {
			 System.setProperty(CHROME_KEY,CHROME_VALUE);
			 driver=new ChromeDriver();
			 driver.manage().window().minimize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get(url);
		 }
		 else
		 {
			 Reporter.log("incorrect browser value!!!",true);
		 }
	}
	
	
		 public void failed(String methodName)
		 {
			 try
			 {
			 TakesScreenshot ts=(TakesScreenshot)driver;
			 File src = ts.getScreenshotAs(OutputType.FILE);
			 File dest = new File("./Screenshot"+methodName+".png");
		     Files.copy(src,dest);
		} 
			 catch (Exception e) {
				
			}
			 
		 }


	@AfterMethod
	public void tearDown() {
		
	}
	@BeforeTest
	public void property() {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		
	}
	
}