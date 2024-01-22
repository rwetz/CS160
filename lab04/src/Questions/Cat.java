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
public class Cat {

    //instance variables//
    private String catName;
    private int rodentsCaught;
    private boolean secretlyIsDeadly;

    //default//
    public Cat() {
    }

    //modifible//
    public Cat(String catName,
            int rodentsCaught,
            boolean secretlyIsDeadly) {
        this.catName = catName;
        this.rodentsCaught = rodentsCaught;
        this.secretlyIsDeadly = secretlyIsDeadly;
    }
    

    //acessor methods//
    public String getCatName() {
        return catName;
    }

    public int getRodentsCaught() {
        return rodentsCaught;
    }

    public boolean getSecretlyIsDeadly() {
        return secretlyIsDeadly;
    }

    //mutator methods//
    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setRodentsCaught(int rodentsCaught) {
        this.rodentsCaught = rodentsCaught;
    }

    public void setSecretlyIsDeadly(boolean secretlyIsDeadly) {
        this.secretlyIsDeadly = secretlyIsDeadly;
    }

    @Override

    public String toString() {
        return "The cat's name is " + catName + ", the cat's # of mice caught is " + rodentsCaught + ", and whether or not the cat wants to kill you is " + secretlyIsDeadly;
    }

}
