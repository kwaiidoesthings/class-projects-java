import java.util.Scanner;

public class payRollWithArray {
    
    private int[] employeeID = {5658845, 4520125, 7895122,
            8477541, 8451277, 1302850,
            7580489
    };

    //Number of hours worked by each employee
    private int[] hours = new int[7];

    //Employee's hourly pay rate
    private double[] payRate = new double[7];

    //Employee's gross wages.
    private double[] wages = new double[7];

    //accessor and mutator methods

    //returns id of index
    public int getEmployeeID(int index) {
        return employeeID[index];
    }

    //returns hours
    public int getHours(int index) {
        return hours[index];
    }

    //returns payrate
    public double getPayRate(int index) {
        return payRate[index];
    }

    //returns wages
    public double getWages(int index) {
        return wages[index];
    }

    //sets ID
    public void setEmployeeID(int index, int ID) {
        employeeID[index] = ID;
    }

    //Sets Hours
    public void setHours(int index, int hour) {
        hours[index] = hour;
    }

    //Sets Rate
    public void setPayRate(int index, double payrate) {
        payRate[index] = payrate;
    }

    //Sets Wages
    public void setWages(int index, double wage) {
        wages[index] = wage;
    }

    //Gross pay for each employee with identification

    public double calculateGrossPay(int theEmployeeID) {
        double grossPay = 0;
        int employeeIndex = -1; //index of the employee
        for (int i = 0; i < employeeID.length; i++) {
            if (employeeID[i] == theEmployeeID) {
                employeeIndex = i;
                break;
            }
        }
        if (employeeIndex != -1) {
            //gross pay for if employee was found.

            int h = hours[employeeIndex];
            double r = payRate[employeeIndex];
            grossPay = (h * r); //calculate the gross pay
        }
        return grossPay;
    }

    public static void main(String[] args) {
        payRollWithArray payroll = new payRollWithArray();
        Scanner kb = new Scanner(System.in);

        int hours;
        double payRate;
        double wages;

        for (int i = 0; i < 7; i++) {
            // Display the correct employee ID
            int employeeID = payroll.getEmployeeID(i);
            System.out.println("\nEnter the hours worked by employee number " + employeeID + ": ");
            hours = Integer.parseInt(kb.nextLine());

            // Validate hours
            while (hours < 0) {
                System.out.println("ERROR: Enter a non-negative value for hours: ");
                hours = Integer.parseInt(kb.nextLine());
            }
            payroll.setHours(i, hours);

            // Display the correct employee ID
            System.out.println("Enter the hourly pay rate for employee number " + employeeID + ": ");
            payRate = Double.parseDouble(kb.nextLine());

            // Validate pay rate
            while (payRate < 6.00) {
                System.out.println("ERROR: Enter 6.00 or greater for pay rate: ");
                payRate = Double.parseDouble(kb.nextLine());
            }
            payroll.setPayRate(i, payRate);

            wages = payroll.calculateGrossPay(employeeID);
            payroll.setWages(i, wages);
        }

        // Display payroll data
        System.out.println("\nPAYROLL DATA\n============");
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee ID: " + payroll.getEmployeeID(i));
            System.out.println("Gross pay: $" + payroll.getWages(i));
        }
    }
}