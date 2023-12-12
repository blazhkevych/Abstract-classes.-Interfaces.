package Tasks.T5;

import Tasks.Validator;

/**
 * The base class for musical instruments.
 */
public class MusicalInstrument {
    private String name;

    /**
     * Constructor for creating a musical instrument with a given name.
     *
     * @param name The name of the musical instrument.
     */
    public MusicalInstrument(String name) {
        this.name = Validator.validateString(name, "Incorrect name for musical instrument!");
    }

    /**
     * Produces the sound of the musical instrument.
     */
    public void sound() {
        System.out.print( "Playing the sound of the ");
    }

    /**
     * Displays the name of the musical instrument.
     */
    public void show() {
        System.out.print("Instrument: ");
    }

    /**
     * Displays the description of the musical instrument.
     */
    public void desc() {
        System.out.println("This is a musical instrument called " + name + ".");
    }

    /**
     * Displays the history of the creation of the musical instrument.
     */
    public void history() {
        System.out.println(name + " was created at a certain point in history.");
    }

    /**
     * Getter for the name of the musical instrument.
     *
     * @return The name of the musical instrument.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name of the musical instrument.
     *
     * @param name The new name of the musical instrument.
     */
    public void setName(String name) {
        this.name = Validator.validateString(name, "Incorrect name for musical instrument!");
    }
}
