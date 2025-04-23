import java.util.Scanner;

public class displayonetoten {
    public static void main(String[] args){
    
    /*
    for( int i=1; i<=10; i++){
        System.out.println(i);
    }
    */

    /*
    System.out.print("Enter a number: ");
    Scanner input = new Scanner (System.in);
    int x = input.nextInt();

    for( int i=1; i<=x; i++){
        System.out.print(i + " ");
    }

    input.close();
    */

    System.out.print("Enter a number: ");
    Scanner input = new Scanner (System.in);
    int x = input.nextInt();

    for (int i=1; i<=x; i++){
        int y = (int)(Math.random() * 75) + 48;
        System.out.print((char)y);
    }

    input.close();

    }
}