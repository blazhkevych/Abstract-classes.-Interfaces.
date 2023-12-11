package Tasks.T3;

import Tasks.T3.Money;
import Tasks.Validator;

/**
 * The Product class represents a product with a price.
 * The class allows the price to be modified.
 */
public class Product {
    // The name of the product
    private String name;
    // The price of the product
    private Money price;

    /**
     * Constructs a new Product with the given name and price (in the form of a Money object).
     *
     * @param name  the name of the product, cannot be null or empty
     * @param price the price of the product
     */
    public Product(String name, Money price) {
        this.name = Validator.validateString(name, "Incorrect name for product!");
        this.price = new Money(price.getIntegerPart(), price.getDecimalPart(), price.getCurrencyType());
    }

    /**
     * Returns the name of the product.
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     *
     * @param name the name to set, cannot be null or empty
     */
    public void setName(String name) {
        this.name = Validator.validateString(name, "Incorrect name for product!");
    }

    /**
     * Sets the price of the product.
     *
     * @param price the price of the product (in the form of a Money object)
     */
    public void setPrice(Money price) {
        this.price = new Money(price.getIntegerPart(), price.getDecimalPart(), price.getCurrencyType());
    }

    /**
     * Reduces the price of the product by the specified amount.
     *
     * @param reduction the amount by which to reduce the product price
     * @throws IllegalArgumentException if the reduction is greater than the current integer part of the price
     */
    public void reducePrice(int reduction) {
        if (price.getIntegerPart() >= reduction) {
            price.setIntegerPart(price.getIntegerPart() - reduction);
        } else {
            System.out.println("Reduction cannot be greater than product price!");
        }
    }

    /**
     * Returns a string representation of the Product object.
     *
     * @return a string representation of the Product object
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", " + price +
                '}';
    }
}
