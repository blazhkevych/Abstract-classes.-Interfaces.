package Tasks.T5;

import Tasks.Validator;

/**
 * The Trombone class, representing a trombone musical instrument.
 */
public class Trombone extends MusicalInstrument {
    private String material;

    /**
     * Constructor for creating a trombone with a given name and material.
     *
     * @param name     The name of the trombone.
     * @param material The material of the trombone.
     */
    public Trombone(String name, String material) {
        super(name);
        this.material = Validator.validateString(material, "Incorrect material for trombone!");
    }

    /**
     * Getter for the material of the trombone.
     *
     * @return The material of the trombone.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Setter for the material of the trombone.
     *
     * @param material The new material of the trombone.
     */
    public void setMaterial(String material) {
        this.material = Validator.validateString(material, "Incorrect material for trombone!");
    }

    /**
     * Override of the sound method to produce the sound of the trombone.
     */
    @Override
    public void sound() {
        super.sound();
        System.out.println("trombone.");
    }

    /**
     * Override of the desc method to display additional information about the trombone.
     */
    @Override
    public void desc() {
        super.desc();
        System.out.println("It is made of " + material + ".");
    }

    /**
     * Override of the history method to display the history of the creation of the trombone.
     */
    @Override
    public void history() {
        super.history();
        System.out.println("The trombone has a long history in brass bands and orchestras.");
    }
}
