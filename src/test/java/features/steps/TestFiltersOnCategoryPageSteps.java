package features.steps;

import components.Breadcrumbs;
import components.Filters;
import core.DriverInitializer;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.ReviewRating;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CategoryPage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFiltersOnCategoryPageSteps {

    private static final String URL = "https://www.amazon.com/s?i=computers-intl-ship&bbn=16225007011&" +
            "rh=n%3A16225007011%2Cn%3A13896617011";
    private WebDriver driver;
    private CategoryPage categoryPage;
    private Filters filters;

    @Before
    public void setUp() {
        driver = DriverInitializer.openChromeDriver();
        driver.get(URL);
        categoryPage = new CategoryPage(driver);
        filters = categoryPage.getFilters();
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @When("^select any subcategory in \"Department\"$")
    public void selectAnySubcategoryInDepartment() {
        filters.getDepartmentFilter().selectRandomSubcategory();
    }

    @And("^select rating no less than 3 stars in \"Avg. Customer Review\"$")
    public void selectRatingNoLessThanThreeStars() {
        filters.getCustomerReviewRatingFilter().selectCustomerReviewRating(ReviewRating.THREE);
    }

    @And("^check (\\S+) box in \"Featured Brands\"$")
    public void checkBrandBoxInFeaturedBrands(String brand) {
        filters.getFeaturedBrandsFilter().selectFeaturedBrands(brand);
    }

    @And("^select any range in \"Price\"$")
    public void selectRangeInPrice() {
        int price = 40;
        filters.getPriceFilter().selectPriceRange(price);
    }

    @And("^input range in \"Price\"$")
    public void inputRangeInPriceFields() {
        filters.getPriceFilter()
                .inputLeftBound(50)
                .inputRightBound(1000)
                .submitPriceRange();
    }

    @Then("^breadcrumbs have been updated$")
    public void checkBreadcrumbs() {
        Breadcrumbs breadcrumbs = categoryPage.getBreadcrumbs();
        String breadcrumbsText = breadcrumbs.convertBreadcrumbsToText(breadcrumbs.getBreadcrumbs());
        Pattern pattern = Pattern.compile("(Computers : Computers & Tablets :\\s\\w+\\s:\\s\\d Stars & Up : \\w+)");
        Matcher matcher = pattern.matcher(breadcrumbsText);
        Assert.assertTrue(matcher.find());
    }
}
