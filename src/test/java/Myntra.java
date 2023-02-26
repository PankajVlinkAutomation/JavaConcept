import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Myntra {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.myntra.com/shirt?sort=popularity");

        List<String> listOfPrice = driver.findElements(By.xpath("//*[@class='product-productMetaInfo']//div[@class='product-price']//span[@class='product-discountedPrice']"))
                .stream().map(a -> a.getText()).toList();

        for (int i = 0; i < listOfPrice.size(); i++) {

            String price = listOfPrice.get(i).substring(4);
            int priceInInteger = Integer.parseInt(price);

            if (priceInInteger < 800) {

                System.out.print(listOfPrice.get(i).substring(4) + "|");

            }

        }
        System.out.println("---------------------------------------------------------------");

        List<String> listOfBrandName = driver.findElements(By.xpath("//*[@class='product-productMetaInfo']/h3[@class='product-brand']")).stream().map(a -> a.getText()).toList();

        for (int j = 0; j < listOfBrandName.size(); j++) {

            System.out.print(j + "-" + listOfBrandName.get(j)+"\n");

        }
        driver.close();
    }
}
