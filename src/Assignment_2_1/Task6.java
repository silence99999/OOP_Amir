package Assignment_2_1;

import java.util.Scanner;

public class Task6 {
    public static int[] array;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        if (len <= 0){
            return;
        }
        array = new int[len];
        for (int i = 0;i < array.length;i++) {
            int input = scanner.nextInt();
            array[i] = input;
        }
        int max = array[0];
        for(int i = 0; i < array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
