package ProvidedClasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ryan
 */
public class ArrayUtilities {

    static int[] array;
    static int[] array2;

    public static boolean arraysAreEqual(int[] array1, int[] array2) {
        if (array1 == array2) {
            return true;
        } else if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    private static int[] resizeArray(int[] array, int factor) {
        int newArrayLength = array.length * factor;
        int[] newArray = new int[newArrayLength];
        return newArray;
    }

    public static int[] resizeArray(int[] array) {
        return resizeArray(array, 2);
    }

    public static int[] copyArray(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    public ArrayUtilities() {

    }
}
