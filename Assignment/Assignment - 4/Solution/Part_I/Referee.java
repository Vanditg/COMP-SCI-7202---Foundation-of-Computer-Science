/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Referee {

    //Instantiating private objects for human and computer here. 
    private Player player1 = new Human();
    private Player player2 = new Computer();

    //Main logic here. 
    public void startGame() throws InvalidStringException {
        int result = 0;
        String player1Move, player2Move;

        player1Move = player1.performMove();
        player2Move = player2.performMove();

        if (player1Move.equalsIgnoreCase(player2Move)) {
            result = 2;
        }

        //Creating conditions here for each cases on who will get points. 
        if (player1Move.equalsIgnoreCase("rock")) {
            if (player2Move.equalsIgnoreCase("paper")) {
                result = 1;
            }
            if (player2Move.equalsIgnoreCase("scissors")) {
                result = 0;
            }
        }

        if (player1Move.equalsIgnoreCase("paper")) {
            if (player2Move.equalsIgnoreCase("rock")) {
                result = 0;
            }
            if (player2Move.equalsIgnoreCase("scissors")) {
                result = 1;
            }

        }

        if (player1Move.equalsIgnoreCase("scissors")) {
            if (player2Move.equalsIgnoreCase("paper")) {
                result = 0;
            }
            if (player2Move.equalsIgnoreCase("rock")) {
                result = 1;
            }
            
        }

        
        //Decalring the winner here. 
        if (result == 0) {
            
            System.out.println("Result: player1 (Human) is the Winner");
            System.out.println();
        } else if (result == 1) {
            
            System.out.println("Result: player2 (Computer) is the Winner");
            System.out.println();
        } else if (result == 2) {
            
            System.out.println("Result: Match Drawn");
            System.out.println();
        }

    }

}

