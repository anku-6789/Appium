package IOSAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSDriver;

public class AppiumClickTest extends baseIOSsetup {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		IOSDriver driver= DesiredCapabilites();
		
		System.out.println("here opeing the app");
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Alert Views\"]")).click();
		
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Text Entry\"]")).click();
				
		driver.findElement(By.xpath("//XCUIElementTypeOther")).sendKeys("Hello its mayuri here");
		
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]")).click();
		
	
		
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Confirm / Cancel\"]")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//*[contains(@name,'message')]")).getText());
		 driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirm\"]")).click();
		
	}

}
