package IOSAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseIOSsetupReal {

	public static IOSDriver DesiredCapabilites() throws MalformedURLException {
		// TODO Auto-generated method stub

		
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.5");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
	//IOS_XCUI_Test and xpresso  for ios framework
		
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		
		capabilities.setCapability("xcodeSigningId", "iPhone Developer");
		capabilities.setCapability("udid", "00008030-001959560247802E");
		capabilities.setCapability("bundleId", "io.appiumankitapractice.WebDriverAgentRunne");
		capabilities.setCapability("xcodeoriginId", "xxxx");
		
		
		
		//this is only for ios
		capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
		capabilities.setCapability("commandTimeouts","12000");
		
	//	capabilities.setCapability(MobileCapabilityType.APP,"/Users/amandhare/eclipse-workspace/Appium/AppiumBasic/src/UIKitCatalog.app");
		
		capabilities.setCapability(MobileCapabilityType.APP,"/Users/amandhare/Library/Developer/Xcode/DerivedData/longtap-civgspexebztwhdjclmotvlahzgf/Build/Products/Debug-iphonesimulator/longtap.app");
		IOSDriver driver= new IOSDriver <>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		return driver;
		
	}

}
