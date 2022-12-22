package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresSortByDate;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
@Execution(ExecutionMode.CONCURRENT)
public class TiresSortByDateTest {
    protected WebDriver driver;

    @BeforeEach
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

    @AfterEach
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
