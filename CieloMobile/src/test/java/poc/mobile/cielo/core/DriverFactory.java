package poc.mobile.cielo.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver; 
	
	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver; 
	}
	
	private static void createDriver() {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.m4u.cielomobile");
	    desiredCapabilities.setCapability("appActivity", 
	    		"com.m4u.cielomobile.view.activities.telaBloqueada.TelaBloqueadaActivity");

	    
	    String remoteUrl = "http://localhost:4723/wd/hub";

	    try {
			driver = new AndroidDriver<MobileElement>(
					new URL(remoteUrl), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}
	
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}
