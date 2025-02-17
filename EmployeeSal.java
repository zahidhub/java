/*Write a Java program that performs the following tasks:

Ask the user how many employees they want to process.
For each employee, input their name and monthly salary.
Store the salaries in an array.
Calculate and display:
The average salary of all employees.
The highest salary and the employee who earns it.
The lowest salary and the employee who earns it.
Employees earning below $1480 should be marked as "Needs Salary Review" in the output. */

import java.util.Scanner;

public class EmployeeSal {
    
        public static void main(String[] args){
    
            Scanner userInput = new Scanner(System.in);
    
    
            int employeeNum;
    
    
            System.out.println("How many employees you want to process: ");
            employeeNum = userInput.nextInt();
            userInput.nextLine();
    
            String[] empName = new String[employeeNum];
            int[] empSal = new int[employeeNum];
    
            for(int i = 0; i < employeeNum; i++){
                System.out.println("Enter employee" + (i+1) + " name: ");
                empName[i] = userInput.nextLine();
    
                System.out.println("Enter employee" + (i+1) + " salary: ");
                empSal[i] = userInput.nextInt();
                userInput.nextLine();
            }
    
            int totalSal = 0;
            for(int salary : empSal){
                totalSal += salary;
            }
    
            int averageSal = totalSal/employeeNum;

            int highestSal = empSal[0];
            String highestSalEmp = empName[0];
            int lowestSal = empSal[0];
            String lowestSalEmp = empName[0];
    
            for(int i = 0; i <employeeNum; i++){
                if (empSal[i] > highestSal) {

                    highestSal = empSal[i];
                    highestSalEmp = empName[i];
                    
                }
                if (empSal[i] < lowestSal) {

                    lowestSal = empSal[i];
                    lowestSalEmp = empName[i];
                }

            }
    
            System.out.println("###Company Info###");
            System.out.println("The average salary of all employees: $" + averageSal);
            System.out.println("The highest salary is: $" + highestSal + ", " + highestSalEmp + " gets it.");
            System.out.println("The lowest salary is: $" + lowestSal + ", " + lowestSalEmp + " gets it.");

            int poorSalary = 1480;
            boolean reviewEmpFound = true;

            for(int i = 0; i < employeeNum; i++){
    
                if (empSal[i] < poorSalary) {
                    if (reviewEmpFound) {
                        System.out.println("----Needs Salary Review----");
                        reviewEmpFound = false;
                    }
                    System.out.println(empName[i]);
                }
                
            }
            userInput.close();

    }
    
}
