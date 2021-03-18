package Test_anotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test(invocationCount=3)
	void trial(){
		Reporter.log("10" ,true);
	}
	
	@Test(priority=-1)
	void trial1(){
		Reporter.log("20", true);
	}
	
	@Test(enabled=false)
	void trails(){
		Reporter.log("30", true);
	}
	
	
}
