package Example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SK\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.rediff.com/");
//		driver.findElement(By.xpath("//a[@class='signin']")).click();
//		Thread.sleep(5000);
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		driver.get("https://yahoo.com");
//	driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
//	Thread.sleep(5000);
//	List<WebElement> list= driver.findElements(By.xpath("//*[contains(@id,'yui_3_18_0_3_15889')]"));
//	System.out.println(list.size());
//	System.out.println(list);
	
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> list= driver.findElements(By.tagName("iframe")) ;
		System.out.println(list.size());
		
		driver.switchTo().frame(0);  
    
      WebElement drag= driver.findElement(By.xpath("//*[@id=\'draggable\']"));
      System.out.println(drag.getText());
    
      
      WebElement drop= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
      System.out.println(drop.getText());
      
      
      Actions action = new Actions(driver);
      action.dragAndDrop(drag, drop).build().perform();
      
	
		
		

	}

}
