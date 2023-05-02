package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) throws InterruptedException {

        // önce gerekli ayarlamaları yapıp driver objesi olusturmalıyız

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa baslıği : " + driver.getTitle());

       // 5. Sayfa basliginin “Amazon” icerdigini test edin
        // yazilim testi beklenen degerlerin gercekleşip gerceklesmediğini test etmektir

        String expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title Amazon iceriyor, Test PASSED");
        }else {
            System.out.println("Title Amazon icermiyot, Test FAILED");
        }


       // 6. Sayfa adresini(url) yazdirin
        System.out.println("Sayfa url : "+ driver.getCurrentUrl());

       // 7. Sayfa url’inin “amazon” icerdigini test edin.

        expectedIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Url amazon iceriyor, URL test PASSED");
        }else {
            System.out.println("Url amazon icermiyor, URL test FAILED");
        }

        //8. Sayfa handle degerini yazdirin
        System.out.println("Sayfanın handle degeri : "+ driver.getWindowHandle());

       // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        expectedIcerik = "alısveris";
        String actualPageSource = driver.getPageSource();

        if (actualPageSource.contains(expectedIcerik)){
            System.out.println("Sayfa kaynak kodlari alısveris iceriyor, test PASSED");
        }else {
            System.out.println("Sayfa kaynak kodlari alısveris icermiyor, test FAILED");
        }
       // 10. Sayfayi kapatin.
        Thread.sleep(3000); // mili saniye olarak yazdığımız sayi süresince kodu bekletir.
        driver.close();// acılan browseri kapatir.
    }
}
