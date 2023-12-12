import Tasks.T1.Builder;
import Tasks.T1.Human;
import Tasks.T1.Pilot;
import Tasks.T1.Sailor;
import Tasks.T2.Crocodile;
import Tasks.T2.Kangaroo;
import Tasks.T2.Tiger;
import Tasks.T3.Money;
import Tasks.T3.Product;
import Tasks.T4.Car;
import Tasks.T4.Device;
import Tasks.T4.Kettle;
import Tasks.T4.Microwave;
import Tasks.T4.Ship;
import Tasks.T5.Cello;
import Tasks.T5.Trombone;
import Tasks.T5.Ukulele;
import Tasks.T5.Violin;
import Tasks.T6.Array;

import java.util.Arrays;

/**
 * The Main class contains methods to test different tasks.
 */
public class Main {

    /**
     * Test method for Task 1 classes.
     */
    public static void t1Tests() {
        System.out.println("\n================= Start of T1 test =================\n");

        System.out.println("// Test the Builder class\n");
        Builder builder = new Builder("John", 42, "Bridges");
        System.out.println("Builder Name: " + builder.getName());
        System.out.println("Builder Age: " + builder.getAge());
        System.out.println("Builder Specialty: " + builder.getSpecialty());

        // Test the Human class
        //Human human = new Human("Jane", 30);
        //System.out.println("Human Name: " + human.getName());
        //System.out.println("Human Age: " + human.getAge());

        System.out.println("\n// Test the Pilot class\n");
        Pilot pilot = new Pilot("Sam", 35, "Fighter jets");
        System.out.println("Pilot Name: " + pilot.getName());
        System.out.println("Pilot Age: " + pilot.getAge());
        System.out.println("Pilot Aircraft Type: " + pilot.getAircraftType());

        System.out.println("\n// Test the Sailor class\n");
        Sailor sailor = new Sailor("Tom", 50, "Submarines");
        System.out.println("Sailor Name: " + sailor.getName());
        System.out.println("Sailor Age: " + sailor.getAge());
        System.out.println("Sailor Vessel Type: " + sailor.getShipName());

        System.out.println("\n================= End of T1 test =================\n");
    }

    /**
     * Test method for Task 2 classes.
     */
    public static void t2Tests() {
        System.out.println("\n================= Start of T2 test =================\n");

        Tiger myTiger = new Tiger("Rex", 30);
        System.out.println(myTiger);
        myTiger.move();

        System.out.println("\n");

        Crocodile myCrocodile = new Crocodile("Petro", 3000);
        System.out.println(myCrocodile);
        myCrocodile.move();

        System.out.println("\n");

        Kangaroo myKangaroo = new Kangaroo("Jack", 3);
        System.out.println(myKangaroo);
        myKangaroo.move();

        System.out.println("\n");


        System.out.println("\n================= End of T2 test =================\n");
    }

    /**
     * Test method for Task 3 classes.
     */
    public static void t3Tests() {
        System.out.println("\n================= Start of T3 test =================\n");

        // Create a Money object to set the product price
        Money initialPrice = new Money(50, 99, "USD");

        // Create a Product object
        Product product = new Product("Example Product", initialPrice);

        // Display information about the product
        System.out.println("Product Details:");
        System.out.println(product);

        // Set a new name for the product
        product.setName("New Product Name");

        // Set a new price for the product
        Money newPrice = new Money(29, 99, "USD");
        product.setPrice(newPrice);

        // Display updated information about the product with the new name and price
        System.out.println("\nUpdated Product with the new name and price. Details:");
        System.out.println(product);

        // Reduce the price of the product
        product.reducePrice(10.50);

        // Display updated information about the product with the new price after reduction
        System.out.println("\nUpdated Product with the new price after reduction 10.50. Details:");
        System.out.println(product);

        System.out.println("\n================= End of T3 test =================\n");
    }

    /**
     * Test method for Task 4 classes.
     */
    public static void t4Tests() {
        System.out.println("\n================= Start of T4 test =================\n");

        Device device = new Device("Generic Device", "Generic Characteristics");
        Car car = new Car("Toyota", "Sedan");
        Kettle kettle = new Kettle("Electric Kettle", "1.7L capacity");
        Microwave microwave = new Microwave("Microwave Oven", "1200W power");
        Ship ship = new Ship("Cargo Ship", "Large capacity");

        device.show();
        device.desc();
        device.sound();

        System.out.println("\n");
        car.show();
        car.desc();
        car.sound();

        System.out.println("\n");
        kettle.show();
        kettle.desc();
        kettle.sound();

        System.out.println("\n");
        microwave.show();
        microwave.desc();
        microwave.sound();

        System.out.println("\n");
        ship.show();
        ship.desc();
        ship.sound();

        System.out.println("\n================= End of T4 test =================\n");
    }

    /**
     * Test method for Task 5 classes.
     */
    public static void t5Tests() {
        System.out.println("\n================= Start of T5 test =================\n");

        // Create objects of each class
        Violin violin = new Violin("Violin", "Horsehair");
        Trombone trombone = new Trombone("Trombone", "Brass");
        Ukulele ukulele = new Ukulele("Ukulele", "4");
        Cello cello = new Cello("Cello", "Full-size");

        // Using each object's methods
        System.out.println("---- Violin ----");
        violin.show();
        violin.sound();
        violin.desc();
        violin.history();

        System.out.println("\n---- Trombone ----");
        trombone.show();
        trombone.sound();
        trombone.desc();
        trombone.history();

        System.out.println("\n---- Ukulele ----");
        ukulele.show();
        ukulele.sound();
        ukulele.desc();
        ukulele.history();

        System.out.println("\n---- Cello ----");
        cello.show();
        cello.sound();
        cello.desc();
        cello.history();

        System.out.println("\n================= End of T5 test =================\n");
    }

    /**
     * Test method for Task 6 classes.
     */
    public static void t6Tests() {
        System.out.println("\n================= Start of T6 test =================\n");

        int[] sampleArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        Array array = new Array(sampleArray);

        // Тестирование методов
        System.out.println("Max: " + array.Max());
        System.out.println("Min: " + array.Min());
        System.out.println("Avg: " + array.Avg());

        System.out.println("\n================= End of T6 test =================\n");
    }

    /**
     * Test method for Task 7 classes.
     */
    public static void t7Tests() {
        System.out.println("\n================= Start of T7 test =================\n");

        // Example array
        int[] testArray = {5, 2, 8, 1, 6};

        // Creating an Array object from Tasks.T7
        Tasks.T7.Array arrayT7 = new Tasks.T7.Array(testArray);

        // Displaying the original array
        System.out.println("Original array: " + Arrays.toString(testArray));

        // Calculating and displaying statistics using IMath interface methods
        System.out.println("Maximum value: " + arrayT7.Max());
        System.out.println("Minimum value: " + arrayT7.Min());
        System.out.println("Average value: " + arrayT7.Avg());

        // Sorting and displaying the array in ascending order
        arrayT7.SortAsc();
        System.out.println("Sorted in ascending order: " + Arrays.toString(arrayT7.getElements()));

        // Sorting and displaying the array in descending order
        arrayT7.SortDesc();
        System.out.println("Sorted in descending order: " + Arrays.toString(arrayT7.getElements()));

        System.out.println("\n================= End of T7 test =================\n");
    }

    /**
     * The main method to run the tests.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Uncomment the method calls for the tests you want to run
        // t1Tests();
        // t2Tests();
        // t3Tests();
        // t4Tests();
        // t5Tests();
        // t6Tests();
        // t7Tests();
    }
}