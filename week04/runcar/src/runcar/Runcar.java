
public class Car {

    private String make; // instance variables
    private String model;
    private int year;

    
    public Car() // default constructor
    {
    make ="Holden";
    model="commodore";
    year=2010; 
    }

    /**
     *
     * @param make
     * @param model
     * @param year
     */
    public Car(String make, String model, int year)
{
this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setmake(String make) {
        this.make = make;
    }

    public String getmake() {
        return make;
    }

    @Override
    public String toString() {
        return " make of the car : " + make + "\n"
                + "Model of the car: " + model + "\n"
                + "Year of the car : " + year + "\n"
                + "__________________________";
    }
}

public class Runcar {

    public static void main(String[] args) {
// create object or instance of the car class
        Car c1 = new Car(); // calling default constructor
        System.out.println(c1);
        Car c2 = new Car("Toyota", "Land cruiser", 2020);
//System.out.println(c2);
        c2.setmake("Honda");
        System.out.println(c2);
        System.out.println("make of car c1 " + c1.getmake());
        System.out.println("make of car c2 " + c2.getmake());
    }
}
