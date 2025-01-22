package Assignment_3_interface;

public class Task9 {
    public static void main(String[] args) {

    }
    interface CanMove{
        double speed();
    }
    interface CanFly extends CanMove{
        double speed(CanFly canFly);
    }
}
