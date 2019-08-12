package components;

import org.openqa.selenium.WebDriver;

public class Filters {

    private DepartmentFilter departmentFilter;
    private CustomerReviewRatingFilter customerReviewRatingFilter;
    private FeaturedBrandsFilter featuredBrandsFilter;

    public Filters(WebDriver driver) {
        this.departmentFilter = new DepartmentFilter(driver);
        this.customerReviewRatingFilter = new CustomerReviewRatingFilter(driver);
        this.featuredBrandsFilter = new FeaturedBrandsFilter(driver);
    }

    public DepartmentFilter getDepartmentFilter() {
        return departmentFilter;
    }

    public CustomerReviewRatingFilter getCustomerReviewRatingFilter() {
        return customerReviewRatingFilter;
    }

    public FeaturedBrandsFilter getFeaturedBrandsFilter() {
        return featuredBrandsFilter;
    }
}
