package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators_findElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusuna Nutella yazdirin
        /*
            Test otomasyonu yaparken
            bir web elementi kullanmak istersek 2 şeye ihtiyacımız var
            1- O web elementi benzersiz olarak tarif edebileceğimiz locator
            2- Bu locator u söylediğimizde bize web elementi bulup getirecek method

            örneğin amazon sitesindeki arma kutusunun unique tarif edicisi olarak
            id= "twotabsearchtextbox" kullanabiliriz
         */

        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
      //data turu  objenin adi         =       findElemet : webelementi bulan method
        //                                     By : Webelementi bulacağımız locator in turunu
        //                                          yazdığımız alan
        //                                     twotabsearchtextbox : unique tarif için attribute değeri

        /*
            findElement() methodu locator turu ve locator icin verdiğimiz degere göre
            webelementi arar.
            Locator icin verdiğimiz değer hatalıysa veya
            locator stratejisinde hata yaptıysak
            aranan web elemnti imlicitlyWait olarak tanımladığımız
            maximum sure boyunca arar
            bulamadıgı ıcın "NoSuschElementException" fırlatır ve
            kodların kalanını calıştırmaz
         */

        aramaKutusuElementi.sendKeys("Nutella");
        // istenen webelemente istenen yziyi yazdirir

        // enter tusuna basarak arama yapın
        aramaKutusuElementi.submit();
        // istenen web elementi uzerinende enter tusuna basar



        Thread.sleep(7000);
        driver.close();


    }
}
