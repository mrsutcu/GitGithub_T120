package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartCardLink {
    public  SmartCardLink(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButonu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//a[@class='nav-link p-0 active']")
    public WebElement basariliGiris;
}
