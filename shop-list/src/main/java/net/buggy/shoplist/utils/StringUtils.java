package net.buggy.shoplist.utils;


import java.math.BigDecimal;
import java.text.DecimalFormat;

public class StringUtils {

    private static final DecimalFormat BIG_DECIMAL_FORMAT;

    static {
        BIG_DECIMAL_FORMAT = new DecimalFormat();
        BIG_DECIMAL_FORMAT.setMaximumFractionDigits(5);
        BIG_DECIMAL_FORMAT.setMinimumFractionDigits(0);
        BIG_DECIMAL_FORMAT.setGroupingUsed(false);
    }

    public static boolean equalIgnoreCase(String s1, String s2) {
        //noinspection StringEquality
        if (s1 == s2) {
            return true;
        }

        if (s1 == null) {
            return false;
        }

        return s1.equalsIgnoreCase(s2);
    }

    public static String toString(BigDecimal bigDecimal) {
        return BIG_DECIMAL_FORMAT.format(bigDecimal);
    }
}
