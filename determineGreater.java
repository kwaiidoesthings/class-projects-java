import java.util.ArrayList;
import java.util.Scanner;

public class determineGreater {

    /**
     * method asks user for n to use to compare the arraylist of numbers
     * @return n - number used in comparison
     */
    public int getCompareNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to compare: ");
        int n = input.nextInt();
        input.close();
        return n;
    }

    /**
     * method asks user for numbers to use to compare the arraylist of numbers, ends the arraylist when user says stop
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
        input.close();
        return num;
    }

    /**
     * Determines and prints which numbers in arrayList are bigger than n
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

    /* Creates an instance and calls the instance multiple times to run the program*/ 
    public static void main(String[] args) {
        determineGreater determineGreater = new determineGreater(); 
        ArrayList<Integer> num = determineGreater.getNumberList(); 
        int n = determineGreater.getCompareNum(); 
        determineGreater.compareTwo(n, num); 
    }

}
