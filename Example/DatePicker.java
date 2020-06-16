package Example;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("fromCity")).sendKeys("Pune");
//driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
List<WebElement> list1 = driver.findElements(By.xpath("//*[@class='calc60']"));
		
		for(WebElement e1:list1) {
			
			if(e1.getText().contains("Pune"))
			{
				System.out.println(e1.getText());
				e1.click();
			}
		}
		
		driver.findElement(By.id("toCity")).sendKeys("Indore");
		
		//List<WebElement> list = driver.findElements(By.xpath("//*[@class='calc60']"));
		
		for(WebElement e:list1) {
			
			if(e.getText().contains("Indore"))
			{
				System.out.println(e.getText());
				e.click();
			}
				
			
//			WebElement E= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3] "));
//			E.click();
//			System.out.println(E.getText());
			
					
			
		}
		
		driver.findElement(By.xpath("//div[@class='fsw_inner ']/label")).click();
		String date = "10-December";
		String splitter[]= date.split("-");
		String checkInmonth_year = splitter[1];
		String checkInday = splitter[0];
		System.out.println(checkInday);
		System.out.println(checkInmonth_year);
		
		List<WebElement> elements= driver.findElements(By.xpath("//div[@class='DayPicker-Caption']//div"));
		for (WebElement E: elements)
		{
			
			System.out.println("months:"+E.getText());
			if(E.getText().equals(checkInmonth_year))
			{
				List<WebElement> days= driver.findElements(By.xpath("//div[@class='DayPicker-Body']//div[@class='DayPicker-Week']"));
				for(WebElement d:days)
				{
					System.out.println("days:"+d.getText());
					if(d.getText().equals(checkInday));
					{
						d.click();
						
					}
					
				}
			}
		}
	
		
	}

}
