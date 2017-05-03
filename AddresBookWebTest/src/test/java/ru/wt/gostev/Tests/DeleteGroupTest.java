package ru.wt.gostev.Tests;

import org.junit.Test;

public class DeleteGroupTest extends TestBase{

    @Test
    public void testDeleteGroup() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returntoGroupPage();
    }
}
