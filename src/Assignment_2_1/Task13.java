package Assignment_2_1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int max = -9999;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                int num = scanner.nextInt();
                if(num > max){
                    max = num;
                }
                arr[i][j] = num;
            }
        }
        System.out.println(max);
    }
}
