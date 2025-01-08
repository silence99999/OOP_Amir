package Assignment_2_2;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }
    public static void reverseArray(int[] array) {
        int[] copyarr = new int[array.length];
        int j = 0;
        for(int i = array.length - 1;i >= 0;i--){
            copyarr[j] = array[i];
            j++;
        }
        for(int i = 0;i < copyarr.length;i++){
            array[i] = copyarr[i];
        }
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
