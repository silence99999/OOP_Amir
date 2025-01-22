import mypackage.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Database database = new MySQL();

    public static void main(String[] args) {

        Human miras = new Human();
        Human amir = new Human("Amir", 18);
        Human amiran = new Human("Amiran");

        amir.setAge(20);

        System.out.println(amir.getAge());
    }

    public static void otherFunc() {
        // ...

        database.GetAllUsers();

        // ...

        database.SaveUser();
    }
}