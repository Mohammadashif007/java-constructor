public class Bike {
    String brand;
    int year;
    int price;
    boolean isConvenient;

    Bike(String brand, int year, int price, boolean isConvenient) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.isConvenient = isConvenient;
    }

    void bikeInfo() {
        if ((brand.equals("Yamaha") || brand.equals("Harly-Davidson") || brand.equals("honda")) && price <= 20000 && year > 2010) {
            System.out.println(brand+" This Bike is suitable for me");
        } else {
            System.out.println("Over the boundary");
        }
    }

    public static void main(String[] args) {
        Bike perfectBike = new Bike("Harly-Davidson", 2000, 500000, true);
        perfectBike.bikeInfo();
    }

}
