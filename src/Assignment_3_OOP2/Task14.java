package Assignment_3_OOP2;

public class Task14{
    public static void showWeather(City city) {
        System.out.println("In the city " + city.getName() + " today the air temperature " + city.getTemperature() + " temperature in the city");
    }
    public  static void main(String[] args) {
        City city = new City("Dubai",40);
        showWeather(city);
    }
}
