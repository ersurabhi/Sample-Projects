package Example;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class crosscheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='fromCity']")).sendKeys("PNQ");
	
		
//driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click(); 
List<WebElement> list1 = driver.findElements(By.xpath("//*[@class='calc60']"));
Thread.sleep(1000); 
		for(WebElement e1:list1) {
			System.out.println("........."+e1.getText());
			if(e1.getText().contains("Pune"))
		{
				System.out.println("inside if"+e1.getText());
			e1.click();
			break;
	}
		}

		
		  Thread.sleep(5000); driver.findElement(By.xpath(
		  "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"
		  )).sendKeys("Indore"); System.out.println("clicked");
		 
		 
     
       System.out.println("sent indore in to");

     driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();;
			

		
//		List<WebElement> list = driver.findElements(By.xpath("//*[@id='react-autowhatever-1']"));
		
		//*[@id="react-autowhatever-1-section-0-item-0"]/div/div[1]
//for(WebElement e:list) {
//			
//			if(e.getText().contains("Indore"))
//			{
//				System.out.println(e.getText());
//				e.click();
//				break;
//			}
//					
//	                    }
	}
}
