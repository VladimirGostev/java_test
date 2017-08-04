package ru.wt.gostev.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.wt.gostev.Model.AbonentDate;
import ru.wt.gostev.Model.GroupData;

import java.util.List;


public class AbonentCreationTest extends TestBase {

    @Test
    public void testAbonentCreation(){
        List<AbonentDate> before = app.getAbonentHelper().getAbonentList();
        app.getNavigationHalper().gotoAbonentPage();
        app.getAbonentHelper().fillAbonentForm(new AbonentDate("TestName", "TestLasrName",
                "TestNameCompany", "dddff f22 asd2", "21246", "89005003020", "445556",
                "485612", "first@mail.test", "www.test.ru", "test1"), true);
        app.getAbonentHelper().submitAbonentCreation();
        app.getNavigationHalper().gotoMainPage(By.xpath(".//*[@id='content']/div/i/a[2]"));
        List<AbonentDate> after = app.getAbonentHelper().getAbonentList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
