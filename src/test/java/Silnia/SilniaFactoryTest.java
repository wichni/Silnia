package Silnia;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SilniaFactoryTest {

    private SilniaFactory factory = new SilniaFactory();

    @Test
    public void shouldProduceIterational() {
        //given
        final AlgorithmType type = AlgorithmType.ITERATIONAL;

        //when
        Silnia result = factory.produce(type);

        //then
        assertTrue(result instanceof Silnia);
        assertTrue(result instanceof SilniaIteration);
        assertFalse(result instanceof SilniaRecursive);
    }

    @Test
    public void shouldProduceRecursive(){
        //given
        final AlgorithmType type = AlgorithmType.RECURSIVE;

        //when
        Silnia result = factory.produce(type);

        //then
        assertTrue(result instanceof Silnia);
        assertFalse(result instanceof SilniaIteration);
        assertTrue(result instanceof SilniaRecursive);
    }
}
