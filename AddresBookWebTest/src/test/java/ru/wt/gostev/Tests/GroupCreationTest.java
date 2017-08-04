package ru.wt.gostev.Tests;

import org.junit.Assert;
import org.junit.Test;
import ru.wt.gostev.Model.GroupData;

import java.util.List;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.getNavigationHalper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().creationGroup(new GroupData("test1", "test2", "test3"));
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
