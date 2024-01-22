package Questions;

import ProvidedClasses.Student;

/**
 *
 * @author (ryan wetzstein)
 */
public class Question1 {

    public static boolean[] question1(int age, String personName, Student aStudent, boolean a, boolean b) {
        /*   For this Exercise, you will be writing 8 different conditional expressions in order to solve a stated problem.
		*    There are five variables being passed as arguments to this method that you will use as part of your solution:
		*       An int variable with the identifier age
		*       A String variable with the identifier personName
		*       A Student variable with the identifier aStudent
		*       Two boolean variables with the identifiers a and b
		*
		*    HINT: It is not necessary to use any if statements to complete this part of the Lab04 assignment.
		*    CHALLENGE: Make all of your solutions a single statement.
         */
 /*  1) Declare a boolean varaible with the identifier condition1 and assign it a value based on the following instructions:
		*       The value of a boolean expression involving the int variable age that evaluates to true based on the following conditions:
		*        The value of age is greater than or equal to 65.
         */

        boolean condition1 = (age >= 65);
        /*  2) Declare a boolean variable with the identifier condition2 and assign it a value based on the following instructions:
		*       The value of a boolean expression involving the String personName that evaluates to true based on the following conditions:
		*        The person's name comes before 'N' alphabetically (i.e., their names starts with A - M)
         */
        boolean condition2 = personName.toLowerCase().charAt(0) < 'n';


        /*  3) Declare a boolean variable with the identifier condition3 and assign it a value based on the following instructions:
		*       The result of a boolean expression involving the Student variable aStudent that evaluates to true based on the following conditions:
		*        The ID of the student contains no more than 7 digits in it.
         */
        boolean condition3 = aStudent.getID() <= 9999999;


        /*  4) Declare a boolean variable with the identifier condition4 and assign it a value based on the following instructions:
		*      The result of a boolean expression involving the int variable age that evaluates to true based on the following conditions:
		*       The value of age is in the range 18 to 24 inclusive.
         */
        boolean condition4 = age >= 18 && age <= 24;


        /*  5) Declare a boolean variable with the identifier condition5 and assign it a value based on the following instructions:
		*      The result of a boolean expression involving the String variable personName that evaluates to true based on the following conditions:
		*       The first or last letter in the String is an 'a' regardless of case (i.e., 'A' is also valid)
         */
        boolean condition5 = personName.toLowerCase().startsWith("a") || personName.toLowerCase().endsWith("a");


        /*  6) Declare a boolean variable with the identifier condition6 and assign it a value based on the following instructions:
		*      The result of a boolean expression involving the Student variable aStudent that evaluates to true based on the following conditions:
		*       The student's average grade for 3 exam scores is greater than 60.
         */
        boolean condition6 = (double)(aStudent.getExamScore1() + aStudent.getExamScore2() + aStudent.getExamScore3()) / 3 > 60;


        /*  7) Declare a boolean variable with the identifier condition7 and assign it a value based on the following instructions:
		*      The result of a boolean expression involving the Student variable aStudent and the String variable personName that evaluates to true based on the following conditions:
		*       The combined length of personName and the student's name is less than 10 characters or greater than 20 characters.
		*       You should exclude spaces from your calculation.
         */
        boolean condition7 = (aStudent.getName().replace(" ", "").length() + personName.replace(" ", "").length() > 20 || aStudent.getName().replace(" ", "").length() + personName.replace(" ", "").length() < 10);


        /*  8) Declare a boolean variable with the identifier condition8 and assign it a value based on the following instructions:
		*      The result of a boolean expression involving the boolean variables a and b that models the logical implication ( -> ) operator. The expected behavior is:
		*       if both a and b are true, a -> b (i.e., a implies b) is true
		*       if a is true and b is false, a -> b (i.e., a implies b) is false
		*       if a is false, a -> b (i.e., a implies b) is true regardless of the value of b
         */
        boolean condition8 = !a || b;
        // Necessary for unit tests. Do not modify.
        return new boolean[]{condition1, condition2, condition3, condition4, condition5, condition6, condition7, condition8};
    }

    // Main method for testing code.
    public static void main(String[] args) {
        // Modify these values to test your code
        int age = 17;
        String personName = "Betty";
        Student aStudent = new Student();
        boolean a = false;
        boolean b = true;

        // Do not modify:
        boolean[] results = question1(age, personName, aStudent, a, b);
        for (int i = 0; i < results.length; i++) {
            System.out.println("condition" + (i + 1) + ": " + results[i]);
        }
    }

}
