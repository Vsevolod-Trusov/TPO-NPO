package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresSortByDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TiresSortByDateTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void whenGetTiresThenGetSortedCollection() throws InterruptedException {
        TiresSortByDate tiresSortByDate = new TiresSortByDate(driver);
        tiresSortByDate
                .openPage("https://bel-shina.by/legkovyie")
                .clickOnDateButton();
        assertThat("Белшина Artmotion Snow Бел-307 195/60R15 88T",
                is(equalTo(tiresSortByDate.getResultText())));
    }

    @After
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
