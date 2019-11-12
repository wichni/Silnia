package Silnia;

import java.math.BigDecimal;

public interface Silnia {
    BigDecimal getN(int n);

    default void validateArgument(int n){
        if (n < 0) {
            throw new SilniaArgumentException("Value must be positive");
        }
    }
}
