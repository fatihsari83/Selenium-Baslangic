package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        // sisteme webdriver in ne olacağini ve bu driver in hangi dosya yolunda
        // oldugunu soyler
        WebDriver driver = new ChromeDriver();
        // bilgisayırınızdaki Chrome browser in otomosyonla çalışacak bir kopyasini olusturur
        // Chrome dısında bir browser kullanmak istersek o browser in driver ini indirip
        // System.setProperty("webdriver.safari.driver"," safari driver in doya yolu"

        // olusturdugumuz driver objesi bizim elimiz, gözümüz gibidir.

        driver.get("https://www.amazon.com");// istenen url e bizi götürür
        //www yazmasak da çalışır. Ancak https:// yazmazsak çalışmaz

        System.out.println(driver.getTitle());// bize title i döndürür

        System.out.println(driver.getCurrentUrl()); // gidilen url i döndürür https://www.amazon.com/

        System.out.println(driver.getPageSource());
        // gidilen web sayfasının kaynak kodlarını döndürür

        System.out.println(driver.getWindowHandle());// 1868B6B73C2D8A45AD255E3614727EF6
        // acılan her bir pencereye verilen unique hash code değeridir

        System.out.println(driver.getWindowHandles());// [1868B6B73C2D8A45AD255E3614727EF6]
        // eger driver çalışırken birden fazla pencere veya tab oluşturduysa
        // açılan tüm windows/tab larin unique hazh code larini set olarak döndürür




        Thread.sleep(3000); // mili saniye olarak yazdığımız sayi süresince kodu bekletir.
        driver.close();// acılan browseri kapatir.


    }
}
