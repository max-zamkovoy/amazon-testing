package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FeaturedBrandsFilter extends FilterAbstract {

    public FeaturedBrandsFilter(WebDriver driver) {
        super(driver);
    }

    public void selectFeaturedBrands(String brand) {
        driver.findElements(By.cssSelector("#brandsRefinements .s-navigation-item"))
                .stream()
                .filter(link -> link.getText().equalsIgnoreCase(brand))
                .findFirst()
                .ifPresent(WebElement::click);
    }
}
