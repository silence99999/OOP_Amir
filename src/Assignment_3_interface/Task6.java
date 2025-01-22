package Assignment_3_interface;

public class Task6 {
    public static void main(String[] args) {
    }
    interface Selectable {
        void onSelect();
    }
    interface Updatable {
        void refresh();
    }
    public static class Screen implements Selectable,Updatable{
        @Override
        public void onSelect(){

        }
        @Override
        public void refresh(){

        }
    }
}
