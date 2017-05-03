package ru.wt.gostev;

import org.junit.Test;

public class DeleteGroup extends TestBase{

    @Test
    public void testDeleteGroup() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returntoGroupPage();
    }
}
