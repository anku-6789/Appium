package EcoomerceApplicaction;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class basicSetup  extends Thread {

	public void run(){  
		System.out.println("thread is running...");  
		}  
	
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		// TODO Auto-generated method stub
		//here created absolute path

		File f= new File("src");
		File fs= new File(f,"General-Store.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
      if (device.equals("emulator") )
      {
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
      }
      else if (device.equals("real") )
      {
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
      }
      //ui autimator is frmawork for android element
      cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
      cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT ,12);
      
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//Android updated its internal framework to uiautomator2 and through Appium code, we need to tell that we need to access uiautomator2 elements of Android.


		


		//IN first argument  connecting to severe and in second  object it will connect to all desired capabilties

	
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;//to return main android driver;
		
	
		
	}

}