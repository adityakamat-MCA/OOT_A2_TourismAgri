import java.util.Scanner;

/**
 * Menu-driven application demonstrating inheritance in tourism
 * and agriculture using Java.
 *
 * @author Student
 * @version 1.0
 */
public class TourismAgriculture {
    /**
     * Displays the main menu.
     */
    public static void displayMenu() {
        System.out.println("\n===== TOURISM AND AGRICULTURE MANAGEMENT =====");
        System.out.println("1. Single Inheritance");
        System.out.println("2. Multiple Inheritance");
        System.out.println("3. Multilevel Inheritance");
        System.out.println("4. Hierarchical Inheritance");
        System.out.println("5. Hybrid Inheritance");
        System.out.println("6. Demonstrate All");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Demonstrates single inheritance.
     */
    public static void singleInheritance() {
        System.out.println("\n--- SINGLE INHERITANCE ---");
        EcoTourismSpot spot = new EcoTourismSpot();
        spot.showService();
        spot.showEcoTourism();
    }

    /**
     * Demonstrates multiple inheritance through interfaces.
     */
    public static void multipleInheritance() {
        System.out.println("\n--- MULTIPLE INHERITANCE ---");
        FarmTourism farm = new FarmTourism();
        farm.provideTourismService();
        farm.provideAgricultureService();
    }

    /**
     * Demonstrates multilevel inheritance.
     */
    public static void multilevelInheritance() {
        System.out.println("\n--- MULTILEVEL INHERITANCE ---");
        OrganicFarmVisit visit = new OrganicFarmVisit();
        visit.showActivity();
        visit.showFarmVisit();
        visit.showOrganicFarming();
    }

    /**
     * Demonstrates hierarchical inheritance.
     */
    public static void hierarchicalInheritance() {
        System.out.println("\n--- HIERARCHICAL INHERITANCE ---");
        HeritageTourism heritage = new HeritageTourism();
        heritage.showService();
        heritage.showHeritageTourism();

        AdventureTourism adventure = new AdventureTourism();
        adventure.showService();
        adventure.showAdventureTourism();
    }

    /**
     * Demonstrates hybrid inheritance.
     */
    public static void hybridInheritance() {
        System.out.println("\n--- HYBRID INHERITANCE ---");
        FarmTourismAnimal animal = new FarmTourismAnimal();
        animal.showResource();
        animal.showAnimal();
        animal.provideTourismService();
        animal.showFarmExperience();
    }

    /**
     * Executes the menu-driven application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    singleInheritance();
                    break;
                case 2:
                    multipleInheritance();
                    break;
                case 3:
                    multilevelInheritance();
                    break;
                case 4:
                    hierarchicalInheritance();
                    break;
                case 5:
                    hybridInheritance();
                    break;
                case 6:
                    singleInheritance();
                    multipleInheritance();
                    multilevelInheritance();
                    hierarchicalInheritance();
                    hybridInheritance();
                    break;
                case 0:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select from 0 to 6.");
            }
        } while (choice != 0);

        sc.close();
    }
}