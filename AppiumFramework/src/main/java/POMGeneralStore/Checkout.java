package POMGeneralStore;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Checkout {

	
	public Checkout(AndroidDriver<AndroidElement> driver)//so here we are passing direct android driver 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	
@AndroidFindBy(id="com.androidsample.generalstore:id/productPrice")
public List<WebElement> productlist;


//driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl"))

@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
public WebElement total;


public List<WebElement> getProductList()
{
	System.out.println("here we are getting product list");
	
	return productlist;
}


public WebElement gettotal()
{
	System.out.println("here we are getting total of the prodcuts");
	return total;
}

}

