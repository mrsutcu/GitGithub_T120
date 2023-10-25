package tests.day19.testNGreports_crossBrowserTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_RaporluNegatifLoginTesti extends TestBaseRapor {

    QualitydemyPage qualitydemyPage;

    @Test
    public void gecersizPasswordTest(){
        extentTest = extentReports.createTest("gecersiz Password Test","Kullanıcı gecersiz password ve gecerli username ile giris yapamamalı");
        Driver.getDriver().get("https://www.qualitydemy.com/");
        extentTest.info("Kullanıcı qualitydemy nasayfaysına gider");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("ilk sayfadaki login linline tıklar");

        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        extentTest.info("username olarak gecerli username yazar");

        qualitydemyPage.passwordKutusu.sendKeys("12345");
        extentTest.info("password olarak gecersiz password yazar");

        qualitydemyPage.coockieButtonu.click();
        ReusableMethods.bekle(2);
        extentTest.info("cookie butonuna basar");


        qualitydemyPage.loginButonu.click();
        extentTest.info("login butonuna basar");

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapılamadıgını test eder");

        Driver.closeDriver();
        extentTest.info("sayfayı kapatır");
    }

    @Test
    public void gecersizEmailTesti(){
        extentTest = extentReports.createTest("gecersiz Email Test","Kullanıcı gecerli password ve gecersiz username ile giris yapamamalı");
        Driver.getDriver().get("https://www.qualitydemy.com/");
        extentTest.info("Kullanıcı qualitydemy nasayfaysına gider");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("ilk sayfadaki login linline tıklar");

        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        extentTest.info("username olarak gecersiz username yazar");

        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        extentTest.info("password olarak gecerli password yazar");

        qualitydemyPage.coockieButtonu.click();
        ReusableMethods.bekle(2);
        extentTest.info("cookie butonuna basar");

        qualitydemyPage.loginButonu.click();
        extentTest.info("login butonuna basar");

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapılamadıgını test eder");

        Driver.closeDriver();
        extentTest.info("sayfayı kapatır");
    }

    @Test
    public void gecersizEmailPasswordTesti(){
        extentTest = extentReports.createTest("gecersiz Email ve Password Test","Kullanıcı gecersiz password ve gecersiz username ile giris yapamamalı");
        Driver.getDriver().get("https://www.qualitydemy.com/ ");
        extentTest.info("Kullanıcı qualitydemy nasayfaysına gider");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("ilk sayfadaki login linline tıklar");

        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        extentTest.info("username olarak gecersiz username yazar");

        qualitydemyPage.passwordKutusu.sendKeys("12345");
        extentTest.info("password olarak gecersiz password yazar");

        qualitydemyPage.coockieButtonu.click();
        ReusableMethods.bekle(2);
        extentTest.info("cookie butonuna basar");

        qualitydemyPage.loginButonu.click();
        extentTest.info("login butonuna basar");

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapılamadıgını test eder");

        Driver.closeDriver();
        extentTest.info("sayfayı kapatır");
    }
}
