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
public class MyProgrammer {

    //instance variables//
    private boolean livesInSilliconValley;
    private int languagesKnown;
    private int helloWorldsPrinted;

    //default//
    public MyProgrammer() {

    }

    //accessors//
    public boolean getLivesInSilliconValley() {
        return livesInSilliconValley;
    }

    public int getLanguagesKnown() {
        return languagesKnown;
    }

    public int getHelloWorldsPrinted() {
        return helloWorldsPrinted;
    }

    //mutators//
    public void setLivesInSilliconValley(boolean livesInSilliconValley) {

    }

    public void setLanguagesKnown(int languagesKnown) {

    }

    public void setHelloWorldsPrinted(int hellowWorldsPrinted) {

    }

    @Override

    public String toString() {
        return "The programmer lives in Sillicon valley is " + livesInSilliconValley + ", and the amount of languages that the programmer knows is " + languagesKnown + ", and the amount of Hello Worlds printed is " + helloWorldsPrinted;
    }

}
