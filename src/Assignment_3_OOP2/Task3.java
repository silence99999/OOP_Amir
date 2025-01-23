package Assignment_3_OOP2;

public class Task3 {
    public class Skyscraper {
        private int floorsCount;
        private String developer;
        public Skyscraper(){
            this.floorsCount = 5;
            this.developer = "JavaRushDevelopment";
        }
        public Skyscraper(int floorsCount,String developer){
            this.floorsCount = floorsCount;
            this.developer = developer;
        }
        public void main(String[] args) {
            Skyscraper skyscraper = new Skyscraper();
            Skyscraper skyscraperUnknown = new Skyscraper(50, "Unknown");
        }
    }
}
