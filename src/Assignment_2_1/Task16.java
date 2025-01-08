package Assignment_2_1;

import java.util.Scanner;

public class Task16 {
    public static char[][] array;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();


        int width = 2 * height - 1;


        array = new char[height][width];


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = ' ';
            }
        }


        for (int i = 0; i < height; i++) {

            int hashes = 2 * i + 1;

            int startPos = (width - hashes) / 2;


            for (int j = startPos; j < startPos + hashes; j++) {
                array[i][j] = '#';
            }
        }


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

