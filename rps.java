import java.util.Scanner;

public class rps {
    public static void main (String[] args){

        //Input Move
        System.out.print("rock (0), paper (1), scissors (2): ");
        Scanner input = new Scanner (System.in);
        int userMove = input.nextInt();

        //Generates 3 random numbers after user input
        int randomNumber = (int)(Math.random() * 3);

        //Moves are equal to rock, paper, or scissors
        String computerMove = move(randomNumber);
        String playerMove = move(userMove);

        //Display Result
        if (userMove == randomNumber){
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + " too. It is a draw.");
        } else if ((userMove == 0 && randomNumber == 1) || (userMove == 1 && randomNumber == 2) || (userMove == 2 && randomNumber == 0)){
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You lost.");
        } else if ((userMove == 0 && randomNumber == 2) || (userMove == 1 && randomNumber == 0) || (userMove == 2 && randomNumber == 1)){
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You won.");
        } else {
            System.out.println("INVALID MOVE");
        }

        input.close();

    }

    //Integer to String Method
    private static String move(int number) {
        if (number == 0){
            return "rock" ;
        } else if (number == 1){
            return "paper" ;
        } else if (number == 2){
            return "scissors" ;
        }
        return null;
    }
}