package com.tk.qa.Base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.io.File;

public interface TakesScreenshot {

    File getScreenshotAs(OutputType<File> file);
}
