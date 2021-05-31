package AppiumPractice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class setup  extends Thread {

	public void run(){  
		System.out.println("thread is running...");  
		}  
	
	public static AndroidDriver<AndroidElement> capabiltes() throws MalformedURLException {
		// TODO Auto-generated method stub
		//here created absolute path

		File f= new File("src");
		File fs= new File(f,"ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//Android updated its internal framework to uiautomator2 and through Appium code, we need to tell that we need to access uiautomator2 elements of Android.


		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");


		//IN first argument  connecting to severe and in second  object it will connect to all desired capabilties

	
		AndroidDriver<AndroidElement> ad= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return ad;//to return main android driver;
		
	
		
	}

}