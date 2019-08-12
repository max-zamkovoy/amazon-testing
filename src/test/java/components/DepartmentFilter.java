package components;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Utils;

import java.util.List;

public class DepartmentFilter {

    private final WebDriver driver;

    public DepartmentFilter(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRandomSubcategory() {
        Utils.selectRandom(getSubcategories());
    }

    public List<WebElement> getSubcategories() {
        By subcategories = By.cssSelector(".s-navigation-indent-2 .s-navigation-item");
        return driver.findElements(subcategories);
    }
}
