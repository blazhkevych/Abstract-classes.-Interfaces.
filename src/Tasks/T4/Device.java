package Tasks.T4;

import Tasks.Validator;

/**
 * The Device class represents a generic device with a name and characteristics.
 * It includes methods to get and set the name and characteristics,
 * as well as default implementations for sound, show, and desc methods.
 * The name and characteristics are validated using the Validator class.
 */
public class Device {
    private String name;
    private String characteristics;

    /**
     * Constructs a new Device with the specified name and characteristics.
     * Validates the input using the Validator class.
     *
     * @param name            the name of the device
     * @param characteristics the characteristics of the device
     */
    public Device(String name, String characteristics) {
        this.name = Validator.validateString(name, "Incorrect name");
        this.characteristics = Validator.validateString(characteristics, "Incorrect characteristics");
    }

    /**
     * Gets the name of the device.
     *
     * @return the name of the device
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the device, validating the input.
     *
     * @param name the new name for the device
     */
    public void setName(String name) {
        this.name = Validator.validateString(name, "Incorrect name");
    }

    /**
     * Gets the characteristics of the device.
     *
     * @return the characteristics of the device
     */
    public String getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the characteristics of the device, validating the input.
     *
     * @param characteristics the new characteristics for the device
     */
    public void setCharacteristics(String characteristics) {
        this.characteristics = Validator.validateString(characteristics, "Incorrect characteristics");
    }

    /**
     * Outputs the default sound of the device.
     * In this case, it prints "Device sound: beep-beep".
     */
    public void sound() {
        System.out.println("Device sound: beep-beep");
    }

    /**
     * Displays the name of the device.
     */
    public void show() {
        System.out.println("Device name: " + name);
    }

    /**
     * Outputs the description of the device.
     * It includes the characteristics of the device.
     */
    public void desc() {
        System.out.println("Device description: " + characteristics);
    }
}
