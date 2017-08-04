package ru.wt.gostev.AppManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.wt.gostev.Model.GroupData;
import java.util.ArrayList;
import java.util.List;

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

    public void selectGroup(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
     }

    public void modificationGroup() {
        click(By.xpath("//input[@name='edit']"));
    }

    public void submitGroupModification() {
        click(By.xpath("//input[@name='update']"));
    }

    public void creationGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returntoGroupPage();
    }

    public boolean isTheAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int countGroup() {
        return  wd.findElements(By.xpath("//span[@class='group']")).size();
    }

    public List<GroupData> getGroupList() {
        List<GroupData> groups = new ArrayList<GroupData>();
        List<WebElement> element = wd.findElements(By.name("selected[]"));
        for(WebElement elements : element){
           String name = elements.getText();
            GroupData group = new GroupData(name, null, null);
            groups.add(group);
        }
        return groups;
    }
}
