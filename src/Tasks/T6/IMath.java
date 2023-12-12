package Tasks.T6;

/**
 * The IMath interface represents mathematical operations on a set of integers.
 * It provides methods to calculate the maximum, minimum, and average of a set of integers.
 */
public interface IMath {

    /**
     * Calculates and returns the maximum value among the elements.
     *
     * @return The maximum value in the set.
     */
    int Max();

    /**
     * Calculates and returns the minimum value among the elements.
     *
     * @return The minimum value in the set.
     */
    int Min();

    /**
     * Calculates and returns the average (arithmetic mean) of the elements.
     *
     * @return The average value of the set.
     */
    float Avg();
}