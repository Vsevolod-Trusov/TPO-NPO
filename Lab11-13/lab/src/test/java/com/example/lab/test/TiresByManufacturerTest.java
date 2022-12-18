package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresByManufacturerPage;
import com.example.lab.page.TiresByModelPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TiresByManufacturerTest {

    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void whenGetTiresThenGetOneElement() throws InterruptedException {
        TiresByManufacturerPage tiresByManufacturerPage = new TiresByManufacturerPage(driver);
        tiresByManufacturerPage
                .openPage("https://bel-shina.by/legkovyie")
                .clickOnParameterButton()
                .clickOnManufacturerLink();
        Assert.assertEquals("Всего результатов: 3",
                tiresByManufacturerPage.getResultText());
    }

    @After
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
