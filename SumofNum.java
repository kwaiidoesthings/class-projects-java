//Jason Sacerio COP2800
import java.util.Scanner;

// class header
public class SumofNum {
public static void main(String[] args) {

int solution = 0;
int num;
Scanner input = new Scanner(System.in);
System.out.print("Enter number: ");
num = input.nextInt();

for (int i = 0; i <= num; i++){
    solution += i;
}
System.out.print(solution);
}
}
