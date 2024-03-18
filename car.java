// Jason Sacerio COP2800

import java.util.Scanner;

public class car {
    public static int breakSpeed(int speed){
        return speed - 5;
    }
    public static int accelerate(int speed){
        return speed + 5;
    }
    public static void main(String[] args) {
    int yearModel;
    String make;
    int speed = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter Make of Car: ");
        make = input.nextLine();
    System.out.print("Enter Year of Model: ");
        yearModel = input.nextInt();

   

    for(int i = 0; i < 5; i++){
        speed = accelerate(speed);
            System.out.print("Current Speed: " + speed + "\n");
        }
    
    for (int i = 0; i < 5; i++){
        speed = breakSpeed(speed);
            System.out.print("Current Speed: " + speed + "\n");
        }
         
        input.close();
    }
}

