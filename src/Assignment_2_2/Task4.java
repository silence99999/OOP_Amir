package Assignment_2_2;

public class Task4 {
    public static void main(String[] args) {
        String navigator = "John";
        String pilot = "Gender";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }
    public static void createCrew(String navigator, String pilot, String SecondPilot, String flightEngineer){
        System.out.println("The four to conquer space:");
        System.out.println("Navigator: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Co-pilot: " + SecondPilot);
        System.out.println("Flight Engineer: " + flightEngineer);
    }
}
