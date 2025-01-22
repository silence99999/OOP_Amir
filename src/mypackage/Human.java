package mypackage;

public class Human {
    private int age;
    private String name;
    protected String surname;

    public static String armor = "skin";

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public void SayHi() {
        System.out.println("Hi " + this.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            return;
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }
}
