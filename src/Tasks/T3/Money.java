package Tasks.T3;

import Tasks.Validator;

/**
 * The Money class stores the value and type of the currency
 */
public class Money {
    // The integer part of the money value
    private int integerPart;
    // The decimal part of the money value
    private int decimalPart;
    // The type of currency (e.g., USD, EUR)
    private String currencyType;

    /**
     * Default constructor initializes the Money object with zero values and the default currency type (UAH).
     */
    public Money() {

        this(0, 0, "UAH");
    }

    /**
     * Parameterized constructor initializes the Money object with the specified values and currency type.
     *
     * @param integerPart  the integer part of the money value
     * @param decimalPart  the decimal part of the money value
     * @param currencyType the type of currency (e.g., USD, EUR)
     */
    public Money(int integerPart, int decimalPart, String currencyType) {
        this.integerPart = Validator.validateIntegerDecimalPart(integerPart);
        this.decimalPart = Validator.validateIntegerDecimalPart(decimalPart);
        this.currencyType = Validator.validateCurrencyType(currencyType);
    }

    /**
     * Parameterized constructor initializes the Money object with the specified values and the default currency type (UAH).
     *
     * @param integerPart the integer part of the money value
     * @param decimalPart the decimal part of the money value
     */
    public Money(int integerPart, int decimalPart) {
        this.integerPart = Validator.validateIntegerDecimalPart(integerPart);
        this.decimalPart = Validator.validateIntegerDecimalPart(decimalPart);
        this.currencyType = "UAH";
    }

    /**
     * Getter for the currency type.
     *
     * @return the currency type
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Setter for the currency type.
     *
     * @param currencyType the new currency type to set
     */
    public void setCurrencyType(String currencyType) {
        this.currencyType = Validator.validateCurrencyType(currencyType);
    }

    /**
     * Returns the integer part of the money value.
     *
     * @return the integer part of the money value
     */
    public int getIntegerPart() {
        return integerPart;
    }

    /**
     * Sets the integer part of the money value.
     *
     * @param integerPart the new integer part to set
     */
    public void setIntegerPart(int integerPart) {
        this.integerPart = Validator.validateIntegerDecimalPart(integerPart);
    }

    /**
     * Returns the decimal part of the money value.
     *
     * @return the decimal part of the money value
     */
    public int getDecimalPart() {
        return decimalPart;
    }

    /**
     * Sets the decimal part of the money value.
     *
     * @param decimalPart the new decimal part to set
     */
    public void setDecimalPart(int decimalPart) {
        this.decimalPart = Validator.validateIntegerDecimalPart(decimalPart);
    }

    /**
     * Returns a string representation of the Money object.
     *
     * @return a string representation of the Money object
     */
    @Override
    public String toString() {
        return "Price: " +
                integerPart +
                "," + decimalPart +
                " " + currencyType;
    }

    /**
     * Converts the integer and decimal parts of money to a decimal representation.
     *
     * @param integerPart the integer part of the money value
     * @param decimalPart the decimal part of the money value
     * @return the decimal representation of the money value
     */
    public static double makeMoneyDecimalRepresentation(int integerPart, int decimalPart) {
        return Double.parseDouble(integerPart + "." + decimalPart);
    }

    /**
     * Creates a Money object from a given decimal representation.
     *
     * @param decimalRepresentation the decimal representation of the money value
     * @return a Money object representing the given decimal value
     */
    public static Money makeMoneyFromDecimalRepresentation(double decimalRepresentation) {
        // Extract the integer and decimal parts from the decimal representation
        int integerPart = (int) decimalRepresentation;
        int decimalPart = (int) ((decimalRepresentation - integerPart) * 100);

        // Create and return a new Money object
        return new Money(integerPart, decimalPart);
    }

    /**
     * Reduces the price of the product by the specified amount.
     *
     * @param reduction the amount by which to reduce the product price, must be a non-negative value
     * @throws IllegalArgumentException if the reduction is greater than the current price
     */
    public void reducePrice(double reduction) {
        // Calculate the new price in decimal representation after reduction
        double newPriceInDecimalRepresentation = Money.makeMoneyDecimalRepresentation(getIntegerPart(), getDecimalPart());

        // Check if the reduction is greater than the new price
        if (reduction > newPriceInDecimalRepresentation ) {
            throw new IllegalArgumentException("Reduction cannot be greater than product price!");
        }
        if (reduction < 0) {
            throw new IllegalArgumentException("Reduction cannot be negative!");
        }

        // Reduce the price by the specified amount
        newPriceInDecimalRepresentation -= reduction;

        // Create a new Money object from the updated decimal representation
        Money newPrice = Money.makeMoneyFromDecimalRepresentation(newPriceInDecimalRepresentation);

        // Update the product price with the new values
        this.setIntegerPart(newPrice.getIntegerPart());
        this.setDecimalPart(newPrice.getDecimalPart());
    }
}