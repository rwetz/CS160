package Questions.Chapter8;

/**
 *
 * @author (ryan wetzstein)
 */
public class Question1 {

    /*  For this portion of the assignment, you will be declaring and instantiating several different arrays.
	 *	You may use any identifier you would like, but they should be meaningful given the context of the problem.
     */
    public static Object[] Question1() {
        /*	1) Create an array of type int that will be used to store the scores of a student's five assignments.
		 *	   You do not need to modify the values of this array after it is instantiated.
         */
        int[] studentScores = new int[5];


        /*	2) Create an array of type String that will be used to store the names of ten people.
		 *		a) Assign the value "Jill" to the element index position three (3) of the array.
		 *		b) Assign the value of "Jack" to the ninth (9th) element of the array.
         */
        String[] names = new String[10];
        names[3] = "Jill";
        names[8] = "Jack";


        /*	3) Create an array of type double that will be used to store the tip amounts earned by a waiter
	     *		a) Explicitly assign the array the following values (in this order) during instantiation:
		 *              * 7.34
	     *			* 4.72
	     *			* 9.32
	     *			* 8.25
         */
        double[] tipAmounts = {7.34, 4.72, 9.32, 8.25};


        /*	4) Create an array of type boolean that will store responses to a true/false question for 17 people
		 *	   An interesting pattern occured with the results where every third person responded true and all others false.
		 *		a) Write a for loop that assigns every third element in the array the value true.
         */
        boolean[] responses = new boolean[17];

        for (int i = 0; i < responses.length; i++) {
            if (i == 2) {
                responses[2] = true;
            } else if (i == 5) {
                responses[5] = true;
            } else if (i == 8) {
                responses[8] = true;
            } else if (i == 11) {
                responses[11] = true;
            } else if (i == 14) {
                responses[14] = true;
            } else if (i == 17) {
                responses[17] = true;
            }
        }


        /*	5) The waiter from part 3 just had a few last minute customers stop.
		 *		a) Create a new array that has room for an additional two tips.
		 *		b) Copy the values of the first four elements from the array created in step 2 into this array
		 *         Hint: You can use a for loop to accomplish this
		 *		c) Assign a value of 1.05 for the tip left by the fifth customer.
		 *		d) Assign a value of 27.32 for the tip left by the last customer.
         */
        double[] tipAmounts2 = new double[6];
        for (int i = 0; i < tipAmounts.length; i++) {
            tipAmounts2[i] = tipAmounts[i];
        }
        tipAmounts2[4] = 1.05;
        tipAmounts2[5] = 27.32;

        /*	You may have noticed that the return type for this method is an Object array.
		 *	Return an Object array that includes as elements each of the five arrays you created above.
		 *	The elements of the array should be placed in the order in which they are created based on the above instructions.
         */
        Object[] array = {studentScores, names, tipAmounts, responses};

        return array;

    }
}
