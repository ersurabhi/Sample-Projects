package Example;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	static String encodedPassword = "MDExMDg3U0olcw==";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.id("login1")).sendKeys("ersurabhi.jain01@gmail.com");
		driver.findElement(By.id("password")).sendKeys("decodedPassword");
		driver.findElement(By.name("proceed")).click();
		
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static String decodedPassword() {
		return new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
	}

}
