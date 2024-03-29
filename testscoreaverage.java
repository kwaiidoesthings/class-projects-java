import java.util.Formatter;
import java.util.Scanner;

public class testscoreaverage {
    public static void main(String[] args) {
    // var for each test and final test avg
    double test1;
    double test2;
    double test3;
    double test_avg; 

    // takes input for test 1,2,3
        Scanner test1_input = new Scanner(System.in);
        System.out.print("Enter first test score: ");
        test1 = test1_input.nextDouble();
        Scanner test2_input = new Scanner(System.in);
        System.out.print("Enter second test score: ");
        test2 = test2_input.nextDouble();
        Scanner test3_input = new Scanner(System.in);
        System.out.print("Enter third test score: ");
        test3 = test3_input.nextDouble();

    // math... ttl of numbers / amount of numbers = avg
        test_avg = (test1 + test2 + test3) / 3;

    // rounds the decimal to 2 digits, helps makes output clean
       Formatter testavg_round = new Formatter();
       testavg_round.format("%.2f", test_avg);

    // outputting each test score and its final average
        System.out.println("Test 1: " + test1);
        System.out.println("Test 2: " + test2);
        System.out.println("Test 3: " + test3);
        System.out.print("Final Average: " + testavg_round);

    // closes everything (to avoid memory leak, im learning :D)
    testavg_round.close();
    test1_input.close();
    test2_input.close();
    test3_input.close();
    }
}

