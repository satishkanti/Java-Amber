class Vehicle {
    private String make;
    private String model;
    private int year;
    private int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " Car is driving.");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " Bike is driving.");
    }
}

public class InheritanceAssignment1 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 180);
        Bike myBike = new Bike("Honda", "CBR500R", 2021, 150);

        System.out.println("Car attributes:");
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Maximum Speed: " + myCar.getMaximumSpeed());
        myCar.drive();

        System.out.println("\nBike attributes:");
        System.out.println("Make: " + myBike.getMake());
        System.out.println("Model: " + myBike.getModel());
        System.out.println("Year: " + myBike.getYear());
        System.out.println("Maximum Speed: " + myBike.getMaximumSpeed());
        myBike.drive();
    }
}
