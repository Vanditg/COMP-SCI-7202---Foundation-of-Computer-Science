/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/
 
import java.util.*;

public class Computer implements Player {

    Scanner input = new Scanner(System.in);
    private String move;

    //Overriding performMove method for computer class. 
    @Override
    public String performMove() {
        //Random generation
        Random rand = new Random();

        //Obtain a number between [0 - 2].
        int randomNo = rand.nextInt(3);

        //Switch case for rock, paper and scissor. 
        switch (randomNo) {
            case 0:
                move = "Rock";
                break;

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
        }

        System.out.print("*********************");
        System.out.println();
        System.out.println("Player2 (Computer): ");
        System.out.println("*********************");
        System.out.print("Move: " + move);
        System.out.println();

    return move;
    
    }

}

