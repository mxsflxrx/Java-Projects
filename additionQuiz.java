import java.util.Scanner;

public class additionQuiz {
    public static void main(String[] args){

        //Displays single digit number
        int x = (int)(Math.random() * 9);
        int y = (int)(Math.random() * 9);
        int z = (int)(Math.random() * 9);

        //Mathematical Expression
        System.out.print("What is " + x + " + " + y + " + " + z + " ? ");
        Scanner input = new Scanner (System.in);
        int answer = input.nextInt();

        //Result
        if(x + y + z == answer){
            System.out.println("Correct Answer!");
        }else{
            System.out.println("Incorrect Answer!");
            System.out.println("Answer should be " + (x + y + z) + ".");
        }

        input.close();
    } 
}