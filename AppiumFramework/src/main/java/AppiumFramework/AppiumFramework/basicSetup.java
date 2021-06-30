package AppiumFramework.AppiumFramework;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class basicSetup  extends Thread {

public static AppiumDriverLocalService service;
	
public static AndroidDriver<AndroidElement> driver;

	protected static AppiumDriverLocalService startserver() 
	{
		
		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder()
						.usingDriverExecutable(new File("/usr/local/bin/node"))
						.withAppiumJS(
								new File(
										"/usr/local/lib/node_modules/appium/lib/appium.js"))
						.withIPAddress("127.0.0.1").usingPort(4723));
		
		return service;
	}
	
	
	
	
	
	//to start the server
//	public  AppiumDriverLocalService startServer()
//	{
//		//here we are creating service variable and we have default method is available
//	//	if server it is already started it will go in block then we are skiping server running on object
//		boolean flag=checkIfServerIsRunnning(4723);
//		if (!flag)
//		{
//			service=AppiumDriverLocalService.buildDefaultService();
//		service.start();
//		}
//		
//		return service;
//	}
	
	
	
public static boolean checkIfServerIsRunnning(int port) {
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}
	
	


public static void startemulator() throws IOException, InterruptedException

	{
	//Users/amandhare/eclipse-workspace/Appium/AppiumFramework/src/main/java/resources/startemulator.sh.rtf
	
	Runtime.getRuntime().exec(System.getProperty("user.dir")+"src/main/java/resources/startemulator.sh");
	
	Thread.sleep(6000);
	}
	
	public void run(){  
		System.out.println("thread is running...");  
		}  
	
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//here created absolute path

		//here filepinput stream  is class of java  with the help of that we can bring global proprty here
		
		
		
		System.getProperty("user.dir");
		//read file sent argument//property is classworks on mapping read fis file and add throws declaration
	// FileInputStream  fis=new  FileInputStream("/Users/amandhare/eclipse-workspace/Appium/AppiumFramework/src/main/java/gloabal.properties");
		
		FileInputStream  fis=new  FileInputStream(System.getProperty("user.dir")+"/src/main/java/gloabal.properties");
		Properties prop= new Properties();
		prop.load(fis);//and it will work as key and value
		//so form tc it will come here and willl get key value pair
	
		
		
		
		File f= new File("src");
		File fs= new File(f,(String) prop.get(appName));

		DesiredCapabilities cap = new DesiredCapabilities();
		
    //  if (device.equals("emulator") )
		//here we are contrilling the device now globaly through global properties
		String Emulator = (String) prop.get("Emulator");
		//String Emulator = (String) prop.get("deviceName");//here it dvice name real passeing
		
      {
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, Emulator);
		//cap.setCapability("avd", "emulator-5554");
      }
      
     // else if (device.equals("real") )
      //it will be only if emulator
      String device = (String) prop.get("device");
     
      
    //  {
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
     // }
      //ui autimator is frmawork for android element
      cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
      cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT ,12);
      
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//Android updated its internal framework to uiautomator2 and through Appium code, we need to tell that we need to access uiautomator2 elements of Android.


		


		//IN first argument  connecting to severe and in second  object it will connect to all desired capabilties

	
		 driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;//to return main android driver;
		
	
		
	}

	public static void getScreenshot(String failure) throws IOException
	{
		//get screenshot as file and store it in store objectand need to copy that in local machine
		//here we are casting the driver object  takescreenhot object
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir")+"//src/FailureScreenshot/Screenshot.png"));
		
	}

	
	
	

}