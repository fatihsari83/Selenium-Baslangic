package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElemetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon ana sayfaya gidip arama kutusunu lovator edelim.

        driver.get("https://www.amazon.com");

       WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));

        System.out.println(aramaKutusuElementi.isDisplayed());// true
        System.out.println(aramaKutusuElementi.isEnabled()); // true
        System.out.println(aramaKutusuElementi.getText());


        System.out.println(aramaKutusuElementi.getSize());// (789, 38)

        System.out.println(aramaKutusuElementi.getLocation());// (279, 10)

        System.out.println(aramaKutusuElementi.getRect().getDimension());// (789, 38)


        Thread.sleep(3000);
        driver.close();
    }
}
