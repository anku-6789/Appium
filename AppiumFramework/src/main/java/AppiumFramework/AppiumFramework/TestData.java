package AppiumFramework.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {

	//Verify  special charaters are allowed or not
	
	@DataProvider(name="InputData")

	public Object[][] getdataforeditfeild()
	{
	//2sets of data 1. hello; 2. $%^$%^
		//here object is the super classfor string ,int, special charater so here data type asas object as superclass
		Object [][] obj= new Object[][]
				
			{{"hello"}, {"erteterte"}};
			return obj;//trying to collect object need to return
	}
}
