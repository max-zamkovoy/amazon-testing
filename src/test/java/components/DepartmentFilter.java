package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Utils;

import java.util.List;

public class DepartmentFilter extends FilterAbstract {

    public DepartmentFilter(WebDriver driver) {
        super(driver);
    }

    public void selectRandomSubcategory() {
        Utils.selectRandom(getSubcategories(), driver);
    }

    public List<WebElement> getSubcategories() {
        By subcategories = By.cssSelector(".s-navigation-indent-2 .s-navigation-item");
        return driver.findElements(subcategories);
    }
}
