package tests.day24_genelTekrar;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_iFrame {

    @Test
    public void iFrameTesti(){

        // 1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("webUniUrl"));

        // 2.“Our Products” butonuna basin
        WebUniPage webUniPage = new WebUniPage();

        // click yapmak istedigimiz ourproduct linki bir iframe içinde.
        // Öncelikle o iframe'i locate edip, geçiş yapmalıyız.
        Driver.getDriver().switchTo().frame(webUniPage.iFrameElementi);
        ReusableMethods.bekle(1);

        webUniPage.ourProductLinki.click();

        // 3.“Cameras product”i tiklayin
        webUniPage.camerasElementi.click();

        // 4.Popup mesajini yazdirin
        System.out.println(webUniPage.alertYaziElementi.getText());

        // 5.“close” butonuna basin
        webUniPage.alertKapatButonu.click();

        // 6.“WebdriverUniversity.com (IFrame)” linkini tiklayin
        // link anasayfada. Önce iFrame'den anasayfaya dönmeliyiz.
        Driver.getDriver().switchTo().defaultContent();
        webUniPage.webDriverLinki.click();

        // 7.“http://webdriveruniversity.com/index.html” adresine gittigini test edin
        String expectedUrl = "http://webdriveruniversity.com/index.html";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.bekle(2);
        Driver.closeDriver();




    }
}
