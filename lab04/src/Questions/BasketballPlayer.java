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
public class BasketballPlayer {

    //instance variables//
    private int jNumber;
    private String team;
    private int heightInCm;

    //default//
    public BasketballPlayer() {

    }

    //accessors//
    public int getJNumber() {
        return jNumber;
    }

    public String getTeam() {
        return team;

    }

    public int getHeightInCm() {
        return heightInCm;
    }

    //mutators//
    public void setJNumber(int jNumber) {

    }

    public void setTeam(String team) {

    }

    public void setHeightInCm(int heightInCm) {

    }

    @Override

    public String toString() {
        return "The Basketball player's jersey # is " + jNumber + ", and their team is " + team + ", and their height in centimeters is " + heightInCm;
    }

}
