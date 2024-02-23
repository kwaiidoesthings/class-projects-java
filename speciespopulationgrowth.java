//Jason Sacerio COP2800
import java.text.DecimalFormat;
import java.util.Scanner;

// class header
public class speciespopulationgrowth {
public static void main(String[] args) {
//variables used and decimal formatter for visible pleasure
double population;
int days;
double daily_increase;
DecimalFormat numberFormat = new DecimalFormat("#.00");

// asks user for input of variables, population size, daily increase, and days of reproduction
Scanner input = new Scanner(System.in);
System.out.print("Enter starting population: ");
    population = input.nextInt();
System.out.print("Enter population increase as a percentage: ");
    daily_increase = input.nextDouble();
System.out.print("Enter amount of days: ");
    days = input.nextInt();

//turns percentage into decimal form for calculations
daily_increase = daily_increase / 100;

/*for loop that continues until i reaches days. to determine population increase i use population * daily increase then add the product to population
printed population at the beginning for logical purposes, day 0 would be the starting population and day 1 would be the first day of replication. not 100% sure if thats what the assignment intended*/
for (int i = 0; i <= days; i++){
System.out.println("Day " + i + " Population: " + numberFormat.format(population));
double increase = population * daily_increase;
population = increase + population;
}
input.close();
}}