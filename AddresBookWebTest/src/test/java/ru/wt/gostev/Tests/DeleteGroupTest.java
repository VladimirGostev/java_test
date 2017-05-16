package ru.wt.gostev.Tests;

import org.junit.Test;

public class DeleteGroupTest extends TestBase{

    @Test
    public void testDeleteGroup() {
        app.getNavigationHalper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returntoGroupPage();
    }
}
