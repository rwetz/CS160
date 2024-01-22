/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyUnitTests;

import ProvidedClasses.Restaurant;
import ProvidedClasses.Restaurant.Mode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class DiscountMethodTest {

    // This field intentionally left public to allow for unit tests to function properly.
    public static Restaurant testRestaurant;

    /**
     * This method runs before any unit tests are run and initializes a common
     * test object that can be used by each of the different unit tests. You can
     * use the default constructor for the Restaurant class to have a random
     * test mode (i.e. what version of the discount method is used) each time or
     * you can use the Constructor method that allows you to set the Mode for
     * specific testing. Don't remove the selection statement as it is necessary
     * for the unit tests to function properly.
     */
    @BeforeClass
    public static void BeforeClass() {
        // Do not remove selection statement
        if (testRestaurant == null) {
            // You can modify the Mode as you wish or use a Random mode each time
            // testRestaurant = new Restaurant();     // Random Mode
            testRestaurant = new Restaurant(Mode.ALWAYS_TRUE); // Specific Mode
        }

        // Announce which mode is being used and describe it. 
        System.out.println("Testing Restaurant with " + testRestaurant.getMode() + " Mode: " + testRestaurant.getModeDescription());
    }

    @Test
    public void testExample() {
        // setup test parameters
        int age = 10;
        boolean militaryStatus = false;

        // determined expected value and actual value
        boolean expected = false;
        boolean actual = testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus);

        // use assert method to compare
        assertEquals("\"Testing for age " + age + " and militaryStatus: " + militaryStatus + "\"", expected, actual);
    }

    @Test 
    public void testChild() {
        int age = 1;
        boolean militaryStatus = false;
        assertTrue(testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus));
    }
    public void testAdult() {
        int age = 18;
        boolean militaryStatus = false;
        assertTrue(testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus));
    }
    public void testMS() {
        int age = 16;
        boolean militaryStatus = true;
        assertTrue(testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus));
    }
    public void testNegativeAge() {
        int age = -5;
        boolean militaryStatus = false;
        assertTrue(testRestaurant.checkIfCustomerGetsDiscount(age, militaryStatus));
    }
}
    
