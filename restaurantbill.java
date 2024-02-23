import java.util.Scanner;

public class restaurantbill {
    public static void main(String[] args) {
    // const declaring tax and tip rate
      final double tax = .0675;
      final double tip = .20; 
    // vars declaring different factors 
      double meal;
      double tax_amount;
      double tip_amount;
      double meal_final;
    // takes input of amount of the meal
      Scanner input = new Scanner(System.in);
      System.out.print("Enter meal amount: ");
      meal = input.nextDouble();
    // math calc for tip tax and final meal bill
      tax_amount = meal * tax;
      tip_amount = meal * tip;
      meal_final = meal + tip_amount + tax_amount;
    // output (should i always be using formatting (%n %s etc?))
      System.out.println("Meal: " + meal);
      System.out.println("Tax: " + tax_amount);
      System.out.println("Tip: " + tip_amount);
      System.out.println("Total: " + meal_final);
      input.close();
    }
}
