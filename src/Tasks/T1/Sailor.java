package Tasks.T1;

import Tasks.Validator;

/**
 * The Sailor class represents a human who is a sailor.
 * This class is an extension of the Human class with the addition of a shipName field.
 */
public class Sailor extends Human {

    /**
     * The name of the ship of the sailor.
     */
    private String shipName;

    /**
     * Constructs a new Sailor with the given name, age, and ship name.
     *
     * @param name     the name of the sailor
     * @param age      the age of the sailor
     * @param shipName the name of the ship of the sailor
     */
    public Sailor(String name, int age, String shipName) {
        super(name, age);
        this.shipName = Validator.validateString(shipName, "Incorrect ship name!");
    }

    /**
     * Returns the name of the ship of the sailor.
     *
     * @return the name of the ship of the sailor
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * Sets the name of the sailor's ship.
     * The name passes through a validation method first, which ensures it is a valid string.
     *
     * @param shipName the name of the ship to set
     */
    public void setShipName(String shipName) {
        this.shipName = Validator.validateString(shipName, "Incorrect ship name!");
    }

    /**
     * Returns a string representation of the sailor, including the name, age, and ship name.
     *
     * @return a string representation of the sailor
     */
    @Override
    public String toString() {
        return super.toString() +
                ", Sailor { shipName='" + shipName + '\'' +
                '}';
    }
}