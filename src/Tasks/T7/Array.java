package Tasks.T7;

import Tasks.T6.IMath;
import Tasks.Validator;

import java.util.Arrays;

/**
 * The Array class represents an array of integers and implements the IMath interface.
 */
public class Array implements IMath, ISort {
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

    /**
     * Sorts the array in ascending order.
     */
    @Override
    public void SortAsc() {
        Arrays.sort(elements);
    }

    /**
     * Sorts the array in descending order.
     */
    @Override
    public void SortDesc() {
        Arrays.sort(elements);
        reverseArray();
    }

    /**
     * Reverses the order of elements in the array.
     */
    private void reverseArray() {
        int[] reversedArray = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            reversedArray[i] = elements[elements.length - 1 - i];
        }
        elements = reversedArray;
    }

    /**
     * Gets the array of elements.
     *
     * @return The array of integers.
     */
    public int[] getElements() {
        return elements;
    }
}
