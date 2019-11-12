package Silnia;

import java.math.BigDecimal;

public class SilniaIteration implements Silnia {

    @Override
    public BigDecimal getN(int n) {

        validateArgument(n);

        BigDecimal result = new BigDecimal(1);

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }
        return result;
    }
}