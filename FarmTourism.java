/**
 * Combines tourism and agriculture services using interfaces.
 */
public class FarmTourism implements TourismServices, AgricultureServices {
    /**
     * Provides farm tourism services.
     */
    @Override
    public void provideTourismService() {
        System.out.println("Tourism: Arranging farm visits for tourists.");
    }

    /**
     * Provides agricultural services.
     */
    @Override
    public void provideAgricultureService() {
        System.out.println("Agriculture: Demonstrating organic farming.");
    }
}