/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author ryan.wetzstein
 */
public class Conversion {

    //constructor//
    private Conversion() {

    }

    //methods//
    public static int celsiusToFahrenheit(int temp) {
        return (int) (temp * 1.8 + 32);
    }

    public static int fahrenheitToCelsius(int temp) {
        return (int)((temp - 32) /  1.8);
    }

    public static int metersToInches(int meters) {
        return (int) (meters * 39.3701);
    }

    public static int inchesToMeters(int inches) {
        return (int) (inches * 0.0254);
    }

    public static double celsiusToFahrenheit(double temp) {
        return temp * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(double temp) {
        return (temp - 32) / 1.8;
    }

    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

}
