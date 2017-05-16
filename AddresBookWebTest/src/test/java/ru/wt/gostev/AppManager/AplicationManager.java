package ru.wt.gostev.AppManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;

/**
 * Created by VGostev on 03.05.2017.
 */
public class AplicationManager {
    private WebDriver wd;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHalper;
    private AbonentHelper  abonentHelper;
    private String browser;

    public AplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        }else if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }else if (browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHalper = new NavigationHelper(wd);
        abonentHelper = new AbonentHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }
    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHalper() {
        return navigationHalper;
    }

    public AbonentHelper getAbonentHelper() {
        return abonentHelper;
    }
}