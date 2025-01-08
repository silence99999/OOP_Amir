package Assignment_2_2;

public class Task6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod("Hello");
        universalMethod(42);
        universalMethod(3.14);
        universalMethod("Text", 100);
        universalMethod(10, 20);
        universalMethod(true);
        universalMethod(new int[]{1, 2, 3});
        universalMethod("Start", "End");
        universalMethod(1, 2, 3);
    }

    public static void universalMethod() {
        System.out.println("Universal method with no parameters");
    }

    public static void universalMethod(String text) {
        System.out.println("Universal method with String: " + text);
    }

    public static void universalMethod(int number) {
        System.out.println("Universal method with int: " + number);
    }

    public static void universalMethod(double number) {
        System.out.println("Universal method with double: " + number);
    }

    public static void universalMethod(String text, int number) {
        System.out.println("Universal method with String and int: " + text + ", " + number);
    }

    public static void universalMethod(int number1, int number2) {
        System.out.println("Universal method with two ints: " + number1 + ", " + number2);
    }

    public static void universalMethod(boolean flag) {
        System.out.println("Universal method with boolean: " + flag);
    }

    public static void universalMethod(int[] array) {
        System.out.println("Universal method with int array of length: " + array.length);
    }

    public static void universalMethod(String text1, String text2) {
        System.out.println("Universal method with two Strings: " + text1 + ", " + text2);
    }

    public static void universalMethod(int x, int y, int z) {
        System.out.println("Universal method with three ints: " + x + ", " + y + ", " + z);
    }
}