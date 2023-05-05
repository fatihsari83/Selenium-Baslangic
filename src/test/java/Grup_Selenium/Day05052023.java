package Grup_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day05052023 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 1- bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTitle = "Spend less";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){ //Title testi PASSED
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

        //6- Gift Cards sekmesine basin

        WebElement giftCardElementi = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
        giftCardElementi.click();
        //giftCardElementi.sendKeys("Nutella" + Keys.ENTER);


        //7- Birthday butonuna basin
        WebElement birtdayElementi = driver.findElement(By.xpath("//a[@aria-label='Birthday']"));
        birtdayElementi.click();

        //8- Best Seller bolumunden beşinci urunu tiklayin

        WebElement bestSellerElementi = driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[3]"));
        bestSellerElementi.click();

        //9- Gift card details’den 50 $’i secin
        WebElement detailsElementi = driver.findElement(By.xpath("(//*[@id=\"gc-mini-picker-amount-1\"])[2]"));
        System.out.println(detailsElementi.getText());
        detailsElementi.click();

        //10-Urun ucretinin 50$ oldugunu test edin

        String expectedUcret = "$50";
        String actualUcret = detailsElementi.getText();

        if (actualUcret.equals(expectedUcret)){
            System.out.println("Ucret testi PASSED");
        }else {
            System.out.println("Ucret testi FAILED");
        }


        //11-Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
