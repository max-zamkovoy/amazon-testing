package components;

import enums.ReviewRating;
import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomerReviewRatingFilter {

    private final WebDriver driver;

    public CustomerReviewRatingFilter(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCustomerReviewRating(ReviewRating reviewRating) {
        WebElement ratingLink = getRatingLink(reviewRating);
        if (ratingLink != null) {
            ratingLink.click();
        }
    }

    public WebElement getRatingLink(ReviewRating reviewRating) { // TODO: SIMPLIFY BY USING CSS SELECTORS
        WebElement ratingLink = null;
        List<WebElement> ratings = getCustomerReviewRating();
        if (CollectionUtils.isNotEmpty(ratings)) {
            By ratingTag = By.cssSelector(String.format(".a-star-medium-%s", reviewRating.getRating()));
            ratingLink = ratings
                    .stream()
                    .filter(element -> CollectionUtils.isNotEmpty(element.findElements(ratingTag)))
                    .findAny()
                    .orElse(null);
        }
        return ratingLink;
    }

    public List<WebElement> getCustomerReviewRating() {
        By customerReviewRating = By.cssSelector("#reviewsRefinements .s-navigation-item");
        return driver.findElements(customerReviewRating);
    }
}
