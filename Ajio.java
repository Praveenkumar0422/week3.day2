package week3.day2;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		String item = driver.findElement(By.className("length")).getText();
		System.out.println(item);
		System.out.println("list of brands");
		List<WebElement>bagBrandList =driver.findElements(By.className("brand"));
		System.out.println("size:"+bagBrandList .size());
		
		for (WebElement webElement : bagBrandList ) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
		System.out.println("list of bag name:");
		List<WebElement>bagName=driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement baglist : bagName) {
			String tex = baglist.getText();
			System.out.println(tex);
		}
		
			
			
			
		
		

		
		
		
		
		
	}

}
