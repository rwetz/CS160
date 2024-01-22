/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author (Your Name Here)
 */
public class Question3 {

    /*  For this portion of the assignment you will need to create the Employee class
	*   based on the instructions in the API and have implemented the equals method for that class.
	*   You should complete that class before working on this part of the assignment.
	*
	*   There is one parameter being passed as to this method that you will use as part of your solution:
	*       An Employee object reference with the identifier testEmployee
     */
    public static void question3(Employee testEmployee) {

        /* 1) Instantiate an instance of the Employee class using the default constructor and
		*      assign it to an object reference with the identifier defaultEmployee
         */
        Employee defaultEmployee = new Employee();


        /* 2) Instantiate an instance of the Employee class using the alternate constructor,
		*      passing the following arguments:
		*          name: "Keanu Reeves"
		*          ID: 10010
		*          salary: 78000.00
		*      Assign the instance to an object reference with the identifier keanuEmployee
         */
        Employee keanuEmployee = new Employee("Keanu Reeves", 10010, 78000.00);


        /* 3) Declare a variable of type Employee with the identifier excellentEmployee and assign it
		*      a reference to the same object that is being referenced by the keanuEmployee object reference.
         */
        Employee excellentEmployee = keanuEmployee;


        /* 4) Construct a selection statement that tests if testEmployee is equal
		*      (has the same name and ID) as defaultEmployee or keanuEmployee
		*      If it is equal to defaultEmployee, print the following message:
		*          "The testEmployee is the same as the default employee."
		*      Else if it is equal to keanuEmployee, print the following message:
		*          "The testEmployee is the same as keanuEmployee. Excellent!"
		*      Otherwise print the following message:
		*          "The test employee was not the same as either of the employees I constructed."
         */
        if (testEmployee.getID() == (defaultEmployee.getID())) {
            System.out.println("The testEmployee is the same as the default employee.");
        } else if (testEmployee.getID() == (keanuEmployee.getID())) {
            System.out.println("The testEmployee is the same as keanuEmployee. Excellent!");
        } else {
            System.out.println("The test employee was not the same as either of the employees I constructed.");
        }


        /* 5) Check to see if testEmployee and keanuEmployee reference (point to) the same
		*      location in memory (i.e., reference the same object)
		*      If they do print out the following:
		*          "The testEmployee and keanuEmployee object references refer to the same memory location. Woah!"
		*      Otherwise print the following message:
		*          "The testEmployee and keanuEmployee object references don't refer to the same memory location."
         */
        if (testEmployee == keanuEmployee) {
            System.out.println("The testEmployee and keanuEmployee object references refer to the same memory location. Woah!");
        } else {
            System.out.println("The testEmployee and keanuEmployee object references don't refer to the same memory location.");
        }
        /* 6) Check to see if excellentEmployee and keanuEmployee reference (point to) the same
		*      location in memory (i.e., reference the same object)
		*      If they do print out the following:
		*          "The excellentEmployee and keanuEmployee object references refer to the same memory location."
		*      Otherwise print out the following message:
		*          "The excellentEmployee and keanuEmployee object references don't refer to the same memory location."
         */
        if (excellentEmployee == keanuEmployee) {
            System.out.println("The excellentEmployee and keanuEmployee object references refer to the same memory location.");
        } else {
            System.out.println("The excellentEmployee and keanuEmployee object references don't refer to the same memory location.");
        }
    }
}
