package tests.day16_testNG_framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {

    @Test(groups = {"smoke","e2e2,1","regression"})
    public void nutellaTesti(){

        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // Nutella için arama yapalım
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuçlarının Nutella içerdiğini test edelim
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        // driver'ı kapatalım
        Driver.closeDriver();
    }
}
