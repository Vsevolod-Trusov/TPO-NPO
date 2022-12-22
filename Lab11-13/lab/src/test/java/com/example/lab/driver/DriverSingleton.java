package com.example.lab.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class DriverSingleton {
    //private static final String SELENOID_URI = "http://localhost:4444/wd/hub";
    private static WebDriver driver;
    //private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    private DriverSingleton(){}

    public static WebDriver getDriver(){
       /* if (webDriver.get() == null) {
            try {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                        capabilities.setCapability("browserName", "chrome");
                Map<String, Object> options = new HashMap<>();
                options.put("enableVNC", true);
                options.put("enableVideo", true);
                capabilities.setCapability("selenoid:options", options);
                webDriver.set(new RemoteWebDriver(URI.create(SELENOID_URI).toURL(), capabilities));
                webDriver.get().manage().window().maximize();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return webDriver.get();*/
        if (null == driver){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
