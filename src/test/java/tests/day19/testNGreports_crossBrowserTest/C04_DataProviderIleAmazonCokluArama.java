package tests.day19.testNGreports_crossBrowserTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProviderIleAmazonCokluArama {

    // String[] aranacakUrunler = {"Nutella","Java","Armut","elma","Erik","Malatya"};

    @Test
    public void amazonCokluAramaTesti(String urun){
        // amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // verilen listedeki her bir urun icin arama yaptirin
        // her urun icin bulunan sonuc sayisinin 1000'den fazla oldugunu test edin
        AmazonPage amazonPage = new AmazonPage();
        String aramaSonucu;
        String[] aramaSonucKelimeleri;
        String aramasonucSayisiStr;
        int aramaSonucSayisiInt;

        amazonPage.aramaKutusu.clear();
        amazonPage.aramaKutusu.sendKeys(urun + Keys.ENTER);

        aramaSonucu = amazonPage.sonucYaziElementi.getText();
        aramaSonucKelimeleri = aramaSonucu.split(" ");

        if (aramaSonucKelimeleri[2].equals("over")){
            aramasonucSayisiStr = aramaSonucKelimeleri[3];
        }else{
            aramasonucSayisiStr = aramaSonucKelimeleri[2];
        }

        aramasonucSayisiStr = aramasonucSayisiStr.replaceAll("\\D","");
        aramaSonucSayisiInt = Integer.parseInt(aramasonucSayisiStr);
        Assert.assertTrue(aramaSonucSayisiInt>100);

    }

}
