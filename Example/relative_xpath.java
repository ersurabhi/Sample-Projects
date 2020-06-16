package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[text()='Learn CSS']/preceding-sibling::a")).click();
		//driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[text()='Learn CSS']/following-sibling::a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[text()='Learn CSS']/parent::div/parent::nav//following-sibling::div[2]/div[1]/div[1]/a[2]")).click();
	}

}
