package Assignment_2_1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                int num = scanner.nextInt();
                arr[i][j] = num;
            }
        }
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
