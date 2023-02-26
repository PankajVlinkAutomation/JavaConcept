import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLess {
    static WebDriver driver;
    static ChromeOptions options;

    @Test(priority = 1)
    public static void open(){
        options=new ChromeOptions();
        options.setHeadless(true);
        driver=new ChromeDriver(options);
        driver.get("https://www.google.co.in/");
    }

    @Test(priority = 2)
    public static void currentUrl(){
        System.out.println(driver.getCurrentUrl());

    }

    @Test(invocationCount = 5,priority = 3, timeOut = 1,enabled = true)
    public static void getHandle(){

        System.out.println(driver.getWindowHandle());
    }

    @Test(priority = 4)
    public static void getTitle(){

        System.out.println(driver.getTitle());
    }

}
