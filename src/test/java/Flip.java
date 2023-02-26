import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import java.util.stream.Collectors;

public class Flip {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.className("_3704LK")).sendKeys("Shirt", Keys.ENTER);
        Thread.sleep(3000);
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0,500);
        Thread.sleep(3000);
        WebElement elements = driver.findElement(By.xpath("//*[@class='_3uDYxP']//select[@class='_2YxCDZ']"));
        Select select=new Select(elements);
        select.selectByIndex(0);
        Thread.sleep(3000);
        List<String> collect = driver.findElements(By.xpath("//div[@class='_25b18c']//div[@class='_30jeq3' and text()]")).stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(collect);
        Collections.sort(collect);
        System.out.println(collect);
    }
}
