import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringscanner{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        Pattern pattern = Pattern.compile("^[a-z].*[^a-zA-Z0-9]$");
        Matcher matcher = pattern.matcher(string);
        
        if(matcher.matches()){
            System.out.println("Valid string!");
        } else {
            System.out.println("Invalid string.");
        }

        input.close();
        
    }
}