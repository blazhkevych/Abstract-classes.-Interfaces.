package Tasks.T2;

import Tasks.Validator;

/**
 * This class represents a Tiger, which is a specific type of Animal.
 * <p>
 * It provides methods enabling you to get and set the running speed of the Tiger
 * and also to demonstrate its movement. You can also get a string representation of the Tiger.
 * Each Tiger object has a `name` inherited from Animal, and a `speed` which is specific to the Tiger class.
 */
public class Tiger extends Animal {

    // The running speed of the Tiger
    private int speed;

    /**
     * Constructs a new Tiger object with the given name and speed.
     *
     * @param name  the name of the Tiger
     * @param speed the running speed of the Tiger
     */
    public Tiger(String name, int speed) {
        super(name);
        this.speed = Validator.validateSpeed(speed);
    }

    /**
     * Speed getter.
     *
     * @return the running speed of the Tiger
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Sets the running speed of the Tiger, after validating the speed.
     *
     * @param speed the running speed to set for the Tiger
     */
    public void setSpeed(int speed) {
        this.speed = Validator.validateSpeed(speed);
    }

    /**
     * Returns a string representation of the Tiger.
     * <p>
     * The returned string includes the name of the Tiger (inherited from Animal)
     * and its running speed.
     *
     * @return a String representation of the Tiger
     */
    @Override
    public String toString() {
        return super.toString() + " and can run at a speed of " + speed;
    }

    /**
     * Demonstrates the movement of the Tiger.
     * <p>
     * Prints a message to the standard output indicating the running speed of the Tiger.
     */
    @Override
    public void move() {
        System.out.println("The tiger is running at a speed of " + speed);
    }
}