package enums;

public enum ReviewRating {

    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5");

    public String rating;

    ReviewRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
}
