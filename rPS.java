/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.helloworld;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class rPS {
    public static void main(String[] args) {
        //set a game flag to control the exit of the do while loop
        boolean gameFlag;
        // use a while loop to repaet game till game flag is false
        //while(gameFlag = TRUE){
            // create the computer choice up here
            do{
            Scanner sc = new Scanner(System.in);
            Random compChoice = new Random();
            // vars for player wins comp wins and keep round count
            int playerWins = 0;
            int computerWins = 0;
            int roundCount = 0;
            // var to display random compchoice as a string to player
            String computerString = null;
            // asks for rounds and grabs choice
            System.out.println("How many rounds would you like to play ?: between 1-10");
            int numRounds = sc.nextInt();
            sc.nextLine();
            // condition for if rounds greater 10 or less 1 exit
            if(numRounds > 10 || numRounds < 1){
                System.out.println("Error not right input for rounds");
                System.exit(0);
            }
            // use a for loop to loop through game logic numrounds times
            for(int i = 0; i < numRounds; i++){
                //grab user choice 
                System.out.println("Please choose rock, paper, or scissors");
                String playerChoice = sc.nextLine();
                //if(playerChoice)
                System.out.println("You chose " + playerChoice);
                // conditions to see who wins rounds and keep track of vars
                int computerChoice = compChoice.nextInt(3)+1;
                // 1 is rock, 2 is paper, 3 is scissors
                if(computerChoice == 1){
                    if(playerChoice.equalsIgnoreCase("rock")){
                        System.out.println("Tie");
                        roundCount++;
                    } else if(playerChoice.equalsIgnoreCase("paper")){
                        System.out.println("Player Win");
                        playerWins++;
                        roundCount++;
                    } else if(playerChoice.equalsIgnoreCase("scissors")){
                        System.out.println("Player Win");
                        computerWins++;
                        roundCount++;
                    } 
                    computerString = "Rock";
                }
                // 1 is rock, 2 is paper, 3 is scissors
                if(computerChoice == 2){
                    if(playerChoice.equalsIgnoreCase("rock")){
                        System.out.println("Player Loss");
                        computerWins++;
                        roundCount++;
                    } else if(playerChoice.equalsIgnoreCase("paper")){
                        System.out.println("Tie");
                        roundCount++;
                    } else if(playerChoice.equalsIgnoreCase("scissors")){
                        System.out.println("Player Win");
                        playerWins++;
                        roundCount++;
                    }
                    computerString = "Paper";
                }
                // 1 is rock, 2 is paper, 3 is scissors
                if(computerChoice == 3){
                    if(playerChoice.equalsIgnoreCase("rock")){
                        System.out.println("Player Win");
                        playerWins++;
                        roundCount++;
                    } else if(playerChoice.equalsIgnoreCase("paper")){
                        System.out.println("Player Loss");
                        computerWins++;
                        roundCount++;
                    } else if(playerChoice.equalsIgnoreCase("scissors")){
                        System.out.println("Tie");
                        roundCount++;
                    }
                    computerString = "Scissors";
                }


                // prints to display to the player
                System.out.println("Computer choose " + computerString);
                System.out.println("Round is currently: " + roundCount);

            }
            // final winner decider logic here
            if(playerWins > computerWins){
                System.out.println("Player Wins");
            } else if(playerWins < computerWins){
                System.out.println("Computer Wins");
            } else {
                System.out.println("Tie");
            }
            // flag updater and exit statement or redo loop game
            System.out.println("Would you like to play again y/n?");
            String playerDecision = sc.nextLine();
            
            if(playerDecision.equalsIgnoreCase("y")){
                gameFlag = TRUE;
            }
            else if(playerDecision.equalsIgnoreCase("n")){
                gameFlag = FALSE;
                System.exit(0);
            }
        }
        while(gameFlag = TRUE);
    }
}
