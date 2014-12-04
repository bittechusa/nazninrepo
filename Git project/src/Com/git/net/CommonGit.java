package Com.git.net;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonGit {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.BLUEFLY.com");
		WebElement MENLink = driver.findElement(By.xpath(".//*[@id='main-nav-men']/a"));
		//MainGit newLink = driver.findElement(By.xpath(xpathExpression))new MainGit(driver);
		//main.click(newLink);
		

	}

}
