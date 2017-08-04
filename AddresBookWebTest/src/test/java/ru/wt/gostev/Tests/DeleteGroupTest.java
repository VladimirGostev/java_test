package ru.wt.gostev.Tests;

import org.junit.Assert;
import org.junit.Test;
import ru.wt.gostev.Model.GroupData;

import java.util.List;

public class DeleteGroupTest extends TestBase{

    @Test
    public void testDeleteGroup() {
        app.getNavigationHalper().gotoGroupPage();
        if (! app.getGroupHelper().isTheAGroup()){
            app.getGroupHelper().creationGroup(new GroupData("test1", "test2", "test3"));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returntoGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(after, before);

    }
}
