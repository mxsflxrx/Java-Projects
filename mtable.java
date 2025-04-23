import java.util.Scanner;

public class mtable{
    public static void main(String[] args){
//Declaration
        int num;
//Scan Code
        Scanner input = new Scanner(System.in);
//Input
        System.out.println("Multiplication Table Program NxN");
        System.out.print("Enter Number: ");
        num = input.nextInt();
//Driver Code
    for(int n=1; n<=num; n++){
        for(int m=1; m<=num; m++){
            System.out.printf("%5d", n*m);
        }
            System.out.print("\n");
        }
    }
}