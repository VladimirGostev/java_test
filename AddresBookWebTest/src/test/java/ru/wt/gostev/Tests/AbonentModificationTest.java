package ru.wt.gostev.Tests;

import org.junit.Test;
import ru.wt.gostev.Model.AbonentDate;
import ru.wt.gostev.Model.GroupData;

/**
 * Created by VGostev on 16.05.2017.
 */
public class AbonentModificationTest extends TestBase{
    @Test
    public void testAbonentModification(){
        //app.getNavigationHalper().gotoAbonentModificationPage();
        if (! app.getAbonentHelper().isTheAAbonent()){
            app.getNavigationHalper().gotoAbonentPage();
            app.getAbonentHelper().creationAbonent(new AbonentDate("TestName", "TestLasrName",
                    "TestNameCompany", "dddff f22 asd2", "21246", "89005003020", "445556",
                    "485612", "first@mail.test", "www.test.ru", "mod1"), true);
        }
        app.getNavigationHalper().gotoAbonentModificationPage();
        app.getAbonentHelper().fillAbonentForm(new AbonentDate("MOd", "MOd",
                "MOd", "MOd MOd MOd", "MOd", "MOd", "MOd",
                "MOd", "first@MOd.test", "www.MOd.ru", null),false);
        app.getAbonentHelper().submitAbonentModification();
    }
}
