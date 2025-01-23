package Assignment_3_OOP2;


    public class Iphone {
        private String model;
        private String color;
        private int price;
        public Iphone(String model, String color, int price) {
            this.model = model;
            this.color = color;
            this.price = price;
        }
        public boolean equals(Object obj){
            if (this == obj){
                return true;
            }
            if (obj == null){
                return false;
            }
            Iphone other = (Iphone) obj;
            return price == other.price && model.equals(other.model) && color.equals(other.color);
        }
        public static void main(String[] args) {
            Iphone iphone1 = new Iphone("X", "Black", 999);
            Iphone iphone2 = new Iphone("X", "Black", 999);
            System.out.println(iphone1.equals(iphone2));
        }
    }

