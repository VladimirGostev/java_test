package ru.wt.gostev.AppManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.wt.gostev.Model.AbonentDate;

/**
 * Created by VGostev on 15.05.2017.
 */
public class AbonentHelper extends HelperBase{
    protected NavigationHelper navigationHalper;
    public AbonentHelper(WebDriver wd) {
        super(wd);
    }

    public void fillAbonentForm(AbonentDate abonentDate, boolean creation) {
        type(By.name("firstname"),abonentDate.getFirstAbonentName());
        type(By.name("lastname"),abonentDate.getLastAbonentName());
        type(By.name("company"),abonentDate.getCompanyName());
        type(By.name("address"),abonentDate.getAddressAbonent());
        type(By.name("home"),abonentDate.getHomePhoneNumber());
        type(By.name("mobile"),abonentDate.getMobilePhoneNumber());
        type(By.name("work"),abonentDate.getWorkPhoneNumber());
        type(By.name("fax"),abonentDate.getFaxNumber());
        type(By.name("email"),abonentDate.getEmailAbonent());
        type(By.name("homepage"),abonentDate.getHomePageAbonent());

        if(creation){
            new Select(wd.findElement(By.name("new_group"))).
                    selectByVisibleText(abonentDate.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void submitAbonentCreation() {
        click(By.xpath("//input[@name='submit']"));
    }
    public void submitAbonentModification() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void creationAbonent(AbonentDate abonentDate, boolean b) {
        fillAbonentForm(abonentDate, true);
        submitAbonentCreation();
    }

    public boolean isTheAAbonent() {
        return isElementPresent(By.xpath(".//*[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
    }
}
