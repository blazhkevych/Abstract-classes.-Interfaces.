package Tasks.T1;

import Tasks.Validator;

/**
 * The Human abstract class represents a general human being.
 * This class includes methods for setting and retrieving the name and age of a human, with validation.
 */
public abstract class Human {
    /**
     * The name of the human.
     */
    private String name;
    /**
     * The age of the human.
     */
    private int age;

    /**
     * Constructs a new Human with the given name and age.
     *
     * @param name the name of the human
     * @param age  the age of the human
     */
    public Human(String name, int age) {
        this.name = Validator.validateString(name, "Incorrect name!");
        this.age = Validator.validateHumanAge(age);
    }

    /**
     * Returns the name of the human.
     *
     * @return the name of the human
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the human.
     *
     * @param name the name to set, cannot be null or empty
     */
    public void setName(String name) {
        this.name = Validator.validateString(name, "Incorrect name!");
    }

    /**
     * Returns the age of the human.
     *
     * @return the age of the human
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the human.
     *
     * @param age the age to set, must be between 0 and 150
     */
    public void setAge(int age) {
        this.age = Validator.validateHumanAge(age);
    }

    /**
     * Returns a string representation of the human, including the name and age.
     *
     * @return a string representation of the human
     */
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}