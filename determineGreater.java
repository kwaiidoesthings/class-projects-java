import java.util.ArrayList;
import java.util.Scanner;

public class determineGreater {

    /**
     * Method asks user for n to use to compare the arraylist of numbers
     * @return n - number used in comparison
     */
    public int getCompareNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to compare: ");
        int n = input.nextInt();
        return n;
    }

    /**
     * Method asks user for numbers to use to compare the arraylist of numbers, ends the arraylist when user says STOP
     * @return num - list of numbers entered by the user
     */
    public ArrayList<Integer> getNumberList(){
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
        return num;
    }

    /**
     * Determines which numbers in arrayList are bigger than n
     * @param n - number used in comparison
     * @param num - list of numbers to be compared
     */
    public void compareTwo(int n, ArrayList<Integer> num){
        System.out.print("Numbers greater than " + n + ": ");
        for (int i : num) {
            if (i > n) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        determineGreater determineGreater = new determineGreater(); // Create an instance of the class
        ArrayList<Integer> num = determineGreater.getNumberList(); // Call instance method
        int n = determineGreater.getCompareNum(); // Call instance method
        determineGreater.compareTwo(n, num); // Call instance method

        // Close the Scanner instance after it's no longer needed
    }

}
