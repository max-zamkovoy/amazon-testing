package components;

import java.util.Objects;

public class Range {

    private double leftBound;
    private double rightBound;

    public double getLeftBound() {
        return leftBound;
    }

    public void setLeftBound(double leftBound) {
        this.leftBound = leftBound;
    }

    public double getRightBound() {
        return rightBound;
    }

    public void setRightBound(double rightBound) {
        this.rightBound = rightBound;
    }

    public boolean isInRange(double num) {
        return getLeftBound() <= num && num <= getRightBound();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Range range = (Range) o;
        return Double.compare(range.leftBound, leftBound) == 0 &&
                Double.compare(range.rightBound, rightBound) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftBound, rightBound);
    }
}
