import Tasks.T1.Builder;
import Tasks.T1.Human;
import Tasks.T1.Pilot;
import Tasks.T1.Sailor;
import Tasks.T2.Crocodile;
import Tasks.T2.Kangaroo;
import Tasks.T2.Tiger;
import Tasks.T3.Money;
import Tasks.T3.Product;

public class Main {

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

        // Reduce the price of the product
        product.reducePrice(10);

        // Display updated information about the product
        System.out.println("\nUpdated Product Details:");
        System.out.println(product);

        System.out.println("\n================= End of T3 test =================\n");
    }

    public static void t4Tests() {
        System.out.println("\n================= Start of T4 test =================\n");


        System.out.println("\n================= End of T4 test =================\n");
    }

    public static void t5Tests() {
        System.out.println("\n================= Start of T5 test =================\n");


        System.out.println("\n================= End of T5 test =================\n");
    }

    public static void t6Tests() {
        System.out.println("\n================= Start of T6 test =================\n");


        System.out.println("\n================= End of T6 test =================\n");
    }

    public static void t7Tests() {
        System.out.println("\n================= Start of T7 test =================\n");


        System.out.println("\n================= End of T7 test =================\n");
    }

    public static void main(String[] args) {
        //t1Tests();
        //t2Tests();
        t3Tests();
        //t4Tests();
        //t5Tests();
        //t6Tests();
        //t7Tests();

    }
}