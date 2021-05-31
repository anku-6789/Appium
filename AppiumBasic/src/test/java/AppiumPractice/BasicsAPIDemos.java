package AppiumPractice;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasicsAPIDemos extends setup
{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//here ad is driver come with data element AndroidDriver<AndroidElement>
		AndroidDriver<AndroidElement> ad= capabiltes();
		
		//xpath.syntax
		//tagname[@attribute='value']
		System.out.println("API demoesAPI file is opening in emulator");
		 ad.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		ad.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		ad.findElement(By.id( "android:id/checkbox")).click();
		//now here for wifi and wifi settings have same classname so give xpath till there and click on 2ndelement
		//android.widget.FrameLayout[2]
		//xpath using index
		System.out.println("Here clickinng on wifi settings");
		ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout\n"
				)).click();
		//this	is also another ways to find elements with same classname and no ither unique properties with find elements	
		//ad.findElementsByClassName("android.widget.FrameLayout").get(2).click();
		System.out.println("here wifi poup is opening");
		ad.findElement(By.className("android.widget.EditText")).sendKeys("Mayuri");
		ad.findElementsByClassName("android.widget.Button").get(1).click();
	
}
}