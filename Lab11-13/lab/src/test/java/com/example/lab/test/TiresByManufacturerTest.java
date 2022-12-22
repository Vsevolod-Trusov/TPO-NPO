package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresByManufacturerPage;
import com.example.lab.page.TiresByModelPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;

public class TiresByManufacturerTest {

    protected WebDriver driver;

    @BeforeEach
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

    @AfterEach
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
