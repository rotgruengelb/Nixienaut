package net.rotgruengelb.nixienaut;

public class ClampedNum<T extends Comparable<T>> {
    private final T minValue;
    private final T maxValue;
    private T value;

    public ClampedNum(T minValue, T maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) throws IllegalArgumentException {
        if (value.compareTo(minValue) < 0 || value.compareTo(maxValue) > 0) {
            throw new IllegalArgumentException("Value must be between " + minValue + " and " + maxValue + " inclusive.");
        }
        this.value = value;
    }
}