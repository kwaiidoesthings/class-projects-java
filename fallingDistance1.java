// Jason Sacerio COP2800
import java.text.DecimalFormat;

//class header
public class fallingDistance1 {

/* method fallingDistance calls int time from main and puts time into formula
 d = 1/2 gt^2 represented by .5 * 9.8(gravity) * Math.pow(time,2), Math.pow puts time to the power of 2
 prints solution after
*/
public static double fallingDistance(int time){

double solution = .5 * 9.8 * Math.pow(time,2);
    return solution;
    }
// for loop that iterates 1-10 and calls fallingDistance to i to simulate test arguments 1-10
public static void main(String[] args) {
DecimalFormat numberFormat = new DecimalFormat("#.00");
    for (int i = 1; i < 11; i++){
        System.out.println(numberFormat.format(fallingDistance(i)) + " meters");
        
}}}