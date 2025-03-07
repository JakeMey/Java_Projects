public class Runcar {
    public static void main(String[] args) {
        Car c1 = new Car(); // calling default constructor
        System.out.println(c1);

        Car c2 = new Car("Toyota", "Land Cruiser", 2020); // calling parameterized constructor
        // c2.setMake("Honda"); // This line would cause an error since setMake is removed
        System.out.println(c2);

        System.out.println("Make of car c1: " + c1.getMake());
        System.out.println("Make of car c2: " + c2.getMake());
    }
}

class Car {
    private final String make; // instance variables
    private final String model;
    private final int year;

    public Car() { // default constructor
        this.make = "Holden";
        this.model = "Commodore";
        this.year = 2010;
    }

    public Car(String make, String model, int year) { // parameterized constructor
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // No setter for make or model because they are final
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Make of the car: " + make + "\n" +
               "Model of the car: " + model + "\n" +
               "Year of the car: " + year + "\n" +
               "__________________________";
    }
}