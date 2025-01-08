package Assignment_2_2;

public class Task7 {
    public static void main(String[] args) {
        String user = "user";
        signIn(user);
    }
    public static void signIn(String username){
        if(username == "user"){
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
