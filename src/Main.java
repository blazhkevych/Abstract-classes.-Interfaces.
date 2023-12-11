import Tasks.T1.Builder;
import Tasks.T1.Human;
import Tasks.T1.Pilot;
import Tasks.T1.Sailor;

public class Main {
    public static void t1Tests() {
        System.out.println("\n================= Start of T1 test =================\n");

        // Test the Builder class
        Builder builder = new Builder("John", 42, "Bridges");
        System.out.println("Builder Name: " + builder.getName());
        System.out.println("Builder Age: " + builder.getAge());
        System.out.println("Builder Specialty: " + builder.getSpecialty());

        // Test the Human class
        //Human human = new Human("Jane", 30);
        //System.out.println("Human Name: " + human.getName());
        //System.out.println("Human Age: " + human.getAge());

        // Test the Pilot class
        Pilot pilot = new Pilot("Sam", 35, "Fighter jets");
        System.out.println("Pilot Name: " + pilot.getName());
        System.out.println("Pilot Age: " + pilot.getAge());
        System.out.println("Pilot Aircraft Type: " + pilot.getAircraftType());

        // Test the Sailor class
        Sailor sailor = new Sailor("Tom", 50, "Submarines");
        System.out.println("Sailor Name: " + sailor.getName());
        System.out.println("Sailor Age: " + sailor.getAge());
        System.out.println("Sailor Vessel Type: " + sailor.getShipName());
        System.out.println("\n================= Start of T1 test =================\n");
    }

    public static void main(String[] args) {
        t1Tests();

    }
}