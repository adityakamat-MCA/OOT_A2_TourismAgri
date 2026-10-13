/**
 * Combines multilevel inheritance with a tourism interface.
 */
public class FarmTourismAnimal extends FarmAnimal implements TourismServices {
    /**
     * Provides a tourism service related to farm animals.
     */
    @Override
    public void provideTourismService() {
        System.out.println("Tourism: Visitors learn about dairy farming.");
    }

    /**
     * Displays the farm tourism experience.
     */
    public void showFarmExperience() {
        System.out.println("Visitors experience responsible animal care.");
    }
}