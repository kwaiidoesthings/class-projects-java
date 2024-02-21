//Jason Sacerio COP2800
import java.text.DecimalFormat;
import java.util.Scanner;

// class header
public class mobileserviceproviderparttwo{

     // method that determines whether user went over minute limit for package A and then determines math for how much the monthly plan is along with the savings for package A in comparison to B or C
    static void PackageA(int minutes) {
        final double packcost = 39.99;
        final double pack_overlimit_cost = .45;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        if(minutes < 450){
            System.out.print("Monthly Cost: $39.99" + "\n");
        }
        else if(minutes < 901){
            double savingsB = 59.99;
            double savingsC = 69.99;
            double adjusted_cost = (minutes - 450) * pack_overlimit_cost + packcost;
            System.out.print("Monthly Cost: $" + numberFormat.format(adjusted_cost) + "\n");

            if (adjusted_cost > savingsB) {
                double  adjusted_savingsB = adjusted_cost - savingsB;
                  System.out.println("You would have saved $" + numberFormat.format(adjusted_savingsB) + " if you had gotten package B" + "\n");
              }
              else if(adjusted_cost > savingsC){
                  System.out.println("You would have saved $" + numberFormat.format(savingsC) + " if you had gotten package C" + "\n");
              }
        }
        else{
            double adjusted_cost = (minutes - 450) * pack_overlimit_cost + packcost;
            System.out.print("Monthly Cost: $" + numberFormat.format(adjusted_cost) + "\n");

            double savingsB = 0.00;
            double savingsC = 0.00;
            savingsB = (59.99 + ((minutes - 900) * .40));
            savingsC = 69.99;
    
            if (adjusted_cost > savingsB) {
              double  adjusted_savingsB = adjusted_cost - savingsB;
                System.out.println("You would have saved $" + numberFormat.format(adjusted_savingsB) + " if you had gotten package B" + "\n");
            }
            else if(adjusted_cost > savingsC){
                System.out.println("You would have saved $" + numberFormat.format(savingsC) + " if you had gotten package C" + "\n");
            }
        }

    }

 // method that determines whether user went over minute limit for package B and then determines math for how much the monthly plan is along with the savings for package B in comparison to C
    static void PackageB(int minutes) {
      final double packcost = 59.99;
      final double pack_overlimit_cost = .40;
      DecimalFormat numberFormat = new DecimalFormat("#.00");
      if(minutes < 900){
          System.out.print("Monthly Cost: $59.99");
      }
      else{
          double adjusted_cost = (minutes - 900) * pack_overlimit_cost + packcost;
          System.out.print("Monthly Cost: $" + numberFormat.format(adjusted_cost) + "\n");
          double savingsC = adjusted_cost - 69.99;
    
            if (adjusted_cost > savingsC) {
                System.out.println("You would have saved $" + numberFormat.format(savingsC) + " if you had gotten package C" + "\n");
            }

      }
    }
// method that prints packageC cost
    static void PackageC(int minutes) {
      final double packcost = 69.99;
      System.out.print("Monthly Cost: $" + packcost);
      }
  
    public static void main(String[] args) {
    // asks and takes user input for minutes and package type 
        double minutes = 0;
        String pack = "";
    Scanner input = new Scanner(System.in);
     System.out.print("Enter Package: ");
        pack = input.nextLine().toUpperCase();
     System.out.print("Enter minutes: ");
        minutes = input.nextInt();

    // sends minutes to correct package type
        if (pack.equals("A")) {
            PackageA((int) minutes);
        }
        else if(pack.equals("B")) {
            PackageB((int) minutes);
        }
        else if(pack.equals("C")) {
            PackageC((int) minutes);
        }
        else{
            System.out.print("Error! Not a valid package type.");
        }


        input.close();
        }

    }