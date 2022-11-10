package Gun01;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
  3- Newsletter  Subscribe işlemini abonelikten çıkınız(NO)
  4- Newsletter  Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapınız.
 */

import Utils.BaseDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_SubscribeNewsLetter extends BaseDriver {

    By link=By.linkText("Newsletter");
    By yes=By.cssSelector("[type='radio'][value='1']");
    By no=By.cssSelector("[type='radio'][value='0']");
    By cnt=By.cssSelector("[value='Continue']");

    @Test(priority = 1)
    void subscribeFunctionYes()
    {
        WebElement newsLetterLink=driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(yes);
        subscribeYes.click();

        WebElement continueButton=driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 2)
    void subscribeFunctionNo() {
        WebElement newsLetterLink=driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeNo=driver.findElement(no);
        subscribeNo.click();

        WebElement continueButton=driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 3)
    void subscribeFunctionForBoth() {
        WebElement newsLetterLink=driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(yes);
        WebElement subscribeNo=driver.findElement(no);

        if (subscribeYes.isSelected())
            subscribeNo.click();
        else
            subscribeYes.click();

        WebElement continueButton=driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();
    }

}
