package Tasks.T2;

import Tasks.Validator;

/**
 * This class represents a Crocodile, which is a specific type of Animal.
 * <p>
 * It provides methods enabling you to get and set the bite force of the Crocodile
 * and also to demonstrate its movement. You can also get a string representation of the Crocodile.
 * Each Crocodile object has a `name` inherited from Animal, and a `biteForce` which is specific to the Crocodile class.
 */
public class Crocodile extends Animal {

    // The bite force of the Crocodile
    private int biteForce;

    /**
     * Constructs a new Crocodile object with the given name and bite force.
     *
     * @param name      the name of the Crocodile
     * @param biteForce the bite force of the Crocodile
     */
    public Crocodile(String name, int biteForce) {
        super(name);
        // Validate that the bite force is within an acceptable range
        this.biteForce = Validator.validateBiteForce(biteForce);
    }

    /**
     * Returns the bite force of the Crocodile.
     *
     * @return the bite force of the Crocodile
     */
    public int getBiteForce() {
        return this.biteForce;
    }

    /**
     * Sets the bite force of the Crocodile, after validating the bite force.
     *
     * @param biteForce the bite force to set for the Crocodile
     */
    public void setBiteForce(int biteForce) {
        // Validation to ensure that the bite force is within an acceptable range
        this.biteForce = Validator.validateBiteForce(biteForce);
    }

    /**
     * Returns a string representation of the Crocodile.
     * <p>
     * The returned string includes the name of the Crocodile (inherited from Animal)
     * and its bite force.
     *
     * @return a String representation of the Crocodile
     */
    @Override
    public String toString() {
        return super.toString() + " and has a bite force of " + biteForce;
    }

    /**
     * Demonstrates the movement of the Crocodile.
     * <p>
     * Prints a message to the standard output indicating the bite force of the Crocodile.
     */
    @Override
    public void move() {
        System.out.println("The crocodile is moving.");
    }
}