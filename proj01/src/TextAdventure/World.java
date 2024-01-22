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
//DONE//
public class World {

    //instance variables
    private Room startingRoom;
    private Room endingRoom;

    public World(Room startingRoom, Room endingRoom) {
        this.startingRoom = startingRoom;
        this.endingRoom = endingRoom;
    }

    public Room getStartingRoom() {
        return startingRoom;
    }

    public Room getEndingRoom() {
        return endingRoom;
    }
}
