//Jason Sacerio COP2800
import java.text.DecimalFormat;
import java.util.Scanner;

// class header
public class mobileserviceprovider{

    static void PackageA(int minutes) {
        final double packcost = 39.99;
        final double pack_overlimit_cost = .45;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        if(minutes < 450){
            System.out.print("Monthly Cost: $39.99");
        }
        else{
            double adjusted_cost = (minutes - 450) * pack_overlimit_cost + packcost;
            System.out.print("Monthly Cost: $" + numberFormat.format(adjusted_cost));

        }

    }
    static void PackageB(int minutes) {
      final double packcost = 59.99;
      final double pack_overlimit_cost = .40;
      DecimalFormat numberFormat = new DecimalFormat("#.00");
      if(minutes < 900){
          System.out.print("Monthly Cost: $59.99");
      }
      else{
          double adjusted_cost = (minutes - 900) * pack_overlimit_cost + packcost;
          System.out.print("Monthly Cost: $" + numberFormat.format(adjusted_cost));

      }
    }
    static void PackageC(int minutes) {
      final double packcost = 69.99;
      System.out.print("Monthly Cost: $" + packcost);
      }
  
    public static void main(String[] args) {
        double minutes = 0;
        String pack = "";
    Scanner input = new Scanner(System.in);
     System.out.print("Enter Package: ");
        pack = input.nextLine().toUpperCase();
     System.out.print("Enter minutes: ");
        minutes = input.nextInt();

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