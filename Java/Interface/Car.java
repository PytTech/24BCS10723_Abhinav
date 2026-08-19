package Interface;


interface Drivable {
    public void Drive();
}

class Vehicle {
    String Brand;
    String Speed;

    Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    Vehicle(String a) {
        System.out.println(a);
    }

    public void move() {
        System.out.println("Move method");
    }
}

public class Car extends Vehicle implements Drivable {
    @Override
    public void Drive() {
        System.out.println("Drive method");
    }

    int[] Seats = new int[4];

    Car() {
        System.out.println("Car Constructor");
    }

    Car(String a) {
        super(a);
        System.out.println("Car Constructor");
    }

    public void Display() {
        System.out.println("Display method");
    }

    public static void main(String[] args) {
        Car cr = new Car("toyota");
        cr.move();
        cr.Drive();
        cr.Display();
    }
}