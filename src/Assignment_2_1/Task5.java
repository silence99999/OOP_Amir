package Assignment_2_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        if (len > 0){
            int[] arr = new int[len];
            for (int i = 0;i < arr.length;i++) {
                int input = scanner.nextInt();
                arr[i] = input;
            }
            if(len % 2 == 1){
                int idx = 0;
                int[] revarr = new int[len];
                for(int j = arr.length-1;j >= 0;j--){
                    revarr[idx] = arr[j];
                    idx++;
                }
                arr = revarr;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
