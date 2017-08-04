package ru.wt.gostev.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by VGostev on 15.05.2017.
 */
public class NavigationHelper extends HelperBase{
    protected GroupHelper groupHelper;

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void gotoAbonentPage() {
        click(By.linkText("add new"));
    }

    public void gotoAbonentModificationPage() {
        click(By.xpath(".//*[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void gotoMainPage(By xpath) {
        click(xpath);
    }
}
