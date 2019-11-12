package Silnia;

public class SilniaFactory {

    public Silnia produce(AlgorithmType type) {
        if (AlgorithmType.RECURSIVE.equals(type)) {
            return new SilniaRecursive();
        }
        if (AlgorithmType.ITERATIONAL.equals(type)) {
            return new SilniaIteration();
        }
        return null;
    }
}
