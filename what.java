import java.util.Scanner;

public class what{
    public static void main(String[] args){

    int n;
//Input Number
    System.out.println("Enter N: ");
    Scanner input = new Scanner(System.in);
    n=input.nextInt();
//Loop and Print
        for (int i=0; i<n; i++){
            for (int j=0; j<n+i; j++){
                if (j<n-i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }

    }
}