package Tasks.T1;

import Tasks.Validator;

/**
 * The Pilot class represents a pilot, who is a human that can pilot aircraft of a certain type.
 */
public class Pilot extends Human {

    // The type of aircraft that the pilot is certified to fly
    private String aircraftType;

    /**
     * Creates an instance of Pilot with specified name, age, and aircraft type.
     *
     * @param name         the name of the pilot.
     * @param age          the age of the pilot.
     * @param aircraftType the type of aircraft the pilot can fly.
     */
    public Pilot(String name, int age, String aircraftType) {
        super(name, age);
        // Validate the aircraftType string before setting it
        this.aircraftType = Validator.validateString(aircraftType, "Incorrect aircraft type!");
    }

    /**
     * Returns the type of aircraft that the pilot can fly.
     *
     * @return the type of aircraft that this pilot can fly.
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * Sets the type of aircraft the pilot can fly.
     *
     * @param aircraftType the type of aircraft the pilot can fly.
     */
    public void setAircraftType(String aircraftType) {
        // Validate the aircraftType string before setting it
        this.aircraftType = Validator.validateString(aircraftType, "Incorrect aircraft type!");
    }
}