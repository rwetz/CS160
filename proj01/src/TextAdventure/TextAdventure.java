/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextAdventure;

/**
 *
 * @author rwetz
 */
public class TextAdventure {

    public static void main(String[] args) {

        //item 1//
        Item item1 = new Item("Basic Sword", "This sword is rusty and is uncomfortable to wield, however it can handle creature business");

        //item2//
        Item item2 = new Item("Gorlaug's Mace", "This weapon is from the ogre kingdom and does significantly more damage to everything. This thing is ridiculous.");

        //item3//
        Item item3 = new Item("Sword of Sharpness", "This sword is so sharp it can split atoms. The warning on the guard says \"If you atempt to shave the hair off your arm with this blade, you will take your arm off.\"");

        //item4//
        Item item4 = new Item("Excalibur", "Insert cliche secret one shot item in small programming games here");

        //Creature1//
        Creature creature1 = new Creature("Big Ass Spider", "This is definitely one big spider", "You defeated that big ass spider, you're the man!");

        //Creature2//
        Creature creature2 = new Creature("Gorlaug the Merciless", "Gorlaug the Merciless, a.k.a. the 10 foot tall king if the ogre kingdom", "You defeated Gorlaug, congrats! I'd take his weapon if I were you.");

        //Creature3//
        Creature creature3 = new Creature("\"Omar\" the gigantic bear", "This bear is about 20 feet tall, and is wearing a big collar with the name \"Omar\" written on it", "You defeated Omar! Nice!");

        //Creature4//
        Creature creature4 = new Creature("Xlea the Demon-King", "Xlea (pronounced \"shlea\") has been the king of the demons in the underworld for 2.7 million years", "You defeated Xlea, you won!");

        //Exits//
        Exit exit1 = new Exit("Exit 1", "This is the exit for room 1", "This exit takes you from room 1 to 2.");
        Exit exit2 = new Exit("Exit 2", "This is the exit for room 2", "This exit takes you from room 2 to 3.");
        Exit exit3 = new Exit("Exit 3", "This is the exit for room 3", "This exit takes you from room 3 to the secret room.");
        Exit secretExit = new Exit("Secret Exit", "This is the exit for the secret room", "This exit takes you from the secret room to room 3");
        Exit exit4 = new Exit("Exit 4", "This is the real exit for room 3", "This exit takes you from room 3 to 4.");
        Exit exit5 = new Exit("Exit 5", "This is the exit for room 4", "This exit takes you from room 4 to 5.");
        Exit exit6 = new Exit("Exit 6", "This is the exit for room 5", "This exit takes you from room 5 to 6.");
        Exit exit7 = new Exit("Exit 7", "This is the exit for room 6", "This exit takes you from room 6 to 7.");
        Exit exit8 = new Exit("Exit 8", "This is the exit for room 7", "This exit takes you from room 7 to 8.");
        Exit exit9 = new Exit("Exit 9", "This is the exit for room 8", "This exit takes you from room 8 to 9.");
        Exit exit10 = new Exit("Exit 10", "This is the exit for room 9", "This exit takes you from room 9 to 10.");

        //Rooms//
        Room room1 = new Room("Room 1", "Starting Room", exit1, null, item1, null);
        Room room2 = new Room("Room 2", "Room 2", exit2, null, null, creature1);
        Room room3 = new Room("Room 3", "Room 3", exit3, exit4, null, null);
        Room room4 = new Room("Secret Room", "Secret Room", exit3, secretExit, item4, null);
        Room room5 = new Room("Room 4", "Room 4", exit5, null, null, null);
        Room room6 = new Room("Room 5", "Room 5", exit6, null, item2, creature2);
        Room room7 = new Room("Room 6", "Room 6", exit7, null, null, null);
        Room room8 = new Room("Room 7", "Room 7", exit8, null, item3, creature3);
        Room room9 = new Room("Room 8", "Room 8", exit9, null, null, null);
        Room room10 = new Room("Room 9", "Room 9", exit10, null, null, null);
        Room room11 = new Room("Room 10", "Boss Room", null, null, null, creature4);

        //destinations//
        exit1.setDestination(room2);
        exit2.setDestination(room3);
        exit3.setDestination(room4);
        secretExit.setDestination(room3);
        exit4.setDestination(room5);
        exit5.setDestination(room6);
        exit6.setDestination(room7);
        exit7.setDestination(room8);
        exit8.setDestination(room9);
        exit9.setDestination(room10);
        exit10.setDestination(room11);

        //game essentials//
        World world = new World(room1, room10);
        Player me = new Player("Me", "Basically, that guy.");
        Game game = new Game(world, me);
        game.start();
    }

}
