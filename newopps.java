class Car {
    String brand;
    int speed;
    void drive() {
        System.out.println(brand + "is driving at " + speed + "km/h");
    }
}
public class newopps {
    public static void main(String[] args) {
       Car c = new Car();
       c.brand ="Toyota";
       c.speed = 100;
       c.drive(); 
    }
}
