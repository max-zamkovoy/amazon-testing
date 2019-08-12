package components;

import enums.ReviewRating;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerReviewRatingFilter {

    private final WebDriver driver;

    public CustomerReviewRatingFilter(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCustomerReviewRating(ReviewRating reviewRating) {
        String reviewRatingXpath = String.format("//*[contains(@class, 'a-star-medium-%s')]/parent::a",
                reviewRating.getRating());
        driver.findElement(By.xpath(reviewRatingXpath)).click();
    }
}
