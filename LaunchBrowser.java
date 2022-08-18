package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//step 1 //connect with BrowserDriver (exe file)
		
		WebDriverManager.chromedriver().setup();//check for the version and download
		/* String property = System.getProperty("webdriver.driver.chromedriver");//getproperty helps to know the version of web browser
		System.out.println(property);
		*/
       
		//step 2 //launch a browser
		ChromeDriver driver = new ChromeDriver();
		
		//step 3  // load the url 
		driver.get("http://www.leaftaps.com/opentaps/control/main");//get method to load url
		
		//step 4 //Maximize the window
		driver.manage().window().maximize();
		//to wait for the driver to locate the element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 5 //enter the username
		//if value of the locator is not proper, it throws the excuption as NosuchElement
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		/* WebElement username = driver.findElement(By.id("username"))
		 * username.sendKeys("demosalesManager"); 
		 */
		/*findElement , By, class*/
		
		//step 6 //enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//step 7 //click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//step 8 //click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//step 9 //click leads
		driver.findElement(By.linkText("Leads")).click();
		//step 10 //click create leads
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf Software");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mathiyalagan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		//step 11 //confirm my title of my webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		//Pause the excution
		Thread.sleep(2000);
		//to close the browser
	    driver.close();
	}

}
