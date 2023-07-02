package tests.selenide;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.selenidePages.DynamicLoadingPageHW;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class DynamicLoadingTestHW {
    @Test
    public void dynamicLoadingTest1() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.savePageSource = false;

        DynamicLoadingPageHW dynamicLoadingPage = new DynamicLoadingPageHW();
        dynamicLoadingPage.openDynamicLoadingPage("/dynamic_loading/1");

        dynamicLoadingPage.waitForContent();

        assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!");
    }

    @Test
    public void dynamicLoadingTest2() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.savePageSource = false;

        DynamicLoadingPageHW dynamicLoadingPage = new DynamicLoadingPageHW();
        dynamicLoadingPage.openDynamicLoadingPage("/dynamic_loading/2");

        dynamicLoadingPage.waitForContent();

        assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!");
    }
}