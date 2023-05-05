package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedIcerik = "Spend less";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//a[@class=‘nav-a  ’])[4]")).click();

        //7- Birthday butonuna basin
        driver.findElement(By.xpath("(//img[@alt='Birthday'])[2]")).click();

        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//div[@class=‘a-section a-spacing-mini a-spacing-top-micro acs-product-block__product-image’])[1]")).click();

        //9- Gift card details’den 25 $’i secin
        //10-Urun ucretinin 25$ oldugunu test edin
        //11-Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
