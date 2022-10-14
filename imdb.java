package CodingTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class imdb {
	@Test
	public void imdbpushpa() {
	System.setProperty("webdriver.chrome.driver","E:/h/chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
    dr.get("https://www.imdb.com/title/tt9389998/?ref_=tt_mv_close");
	dr.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)dr;
	js.executeScript("window.scrollBy(0,5900)", "");
    WebElement date=	dr.findElement(By.xpath("//ul[@class='ipc-metadata-list ipc-metadata-list--dividers-all ipc-metadata-list--base']/li[@data-testid='title-details-releasedate']/div[@class='ipc-metadata-list-item__content-container']"));
    String redate=date.getText();
    System.out.println("Release date "+redate);
    Assert.assertEquals(redate,"December 17, 2021 (United States)");
    WebElement origin=dr.findElement(By.xpath("//ul[@class='ipc-metadata-list ipc-metadata-list--dividers-all ipc-metadata-list--base']/li[@class='ipc-metadata-list__item']/div[@class='ipc-metadata-list-item__content-container']"));
    String countryorigin=origin.getText();
    System.out.println("Country of origin "+countryorigin);
    Assert.assertEquals(countryorigin,"India");


	
	}

}
