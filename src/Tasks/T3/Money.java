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
}