package Tasks.T1;

import Tasks.Validator;

/**
 * The Builder class represents a human who is a builder.
 * This class is an extension of the Human class with the addition of a speciality field.
 */
public class Builder extends Human {

    /**
     * The speciality of the builder.
     */
    private String speciality;

    /**
     * Constructs a new Builder with the given name, age, and speciality.
     *
     * @param name       the name of the builder
     * @param age        the age of the builder
     * @param speciality the speciality of the builder
     */
    public Builder(String name, int age, String speciality) {
        super(name, age);
        this.speciality = Validator.validateString(speciality, "Incorrect speciality!");
    }

    /**
     * Returns the speciality of the builder.
     *
     * @return the speciality of the builder
     */
    public String getSpecialty() {
        return speciality;
    }

    /**
     * Sets the speciality of the builder.
     *
     * @param speciality the speciality to set, cannot be null or empty
     */
    public void setSpeciality(String speciality) {
        this.speciality = Validator.validateString(speciality, "Incorrect speciality!");
    }

    /**
     * Returns a string representation of the builder, including the name, age, and speciality.
     *
     * @return a string representation of the builder
     */
    @Override
    public String toString() {
        return super.toString() +
                ", Builder { speciality='" + speciality + '\'' +
                '}';
    }
}