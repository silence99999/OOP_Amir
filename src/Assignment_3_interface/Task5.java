package Assignment_3_interface;

public class Task5 {
    public static void main(String[] args) {

    }
    public interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }
    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
    }
    public static class BeerLover implements Alcoholic{
        @Override
        public void askForMore(String message){

        }
        @Override
        public void sayThankYou(){

        }
        @Override
        public boolean isReadyToGoHome(){
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {

        }
    }
}
