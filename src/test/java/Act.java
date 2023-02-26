import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Act {
    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();
        //selectMultipleValue("https://jsbin.com/osebed/2");
        //dragAndDrop("http://demo.guru99.com/test/drag_drop.html");
        NoOfColAndRowhandleDynamicWebTable("https://demo.guru99.com/test/web-table-element.php");

    }
    public static void selectSingleValue(String baseURL){

         driver.get(baseURL);
        Select select=new Select(driver.findElement(By.name("country")));
        select.selectByIndex(2);
        driver.close();
    }
    public static void selectMultipleValue(String baseURL){
        driver.get(baseURL);
        Select select=new Select(driver.findElement(By.id("fruits")));
        select.selectByIndex(0);
        select.selectByIndex(1);
        select.selectByIndex(2);
        driver.close();
    }
    public static void dragAndDrop(String baseURL){
        driver.get(baseURL);
        WebElement From = driver.findElement(By.id("credit2"));
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(From,To).build().perform();
       // actions.dragAndDropBy(From, (int) 136.567,40).build().perform();
    }
    public static void NoOfColAndRowhandleDynamicWebTable(String baseURL){
        driver.get(baseURL);
        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
        System.out.println("Total col= > "+col.size());
        System.out.println("Total row= > "+row.size());
        driver.close();

    }
    public static void handleWebTable(String baseURL){
        driver.get(baseURL);
        WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
        baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/"));
    }

}
