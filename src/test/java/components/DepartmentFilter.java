package components;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class DepartmentFilter {

    private final WebDriver driver;

    public DepartmentFilter(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRandomSubcategory() {
        List<WebElement> subcategories = getSubcategories();
        if (CollectionUtils.isNotEmpty(subcategories)) {
            int randomSubcategoryIndex = new Random().nextInt(subcategories.size());
            subcategories.get(randomSubcategoryIndex).click();
        }
    }

    public List<WebElement> getSubcategories() {
        By subcategories = By.cssSelector(".s-navigation-indent-2 .s-navigation-item");
        return driver.findElements(subcategories);
    }
}
