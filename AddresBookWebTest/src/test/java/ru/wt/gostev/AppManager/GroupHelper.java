package ru.wt.gostev.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.wt.gostev.Model.GroupData;

/**
 * Created by VGostev on 15.05.2017.
 */
public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returntoGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.xpath("//input[@name='new']"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void modificationGroup() {
        click(By.xpath("//input[@name='edit']"));
    }

    public void submitGroupModification() {
        click(By.xpath("//input[@name='update']"));
    }
}
