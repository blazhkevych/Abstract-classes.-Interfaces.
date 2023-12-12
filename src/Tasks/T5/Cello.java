package Tasks.T5;

import Tasks.Validator;

/**
 * The Cello class, representing a cello musical instrument.
 */
public class Cello extends MusicalInstrument {
    private String size;

    /**
     * Constructor for creating a cello with a given name and size.
     *
     * @param name The name of the cello.
     * @param size The size of the cello.
     */
    public Cello(String name, String size) {
        super(name);
        this.size = Validator.validateString(size, "Incorrect size for cello!");
    }

    /**
     * Getter for the size of the cello.
     *
     * @return The size of the cello.
     */
    public String getSize() {
        return size;
    }

    /**
     * Setter for the size of the cello.
     *
     * @param size The new size of the cello.
     */
    public void setSize(String size) {
        this.size = Validator.validateString(size, "Incorrect size for cello!");
    }

    /**
     * Override of the sound method to produce the sound of the cello.
     */
    @Override
    public void sound() {
        super.sound();
        System.out.println("cello.");
    }

    /**
     * Override of the show method to show the cello.
     */
    @Override
    public void show() {
        super.show();
        System.out.println(this.getName());
    }

    /**
     * Override of the desc method to display additional information about the cello.
     */
    @Override
    public void desc() {
        super.desc();
        System.out.println("It is a " + size + " cello.");
    }

    /**
     * Override of the history method to display the history of the creation of the cello.
     */
    @Override
    public void history() {
        super.history();
        System.out.println("The cello has been a key instrument in classical music for centuries.");
    }
}
