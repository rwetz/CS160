package Questions.Chapter9;

import ProvidedClasses.Person;
import java.util.ArrayList;

/**
 *
 * @author (Your Name Here)
 */
public class Question3 {

    /*  For this part of the assignment, you will need to help your young relative who is just learning multiplication.
     *  Your method should generate a two-dimensional int array that stores the value of multiplying the value of the
     *  index for the current row and column together and storing that result in the correct index location.
	 *
	 *  The method has a single parameter, an int maxNumber which you will need to use as part of your solution.
     *  maxNumber is the largest index value that you should use in the table that you generate. If, for example, the value
     *  of maxNumber is five, you should construct the array to multiply values in the range 0 - 5 inclusive.
     *
     *  You should also make sure that your code does not generate any run-time exceptions.
     *
     */
    public static int[][] multiplicationTable(int maxNumber) {
        int[][] table = new int[maxNumber + 1][maxNumber + 1];

        for (int r = 0; r <= maxNumber; r++) {
            for (int c = 0; c <= maxNumber; c++) {
                table[r][c] = r * c;
            }
        }

        return table;
    }


    /*  For this part of the assignment you will use an ArrayList to handle the guest list for party you wanted to have.
     *  Intially you had planned to only invite 3 people and keep things rather relaxed, however eventually the word got out
     *   and more people want to come. Being a good person you've decided to invite them.
     *
     */
    public static ArrayList partyList() {
        /* 1) Declare an ArrayList that only accepts Person objects as elements and give it an inital capacity of 3,
	     *     the original number of guests you wanted to invite.
         */
        ArrayList<Person> invitedGuests = new ArrayList<>(3);


        /* 2) Create 3 new Person objects (you can use the default constructor) and individually add them to your list.
	     *    You will need to make multiple calls to the add method for each Person object you want to add.
         */
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        invitedGuests.add(person1);
        invitedGuests.add(person2);
        invitedGuests.add(person3);

        /* 3) Now use a for loop to add an additional 25 guests to the list.
         *    You can use the default constructor when creating the Person objects to add.
         */
        for (int i = 0; i < 25; i++) {
            Person guest = new Person();
            invitedGuests.add(guest);
        }
        return invitedGuests;
    }

    /*  One of your friends who is also having a party has decided it would be really cool if you just combined your
     *  parties into one incredibly large super-party. Since your friend has agreed to have it at their house,
     *  you've decided this isn't such a bad idea.
     */
    public static ArrayList combinedList(ArrayList<Person> yourGuestList, ArrayList<Person> friendsGuestList, ArrayList<Person> cannotAttend) {
        /* 1) Declare a new ArrayList that only accepts Person objects that will be a master guest list.
         */
        ArrayList<Person> masterList = new ArrayList<>();
        /* 2) Use an enhanced for loop to add all of the Person objects in your list (i.e., the yourGuestList parameter)
		 *    to the master guest list.
         */
        for (Person guest : yourGuestList) {
            masterList.add(guest);
        }
        /* 3) Rather than add guests individually to the list, use a single method to add every element from your and
		 *    your friend's lists (i.e., the friendsGuestList parameter) to the new master list.
         */
        masterList.addAll(yourGuestList);
        masterList.addAll(friendsGuestList);
        /* 4) A few people have called to inform you that they cannot make it to your party. Call a different method
		 *    of the ArrayList class to remove all of the Persons who cannot make it (i.e., the cannotAttend parameter)
		 *    from the master guest list.
         */
        masterList.removeAll(cannotAttend);
        /* 5) Return the master guest list for the party.
         */
        return masterList;
    }

}
