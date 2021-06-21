package IOSAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseIOSsetup {

	public static IOSDriver DesiredCapabilites() throws MalformedURLException {
		// TODO Auto-generated method stub

		
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro Max");
	//IOS_XCUI_Test and xpresso  for ios framework
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		//this is only for ios
		capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
		capabilities.setCapability("commandTimeouts","12000");
		
	//	capabilities.setCapability(MobileCapabilityType.APP,"/Users/amandhare/eclipse-workspace/Appium/AppiumBasic/src/UIKitCatalog.app");
		
		capabilities.setCapability(MobileCapabilityType.APP,"/Users/amandhare/Library/Developer/Xcode/DerivedData/longtap-civgspexebztwhdjclmotvlahzgf/Build/Products/Debug-iphonesimulator/longtap.app");
		IOSDriver driver= new IOSDriver <>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		return driver;
		
	}

}
