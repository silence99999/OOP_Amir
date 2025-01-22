package mypackage;

public class Gopnik extends Human implements Database, Eatable{
    public int money;

    @Override
    public void SayHi() {
        System.out.println("ку епта");
        System.out.println(this.surname);
    }

    @Override
    public void GetAllUsers() {

    }

    @Override
    public void SaveUser() {

    }
}
