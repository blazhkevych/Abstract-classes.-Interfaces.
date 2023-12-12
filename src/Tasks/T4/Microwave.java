package Tasks.T4;

/**
 * The Microwave class represents a type of device that is a microwave.
 * It extends the Device class and provides specific
 * implementations for the sound, show, and desc methods.
 */
public class Microwave extends Device {

    /**
     * Constructs a new Microwave with the specified name and characteristics.
     *
     * @param name            the name of the microwave
     * @param characteristics the characteristics of the microwave
     */
    public Microwave(String name, String characteristics) {
        super(name, characteristics);
    }

    /**
     * Outputs the sound of the microwave.
     * In this case, it prints "Microwave sound: bzzzz".
     */
    @Override
    public void sound() {
        System.out.println("Microwave sound: bzzzz");
    }

    /**
     * Displays the name of the microwave.
     */
    @Override
    public void show() {
        System.out.println("Microwave name: " + getName());
    }

    /**
     * Outputs the description of the microwave.
     * It includes the characteristics of the microwave.
     */
    @Override
    public void desc() {
        System.out.println("Microwave description: " + getCharacteristics());
    }
}
