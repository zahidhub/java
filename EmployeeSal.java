/*Write a Java program that performs the following tasks:

Ask the user how many employees they want to process.
For each employee, input their name and monthly salary.
Store the salaries in an array.
Calculate and display:
The average salary of all employees.
The highest salary and the employee who earns it.
The lowest salary and the employee who earns it.
Employees earning below $3000 should be marked as "Needs Salary Review" in the output. */

import java.util.Scanner;

public class EmployeeSal {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);


        int employeeNum;


        System.out.println("How many employees you want to process");
        employeeNum = userInput.nextInt();

        String[] empName = new String[employeeNum];
        int[] empSal = new int[employeeNum];

        for(int i = 0; i <employeeNum + 1; i++){
            System.out.println("Enter employee" + (i+1) + " name: ");
            empName[i] = userInput.nextLine();

            System.out.println("Enter employee" + (i+1) + " salary: ");
            empSal[i] = userInput.nextInt();

        }

    }
    
}
