package Assignment_1;

import java.nio.IntBuffer;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp < 0){
            System.out.println("it’s cold outside");
        } else {
            System.out.println("it’s warm outside.");
        }
        scanner.close();
    }
}
