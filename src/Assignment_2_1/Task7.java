package Assignment_2_1;

import java.util.Scanner;

public class Task7 {
    public static String[] strings;
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0;i < strings.length;i++) {
            String input = scanner.nextLine();
            strings[i] = input;
        }
        for(int i = 0; i < strings.length;i++){
            if (strings[i] == null) continue;
            boolean duplicate = false;
            for(int j = 0;j < strings.length;j++){
                if (j != i && strings[j] != null && strings[j].equals(strings[i])) {
                    strings[j] = null;
                    duplicate = true;
                }
            }
            if(duplicate){
                strings[i] = null;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
