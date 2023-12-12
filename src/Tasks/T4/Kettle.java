package Tasks.T4;

/**
 * The Kettle class represents a type of device that is a kettle.
 * It extends the Device class and provides specific
 * implementations for the sound, show, and desc methods.
 */
public class Kettle extends Device {

    /**
     * Constructs a new Kettle with the specified name and characteristics.
     *
     * @param name            the name of the kettle
     * @param characteristics the characteristics of the kettle
     */
    public Kettle(String name, String characteristics) {
        super(name, characteristics);
    }

    /**
     * Outputs the sound of the kettle.
     * In this case, it prints "Kettle sound: whistle".
     */
    @Override
    public void sound() {
        System.out.println("Kettle sound: whistle");
    }

    /**
     * Displays the name of the kettle.
     */
    @Override
    public void show() {
        System.out.println("Kettle name: " + getName());
    }

    /**
     * Outputs the description of the kettle.
     * It includes the characteristics of the kettle.
     */
    @Override
    public void desc() {
        System.out.println("Kettle description: " + getCharacteristics());
    }
}
