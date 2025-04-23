import java.util.Scanner;

public class phonenumbervalidation{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
    
        System.out.print("Enter a phone number: ");
        String phoneNumber = input.nextLine();

        input.close();

        String valid = "\\([0-9]{3}\\) \\d{3}-\\d{4}";

        if(phoneNumber.matches(valid)){
            System.out.println(phoneNumber + " is a valid phone number.");
        } else {
            System.out.println(phoneNumber + " is not a valid phone number.");
        }
     
    }
}