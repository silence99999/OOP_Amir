package Assignment_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        boolean ishigh = temp > 36.6;
        boolean islow = temp <= 36.4;
        if (ishigh){
            System.out.println("your temperature is too high");
        } else if (islow){
            System.out.println("your temperature is too low");
        } else {
            System.out.println("your temperature is normal");
        }
        scanner.close();
    }
}
