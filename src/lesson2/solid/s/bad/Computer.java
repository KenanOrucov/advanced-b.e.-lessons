package lesson2.solid.s.bad;

public class Computer {

    public static void main(String[] args) {

        Computer2 computer = new Computer2("Apple", "MacBook", 1000L);
        Computer2 computer2 = new Computer2("Samsung", "Notebook", 2000L);
        System.out.println(computer2);
        System.out.println(computer2);

    }

}
     class Computer2 {
        private String brand;
        private String model;
        private Long price;

        public Computer2(String brand, String model, Long price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Long getPrice() {
            return price;
        }

        public void setPrice(Long price) {
            this.price = price;
        }
    }

