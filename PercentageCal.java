/* Exercise 1.1
Write a program to calculate the percentage of a given student in the CBSE board exam.
His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
*/
import java.util.Scanner;

public class PercentageCal{
    public static void main(String [] args){

        // Varibale declaration
        String stuName;
        int sub1;
        int sub2;
        int sub3;
        int sub4;
        int sub5;
        //final int TOTAL_MARKS = 100;
        final int TOTAL_SUBJECTS = 5;
        final int FAIL_MARK = 49;

        Scanner userInput = new Scanner(System.in); // creating a Scanner object

        System.out.println("Hi enter your full name: "); // print line for the user to enter their name
        stuName = userInput.nextLine(); // storing the name in the stuName variable

        System.out.println("Hi, " + stuName + " enter your marks(1-100) for Math: "); // asking user to enter their marks for that subject
        sub1 = userInput.nextInt(); // storing the mark in the sub1 variable

        System.out.println("Hi, " + stuName + " enter your marks(1-100) for English: "); // asking user to enter their marks for that subject
        sub2 = userInput.nextInt(); // storing the mark in the sub2 variable

        System.out.println("Hi, " + stuName + " enter your marks(1-100) for Biology: "); // asking user to enter their marks for that subject
        sub3 = userInput.nextInt(); // storing the mark in the sub3 variable

        System.out.println("Hi, " + stuName + " enter your marks(1-100) for Chemistry: "); // asking user to enter their marks for that subject
        sub4 = userInput.nextInt(); // storing the mark in the sub4 variable

        System.out.println("Hi, " + stuName + " enter your marks(1-100) for Physics: "); // asking user to enter their marks for that subject
        sub5 = userInput.nextInt(); // storing the mark in the sub5 variable

        /*This conditio checks if the student has failed any exam
        If a student gets less than 50 in any subject, the student will fail
        The user it given a print line and the system exits
        */
        if (sub1 <= FAIL_MARK || sub2 <= FAIL_MARK || sub3 <= FAIL_MARK || sub4 <= FAIL_MARK || sub5 <= FAIL_MARK) { // condition to check if the student got less than 50
            System.out.println("\n" + stuName + ", you FAILED the CBSE board exam");
            System.exit(0); // sytem exit
        }

        float stuTotalMark = sub1+sub2+sub3+sub4+sub5; // stores the sum of all subject mark
        float stuCGPA = (stuTotalMark / TOTAL_SUBJECTS); //average of all the subject

        System.out.println("\n" + stuName + ", your CBSE board exam CGPA is: " + stuCGPA + "%"); // print line with the result

        userInput.close(); // closing the scanner

    }
}