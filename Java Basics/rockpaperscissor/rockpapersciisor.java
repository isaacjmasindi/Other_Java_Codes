//the Scanner was imported as the user needs to enter input
import java.util.Scanner;

public class rockpapersciisor {

        ///the method will not return anything therefor its a void

            public static void main(String[] args) {
            Scanner in = new Scanner(System.in);  System.out
                    .println("Scissor is =0\r\n"
                            + "Paper is =1\r\n"
                            + "Rock is =2\r\n"
                            + "The rules of the game are as follows:\r\n"
                            + "-Scissors beats paper\r\n"
                            + "-Rock beats scissors\r\n"
                            + "-Paper beats rock\r\n"
                            + "Lets play!!!!!");

            //Use a while(true) loop and only break the loop if the user wants to quit

                while(true) {

                    //the user will be requested to enter a number to play or 3 to quit

                    System.out.print("To play please enter any of these numbers 0 which is scissor, 1 which is paper or 2 which is rock. if you would like to quit enter 3 ");
                    String Playerchoice = in.nextLine();

                    ////if the user enters 3 a messsage will be displayed and the program will close

                    if (Playerchoice.equals("3")) {
                        System.out.print("Thank you for playing the game");
                        break;
                }


                    //Check if the user's move is valid (rock, paper, or scissors meaning numbers from 0,1 and 2)

                    if(!Playerchoice.equals("0") && !Playerchoice.equals("1") && !Playerchoice.equals("2")) {
                        System.out.println("Your move isn't valid!");

                }   else {
                        //the random function will genarte random numbers that will represent rock paper scissors

                        int rand = (int)(Math.random()*3);

                        //the random numbers are the converted into strings

                        String computer = "";
                        if(rand == 0) {
                            computer  = "0";
                    }   else if(rand == 1) {
                            computer  = "1";
                    }   else {
                            computer  = "2";
                    }
                        System.out.println("Opponent move: " + computer );

                         // if the computer genrates the same number as the entered number than a tie message will appear
                        if(Playerchoice.equals(computer)) {
                            System.out.println("It's a tie!");
                    }
                        //// if the entered number beats the genrated number then a win message will appear
                        else if((Playerchoice.equals("0") && computer.equals("1")) || (Playerchoice.equals("2") && computer.equals("0")) || (Playerchoice.equals("1") && computer.equals("0"))) {
                             System.out.println("You won!");

                    }
                        ////if the entered number loses to the generated number then a lose message will appear
                        else {
                             System.out.println("You lost!");
                    }

                }

            }


        }

    }

