/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

/**
 *
 * @author rwetz
 */
public class ScrabbleScore {

    public ScrabbleScore() {

    }

    public static int calculateScore(String word) {
        word.toLowerCase();
        if (word == null) {
            return -1;
        } else {
            switch (word.toLowerCase()) {
                case "":
                    return 0;
                case "e":
                    return 1;
                case "a":
                    return 1;
                case "i":
                    return 1;
                case "o":
                    return 1;
                case "n":
                    return 1;
                case "r":
                    return 1;
                case "t":
                    return 1;
                case "l":
                    return 1;
                case "s":
                    return 1;
                case "u":
                    return 1;
                case "d":
                    return 2;
                case "g":
                    return 2;
                case "b":
                    return 3;
                case "c":
                    return 3;
                case "m":
                    return 3;
                case "p":
                    return 3;
                case "f":
                    return 4;
                case "h":
                    return 4;
                case "v":
                    return 4;
                case "w":
                    return 4;
                case "y":
                    return 4;
                case "k":
                    return 5;
                case "j":
                    return 8;
                case "x":
                    return 8;
                case "q":
                    return 10;
                case "z":
                    return 10;
                case "1":
                    return -1;
                case "2":
                    return -1;
                case "3":
                    return -1;
                case "4":
                    return -1;
                case "5":
                    return -1;
                case "6":
                    return -1;
                case "7":
                    return -1;
                case "8":
                    return -1;
                case "9":
                    return -1;
                default:
                    return -1;
            }
        }
    }
}
