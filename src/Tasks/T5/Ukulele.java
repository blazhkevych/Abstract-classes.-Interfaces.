package Tasks.T5;

import Tasks.Validator;

/**
 * The Ukulele class, representing a ukulele musical instrument.
 */
public class Ukulele extends MusicalInstrument {
    private String strings;

    /**
     * Constructor for creating a ukulele with a given name and number of strings.
     *
     * @param name    The name of the ukulele.
     * @param strings The number of strings on the ukulele.
     */
    public Ukulele(String name, String strings) {
        super(name);
        this.strings = Validator.validateString(strings, "Incorrect number of strings for ukulele!");
    }

    /**
     * Getter for the number of strings on the ukulele.
     *
     * @return The number of strings on the ukulele.
     */
    public String getStrings() {
        return strings;
    }

    /**
     * Setter for the number of strings on the ukulele.
     *
     * @param strings The new number of strings on the ukulele.
     */
    public void setStrings(String strings) {
        this.strings = Validator.validateString(strings, "Incorrect number of strings for ukulele!");
    }

    /**
     * Override of the sound method to produce the sound of the ukulele.
     */
    @Override
    public void sound() {
        super.sound();
        System.out.println("ukulele.");
    }

    /**
     * Override of the desc method to display additional information about the ukulele.
     */
    @Override
    public void desc() {
        super.desc();
        System.out.println("It has " + strings + " strings.");
    }

    /**
     * Override of the history method to display the history of the creation of the ukulele.
     */
    @Override
    public void history() {
        super.history();
        System.out.println("The ukulele originated in the 19th century in Hawaii.");
    }
}
