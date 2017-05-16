package ru.wt.gostev.Tests;

import org.junit.Test;
import ru.wt.gostev.Model.AbonentDate;

public class AbonentCreationTest extends TestBase {

    @Test
    public void testAbonentCreation(){

        app.getNavigationHalper().gotoAbonentPage();
        app.getAbonentHelper().fillAbonentForm(new AbonentDate("TestName", "TestLasrName",
                "TestNameCompany", "dddff f22 asd2", "21246", "89005003020", "445556",
                "485612", "first@mail.test", "www.test.ru"));
        app.getAbonentHelper().submitAbonentCreation();
    }

}
