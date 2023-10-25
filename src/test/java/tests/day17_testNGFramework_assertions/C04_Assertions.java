package tests.day17_testNGFramework_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_Assertions {

    @Test
    public void test01(){

        // amazon anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // url'nin amazon içerdiğini test et
        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));

        // aranacak kelimeyi aratalım
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);

        // sonuçların aranacak kelimeyi içerdiğini test edin.
        String expectedSonucIcerik = ConfigReader.getProperty("amazonAranacakKelime");
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucIcerik));

        // ilk ürüne tıklayalım
        amazonPage.ilkUrunElementi.click();

        // ilk ürün isminde aranacak kelime bulunduğunu test edelim.
        String expectedUrunIcerik = ConfigReader.getProperty("amazonAranacakKelime");
        String actualIsim = amazonPage.ilkUrunIsimElementi.getText();

        Assert.assertTrue(actualIsim.contains(expectedUrunIcerik));

        // sayfayı kapatalım
        Driver.closeDriver();



    }
}
