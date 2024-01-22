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
public class Exit {

    //instance variables//
    private String name;
    private String description;
    private String transition;
    private boolean creatureBlocks;
    private Room room;
    private Item item;

    //constructor
    public Exit(String name, String description, String transition) {
        this.name = name;
        this.description = description;
        this.transition = transition;
    }

    //accessorz 
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getTransition() {
        return transition;
    }

    public boolean getCreatureBlocks() {
        return creatureBlocks;
    }

    public Room getDestination() {
        return room;
    }

    public Item getRequiredItem() {
        return item;
    }

    //MUTATORS
    public void setDestination(Room destination) {
        this.room = destination;
    }

    public void setRequiredItem(Item item) {
        this.item = item;
    }

    public void setCreatureBlocks(boolean value) {
        this.creatureBlocks = creatureBlocks;
    }
}
