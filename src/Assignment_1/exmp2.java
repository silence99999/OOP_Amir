package Assignment_1;

public class exmp2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 0 || i == 4) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("Q");
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    if (j == 0 || j == 9) {
                        System.out.print("Q");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
