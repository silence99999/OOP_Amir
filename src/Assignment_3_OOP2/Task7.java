package Assignment_3_OOP2;

public class Task7 {
    public class Programmer {
        private int salary = 1000;

        public int getSalary() {
            return salary;
        }
        public void setSalary(int newSalary){
            if (newSalary > salary){
                salary = newSalary;
            }
        }
    }
}
