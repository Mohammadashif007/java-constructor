public class Car{
    String model;
    int year;
    Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("Model: "+ model +"," + "Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);
        car.displayInfo();
    }
}