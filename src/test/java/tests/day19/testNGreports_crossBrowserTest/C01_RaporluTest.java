package tests.day19.testNGreports_crossBrowserTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    @Test
    public void nutellaTesti(){
        extentTest = extentReports.createTest("Amazon arama Testi","Kullanıcı Amazon'da istenen kelimeyi aratıp, ilk ürüne gidebilmeli");

        // amazon anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanıcı anasayfaya gider");

        // url'nin amazon içerdiğini test et
        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        extentTest.pass("url'nin amazon içerdiğini test eder");

        // aranacak kelimeyi aratalım
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);
        extentTest.info("Test datası olarak belirlenen kelimeyi aratır");

        // sonuçların aranacak kelimeyi içerdiğini test edin.
        String expectedSonucIcerik = ConfigReader.getProperty("amazonAranacakKelime");
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucIcerik));
        extentTest.pass("Amazon arama sonuclarının aranan kelimeyi içerdini test eder.");
        // ilk ürüne tıklayalım
        amazonPage.ilkUrunElementi.click();
        extentTest.info("Ilk ürüne tıklar");

        // ilk ürün isminde aranacak kelime bulunduğunu test edelim.
        String expectedUrunIcerik = ConfigReader.getProperty("amazonAranacakKelime");
        String actualIsim = amazonPage.ilkUrunIsimElementi.getText();

        Assert.assertTrue(actualIsim.contains(expectedUrunIcerik));
        extentTest.pass("ilk ürün isminde aranan kelime bulunduğunu test eder.");

        // sayfayı kapatalım
        Driver.closeDriver();
        extentTest.info("Sayfayı kapatır");



    }
}
