package AndroidChromeBrowseAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baschromesetup {
//here making method static so able to call directly

	public  static AndroidDriver<AndroidElement>   capabilities() throws MalformedURLException
	{
AndroidDriver<AndroidElement> driver;
		
		
		DesiredCapabilities capabilties = new  DesiredCapabilities();
		
		
		capabilties.setCapability(MobileCapabilityType.DEVICE_NAME, "AnkitaEmulator");
		capabilties.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		capabilties.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		 
		driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilties);
		return driver;
	}

}
