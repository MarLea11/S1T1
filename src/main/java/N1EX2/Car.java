package N1EX2;

public class Car {

    // CLASS ATTRIBUTES
    private static final String brand = "BMW";
    private static String model;
    private final int power;

    // BUILDER METHODS
    public Car() {
        //brand = "BMW";   // STATIC FINAL CANNOT BE INITIALIZED IN THE CONSTRUCTOR
        model = "4Door"; // STATIC CAN BE INITIALIZED IN THE CONSTRUCTOR
        power = 740; // FINAL CAN BE INITIALIZED IN THE CONSTRUCTOR THE VALUE IS PERMANENT AND CANNOT BE MODIFIED
    }

    public Car(String model, int power) {
        this.power = power;
    }

    // CLASS METHODS
    public static String stop(String statusMessage) {
        return statusMessage;
    }

    public String accelerate(String statusMessage) {
        return statusMessage;
    }

    // GETTERS
    public static String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

}

