package Example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> Radio = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(Radio.size());
		for (WebElement e: Radio) {
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
			
			if(e.getAttribute("value").equals("Milk"))
				{e.click();
		}
		}
		for (WebElement e: Radio) {
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
		}
	}

}
