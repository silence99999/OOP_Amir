package Assignment_2_1;

public class Task9 {
    public static int[][] result = new int[10][];
    public static void main(String[] args){
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i+1];
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
            }
        }
        for(int i = 0;i < result.length;i++){
            for (int j = 0;j < result[i].length;j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
