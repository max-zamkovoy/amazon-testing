package components;

import org.openqa.selenium.WebDriver;

public abstract class FilterAbstract {

    public final WebDriver driver;

    public FilterAbstract(WebDriver driver) {
        this.driver = driver;
    }
}
