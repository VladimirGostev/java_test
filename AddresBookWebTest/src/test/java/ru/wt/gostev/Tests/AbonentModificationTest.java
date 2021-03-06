package ru.wt.gostev.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.wt.gostev.Model.AbonentDate;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by VGostev on 16.05.2017.
 */
public class AbonentModificationTest extends TestBase{
    @Test
    public void testAbonentModification(){
        if (! app.getAbonentHelper().isTheAAbonent()){
            app.getNavigationHalper().gotoAbonentPage();
            app.getAbonentHelper().creationAbonent(new AbonentDate("TestName", "TestLasrName",
                    "TestNameCompany", "dddff f22 asd2", "21246", "89005003020", "445556",
                    "485612", "first@mail.test", "www.test.ru", "test1"), true);
        }
        app.getAbonentHelper().timeOut();
        List<AbonentDate> before  = app.getAbonentHelper().getAbonentList();
        app.getAbonentHelper().selectAbonent(before.size() - 1);
        app.getNavigationHalper().gotoAbonentModificationPage();
        app.getAbonentHelper().fillAbonentForm(new AbonentDate("MOd", "MOd",
                "MOd", "MOd MOd MOd", "MOd", "MOd", "MOd",
                "MOd", "first@MOd.test", "www.MOd.ru", null),false);
        app.getAbonentHelper().submitAbonentModification();
        app.getNavigationHalper().gotoMainPage(By.xpath(".//*[@id='content']/div/i/a"));
        List<AbonentDate> after = app.getAbonentHelper().getAbonentList();
        Assert.assertEquals(before.size(), after.size());
    }
}
