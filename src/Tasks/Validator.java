package Tasks;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Validator {
    /**
     * Validates the provided telephone code.
     * Ukrainian telephone codes start with "+380" followed by a city code (2-3 digits).
     *
     * @param telephoneCode the telephone code to validate.
     * @return true if the telephone code is valid, false otherwise.
     */
    private static boolean isValidTelephoneCode(String telephoneCode) {
        // Matches "+380" followed by exactly 2-3 digits (city code)
        return telephoneCode.matches("\\+380\\d{2,3}");
    }

    /**
     * Validates and returns the provided telephone code if it's valid.
     * If the telephone code is invalid, it throws an IllegalStateException.
     *
     * @param telephoneCode the telephone code to be validated.
     * @return the same telephone code if it is valid.
     * @throws IllegalStateException If the telephone code is invalid.
     */
    public static String validateTelephoneCode(String telephoneCode) {
        if (!isValidTelephoneCode(telephoneCode)) {
            throw new IllegalStateException("Incorrect telephone code");
        }
        return telephoneCode;
    }

    /**
     * Validates the provided telephone number.
     * Ukrainian telephone numbers start with "+380" followed by 9 digits.
     *
     * @param telephoneNumber the telephone number to validate.
     * @return true if the telephone number is valid, false otherwise.
     */
    private static boolean isValidTelephoneNumber(String telephoneNumber) {
        // Matches "+380" followed by exactly 9 digits
        return telephoneNumber.matches("\\+380\\d{9}");
    }

    /**
     * Validates and returns the provided telephone number if it's valid.
     * If the telephone number is invalid, it throws an IllegalStateException.
     *
     * @param telephoneNumber the telephone number to be validated.
     * @return the same telephone number if it is valid.
     * @throws IllegalStateException If the telephone number is invalid.
     */
    public static String validateTelephoneNumber(String telephoneNumber) {
        if (!isValidTelephoneNumber(telephoneNumber)) {
            throw new IllegalStateException("Incorrect telephone number");
        }
        return telephoneNumber;
    }

    /**
     * Validates the provided postal code. Ukrainian postal codes must contain exactly
     * five digits.
     *
     * @param postalCode the postal code to validate.
     * @return true if the postal code is valid, false otherwise.
     */
    private static boolean isValidPostalCode(int postalCode) {
        int length = (int) (Math.log10(postalCode) + 1);
        return length == 5;
    }

    /**
     * Validates the given postal code. If the postal code is invalid, an exception will be thrown.
     * Ukrainian postal codes must have exactly five digits.
     *
     * @param postalCode the postal code to validate.
     * @return the same postal code if it is valid.
     * @throws IllegalStateException if the postal code is invalid.
     */
    public static int validatePostalCode(int postalCode) {
        if (!(isValidPostalCode(postalCode))) {
            throw new IllegalStateException("Incorrect postal code");
        }
        return postalCode;
    }

    /**
     * Validates the provided population value.
     *
     * @param population the population value to validate.
     * @return true if the population is valid, false otherwise.
     */
    private static boolean isValidPopulation(long population) {
        return population >= 0;
    }

    /**
     * Validates the provided population value.
     * A population is considered valid if it's not negative.
     *
     * @param population the population value to validate.
     * @return population if the population is valid.
     * @throws IllegalStateException if the population is invalid.
     */
    public static long validatePopulation(long population) {
        if (!(isValidPopulation(population))) {
            throw new IllegalStateException("Incorrect population");
        }
        return population;
    }

    /**
     * A helper method to validate the input for string properties.
     * It throws an IllegalStateException when the provided string is null or empty.
     *
     * @param input        The string to be validated.
     * @param errorMessage The error message to be returned if validation fails.
     * @return String the input string if it passes validation.
     */
    public static String validateString(String input, String errorMessage) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalStateException(errorMessage);
        }
        return input;
    }

    /**
     * Overloaded helper method to validate the input for list of strings.
     * It throws an IllegalStateException when the provided list is null, contains null,
     * or contains an empty or whitespace-only string.
     *
     * @param input        The list of strings to be validated.
     * @param errorMessage The error message to be returned if validation fails.
     * @return List<String> the input list if it passes validation.
     */
    public static List<String> validateString(List<String> input, String errorMessage) {
        if (input == null) {
            throw new IllegalStateException(errorMessage);
        }
        for (String str : input) {
            if (str == null || str.trim().isEmpty()) {
                throw new IllegalStateException(errorMessage);
            }
        }
        return input;
    }

    /**
     * A helper method to validate the input for date properties.
     * It throws an IllegalStateException when the provided date is null or in the future.
     *
     * @param date The date to be validated.
     * @return LocalDate the input date if it passes validation.
     */
    public static LocalDate validateDate(LocalDate date) {
        if (date == null || date.isAfter(LocalDate.now())) {
            throw new IllegalStateException("Incorrect birth date!");
        }
        return date;
    }

    /**
     * Validates the year.
     *
     * @param year the year to be validated
     * @return true if the year is valid, false otherwise
     * @throws IllegalArgumentException if the year is less than or equal to 0
     */
    public static boolean isValidYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive integer.");
        }

        // Assuming the book cannot be published in the future,
        // the year should also not be greater than the current year.
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        if (year > currentYear) {
            throw new IllegalArgumentException("Year cannot be in the future.");
        }

        return true;
    }

    /**
     * Validates the year and returns it if it is valid.
     *
     * @param year the year to be validated
     * @return the validated year
     * @throws IllegalArgumentException if the year is less than or equal to 0 or greater than the current year
     */
    public static int validateYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive integer.");
        }

        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        if (year > currentYear) {
            throw new IllegalArgumentException("Year cannot be in the future.");
        }

        return year;
    }

    /**
     * Validates the provided human age.
     *
     * @param age - Age of a human
     * @throws IllegalArgumentException if age is not between 0 and 150.
     */
    public static int validateHumanAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150.");
        }

        return age;
    }

    /**
     * Validates the number of pages in the book.
     *
     * @param numberOfPages the number of pages to be validated
     * @return true if the number of pages is valid, false otherwise
     * @throws IllegalArgumentException if the numberOfPages is less than or equal to 0
     */
    public static boolean isValidNumberOfPages(int numberOfPages) {
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Number of pages must be a positive integer.");
        }
        return true;
    }

    /**
     * Validates the engine capacity.
     *
     * @param engineCapacity the engine capacity to be validated
     * @return the validated engine capacity
     * @throws IllegalArgumentException if the engine capacity is less than or equal to 0 or beyond a sensible limit
     */
    public static double validateEngineCapacity(double engineCapacity) {
        if (engineCapacity <= 0) {
            throw new IllegalArgumentException("Engine Capacity must be a positive value.");
        }

        // Assuming the engine capacity for current cars doesn't exceed certain sensible limit (let's say 10L as a generic limit),
        // the engineCapacity should also not be larger than this limit.
        if (engineCapacity > 10) {
            throw new IllegalArgumentException("Engine Capacity should not exceed the top limit.");
        }

        return engineCapacity;
    }

    /**
     * Validates the given speed value.
     * <p>
     * The method checks if the provided speed is a positive number. If not, it will throw an IllegalArgumentException.
     *
     * @param speed the speed value to validate. It should be a positive number.
     * @return the speed if it's a valid positive number.
     * @throws IllegalArgumentException if the speed is not a positive number.
     */
    public static int validateSpeed(int speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be a positive number");
        }
        return speed;
    }

    /**
     * Validates the bite force of a Crocodile.
     * <p>
     * The bite force must be in the range 1-5000.
     *
     * @param biteForce the bite force to validate
     * @return the bite force if it's valid
     * @throws IllegalArgumentException if the bite force is out of range
     */
    public static int validateBiteForce(int biteForce) {
        if (biteForce < 1 || biteForce > 5000) {
            throw new IllegalArgumentException("Bite force must be between 1 and 5000");
        }
        return biteForce;
    }

    /**
     * Validates that a provided jumpHeight is within valid range for a kangaroo
     * according to data from National Geographic
     *
     * @param jumpHeight the jump height to validate
     * @return The jump height if it is within valid range
     * @throws IllegalArgumentException if the jump height is not within valid range
     */
    public static int validateJumpHeight(int jumpHeight) {
        if (jumpHeight <= 0) {
            throw new IllegalArgumentException("The jump height must be a positive integer.");
        }
        if (jumpHeight > 9) {
            throw new IllegalArgumentException("The jump height must not exceed 9 meters.");
        }
        return jumpHeight;
    }

    /**
     * Validates the integer part of a money value and returns it
     *
     * @param integerPart the integer part of the money value to be validated
     * @return the input value if it is a positive integer and within the range of int
     * @throws IllegalArgumentException if the input value is negative or exceeds the maximum value of int
     * @see Integer#MAX_VALUE
     */
    public static int validateIntegerDecimalPart(int integerPart) {
        // Check if the input value is positive
        if (integerPart < 0) {
            throw new IllegalArgumentException("The integer part of the money value must be positive.");
        }
        // Check if the input value is within the range of int
        // The maximum value of int is 2,147,483,647
        if (integerPart > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("The maximum value of int is 2,147,483,647.");
        }
        // If both conditions are satisfied, return integerPart
        return integerPart;
    }

    /**
     * Validates and returns the currency type.
     *
     * @param currencyType the currency type to validate
     * @return the validated currency type
     * @throws IllegalArgumentException if the currency type is null, empty, or not a valid currency code
     */
    public static String validateCurrencyType(String currencyType) {
        if (currencyType == null || currencyType.isEmpty()) {
            throw new IllegalArgumentException("Currency type cannot be null or empty.");
        }

        // Array of valid currency codes (ISO 4217)
        String[] validCurrencyCodes = {
                "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN",
                "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL",
                "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY",
                "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP",
                "ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL", "GGP", "GHS",
                "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF",
                "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD",
                "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD", "KZT",
                "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD",
                "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN",
                "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK",
                "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR",
                "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "SSP",
                "STN", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD",
                "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VES", "VND",
                "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW",
                "ZWL"
        };

        // Check if the provided currency type is in the list of valid codes
        if (!Arrays.asList(validCurrencyCodes).contains(currencyType)) {
            throw new IllegalArgumentException("Invalid currency type: " + currencyType);
        }

        return currencyType;
    }

    /**
     * Validates an array to ensure it is not empty.
     *
     * @param array     The array to be validated.
     * @param errorText The error message to be displayed in case of validation failure.
     * @throws IllegalArgumentException If the array is empty.
     */
    public static void validateArrayNotEmpty(int[] array, String errorText) {
        if (array.length == 0) {
            throw new IllegalArgumentException(errorText);
        }
    }
}