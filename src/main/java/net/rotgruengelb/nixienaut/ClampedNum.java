package net.rotgruengelb.nixienaut;

/**
 * A number that is clamped between a minimum and a maximum value.
 *
 * @param <T> The type of the number.
 */
public class ClampedNum<T extends Comparable<T>> {
    private final T minValue;
    private final T maxValue;
    private T value;

    /**
     * Creates a new ClampedNum object.
     *
     * @param minValue The minimum value.
     * @param maxValue The maximum value.
     * @see ClampedNum#setValue(T)
     * @see ClampedNum#adjustAndSetValue(T)
     */
    public ClampedNum(T minValue, T maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /**
     * Gets the minimum value.
     *
     * @return The minimum value.
     */
    public T getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value The value to set.
     * @throws IllegalArgumentException If the value is out of range.
     * @see ClampedNum#adjustAndSetValue(T)
     * @see ClampedNum#getValue()
     */
    public void setValue(T value) throws IllegalArgumentException {
        if (value.compareTo(minValue) < 0 || value.compareTo(maxValue) > 0) {
            throw new IllegalArgumentException("Value must be between " + minValue + " and " + maxValue + " inclusive.");
        }
        this.value = value;
    }


    /**
     * Sets the value and clamps it if it is out of range.
     *
     * @param value The value to set.
     * @see ClampedNum#setValue(T)
     * @see ClampedNum#getValue()
     */
    public void adjustAndSetValue(T value) {
        if (value.compareTo(minValue) < 0) {
            this.value = minValue;
        } else if (value.compareTo(maxValue) > 0) {
            this.value = maxValue;
        } else {
            this.value = value;
        }
    }


    /**
     * Gets the minimum value.
     *
     * @return The minimum value.
     * @see ClampedNum#getMaxValue()
     */
    public T getMinValue() {
        return minValue;
    }

    /**
     * Gets the maximum value.
     *
     * @return The maximum value.
     * @see ClampedNum#getMinValue()
     */
    public T getMaxValue() {
        return maxValue;
    }
}