//Jason Sacerio COP2800
import java.util.Scanner;

// class header
public class SumofNum {
public static void main(String[] args) {
int solution = 0;
int num;

// asks user for number input which is called in for loop 
Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
num = input.nextInt();

// for loop that adds 1 to i and then performs addition to int solution until the num variable is reached
for (int i = 0; i <= num; i++){
    solution += i;
}
input.close();
System.out.print(solution);
}
}
