import java.util.Scanner;

public class car {
    // fields, variables yearModel make and speed that are used in the program
    private int yearModel;
    private String make;
    private int speed;

    // Constructor for car object. uses this keyword to refer the instance to the constructor 
    public car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    /*
     * @return yearModel - the year the car was made
     */
    public int getYearModel() {
        return yearModel;
    }
    /*
     * @return getMake - the make of the car
     */
    public String getMake() {
        return make;
    }
    /*
     * @return speed - the speed the car is going
     */
    public int getSpeed() {
        return speed;
    }

    /* accelerate method increases speed by 5 
     * @return - speed +5 units
     */
    public void accelerate() {
        speed += 5;
    }

    /* brake method decreases speed by 5, avoids speed returning anything under 0 as speed can not be negative, 
     * @return - speed -5 units
     */ 
    public void brake() {
        speed -= 5;
        speed = Math.max(speed, 0);
    }

    public static void main(String[] args) {
        /*
        * takes user input for make and models years
        * and creates the car object
        */
        Scanner input = new Scanner(System.in);
        String make = "";
        int yearModel = 0;

        System.out.print("Enter make of car: ");
            make = input.nextLine();

        System.out.print("Enter the cars year: ");
            yearModel = input.nextInt();

        car Car = new car(yearModel, make);

       

        /*
         * for loop that runs the brake method 5 times incrementing speed by 5 each time and printing the speed
         */
        System.out.println("Accelerating:");
        for (int i = 0; i < 5; i++) {
            Car.accelerate();
            System.out.println("Current speed of " + Car.getYearModel() + " " + Car.getMake() + ": " + Car.getSpeed());
        }

        /*
         * for loop that runs the brake method 5 times decrementing speed by 5 each time and printing the speed
         */
        System.out.println("Braking:");
        for (int i = 0; i < 5; i++) {
            Car.brake();
            System.out.println("Current speed of " + Car.getYearModel() + " " + Car.getMake() + ": " + Car.getSpeed());
        }
    input.close();
    }
}
