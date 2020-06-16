package Example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploader {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zamzar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		driver.findElement(By.xpath("//*[@id='inputFile']/parent::p/button")).sendKeys("C:\\Users\\SK\\Desktop\\pinna paint.png");
		driver.findElement(By.xpath("//*[@id='inputFile']/parent::p/button")).click();
		Thread.sleep(5000);
		
	
//		Runtime.getRuntime().exec("C:\\Users\\SK\\Desktop\\AutoItScript.exe");
		Robot r = new Robot();
		
		StringSelection str = new StringSelection("C:\\Users\\SK\\Desktop\\resume.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);      
		r.keyPress(KeyEvent.VK_V);    
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);   
		r.keyRelease(KeyEvent.VK_ENTER);
		

		
		
	}

}
