import java.util.Scanner;

public class calcu{
    public static void main(String[] args){

    double x,y,result;
    char operator;
//Input Expression
    System.out.println("Use operators + - * /.\n");
    System.out.print("Enter expression: ");
    Scanner input = new Scanner(System.in);
//Scanning
    x=input.nextInt();
    operator=input.next().charAt(0);
    y=input.nextInt();
//Expression Case
    System.out.print("\n---------------------------------\n");
    switch(operator){
        case '+':
            result=x+y;
            System.out.printf("Sum: " +result+ ".\n");
            break;
        case '-':
            result=x-y;
            System.out.printf("Difference: " +result+ ".\n");
            break;
        case '*':
            result=x*y;
            System.out.printf("Product: " +result+ ".\n");
            break;
        case '/':
            if (y!=0){
                result=x/y;
                System.out.printf("Quotient: " +result+ ".\n");
            }else{
                System.out.print("Error: division by zero\n");
            }
            break;
        default:
            System.out.print("You entered an invalid expression. Try it again!\n");
    }
    System.out.print("---------------------------------\n");

}
}