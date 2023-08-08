package com.socirank.Z_Extension;

import java.math.BigDecimal;

public class RoundOff {
    public static String customRound(Double value) {
        BigDecimal bigDecimalNumber = BigDecimal.valueOf(value);
        Integer intValue = bigDecimalNumber.intValue();
        BigDecimal decimalValue = bigDecimalNumber.subtract(BigDecimal.valueOf(intValue));

        if (decimalValue.compareTo(BigDecimal.valueOf(0.3)) > 0.3) {
            return String.valueOf(intValue + 1);
        }
        return String.valueOf(intValue);
    }
}
