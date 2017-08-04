package ru.wt.gostev.Tests;

import org.junit.Assert;
import org.junit.Test;
import ru.wt.gostev.Model.GroupData;

import java.util.List;

/**
 * Created by VGostev on 16.05.2017.
 */
public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHalper().gotoGroupPage();
        if (! app.getGroupHelper().isTheAGroup()){
            app.getGroupHelper().creationGroup(new GroupData("test1", "test2", "test3"));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().modificationGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("mod1", "mod2", null));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returntoGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());
    }
}
