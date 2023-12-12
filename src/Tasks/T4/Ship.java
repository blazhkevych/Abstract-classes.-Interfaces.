package Tasks.T4;

/**
 * The Ship class represents a type of device that is a ship.
 * It extends the Device class and provides specific
 * implementations for the sound, show, and desc methods.
 */
public class Ship extends Device {

    /**
     * Constructs a new Ship with the specified name and characteristics.
     *
     * @param name            the name of the ship
     * @param characteristics the characteristics of the ship
     */
    public Ship(String name, String characteristics) {
        super(name, characteristics);
    }

    /**
     * Outputs the sound of the ship.
     * In this case, it prints "Ship sound: brrrr".
     */
    @Override
    public void sound() {
        System.out.println("Ship sound: brrrr");
    }

    /**
     * Displays the name of the ship.
     */
    @Override
    public void show() {
        System.out.println("Ship name: " + getName());
    }

    /**
     * Outputs the description of the ship.
     * It includes the characteristics of the ship.
     */
    @Override
    public void desc() {
        System.out.println("Ship description: " + getCharacteristics());
    }
}
