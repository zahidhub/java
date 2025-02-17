/*Write a Java program that performs the following tasks:

Ask the user how many employees they want to process.
For each employee, input their name and monthly salary.
Store the salaries in an array.
Calculate and display:
The average salary of all employees.
The highest salary and the employee who earns it.
The lowest salary and the employee who earns it.
Employees earning below $1480 should be marked as "Needs Salary Review" in the output. */

import java.util.Scanner; // importing scanner

public class EmployeeSal {
    
        public static void main(String[] args){
    
            Scanner userInput = new Scanner(System.in); // creating scanner object
    
            int employeeNum; // varibale to store the employee number
    
            System.out.println("How many employees you want to process: "); // asking for amount of employee to register
            employeeNum = userInput.nextInt(); // storing the number in the variable
            userInput.nextLine(); // to clear buffer
    
            String[] empName = new String[employeeNum]; // declaring array to store employee names
            int[] empSal = new int[employeeNum]; // declaring array to store employee salary
    
            for(int i = 0; i < employeeNum; i++){ // for loop to itirate through the array
                System.out.println("Enter employee" + (i+1) + " name: "); // asking to enter emlpoyee names
                empName[i] = userInput.nextLine(); // storing the employee name in the array indexes
    
                System.out.println("Enter employee" + (i+1) + " salary: "); // asking for the salary of that empoyee
                empSal[i] = userInput.nextInt(); // storing the salary of that empoyee in array indexes
                userInput.nextLine(); // clears buffer
            }
    
            int totalSal = 0; // variable to store the total amount of salary

            for(int salary : empSal){
                totalSal += salary; // incriment all the salary and storing in the varable
            }
    
            int averageSal = totalSal/employeeNum; // calculating avarage salary and storing in the variable

            int highestSal = empSal[0]; // varible to store the highest salary
            String highestSalEmp = empName[0]; // varible to store the employee name who gets the highest salary
            int lowestSal = empSal[0]; // varible to store the lowest salary
            String lowestSalEmp = empName[0];  // varible to store the employee name who gets the lowest salary
    
            for(int i = 0; i <employeeNum; i++){ // for loop to ititrate trhough the arrays
                if (empSal[i] > highestSal) { // checks if the empoyee salary in the index value is higher than the current highest salary

                    highestSal = empSal[i]; // assignig that index salary to the variable
                    highestSalEmp = empName[i]; // assigning the employee name in the varibale
                    
                }
                if (empSal[i] < lowestSal) { // checks if the empoyee salary in the index value is lower than the current highest salary

                    lowestSal = empSal[i]; // assignig that index salary to the variable
                    lowestSalEmp = empName[i]; // assigning the employee name in the varibale
                }

            }

            // printing the values according the requirment
            System.out.println("###Company Info###");
            System.out.println("The average salary of all employees: $" + averageSal);
            System.out.println("The highest salary is: $" + highestSal + ", " + highestSalEmp + " gets it.");
            System.out.println("The lowest salary is: $" + lowestSal + ", " + lowestSalEmp + " gets it.");

            int poorSalary = 1480; // storing the concerning salary
            boolean reviewEmpFound = true; // flag to control the printing

            for(int i = 0; i < employeeNum; i++){
    
                if (empSal[i] < poorSalary) { // check if the rmployee salary is lower than the concering salary
                    if (reviewEmpFound) { // check if any emplpyee found
                        System.out.println("----Needs Salary Review----"); // print line
                        reviewEmpFound = false; // flag to turn off the print
                    }
                    System.out.println(empName[i]); // print the employee names
                }
                
            }
            userInput.close(); // close the scannner

    }
    
}
