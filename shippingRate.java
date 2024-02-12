//Jason Sacerio COP2800
import java.util.Scanner;

// class header
public class shippingRate {

        public static void main(String[] args) {

        //variables that declare weight and miles, and constants that declare each weight limit and price for shipping, also calculation for shipping charge
            double weight, miles;
            final double less_then_two = 1.10;
            final double two_and_six_pounds = 2.20;
            final double six_and_ten_pounds = 3.70;
            final double over_ten = 3.80;
            double shippingcharge = 0;

        //asks user and reads input for weight and distance 
            Scanner input = new Scanner(System.in);
            System.out.print("Enter weight in pounds: ");
            weight = input.nextDouble();
            System.out.print("Enter distance to ship in miles: ");
            miles = input.nextDouble();

        //if else statement sorting the distance given and computing the final shipping charge
            if (weight < 2)
            shippingcharge = less_then_two * miles;
            else if (weight < 7)
            shippingcharge = two_and_six_pounds * miles;
            else if (weight < 11)
            shippingcharge = six_and_ten_pounds * miles;
            else if (weight > 10)
            shippingcharge = over_ten * miles;

        //prints shipping charge
        System.out.print("Shipping Charge: " + shippingcharge);
            input.close();
        }
    }