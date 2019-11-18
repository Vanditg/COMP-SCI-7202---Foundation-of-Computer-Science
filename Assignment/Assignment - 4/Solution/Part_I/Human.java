/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class Human implements Player {

    Scanner input = new Scanner(System.in);
    private String move;

    //Overriding performMove method here. 
    @Override
    public String performMove() throws InvalidStringException {
        System.out.print("---------------------");
        System.out.println();
        System.out.println("Player1 (Human) Enter Your Move in String: 1) Rock 2) Scissors 3) Paper ");
        System.out.println("---------------------");
        System.out.print("Move: ");

        move = input.nextLine();

        if (move.equalsIgnoreCase("scissor")) {
            move = "scissors";
        }

        if (!(move.equalsIgnoreCase("rock") || move.equalsIgnoreCase("paper") || move.equalsIgnoreCase("scissors"))) {
            throw new InvalidStringException(move);
        }

        return move;
    }

}

