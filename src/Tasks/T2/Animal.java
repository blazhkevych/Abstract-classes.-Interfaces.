package Tasks.T2;

import Tasks.Validator;

/**
 * Abstract base class to represent an animal.
 */
public abstract class Animal {
    private String name;

    /**
     * Constructor for the Animal class. It validates the input string.
     *
     * @param name the name of the animal
     * @throws IllegalArgumentException if name is invalid
     */
    public Animal(String name) {
        this.name = Validator.validateString(name, "Incorrect name!");
    }

    /**
     * Name getter.
     *
     * @return the name of the animal
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name setter. It validates the input string.
     *
     * @param name the new name to set
     * @throws IllegalArgumentException if name is invalid
     */
    public void setName(String name) {
        this.name = Validator.validateString(name, "Incorrect name!");
    }

    /**
     * Represents the animal as a string.
     *
     * @return a string representation of the animal
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " named " + this.name;
    }

    /**
     * Method to represent movement of the animal.
     * Must be implemented in child classes.
     */
    public abstract void move();
}