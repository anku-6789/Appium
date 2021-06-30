package POMGeneralStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {

	
	public FormPage(AndroidDriver<AndroidElement> driver)//so here we are passing direct android driver 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement namefeild;
	

	@AndroidFindBy(xpath="//*[@text='Female']")
	public WebElement feamleoption;
	
	
	@AndroidFindBy(xpath="android:id/text1")
	public WebElement dropdowncountry;
	

@AndroidFindBy(xpath="//*[@text='Antarctica']")
	public WebElement selectingcountry;
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement shopbutton;
	

	public WebElement getNameField()
	{
		System.out.println("trying to find the Name field");
		return namefeild;
	}
	public WebElement getcountrySelection()
	{
		System.out.println("Selecting the option from dropdown");
		return selectingcountry;
	}
	
	public WebElement getshopbutton()
	{
		System.out.println("tapping on shop button");
		return shopbutton;
	}
	
	public WebElement getfeamleoption()
	{
		System.out.println("tapping on female radio option");
		return feamleoption;
	}
	
	
	
	public WebElement getdropdowncountry()
	{
		System.out.println("tapping on radio option of country");
		return dropdowncountry;
	}
	
	
}

