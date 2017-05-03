package ru.wt.gostev;

import org.junit.Test;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returntoGroupPage();
    }

}
