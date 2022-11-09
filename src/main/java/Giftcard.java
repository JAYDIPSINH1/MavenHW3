import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class Giftcard {
@Test
void setup()
{
    System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");
    driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]")).click();
    driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")).click();
}

    @Test
    void TimeStamp()
    {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println(timeStamp);
    }
}