import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonAutomation {
    public static WebDriver driver;

    public static void openBrowser(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);

    }


    public static void main(String[] args) throws InterruptedException {
        openBrowser("https://www.bing.com/");

        driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and text()='₹10,000 - ₹20,000']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='a-icon-alt' and text()='3 Stars & Up']")).click();
       // driver.findElement(By.xpath("//span[@class='a-icon-alt' and text()='3 Stars & Up']")).click();
        long count = driver.findElements(By.xpath("//span[@class='a-icon-alt']")).stream().filter(p -> Boolean.parseBoolean(p.toString().substring(0, 1))).count();
        System.out.println(count);

    }
}
