import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class News {

    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[contains(text(),'News')]")).click();
        driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]")).sendKeys("Details");


    }

    @Test
    void TimeStamp()
    {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println(timeStamp);
    }



    }

