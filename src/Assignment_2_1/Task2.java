package Assignment_2_1;

public class Task2 {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];
    public static void main(String[] args){
                //write your code here
        for(int i = 0; i < 5;i++) {
            if (i % 2 == 0) {
                strings[i] = ODD;
            } else {
                strings[i] = EVEN;
            }
        }
                System.out.print("index = 0");
                System.out.println(" value = " + strings[0]);
                System.out.print("index = 1");
                System.out.println(" value = " + strings[1]);
                System.out.print("index = 2");
                System.out.println(" value = " + strings[2]);
                System.out.print("index = 3");
                System.out.println(" value = " + strings[3]);
                System.out.print("index = 4");
                System.out.println(" value = " + strings[4]);
    }
}
