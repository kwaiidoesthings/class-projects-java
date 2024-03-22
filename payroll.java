// Jason Sacerio COP2800

import java.text.DecimalFormat;
import java.util.Scanner;

public class payroll {
/* Fields */
    private String employeeName;
    private int employeeID;
    private double payRate, hoursWorked;

/*
 * constructor
 * @param name - employee name taken from user input
 * @param idNum - employees id number taken from user input
 */
    public payroll(String name, int idNum){
        employeeName = name;
        employeeID = idNum;
        payRate = 0.0;
        hoursWorked = 0.0;
    }
/*@return - employees name */
    public String getEmployeesName(){
        return employeeName;
    }
/* @return - employees ID */
    public int getEmployeeID(){
        return employeeID;
    }
    public double getPayRate(){
        return payRate;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    public void setHoursWorked(double hours){
        hoursWorked = hours;
    }
    public void setPayRate(double pay){
        payRate = pay;
    }
    public double calculateGrossPay(){
        return payRate * hoursWorked;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.print("Enter Employee Name: ");
          String name = input.nextLine();
        System.out.print("Enter Employees ID Number: ");
          int idNum = input.nextInt();

        payroll employeePayroll = new payroll(name, idNum);

        System.out.print("Enter Hourly Pay Rate: ");
            double payRate = input.nextDouble();
        System.out.print("Enter Hours Worked: ");
           double hoursWorked = input.nextDouble();

        employeePayroll.setPayRate(payRate);
        employeePayroll.setHoursWorked(hoursWorked);
        
        double grossPay = employeePayroll.calculateGrossPay();
        System.out.println("Gross pay for " + employeePayroll.getEmployeesName() + " (ID: " + employeePayroll.getEmployeeID() + "): $" + numberFormat.format(grossPay));
        input.close();
    }
}
