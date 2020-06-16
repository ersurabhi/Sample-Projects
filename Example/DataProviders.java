package Example;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider()
	  
	  public static Object[][] testData(Method m)
	  {
		Object[][]obj= null;
		if(m.getName().equals("registeredUser"))
		{
		
	obj = new Object[3][4];
	  obj[0][0]= "Rahul";
	  obj[0][1]="Singh";
	  obj[0][2]="test@gmail.com";
	  obj[0][3]="112";
	  
	  obj[1][0]= "Raju";
	  obj[1][1]="Singh";
	  obj[1][2]="test1@gmail.com";
	  obj[1][3]="1123";
	  
	  obj[2][0]= "Ram";
	  obj[2][1]="Joshi";
	  obj[2][2]="test2@gmail.com";
	  obj[2][3]="11234";
	  
	
    }
		if(m.getName().equals("LoginUser"))
		{
			obj = new Object[3][2];
			
			  obj[0][0]="test@gmail.com";
			  obj[0][1]="112";
			  
		
			  obj[1][0]="test1@gmail.com";
			  obj[1][1]="1123";
			  
			
			  obj[2][0]="test2@gmail.com";
			  obj[2][1]="11234";
			  
			
		}
		return obj;
		}


}

