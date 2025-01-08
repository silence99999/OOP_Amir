package Assignment_2_1;

public class Task8 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        int [][]MULTIPLICATION_TABLE = new int[10][10];
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                MULTIPLICATION_TABLE[i][j] = (i+1) * (j+1);
            }
        }
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                System.out.print(MULTIPLICATION_TABLE[i][j]);
                if(MULTIPLICATION_TABLE[i][j] >= 10){
                    System.out.print(" ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
