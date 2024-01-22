/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyUnitTests;

import org.junit.Test;
import static org.junit.Assert.*;
import Questions.ScrabbleScore;

/**
 *
 * @author araderma
 */
public class ScrabbleScoreTest {

    ScrabbleScore score;

    public ScrabbleScoreTest() {
    }

    @Test
    public void templateTest() {
        // setup test values

        // set expected result
        // get actual result
        // compare expected and actual results
    }

    @Test
    public void testValidWord() {
        // Test a valid word
        String inputWord = "boy"; // Replace with a valid word
        int expectedResult = 8; // Replace with the expected score
        int actualResult = ScrabbleScore.calculateScore(inputWord);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testInt() {
        String inputWord = "123";
        int expectedResult = -1;
        int actualResult = ScrabbleScore.calculateScore(inputWord);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testEmptyWord() {
        // Test an empty word
        String inputWord = "";
        int expectedResult = 0;
        int actualResult = ScrabbleScore.calculateScore(inputWord);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUppercaseWord() {
        // Test a word with uppercase letters
        String inputWord = "HELLO";
        int expectedResult = 8; // Assuming uppercase letters are also valid
        int actualResult = ScrabbleScore.calculateScore(inputWord);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSpecialCharacters() {
        // Test a word with special characters
        String inputWord = "$*%"; // Replace with a valid word containing special characters
        int expectedResult = -1; // Special characters should make the word invalid
        int actualResult = ScrabbleScore.calculateScore(inputWord);
        assertEquals(expectedResult, actualResult);
    }

}
