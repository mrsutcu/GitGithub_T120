package tests.day17_testNGFramework_assertions;

import org.testng.annotations.Test;

public class C05_SoftAssert {

    @Test
    public void softAssertionTesti(){

          /*
        TestNG assertion konusunda da bize bir alternatif sunar

        TestNG iki farkli Assertion class'ina sahiptir

        1- Assert
            Bu JUnit'teki assertion ile bire bir aynidir.
            sadece isimlendirirken diger alternatif softAssert oldugundan
            Assert class'ina da HARD ASSERT denir

            hard assert karsilastigi ilk failed'da
            calismayi durdurur, dolayisiyla geriye kalan assertion'larin
            passed veya failed sonuclarindan hangisini alacagini BILEMEYIZ
        2- Sosf Assert
           Soft Assert biz raporla diyene kadar
           yaptigi tum testlerin sonuclarini kendisi tutar
           test passed de olsa failed de olsa calismaya devam eder

           ne zaman raporla dersek
           tum failed olanlari bize rapor eder ve calismayi durdurur

           eger hic failed olan yoksa
           class calismaya devam eder

           A- softAssert objesi olustur
           B- softAssert objesi ile testleri yap, aciklama eklemekte fayda var
           C- softAssert.assertAll() diyerek tum assertipon'lari raporla
              bu satiri yazmazsak, assertion'lar FAILED olsa bile test PASSED olur
     */




    }
}
