package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Utils;

import java.util.List;

public class FeaturedBrandsFilter {

    private final WebDriver driver;

    public FeaturedBrandsFilter(WebDriver driver) {
        this.driver = driver;
    }

    public void selectRandomFeaturedBrands() {
        Utils.selectRandom(getFeaturedBrands());
    }

    public List<WebElement> getFeaturedBrands() {
        By brands = By.cssSelector("#brandsRefinements .s-navigation-item");
        return driver.findElements(brands);
    }
}