package Tasks.T4;

/**
 * The Car class represents a type of device that is a car.
 * It extends the Device class and provides specific
 * implementations for the sound, show, and desc methods.
 */
public class Car extends Device {

    /**
     * Constructs a new Car with the specified name and characteristics.
     *
     * @param name            the name of the car
     * @param characteristics the characteristics of the car
     */
    public Car(String name, String characteristics) {
        super(name, characteristics);
    }

    /**
     * Outputs the sound of the car.
     * In this case, it prints "Car sound: vroom-vroom".
     */
    @Override
    public void sound() {
        System.out.println("Car sound: vroom-vroom");
    }

    /**
     * Displays the name of the car.
     */
    @Override
    public void show() {
        System.out.println("Car name: " + getName());
    }

    /**
     * Outputs the description of the car.
     * It includes the characteristics of the car.
     */
    @Override
    public void desc() {
        System.out.println("Car description: " + getCharacteristics());
    }
}
