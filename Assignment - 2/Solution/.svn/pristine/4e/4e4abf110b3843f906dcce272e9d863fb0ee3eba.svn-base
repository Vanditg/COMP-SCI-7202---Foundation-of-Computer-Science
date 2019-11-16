/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class ATM {
    
    public void run(int amount) {
        
        //Declaring variables and initializing them. 
        int fiftyDollars = 0;
        char flag = 'n';
        int twentyDollars = 0;
        
        //Creating nested condition logic for the amount can be dispursed. 
        if(amount%50 == 0) {
           
            fiftyDollars = amount/50;
            twentyDollars = 0;
            flag = 'y';
            
        }

        else if(amount%20 == 0) {
           
            fiftyDollars = 0;
            twentyDollars = amount/20;
            flag = 'y';

        }
        
        else if(amount/50 > 0) {
        
            fiftyDollars = amount / 50;
            int remainAmount = amount - (fiftyDollars*50);
            int remainAmountMore = amount - ((fiftyDollars - 1)*50) ;
        
            if(remainAmount%20 == 0) {
        
                twentyDollars = remainAmount/20;
                flag = 'y';
        
            }
        
            else if(remainAmountMore%20 == 0) {

                fiftyDollars = fiftyDollars - 1;
                twentyDollars = remainAmountMore/20;
                flag = 'y';
        
            }
        
        }

        else if(amount/20 > 0) {
        
            twentyDollars = amount / 20;
            int remainAmount = amount - (twentyDollars*20);

            if(remainAmount%50 == 0) {
                fiftyDollars = remainAmount/50;
                flag = 'y';

            }
            
        }
        
        if(flag == 'y')
            System.out.println("Here is "+twentyDollars+" $20 notes and "+fiftyDollars+" $50 notes.");
        else
            System.out.println("Sorry, the value you input cannot be withdrew");
            
    }
    
    public static void main(String args[]) {

        //Using Scanner utility to ask the user for input money. 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to dispurse from ATM: ");
        int amountUser = input.nextInt();

        (new ATM()).run(amountUser);

    }

}
