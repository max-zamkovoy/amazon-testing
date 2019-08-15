package components;

import core.RangeParser;
import domain.Range;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class PriceFilter extends FilterAbstract {

    public PriceFilter(WebDriver driver) {
        super(driver);
    }

    public void selectPriceRange(double price) {
        getPriceRanges().forEach((k, v) -> {
            if (k.isInRange(price)) {
                v.click();
            }
        });
    }

    public Map<Range, WebElement> getPriceRanges() {
        Map<Range, WebElement> priceRanges = new HashMap<>();
        RangeParser rangeParser = new RangeParser();
        By priceRange = By.cssSelector("#priceRefinements .s-navigation-item");
        driver.findElements(priceRange)
                .forEach(priceLink -> priceRanges.put(rangeParser.parse(getTextPriceRange(priceLink)), priceLink));
        return priceRanges;
    }

    private String getTextPriceRange(WebElement price) {
        return price.findElement(By.tagName("span")).getText();
    }
}
