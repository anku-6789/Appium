package APIDemosPractice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AppiumFramework.AppiumFramework.TestData;
import AppiumFramework.AppiumFramework.basicSetup;
import POMWithAPIDemos.HomePage;
import POMWithAPIDemos.Preferences;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class APITest extends basicSetup {

	//here 
@Test(dataProvider="InputData",dataProviderClass=TestData.class)
	
	public void apiDemoTest(String input) throws IOException, InterruptedException
	{
			// TODO Auto-generated method stub
	//	service=startServer();
		
		
		service=startserver();
			AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	  //xpath id className, androidUIautomator
	     /*    xpath Syntax
	      *    //tagName[@attribute='value']
	    
	      * 
	      */
	     HomePage h=new HomePage(driver);
	     //Constructor of class will be invoked when you create object for the class
	     
	    // default constructor be called
	     
	     //constructor can be defined with arguments
	     
	  //   driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	     
	     //You can call the methods or variables of the class with class object
	     
	     h.Preferences.click();
	     
	     Preferences p=new Preferences(driver);
	    // driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	     p.dependencies.click();
	     driver.findElementById("android:id/checkbox").click();
	     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	     Thread.sleep(1000);
	     driver.findElementByClassName("android.widget.EditText").sendKeys(input);
	    // driver.findElementsByClassName("android.widget.Button").get(1).click();
	     p.buttons.get(1).click();
	     //for failing purpose changed to  p.buttons.get(17).click();
	     service.stop();
	  
	     }




	
@BeforeTest


public void KillAllNodes() throws IOException, InterruptedException
{
	//it will statr a fesh node test case
	//Runtime.getRuntime().exec("taskkill/F /IM node.exec");
	Thread.sleep(30000);
	System.out.println("killing all the previous node stating and killing the new fesh TC");
	
}

}
