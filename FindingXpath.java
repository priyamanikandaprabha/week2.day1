package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingXpath {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//h5[text()='Type your name']"));
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext')]")).isDisplayed();
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']"));
		driver.findElement(By.xpath("//div[@class='grid formgrid']/following-sibling::h5")).isDisplayed();
		

	}

}
