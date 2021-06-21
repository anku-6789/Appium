	package AndroidChromeBrowseAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class browse extends baschromesetup {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities();
		System.out.println("here navigating to angular app demo page");
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		driver.findElement(By.cssSelector("a[href*='products']")).click();
		
		//Error-Compactibility : if chrome driver not found then appium provide chrome  then emulator appium version is dfifferent then we need to  updated the appium chrome dirver version
		//in appium logs it will provide the path then delete existing and add new chrome driver
		//to scroll we are using //javascript executor javascipt in java
		
		//interview  question //browser supports javascript
		JavascriptExecutor js = (JavascriptExecutor)driver;//casting driver into javascript
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		String text= driver.findElement(By.xpath("(//li[@class='list-group-item'])[3]/div/div/a")).getText();
		
		System.out.println("here text is matching");
		Assert.assertEquals(text, "Devops1");
		
	}

}
