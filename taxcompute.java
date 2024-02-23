//scanner lib to take input
import java.util.Scanner;

// class header

public class taxcompute {

    public static void main(String[] args) {
    // variables to take base number
      double num;
      double state_num; 
      double county_num; 
      double num2;
    // consts
      final double state_tax = .04;
      final double county_tax = .02;
      
    // takes input 
      Scanner input = new Scanner(System.in);
        System.out.print("Enter Payment: ");
        num = input.nextDouble();

    // math calc to get final output
        state_num = num * state_tax;
        county_num = num * county_tax;
        num2 = num + county_num + state_num;
      
    // outputs
      System.out.println(num2);
      input.close();
}
}

