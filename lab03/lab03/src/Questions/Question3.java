package Questions;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author (ryan wetzstein)
 */
public class Question3 {

    public static Object[] question3(double project1cost, double project2cost, double budget) {
        /**
         * For this portion of the assignment you will be working with the
         * NumberFormat class and using factory methods to create instances of
         * that class.
         *
         * Additionally we will be using variables that are passed as parameters
         * to a method. If you look immediately above these instructions you
         * will notice what's referred to as a method header. Among other
         * things, this header specifies 3 variables of type double. These are
         * parameters to a method and you will be using them as part of your
         * solution.
         *
         * Because the declaration for these variables has already been done as
         * part of the method header, it is not necessary for you to declare any
         * of the variables project1cost, project2cost, or budget that you will
         * be using below.
         *
         * Note: You will need to import the NumberFormat and Locale classes
         * which are located in the java.text and the java.util packages
         * respectively.
         *
         * Note: The unit tests for this file cannot be run until all steps have
         * been completed.
         */

        /**
         * 1) Declare a NumberFormat variable with the identifier USCurrency and
         * use one of the factory methods of the NumberFormat class to to get an
         * object that formats currency with the default locale (US)
         */
        NumberFormat USCurrency = NumberFormat.getCurrencyInstance(Locale.US);

        /**
         * 2) Declare a NumberFormat variable with the identifier FrenchCurrency
         * and use one of the factory methods of the NumberFormat class to get
         * an object that formats currency using the locale Locale.FRANCE Note:
         * You want to use the Locale.FRANCE not the Locale.FRENCH
         */
        NumberFormat FrenchCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /**
         * 3) Declare a NumberFormat variable with the identifier USPercent and
         * use one of the factory methods of the NumberFormat class to get an
         * object that formats percentages with the default locale (US)
         */
        NumberFormat USPercent = NumberFormat.getPercentInstance(Locale.US);

        /**
         * 4) Declare a NumberFormat variable with the identifier FrenchPercent
         * and use one of the factory methods of the NumberFormat class to get
         * an object that formats percentages using the locale Locale.FRANCE
         * Note: You want to use the Locale.FRANCE not the Locale.FRENCH
         */
        NumberFormat FrenchPercent = NumberFormat.getPercentInstance(Locale.FRANCE);

        /**
         * 5) Declare a String variable with the identifier USOutput and assign
         * it a value similar to the following:
         *
         * The cost of the first project is $formattedCost1 which is
         * $formattedPercent1 of the budget.
         *
         * NOTE: Here $formattedCost1 should be the value of the variable
         * project1cost formatted for the US and $formmatedPercent1 should be
         * the percentage of the budget formatted for the US.
         */
        String USOutput = "The cost of the first project is " + USCurrency.format(project1cost) + " which is " + USPercent.format(project1cost / budget) + " of the budget.";

        /**
         * 6) Declare a String variable with the identifier FrenchOutput and
         * assign it a value similar to the following:
         *
         * The cost of the second project is $formattedCost2 which is
         * $formattedPercent2 of the budget.
         *
         * NOTE: Here $formattedCost2 should be the value of the variable
         * project2cost formatted for France and $formmatedPercent2 should be
         * the percentage of the budget formatted for France.
         */
        String FrenchOutput = "The cost of the second project is " + FrenchCurrency.format(project2cost) + " which is " + FrenchPercent.format(project2cost / budget) + " of the budget.";

        // Necessary for Unit Tests. Do not delete.
        return new Object[]{USCurrency, FrenchCurrency, USPercent, FrenchPercent, USOutput, FrenchOutput};
    }
}
