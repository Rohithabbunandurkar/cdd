package CodingTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class wiki {
	@Test
	public void wikipushpa() {
		System.setProperty("webdriver.chrome.driver","E:/h/chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
    dr.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	dr.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)dr;
	js.executeScript("window.scrollBy(0,400)", "");
	WebElement origin=dr.findElement(By.xpath("//td[text()='India']"));
	String Country=	origin.getText();
    System.out.println("Country is "+Country);
    Assert.assertEquals(Country , "India");
   WebElement releasedate=dr.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li"));
   String date=  releasedate.getText();
   System.out.println("Release date "+date);
   Assert.assertEquals(date , "17 December 2021");
}}
