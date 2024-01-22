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
//done//
public class Room {

    //instance
    private String name;
    private String description;
    private Exit exit;
    private Exit exit2;
    private Exit exit3;
    private Exit exit4;
    private Exit secretExit;
    private Item item;
    private Creature creature;

    public Room(String name,
            String description,
            Exit exit,
            Exit exit2,
            Item item,
            Creature creature) {
        this.name = name;
        this.description = description;
        this.exit = exit;
        this.item = item;
        this.creature = creature;
        this.exit2 = exit2;

    }

    //accessors
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Exit getExit1() {
        return exit;
    }

    public Exit getExit2() {
        return exit2;
    }

    public Exit getExit3() {
        return exit3;
    }

    public Exit getExit4() {
        return exit4;
    }

    public Exit getSecretExit() {
        return secretExit;
    }

    public Item getItem() {
        return item;
    }

    public Creature getCreature() {
        return creature;
    }

    //mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExit1(Exit exit) {
        this.exit = exit;
    }

    public void setExit2(Exit exit) {
        this.exit2 = exit2;
    }

    public void setExit3(Exit exit) {
        this.exit3 = exit3;
    }

    public void setExit4(Exit exit) {
        this.exit4 = exit4;
    }

    public void setSecretExit(Exit exit) {
        this.exit = secretExit;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
