import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static WebDriver driver;
    public static void takeScreenshot(String FileName) throws IOException {
        File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(File, new File("image location" + FileName + ".jpeg"));
    }
    public static void MakeBorder(WebElement Element)
    {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border = '8px solid red'", Element);
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.amazon.in/");
        WebElement Element = driver.findElement(By.xpath(" //a[@id=\"nav-logo-sprites\" and @aria-label='Amazon.in']"));

        // Assignments to webDriver
        MakeBorder(Element);
        Thread.sleep(2000);
        takeScreenshot("CreateAccountFb");
        driver.quit();
    }
}
