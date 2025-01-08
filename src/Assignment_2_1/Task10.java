package Assignment_2_1;

import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        multiArray = new int[len][];

        for (int i = 0; i < len; i++) {
            int rowlen = scanner.nextInt();
            multiArray[i] = new int[rowlen];
        }
    }
}
