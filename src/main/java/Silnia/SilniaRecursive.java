package Silnia;

import java.math.BigDecimal;

public class SilniaRecursive implements Silnia {

    @Override
    public BigDecimal getN(int n) {

        validateArgument(n);

        if (n == 1) {
            return new BigDecimal(1);
        } else {
            return new BigDecimal(n).multiply(getN(n - 1));
        }
    }
}