package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    /*
        TestNG'de page class'ları
        sürekli kullandığımız bir sayfa/Websitesi'ndeki locate'leri ve
        ilgili sayfada kullanılacak login gibi basit method'ları bu içerir.

        TestNG page class'larindaki locate'lere erisim icin
        Test class'larinda page class'indan obje olusturulmasini benimsemistir.

     */
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
    public WebElement sonucYaziElementi;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//span[@class='a-size-large product-title-word-break']")
    public WebElement ilkUrunIsimElementi;


}
