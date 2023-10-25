package tests.day19.testNGreports_crossBrowserTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_QualitydemyCokluNegatifLoginTesti {

    @DataProvider
    public static Object[][] gecersizKullaniciListesi() {

        String[][] gecersizKullaniciBilgileri = {{"ahmet","12345"},{"Ugur","98658"},{"Nergiz","65432"},{"Mehmet","98365"},{"Hasan","78250"}};
        return gecersizKullaniciBilgileri;
    }

    @Test (dataProvider = "gecersizKullaniciListesi")
    public void cokluNegatifTest(String username , String password){

        // qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // ilk login linkine tıklayın
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // verilen gecersiz kullanıcı adı ve sifreleri listesindeki
        // 5 isim ve sifre için giris yapılamadığını test edin
        qualitydemyPage.emailKutusu.sendKeys(username);
        qualitydemyPage.passwordKutusu.sendKeys(password);
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        // sayfayı kapatın
        Driver.closeDriver();
    }
}
