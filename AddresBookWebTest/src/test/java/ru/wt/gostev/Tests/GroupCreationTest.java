package ru.wt.gostev.Tests;

import org.junit.Test;
import ru.wt.gostev.Model.GroupData;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.getNavigationHalper().gotoGroupPage();
        app.getGroupHelper().creationGroup(new GroupData("test1", "test2", "test3"));
    }

}
