package ru.wt.gostev.AppManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.wt.gostev.Model.AbonentDate;
import ru.wt.gostev.Model.GroupData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
        return isElementPresent(By.name("selected[]"));
    }

    public  void timeOut(){
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public int countAbonent() {
        return wd.findElements(By.xpath("//input[@name='selected[]']")).size();
    }

    public void selectAbonent(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void clickButtonDeliteAbonent() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void submitAlertWindows() {
        wd.switchTo().alert().accept();
    }

    public List<AbonentDate> getAbonentList() {
        List<AbonentDate> abonents = new ArrayList<AbonentDate>();
        List<WebElement> element = wd.findElements(By.name("selected[]"));
        for(WebElement elements : element){
            String firstname = elements.getText();
            AbonentDate abonent = new AbonentDate(firstname,
                    null, null, null,
                    null, null,
                    null, null, null,
                    null, null );
            abonents.add(abonent);
        }
        return abonents;
    }

}
