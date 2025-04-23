import java.util.Scanner;

public class operations {
    public static void main(String[] args){
//Declaration
        int x, y, sum, diff, prd;
//Scan Code
        Scanner input = new Scanner(System.in);
//input
            System.out.println("This is an operations program(adds, subtracts, and multiplies 2 numbers.)");
            System.out.print("Enter number 1: ");
            x = input.nextInt();

            System.out.print("Enter number 2: ");
            y = input.nextInt();
            
//Operations
            sum=x+y;
            diff=x-y;
            prd=x*y;

//Printing
            System.out.println("The sum is " +sum+".");
            System.out.println("The difference is " +diff+".");
            System.out.println("The product is " +prd+".");
    }
}