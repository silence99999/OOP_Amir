package Assignment_3_interface;

public class Task10 {
    public static void main(String[] args) {

    }
    interface Person {
        void use(Person person );
        void startToWork();
    }
    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person,HasManagementPotential{
    }

    class Manager implements Boss {
        public void use(Person person ) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }

    }
    class Subordinate implements Secretary{
        public void use(Person person ) {
        }

        public void startToWork() {
        }
    }
}
