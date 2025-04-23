import java.util.Scanner;

public class gcf {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter 1st number: ");
        int x = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int y = input.nextInt();

        int gcf = 0;

        for (int i = 1; i < x + 1; i++){
            if ( x % i == 0 ) {
                if ( y % i == 0 ) { 
                    gcf = i;   
                }
            }
        }

        System.out.println(gcf);

        input.close();

    }
}