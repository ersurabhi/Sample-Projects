package Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.testng.annotations.Test;

public class learningProperty {
	Properties property;
	FileInputStream fs;

	@Test
	public void testProperty() throws IOException {
		
		fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Example\\config.properties");
		property= new Properties();
		property.load(fs);
		System.out.println(property.getProperty("name"));
	}
	

}
