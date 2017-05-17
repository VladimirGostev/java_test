package ru.wt.gostev.Tests;

import org.junit.Test;
import ru.wt.gostev.Model.AbonentDate;

/**
 * Created by VGostev on 16.05.2017.
 */
public class AbonentModificationTest extends TestBase{
    @Test
    public void testAbonentModification(){
        app.getNavigationHalper().gotoAbonentModificationPage();
        app.getAbonentHelper().fillAbonentForm(new AbonentDate("MOd", "MOd",
                "MOd", "MOd MOd MOd", "MOd", "MOd", "MOd",
                "MOd", "first@MOd.test", "www.MOd.ru", null),false);
        app.getAbonentHelper().submitAbonentModification();
    }
}
