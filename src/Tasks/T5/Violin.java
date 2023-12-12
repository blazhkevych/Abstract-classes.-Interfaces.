package Tasks.T5;

import Tasks.Validator;

/**
 * The Violin class, representing a violin musical instrument.
 */
public class Violin extends MusicalInstrument {
    private String bowType;

    /**
     * Constructor for creating a violin with a given name and bow type.
     *
     * @param name    The name of the violin.
     * @param bowType The type of bow used with the violin.
     */
    public Violin(String name, String bowType) {
        super(name);
        this.bowType = Validator.validateString(bowType, "Incorrect bow type for violin!");
    }

    /**
     * Getter for the type of bow used with the violin.
     *
     * @return The type of bow.
     */
    public String getBowType() {
        return bowType;
    }

    /**
     * Setter for the type of bow used with the violin.
     *
     * @param bowType The new type of bow.
     */
    public void setBowType(String bowType) {
        this.bowType = Validator.validateString(bowType, "Incorrect bow type for violin!");
    }

    /**
     * Override of the sound method to produce the sound of the violin.
     */
    @Override
    public void sound() {
        super.sound();
        System.out.println("violin.");
    }

    /**
     * Override of the desc method to display additional information about the violin.
     */
    @Override
    public void desc() {
        //super.desc();
        System.out.println("It is played with a " + bowType + " bow.");
    }

    /**
     * Override of the history method to display the history of the creation of the violin.
     */
    @Override
    public void history() {
        super.history();
        System.out.println("The violin has a rich history in classical music.");
    }
}
