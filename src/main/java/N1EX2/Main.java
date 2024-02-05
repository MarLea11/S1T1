package N1EX2;

// TODO: 1. Create a class called "Car" with the attributes: brand, model and power.
// Brand must be STATIC FINAL, Model must be STATIC and Power FINAL. Show the difference between the three and indicate
// which one can be initialized in the class constructor.
// TODO: 2. Create a static method called "Stop" in the car class that shows the message "The car is stopping".
// TODO: 3. Create a non-static method called "Accelerate" in the car class that shows the message "The car is accelerating".
// TODO: 4. Demonstrate how to call and use the STATIC and NON-STATIC method from the main class.

public class Main {

    public static void main(String[] args) {

        // 4. THE STATIC METHOD CALLED USING THE CLASS WITHOUT CREATING THE OBJECT
        System.out.println(Car.stop("The car is stopping"));

        System.out.println(Car.getBrand());


        Car car1 = new Car();

        // 4. THE NON-STATIC METHOD HAS TO BE CALLED AFTER CREATING AN INSTANCE OF THE OBJECT
        System.out.println(car1.accelerate("The car is accelerating"));

        System.out.println(car1.getModel());
        System.out.println(car1.getPower());
    }

}
