package ru.wt.gostev.Tests;

import org.junit.Test;
import ru.wt.gostev.Model.GroupData;

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
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().modificationGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("mod1", "mod2", "mod3"));
        app.getGroupHelper().submitGroupModification();
    }
}
