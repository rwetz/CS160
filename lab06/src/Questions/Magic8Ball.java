/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Random;

/**
 *
 * @author ryan.wetzstein
 */
public class Magic8Ball {

 
    public static String askQuestion(String question) {
        String answer = "";
        Random rand = new Random();
        int randNum = rand.nextInt(5) + 1;
        if (question.toLowerCase().startsWith("who")) {
            if (randNum == 1) {
                answer =  "Omar Hussein";
            } else if(randNum == 2) {
                answer = "Mitt Romney";
            }
            else if (randNum == 3) {
                answer = "Alex Radermacher";
            }
            else if (randNum == 4) {
                answer = "Roberto Rodriguez Gonzalez Moreno de la Cruz";
            }
            else if (randNum == 5) {
                answer = "Bill";
            }
        }
        else if (question.toLowerCase().startsWith("what")) {
            if (randNum == 1) {
                answer = "Omar Hussein's left white Reebok shoe";
            }
            else if (randNum == 2) {
                answer = "Mini Donuts";
            }
            else if (randNum == 3) {
                answer = "General Dynamics F-16 Fighting Falcon Multirole Fighter Aircraft";
            }
            else if (randNum == 4) {
                answer = "A red ball";
            }
            else if (randNum == 5) {
                answer = "16,000 tiny 2 and a half inch stainless steel screws";
            }
        }

        else if (question.toLowerCase().startsWith("where")) {
            if (randNum == 1) {
                answer = "Gaza, Palestine";
            }
            else if (randNum == 2) {
                answer = "Omar Hussein's House";
            }
            else if (randNum == 3) {
                answer = "Rochester, Minnesota";
            }
            else if (randNum == 4) {
                answer = "Pyongyang, North Korea";
            }
            else if (randNum == 5) {
                answer = "The Quentin-Burdick Building";
            }
        }

        else if (question.toLowerCase().startsWith("why")) {
            if (randNum == 1) {
                answer = "Because the United States Military sent a spokesperson to the NDSU campus and delivered a hand-writen order from the commander of the United States Navy";
            }
            else if (randNum == 2) {
                answer = "Because I said so";
            }
            else if (randNum == 3) {
                answer = "Because Omar Hussein willed it";
            }
            else if (randNum == 4) {
                answer = "Because the sky is blue";
            }
            else if (randNum == 5) {
                answer = "Because Joe Mama ordered me to";
            }
        }

        else if (question.toLowerCase().startsWith("when")) {
            if (randNum == 1) {
                answer = "1979";
            }
            else if (randNum == 2) {
                answer = "Yesterday";
            }
            else if (randNum == 3) {
                answer = "Two-Weeks ago";
            }
            else if (randNum == 4) {
                answer = "1639";
            }
            else if (randNum == 5) {
                answer = "About 30 minutes ago";
            }
        }

        else if (question.toLowerCase().startsWith("how")) {
            if (randNum == 1) {
                answer = "By summoning the courage to do so";
            }
            else if (randNum == 2) {
                answer = "By calling your father for help";
            }
            else if (randNum == 3) {
                answer = "By asking Omar Hussein";
            }
            else if (randNum == 4) {
                answer = "By rubbing the magic lamp";
            }
            else if (randNum == 5) {
                answer = "By instantly gaining omniscience and knowing how to do it";
            }
        }
        else {
            if (randNum == 1) {
                answer = "Pizza";
            }
            else if (randNum == 2) {
                answer = "Probably tacos";
            }
            else if (randNum == 3) {
                answer = "188860004 tires";
            }
            else if (randNum == 4) {
                answer = "Who knows?";
            }
            else if (randNum == 5) {
                answer = "Go ask your father, I'm not permitted to answer that question";
            }
        }
        return answer;
    }
}
