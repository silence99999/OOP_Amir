package Assignment_1;

public class exmp {
    public static void main(String[] args) {
        for (int i = 0;i < 10;i++){
                for (int f = 0; f <= 10-i; f++) {
                    System.out.print(" ");
            }
            for (int j = 0;j <= i;j++){
                System.out.print("8 ");
            }
            System.out.println("");
        }
    }
}
