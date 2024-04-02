import java.util.ArrayList;
import java.util.Scanner;

public class determineGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        System.out.print("Enter a list of numbers (enter STOP when finished): ");
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                num.add(input.nextInt());
            } else {
                String token = input.next();
                if (token.equalsIgnoreCase("STOP")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'STOP'.");
                }
            }
        }

        System.out.print("Enter a number to compare: ");
        int n = input.nextInt();

        System.out.print("The numbers you entered are: ");
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Numbers greater than " + n + ": ");
        for (int i : num) {
            if (i > n) {
                System.out.print(i + " ");
            }
        }
    }
}