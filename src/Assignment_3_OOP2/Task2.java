package Assignment_3_OOP2;

public class Task2 {
    public class Skyscraper {
        public Skyscraper(){
            System.out.println(SKYSCRAPER_WAS_BUILD);
        }
        public Skyscraper(int floors){
            System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
        }
        public Skyscraper(String developer){
            System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
        }
        public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
        public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT =
                "Skyscraper is built. The number of floors - ";
        public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER =
                "Skyscraper is built. Developer - ";
        //write your code here
        public void main(String[] args) {
            Skyscraper skyscraper = new Skyscraper();
            Skyscraper skyscraperTower = new Skyscraper(50);
            Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
        }
    }
}
