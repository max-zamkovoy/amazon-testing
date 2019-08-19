package components;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FeaturedBrandsFilter extends FilterAbstract {

    public FeaturedBrandsFilter(WebDriver driver) {
        super(driver);
    }

    public void selectFirstFeaturedBrands() {
        List<WebElement> brands = getFeaturedBrands();
        if (CollectionUtils.isNotEmpty(brands)) {
            brands.iterator().next().click();
        }
    }

    public List<WebElement> getFeaturedBrands() {
        By brands = By.cssSelector("#brandsRefinements .s-navigation-item");
        return driver.findElements(brands);
    }
}
