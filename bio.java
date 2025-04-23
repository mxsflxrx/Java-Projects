import java.util.Scanner;

public class bio{
    public static void main(String[] args){
//Declaration
        String fname, lname, motto;
        int age;
//Scan Code
        Scanner input = new Scanner(System.in);
//Input
        System.out.print("Enter firstname: ");
        fname=input.nextLine();

        System.out.print("Enter lastname: ");
        lname=input.nextLine();

        System.out.print("Motto: ");
        motto=input.nextLine();

        System.out.print("Enter age: ");
        age=input.nextInt();

//Printing
        System.out.println("You are " +fname+" " +lname+". "+ "You are " +age+ " years old. "+ "Motto: " +motto+".");
    }
}