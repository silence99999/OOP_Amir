package Assignment_3_interface;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }
    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }
        @Override
        public String getWeatherType(){
            return this.type;
        }
        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
    }
    public interface Weather{
        String getWeatherType();
    }
    public interface WeatherType{
        String CLOUDY = "Cloudy";
        String FOGGY = "Foggy";
        String FREEZING = "Freezing";
    }
}
