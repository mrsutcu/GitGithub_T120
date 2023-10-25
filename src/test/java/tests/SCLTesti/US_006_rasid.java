package tests.SCLTesti;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartCardLink;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_rasid {

    SmartCardLink smartCardLink;

    @Test
    public void gecersizPassword() {


        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        smartCardLink = new SmartCardLink();

        smartCardLink.signInButonu.click();

        // doğru email - yanlış password ile giris yapar
        smartCardLink.emailKutusu.sendKeys("angelamerkel@hotmail.de" + Keys.ENTER);
        smartCardLink.passwordKutusu.sendKeys("1111111Ae." + Keys.ENTER);
        ReusableMethods.bekle(1);
        smartCardLink.loginButonu.click();
        Assert.assertTrue(smartCardLink.passwordKutusu.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void gecersizEmailPassword() {

        // yanlış email - yanlış password ile giriş yapar
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        smartCardLink = new SmartCardLink();
        smartCardLink.signInButonu.click();

        smartCardLink.emailKutusu.sendKeys("leopardgl65@hotmail.de" + Keys.ENTER);
        smartCardLink.passwordKutusu.sendKeys("1111111Ae." + Keys.ENTER);
        ReusableMethods.bekle(1);
        smartCardLink.loginButonu.click();
        Assert.assertTrue(smartCardLink.passwordKutusu.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void gecersizEmail() {

        // yanlış email - doğru password ile giriş yapar
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        smartCardLink = new SmartCardLink();
        smartCardLink.signInButonu.click();

        smartCardLink.emailKutusu.sendKeys("leopardgl65@hotmail.de" + Keys.ENTER);
        smartCardLink.passwordKutusu.sendKeys("1234567Am." + Keys.ENTER);
        ReusableMethods.bekle(1);
        smartCardLink.loginButonu.click();
        Assert.assertTrue(smartCardLink.passwordKutusu.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void gecerliEmailPassword() {

        // doğru email - doğru password ile giriş yapar
        Driver.getDriver().get(ConfigReader.getProperty("sclUrl"));
        smartCardLink = new SmartCardLink();
        smartCardLink.signInButonu.click();

        smartCardLink.emailKutusu.sendKeys("angelamerkel@hotmail.de" + Keys.ENTER);
        smartCardLink.passwordKutusu.sendKeys("1234567am." + Keys.ENTER);
        //ReusableMethods.bekle(1);
        smartCardLink.loginButonu.click();
        ReusableMethods.bekle(1);
        smartCardLink.basariliGiris.click();

        //Driver.closeDriver();
    }
}
