//Jason Sacerio COP2800
import java.text.DecimalFormat;
import java.util.Scanner;

// class header
public class speciespopulationgrowth {
public static void main(String[] args) {
double population;
int days;
double daily_increase;
DecimalFormat numberFormat = new DecimalFormat("#.00");

Scanner input = new Scanner(System.in);
System.out.print("What is the starting population of the species?");
    population = input.nextInt();
System.out.print("What is the daily increase of population as a percentage?");
    daily_increase = input.nextDouble();
System.out.print("How many days?");
    days = input.nextInt();

daily_increase = daily_increase / 100;

for (int i = 0; i < days; i++){
double increase = population * daily_increase;
population = increase + population;
}

System.out.println(numberFormat.format(population));



input.close();
}}