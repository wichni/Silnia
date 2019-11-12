package Silnia;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class SilniaRecursiveTest {

    private Silnia silnia = new SilniaRecursive();

        @Test
        public void shouldReturn120WhenSilniaIs5() {
            //given
            final int n = 5;
            final BigDecimal expectedValue = new BigDecimal(120);

            //when
            BigDecimal result = silnia.getN(n);

            //then
            assertEquals(expectedValue, result);
        }
}