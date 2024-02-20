package N1EX2;

public class App {

    private App(){}

    public static void runProgram() {

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
