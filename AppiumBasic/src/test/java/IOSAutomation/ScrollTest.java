package IOSAutomation;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSDriver;

public class ScrollTest extends baseIOSsetup {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		

		IOSDriver driver= DesiredCapabilites();
		
		System.out.println("here opeing the app");
		
		
		//here for scroll purpose we need to depen on javascript
		//need to provide from where we need to scroll and hashmap as input as key pair
		
		HashMap<String,Object> Scrollobj= new HashMap<>();
		
		Scrollobj.put("direction", "down");
		Scrollobj.put("name", "Web View");//here we are passing attibute that is unique
		
		//it taking hasbma obj as secondary obj
		
		driver.executeScript("mobile:scroll",Scrollobj);
		System.out.println("Now here clicking on Webview with scroll");
		driver.findElement(By.xpath( "//XCUIElementTypeStaticText[@name=\"Web View\"]")).click();
		System.out.println("Navigating to homepage");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"UIKitCatalog\"]")).click();
		//here we are starting dropdown
	System.out.println("here now strtgin dropdown");

		
   driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Picker View\"]")).click();

   System.out.println("Now here selecting dropdown");

driver.findElement(By.xpath("//XCUIElementTypePickerWheel[@name=\"Red color component value\"]")).sendKeys("75");
driver.findElement(By.xpath("//XCUIElementTypePickerWheel[@name=\"Red color component value\"]")).sendKeys("205");
driver.findElement(By.xpath("//XCUIElementTypePickerWheel[@name=\"Red color component value\"]")).sendKeys("140");
driver.findElement(By.xpath("//XCUIElementTypePickerWheel[@name=\"Red color component value\"]")).getText();



System.out.println("Selcted value from dropdown");

	}
}
