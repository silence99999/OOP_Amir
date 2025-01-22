package Assignment_3_interface;

import mypackage.Eatable;

public class Task11 {
    public static void main(String[] args) {

    }
    class Dog implements Movable,Eat{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }
    class mouse implements Movable, Edible{
        @Override
        public void move() {

        }

        public void beEaten(){

        }

    }
    class cat implements Movable,Edible,Eat{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
        public void beEaten(){

        }
    }

    public interface Movable {
        void move();
    }
    //can be eaten
    public interface Edible {
        void beEaten();
    }
    // might eat someone
    public interface Eat {
        void eat();
    }
}
