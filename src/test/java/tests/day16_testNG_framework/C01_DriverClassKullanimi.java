package tests.day16_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverClassKullanimi {

    @Test(groups = "smoke")
    public void amazonTest(){

        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // nutella için arama yapalım
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // ilk ürüne click yapıp yapalım
        Driver.getDriver().findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();

        // sayfayı kapatın
        Driver.closeDriver();
    }

    @Test (groups = {"smoke","regression"})
    public void youtubeTesti(){

        Driver.getDriver().get("https://www.youtube.com");
    }


}
