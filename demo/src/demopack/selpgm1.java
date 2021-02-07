package demopack;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selpgm1 {
	@Test(groups= {"b"})
	public  void main() throws InterruptedException {
		System.out.println("start");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\k.shailesh\\seleniumjars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.trendin.com/");
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//img[@alt='Peter England']"))).perform();
	driver.findElement(By.xpath("//img[@alt='Peter England']")).click();
	String Link = driver.findElement(By.xpath("//img[@alt='Peter England']/..")).getAttribute("href");
	Set<String> s = driver.getWindowHandles();
		System.out.println(s.size()+" tabs are opened");
		Iterator it = s.iterator();
		while(it.hasNext()) {
				driver.switchTo().window(it.next().toString());
			}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@class='closeStoreModeTooltip']")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/li[5]/a")).click();
		String Brand = driver.findElement(By.xpath("//div[@class='header__logo']/a")).getAttribute("title");
		String numberOfProducts = driver.findElement(By.xpath("//span[@class='font-lato-lt font-18']")).getText();
		System.out.println(numberOfProducts+"  are available in "+Brand);
		String selectedproduct = driver.findElement(By.xpath("(//div[contains(text(),'Peter England Multicoloured Neem Tulsi Shirt')])[1]")).getText();
		driver.findElement(By.xpath("(//div[contains(text(),'Peter England Multicoloured Neem Tulsi Shirt')])[1]/..")).click();
		String Returnedproduct = driver.findElement(By.xpath("//h2[@class='font-30 blue-color font-lato-lt']")).getText();
		Assert.assertEquals(Returnedproduct, selectedproduct,"Different products");
		List<WebElement> l = driver.findElements(By.xpath("//ul[@id='online-size']//input"));
		System.out.println(l.size()+" sizes are available in "+selectedproduct);
		for(int i=1;i <l.size();i++) {
			System.out.println(l.get(i).getAttribute("value")+" is the selected size");
			String SelectedSize= l.get(i).getAttribute("value");
			driver.findElement(By.xpath("//input[@value="+SelectedSize+"]")).click();
			
			Thread.sleep(6000);
			String Cost = driver.findElement(By.xpath("//*[@id='divProductPrice']/span[2]")).getText();
			System.out.println(Cost+" is the price of shirt");
			int size = 44;	
			driver.findElement(By.xpath("//input[@value="+size+"]")).click();
			String CostOfShirt = driver.findElement(By.xpath("//*[@id='divProductPrice']/span[2]")).getText();
			driver.findElement(By.xpath("//a[@id='btnAddToBag']")).click();
			WebElement cartbutton = driver.findElement(By.xpath("//span[@class='text-center shopping_cart_count']"));
			a.moveToElement(cartbutton).moveToElement(driver.findElement(By.xpath("//a[@class='btn large-button orange-bg white-color text-center']"))).click();
			Thread.sleep(3000);
			
			
		}
		
		
	}
	@Test(groups= {"a"})
	public void selectlaptop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\k.shailesh\\\\seleniumjars\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions a =new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://ultimateqa.com/automation");
		WebElement URL = driver.findElement(By.xpath("//a[contains(text(),'Selenium Java')]"));
		System.out.println(URL);
		Thread.sleep(5000);
		js.executeScript("window.open('https://ultimateqa.com/selenium-webdriver-java-course/');");
		
		
		
		
		
		
	}
	
	
	
		}


