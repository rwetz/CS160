/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

/**
 *
 * @author ryan.wetzstein
 */
//DONE
public class Creature {

    //instance
    private String name;
    private String description;
    private String defeatedText;
    private Item item;

    //constructor
    public Creature(String name, String description, String defeatedText) {
        this.name         = name;
        this.description  = description;
        this.defeatedText = defeatedText;
    }
    //accessors

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDefeatedText() {
        return defeatedText;
    }

    public Item getItemToDestroy() {
        return item;
    }

    //mutator
    public void setItemToDestroy(Item item) {

    }
}
