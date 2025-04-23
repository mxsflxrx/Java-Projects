import java.util.Scanner;

public class prelimExam2 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        //Accepts input from user
        System.out.print("Enter words: ");
        String words = input.nextLine();

        //Takes input from user and displays its uppercase and lowercase format
        System.out.println(words.toUpperCase());
        System.out.println(words.toLowerCase());

        input.close();
    }
}