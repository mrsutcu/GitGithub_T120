package tests.day17_testNGFramework_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_configurationPropertiesKullanimi {

    @Test
    public void test01(){

        // amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // arama kutusuna aranacak kelimeyi yazdırın ve aratın.
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);

        // arama sonuçlarının aranan kelimeyi içerdiğini test edin
        String expectedIcerik = ConfigReader.getProperty("amazonAranacakKelime");
        String actualAramaSonucu = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

        // sayfayı kapatın
        ReusableMethods.bekle(2);
        Driver.closeDriver();




    }
}
