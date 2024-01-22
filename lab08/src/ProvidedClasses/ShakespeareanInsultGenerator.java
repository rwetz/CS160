/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProvidedClasses;

import java.util.Random;

/**
 *
 * @author Ryan
 */
public class ShakespeareanInsultGenerator {

    //instance
    public static Random random = new Random();
    public static String[] firstWord = {"bawdy", "craven", "dankish", "frothy", "lumpish", "pribbling", "surly", "villainous"};
    public static String[] secondWord = {"beef-witted", "clay-brained", "dizzy-eyed", "flap-mouthed", "ill-nurtured", "motley-minded", "sheep-biting", "tickle-brained"};
    public static String[] thirdWord = {"bugbear", "clotpole", "harpy", "lout", "miscreant", "molwarp", "puttock", "wagtail"};

    public static String generateInsult() {
        String firstW = firstWord[random.nextInt(firstWord.length)];
        String secondW = secondWord[random.nextInt(secondWord.length)];
        String thirdW = thirdWord[random.nextInt(thirdWord.length)];
        return firstW + " " + secondW + " " + thirdW;
    }

}
