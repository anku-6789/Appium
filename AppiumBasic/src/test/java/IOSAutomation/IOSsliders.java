package IOSAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import junit.framework.Assert;

public class IOSsliders extends baseIOSsetup {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		IOSDriver driver= DesiredCapabilites();
		//only for ios
		 //hre we are casting  that particular element to ios element then it means we able to get addition functionality as well
		IOSElement slider =(IOSElement)driver.findElement(By.xpath("//*[@type='XCUIElementTypeCell']"));
		Thread.sleep(2000);
		slider.setValue("0%");
		Thread.sleep(2000);
		slider.setValue("1%");
		Thread.sleep(2000);// zero to 1 % if we need to give 42% we need to pass 4.2
		System.out.println("here it will try to slide");
		Assert.assertEquals("98%", slider.getAttribute("value"));
		
	}

}
