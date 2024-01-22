/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import ProvidedClasses.Student;

/**
 *
 * @author (Your Name Here)
 */
public class Question4 {

    /*  For this exercise you will be using for loops to calculate various values.
	 *
	 *  You will be making use of the following object references which are passed as arguments to this method:
	 *		A Student object reference student1
	 *		A Student object reference student2
	 *
	 *	You will need to use various accessor methods of the Student class to complete this assignment. Some
	 *   additional variables to be used as a part of your solution have already been declared in the method
	 *   below.
	 *
	 *  This program contains a main method that can be used to manually test your code by
	 *   right-clicking Question4.java and selecting "Run File"
     */
    public static Object[] question4(Student student1, Student student2) {
        // Additional variables to be used as part of your solution. Do not delete
        int student1HighestGrade, student2HighestGrade;
        double student1AverageGrade, student2AverageGrade;
        Student bestAverageGradeStudent, bestHighGradeStudent;

        /*  1) Set the value of student1HighestGrade to the highest grade for student1
         */
        for (int grade : student1.getExamScore(student1HighestGrade)) {
            if (grade > student1HighestGrade) {
                student1HighestGrade = grade;
            }
        }


        /*  2) Set the value of student2HighestGrade to the highest grade for student2
         */
        for (int grade : student2.getExamScore()) {
            if (grade > student2HighestGrade) {
                student2HighestGrade = grade;
            }
        }

        /*  3) Set the value of student1AverageGrade to the average grade for student1
         */
        int student1TotalGrades = 0;
        for (int grade : student1.getExamScore(student1HighestGrade)) {
            student1TotalGrades += grade;
        }
        student1AverageGrade = (double) student1TotalGrades / student1.getExamScore().length;

        /*  4) Set the value of student2AverageGrade to the average grade for student2
         */
        int student2TotalGrades = 0;
        for (int grade : student2.getExamScore()) {
            student2TotalGrades += grade;
        }
        student2AverageGrade = (double) student2TotalGrades / student2.getExamScore().length;
        /*  5) Assign the bestHighGradeStudent object reference whichever student has the best high grade
         */

        if (student1HighestGrade > student2HighestGrade) {
            bestHighGradeStudent = student1;
        } else if (student2HighestGrade > student1HighestGrade) {
            bestHighGradeStudent = student2;
        }
        /*  6) Assign the bestAverageGradeStudent object reference whichever student has the best average grade
         */

        if (student1AverageGrade > student2AverageGrade) {
            bestAverageGradeStudent = student1;
        } else if (student2AverageGrade > student1AverageGrade) {
            bestAverageGradeStudent = student2;
        }
        // Necessary for Unit Test
        return new Object[]{student1HighestGrade, student2HighestGrade, student1AverageGrade, student2AverageGrade, bestHighGradeStudent, bestAverageGradeStudent};
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s2.setName("John Doe");

        System.out.println("Student1: " + s1);
        System.out.println("Student2: " + s2);

        Object[] o = question4(s1, s2);

        System.out.println("student1HighestGrade    = " + (int) o[0]);
        System.out.println("student2HighestGrade    = " + (int) o[1]);
        System.out.println("student1AverageGrade    = " + (double) o[2]);
        System.out.println("student2AverageGrade    = " + (double) o[3]);
        System.out.println("bestHighGradeStudent    = " + ((Student) o[4]).getName());
        System.out.println("bestAverageGradeStudent = " + ((Student) o[5]).getName());
    }
}
