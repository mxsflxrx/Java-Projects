import java.util.Scanner;

public class oddeven {
    public static void main(String[] args){

        Scanner number = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int num = number.nextInt();

        if (num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        number.close();
    }
}