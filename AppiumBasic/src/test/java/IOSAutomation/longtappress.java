package IOSAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;

import static  io.appium.java_client.touch.LongPressOptions.longPressOptions;//neeed to omprot this package be ause it is static

import static  io.appium.java_client.touch.offset.ElementOption.element;
import static  io.appium.java_client.touch.TapOptions.tapOptions;
import static java.time.Duration.ofSeconds;

public class longtappress extends baseIOSsetup {
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

  IOSDriver driver= DesiredCapabilites();
		
		System.out.println("here opeing the app");
		//here we are selecting the particular feild we need to tap on that then long press
		MobileElement e=	(MobileElement)driver.findElementByName("Long tap");
		//IOSTouchAction is special class for 
		//perofrm is chinign on that options
		IOSTouchAction touch=  new IOSTouchAction(driver);//created obje of iostouchaction
		touch.longPress(longPressOptions().withElement(element(e)).withDuration(ofSeconds(2))).release().perform();
		
		//tapping event with touch action
		
		MobileElement tap=	(MobileElement)driver.findElement(By.xpath("//XCUIElementTypeSwitch[1]"));
		System.out.print("here tapping on email address feild");
	touch.tap(tapOptions().withElement(element(tap))).perform();
	}

}