package Assignment_1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("ENTER")){
                break;
            }
            sum += Integer.parseInt(input);
        }
        System.out.println(sum);
        scanner.close();
    }
}
