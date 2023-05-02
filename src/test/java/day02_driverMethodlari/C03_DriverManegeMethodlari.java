package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManegeMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
            Selenium 4.7 versiyonu ile kendi driverini sisteme ekledi.
            Kodlar çalışmaya basladığında biz driver icin yol göstermezsek
            Selenium kendi driver ini devreye sokuyor
            Ama baslangıcta driver ayarı aradıgı icin biraz yavas calışıyor

            driver.manage().window().istenen ayar ile window umuzu istediğimiz
            boyuta getirebiliriz.
            veya window un konum ve buyukluk bilgilerine ulaşabiliriz

            Biz genelde bir teste baslamadan once
            windowu maximize yapmayi tercih ederiz

         */

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        /*
        implicitlyWait bir websayfasi açılıncaya veya
        aradıgımız elementler bulununcaya kadar
        driver in bekleyeceği maximum süreyi belirler
         */

        driver.get("https://www.amazon.com");

        System.out.println("Baslangıcta konum : "+ driver.manage().window().getPosition());//Baslangıcta konum : (9, 9)
        System.out.println("Baslangıcta boyut : "+driver.manage().window().getSize());// Baslangıcta boyut : (1051, 798)

        Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println("Baslangıcta konum : "+ driver.manage().window().getPosition());//Baslangıcta konum : (-8, -8)
        System.out.println("Baslangıcta boyut : "+driver.manage().window().getSize()); // Baslangıcta boyut : (1552, 832)

        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum : "+ driver.manage().window().getPosition());//Fullscreen konum : (0, 0)
        System.out.println("Fullscreen boyut : "+driver.manage().window().getSize()); // Fullscreen boyut : (1536, 864)

        Thread.sleep(1000);
        driver.manage().window().minimize();
        System.out.println("Minimize konum : "+ driver.manage().window().getPosition());//Minimize konum : (9, 9)
        System.out.println("Minimize boyut : "+driver.manage().window().getSize());// Minimize boyut : (1051, 798)


        // pencereyi istediğimiz boyut ve konuma getirelim

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500,500));


        Thread.sleep(1000);
        System.out.println("İstediğimiz konum : "+ driver.manage().window().getPosition());//Minimize konum : (9, 9)
        System.out.println("İstediğimiz boyut : "+driver.manage().window().getSize());




        Thread.sleep(3000); // mili saniye olarak yazdığımız sayi süresince kodu bekletir.
        driver.close();// acılan browseri kapatir.
    }
}
