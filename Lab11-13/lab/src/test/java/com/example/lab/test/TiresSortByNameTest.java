package com.example.lab.test;

import com.example.lab.driver.DriverSingleton;
import com.example.lab.page.TiresForCargoCarsPage;
import com.example.lab.page.TiresSortByName;
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
public class TiresSortByNameTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    public void whenGetTiresThenGetSortedCollection() throws InterruptedException {
        TiresSortByName tiresSortByName = new TiresSortByName(driver);
        tiresSortByName
                .openPage("https://bel-shina.by/legkovyie")
                .clickOnNameButton();
        assertThat("Aeolus Neo Allroads D+ 315/70R22.5 154/150L",
                is(equalTo(tiresSortByName.getResultText())));
    }

    @AfterEach
    public void clearResources() {
        DriverSingleton.closeDriver();
    }
}
