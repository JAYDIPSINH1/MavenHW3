import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class Computer {



    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println(timeStamp);
        driver.manage().window().maximize();

       driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li")).sendKeys("Desktop");
        driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();

        String regMsg= driver.findElement(By.className("result")).getText();
        System.out.println(regMsg);
        driver.close();

    }
}
