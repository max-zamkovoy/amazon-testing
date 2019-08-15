package core;

import domain.Range;
import org.apache.commons.lang3.StringUtils;

public class RangeParser {

    protected final String UNDER_RANGE = "Under";
    protected final String ABOVE_RANGE = "Above";

    public Range parse(String priceRange) {
        String unifiedRange = unifyRange(priceRange);
        Range range = new Range();
        range.setLeftBound(getLeftBound(unifiedRange));
        range.setRightBound(getRightBound(unifiedRange));
        return range;
    }

    protected double getLeftBound(String range) {
        return Double.parseDouble(range.replaceAll("(\\$)|(\\s(.*))", StringUtils.EMPTY));
    }

    protected double getRightBound(String range) {
        return Double.parseDouble(range.replaceAll(".*?\\$", StringUtils.EMPTY));
    }

    protected String unifyRange(String range) {
        return range
                .replace(UNDER_RANGE, "$0")
                .replace(ABOVE_RANGE, "$".concat(String.valueOf(Double.MAX_VALUE)));
    }
}
