package Assignment_3_OOP2;

public class Car1 {
    private String model;
    private int year;
    private String color;

    public void init(String model,int year,String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel(){
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Car1 car = new Car1();
        car.init("Tesla Model S", 2023, "Red");

        // Display the car's details (optional)
        System.out.println("Model " + car.getModel());
        System.out.println("Year " + car.getYear());
        System.out.println("Color " + car.getColor());
    }
}
