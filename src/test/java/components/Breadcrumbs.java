package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Breadcrumbs {

    public static final String  BREADCRUMBS_SEPARATOR = " : ";

    public final WebDriver driver;

    public Breadcrumbs(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getBreadcrumbs() {
        By breadcrumbs = By.cssSelector(".s-breadcrumb a");
        return driver.findElements(breadcrumbs);
    }

    public String convertBreadcrumbsToText(List<WebElement> breadcrumbs) {
        StringBuilder builder = new StringBuilder();
        int lastElementIndex = breadcrumbs.size() - 1;
        for (int i = 0; i <= lastElementIndex; i++) {
            builder.append(getTextFromBreadcrumb(breadcrumbs.get(i)));
            if (i != lastElementIndex) {
                builder.append(BREADCRUMBS_SEPARATOR);
            }
        }
        return builder.toString();
    }

    public String getTextFromBreadcrumb(WebElement breadcrumbLink) {
        return breadcrumbLink.findElement(By.tagName("span")).getText();
    }
}
