package Example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> list= driver.findElements(By.tagName("iframe")) ;
		System.out.println(list.size());
		
		driver.switchTo().frame(0);  
    
      WebElement element= driver.findElement(By.xpath("//*[@id=\'draggable\']"));
      System.out.println(element.getText());
      
      Actions action = new Actions(driver);
      action.dragAndDropBy(element, 50, 50).build().perform();
      
      

	}

}
