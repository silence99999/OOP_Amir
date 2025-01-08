package Assignment_2_1;

import java.util.Scanner;

public class Task15 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        int[][] arrayRes = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num = scanner.nextInt();
                array[i][j] = num;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayRes[i][j] = array[j][i];
            }
        }
        for(int i = 0;i < arrayRes.length;i++){
            for(int j = 0;j < arrayRes[i].length;j++){
                System.out.print(arrayRes[i][j] + " ");
            }
            System.out.println();
        }

    }
}
