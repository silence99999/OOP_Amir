package Assignment_1;

public class Task12 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while(i != 100){
            if (i % 3 != 0) {
                sum += i;
                i++;
            }else{
                i++;
            }
        }
        System.out.println(sum);
    }
}
