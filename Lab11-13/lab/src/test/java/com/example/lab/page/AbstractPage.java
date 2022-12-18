package com.example.lab.page;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage
{
	protected WebDriver driver;

	protected abstract AbstractPage openPage(String uri);
	protected final int WAIT_TIMEOUT_SECONDS = 10;

	protected AbstractPage(WebDriver driver)
	{
		this.driver = driver;
	}
}
