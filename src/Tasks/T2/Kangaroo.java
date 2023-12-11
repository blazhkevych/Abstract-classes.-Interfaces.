package Tasks.T2;

import Tasks.Validator;

/**
 * This class represents a Kangaroo, which is a specific type of Animal.
 * <p>
 * It provides methods enabling you to get and set the jump height of the Kangaroo
 * and also to demonstrate its movement.
 * Each Kangaroo object has a `name` inherited from Animal, and a `jumpHeight` which is specific to the Kangaroo class.
 */
public class Kangaroo extends Animal {
    // The jump height of the Kangaroo
    private int jumpHeight;

    /**
     * Constructs a new Kangaroo object with the given name and jump height.
     *
     * @param name       the name of the Kangaroo
     * @param jumpHeight the jump height of the Kangaroo
     */
    public Kangaroo(String name, int jumpHeight) {
        super(name);
        // Validate that the jump height is within an acceptable range
        this.jumpHeight = Validator.validateJumpHeight(jumpHeight);
    }

    /**
     * Returns the jump height of the Kangaroo.
     *
     * @return the jump height of the Kangaroo
     */
    public int getJumpHeight() {
        return this.jumpHeight;
    }

    /**
     * Sets the jump height of the Kangaroo, after validating the jump height.
     *
     * @param jumpHeight the jump height to set for the Kangaroo
     */
    public void setJumpHeight(int jumpHeight) {
        // Validation to ensure that the jump height is within an acceptable range
        this.jumpHeight = Validator.validateJumpHeight(jumpHeight);
    }

    /**
     * Returns a string representation of the Kangaroo.
     * <p>
     * The returned string includes the name of the Kangaroo (inherited from Animal)
     * and its jump height.
     *
     * @return a String representation of the Kangaroo
     */
    @Override
    public String toString() {
        return super.toString() + " and has a jump height of " + jumpHeight;
    }

    /**
     * Demonstrates the movement of the Kangaroo.
     * <p>
     * Prints a message to the standard output indicating the movement of the Kangaroo.
     */
    @Override
    public void move() {
        System.out.println("The kangaroo is jumping.");
    }
}