package features.steps;

import core.DriverInitializer;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import enums.ReviewRating;
import org.openqa.selenium.WebDriver;
import pages.CategoryPage;

public class TestFiltersOnCategoryPageSteps {

    private static final String URL = "https://www.amazon.com/s?i=computers-intl-ship&bbn=16225007011&" +
            "rh=n%3A16225007011%2Cn%3A13896617011";
    private WebDriver driver;
    private CategoryPage categoryPage;

    @Before
    public void setUp() {
        driver = DriverInitializer.openChromeDriver();
        driver.get(URL);
        categoryPage = new CategoryPage(driver);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @When("^select any subcategory in \"Department\"$")
    public void selectAnySubcategoryInDepartment() {
        categoryPage.getFilters().getDepartmentFilter().selectRandomSubcategory();
    }

    @And("^select rating no less than 3 stars in \"Avg. Customer Review\"$")
    public void selectRatingNoLessThanThreeStars() {
        categoryPage.getFilters().getCustomerReviewRatingFilter().selectCustomerReviewRating(ReviewRating.THREE);
    }

}
