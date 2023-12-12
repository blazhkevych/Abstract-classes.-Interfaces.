package Tasks.T6;

import Tasks.Validator;

import java.util.Arrays;

/**
 * The Array class represents an array of integers and implements the IMath interface.
 */
public class Array implements IMath {
    private int[] elements;

    /**
     * Constructs an Array object with the given array of integers.
     *
     * @param elements The array of integers to be used in the calculations.
     * @throws IllegalArgumentException If the array is empty.
     */
    public Array(int[] elements) {
        Validator.validateArrayNotEmpty(elements, "Array is empty");
        this.elements = elements;
    }

    /**
     * Calculates and returns the maximum value among the elements.
     *
     * @return The maximum value in the array.
     */
    @Override
    public int Max() {
        return Arrays.stream(elements).max().orElseThrow();
    }

    /**
     * Calculates and returns the minimum value among the elements.
     *
     * @return The minimum value in the array.
     */
    @Override
    public int Min() {
        return Arrays.stream(elements).min().orElseThrow();
    }

    /**
     * Calculates and returns the average (arithmetic mean) of the elements.
     *
     * @return The average value of the array.
     */
    @Override
    public float Avg() {
        return (float) Arrays.stream(elements).average().orElseThrow();
    }
}
