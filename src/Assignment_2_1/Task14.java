package Assignment_2_1;

import java.util.Scanner;

public class Task14 {
        public static int[][] array = new int[3][3];
        public static void main(String[] args) {
            int rowsum = 0;
            int colsum = 0;
            int rowmin = 99999;
            int colmin = 999999;
            Scanner scanner = new Scanner(System.in);
            for(int i = 0;i < array.length;i++){
                for(int j = 0;j < array[i].length;j++){
                    int num = scanner.nextInt();
                    rowsum += num;
                    array[i][j] = num;
                }
                if(rowsum < rowmin){
                    rowmin = rowsum;
                }
                rowsum = 0;
            }
            for(int i = 0;i < array.length;i++){
                for(int j = 0;j < array[i].length;j++){
                    colsum += array[j][i];
                }
                if(colsum < colmin){
                    colmin = colsum;
                }
                colsum = 0;
            }
            if(colmin > rowmin){
                System.out.println(rowmin);
            } else{
                System.out.println(colmin);
            }
        }
    }
