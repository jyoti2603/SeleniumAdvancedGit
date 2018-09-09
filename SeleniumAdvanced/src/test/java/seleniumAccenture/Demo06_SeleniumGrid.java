package seleniumAccenture;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo06_SeleniumGrid {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  /*DesiredCapabilities dc= new DesiredCapabilities();
	  dc.setBrowserName("chrome");
	  dc.setPlatform(Platform.WINDOWS);
	  RemoteWebDriver driver= new RemoteWebDriver(new URL("http://10.243.204.236:4343/wd/hub"),dc);*/
	  
	  driver=new RemoteWebDriver(new URL("http://10.243.204.236:4343/wd/hub"),DesiredCapabilities.chrome());
	  
  }

}
