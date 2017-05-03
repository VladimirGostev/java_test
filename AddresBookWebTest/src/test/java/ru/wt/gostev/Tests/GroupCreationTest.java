package ru.wt.gostev.Tests;

import org.junit.Test;
import ru.wt.gostev.Model.GroupData;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.returntoGroupPage();
    }

}
