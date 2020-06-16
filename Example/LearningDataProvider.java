package Example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
  @Test(dataProviderClass=DataProviders.class, dataProvider="testData")
  public void registeredUser(String Firstname, String Lastname,String email, String password ) {
	  System.out.println(Firstname);
	  System.out.println(Lastname);
	  System.out.println(email);
	  System.out.println(password);
  }
  
  @Test(dataProviderClass=DataProviders.class, dataProvider="testData")
  public void LoginUser(String email, String password ) {
	  System.out.println(email);
	  System.out.println(password);
  }
  }
  