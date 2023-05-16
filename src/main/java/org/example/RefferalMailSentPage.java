package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class RefferalMailSentPage extends Utils {
    public void productRefferedMailResult() {
        String s = getTextFromElement(By.xpath("//div[@class='result']"));
        //print msg
        System.out.println(s);
        Assert.assertEquals(s,"Your mail has been sent");

    }
}