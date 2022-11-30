package base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public abstract class BasePage {
    protected final Duration WAIT_TIMEOUT_SECONDS = Duration.ofSeconds(10);
    protected WebDriver driver;
    protected BasePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected abstract BasePage openPage();
}
