package ru.wt.gostev.Tests;

import org.junit.Assert;
import org.junit.Test;
import ru.wt.gostev.Model.AbonentDate;
import ru.wt.gostev.Model.GroupData;

import java.util.List;

/**
 * Created by VGostev on 18.05.2017.
 */
public class DeleteAbonenTest extends TestBase{

    @Test
    public void testDeleteAbonent(){
        if (! app.getAbonentHelper().isTheAAbonent()){
            app.getNavigationHalper().gotoAbonentPage();
            app.getAbonentHelper().creationAbonent(new AbonentDate("TestName", "TestLasrName",
                    "TestNameCompany", "dddff f22 asd2", "21246", "89005003020", "445556",
                    "485612", "first@mail.test", "www.test.ru", "test1"), true);
        }
        app.getAbonentHelper().timeOut();
        List<AbonentDate> before  = app.getAbonentHelper().getAbonentList();
        app.getAbonentHelper().selectAbonent(before.size() - 1);
        app.getAbonentHelper().clickButtonDeliteAbonent();
        app.getAbonentHelper().submitAlertWindows();
        List<AbonentDate> after = app.getAbonentHelper().getAbonentList();
        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }
}
