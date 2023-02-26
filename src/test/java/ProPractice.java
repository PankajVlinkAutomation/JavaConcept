import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class ProPractice {
   public static WebDriver driver;
   public static File file;
    public static void screenshot(String fileName) throws IOException {

        file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("image" +fileName+ ".jpeg"));
    }
    public static void makeBorder(WebElement webElement){

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border = '8px solid blue'",webElement);

    }
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options  = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.get("https://www.google.co.in");
        WebElement element = driver.findElement(By.xpath("//*[@id='ctaCanvas']"));
        screenshot("GoogleScreenshots");
        makeBorder(element);

    }
}
