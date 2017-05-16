package ru.wt.gostev.Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.BrowserType;
import ru.wt.gostev.AppManager.AplicationManager;

/**
 * Created by VGostev on 03.05.2017.
 */
public class TestBase {

    protected final AplicationManager app = new AplicationManager(BrowserType.IE);

    @Before
    public void setUp() throws Exception {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

    public AplicationManager getApp() {
        return app;
    }
}
