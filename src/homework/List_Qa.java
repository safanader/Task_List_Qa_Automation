package homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Qa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("/html/body/form/select"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Facebook");
		List <WebElement> myListOfOptions = sel.getAllSelectedOptions();
		for(int i=1;i<myListOfOptions.size();i++) 
		{
		myListOfOptions.get(i).click();
		
		}
		
	}}

	

	
