import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        //User inputs a number
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        int num=1;

        //Displays "PATTERN A"
        System.out.println("PATTERN A");
        
        //Displays numbers and spacing
        for (int i=1; i<=x; ++i){
            for (int j=1; j <= i; ++j){
                System.out.print(j + " ");
            }
            //New line
            System.out.println(" ");    
        }

        System.out.println();

        //Displays "PATTERN B"
        System.out.println("PATTERN B");

        //Displays numbers and spacing
        for (int i = x; i >= 1; i--){  
            for (int j = 1; j <= i; j++){  
                System.out.print(j + " ");  
            }  
            //New line
            System.out.println(); 
        }

        System.out.println();

        //Displays "PATTERN C"
        System.out.println("PATTERN C");
        
        //For columns, rows, and spacing
        for (int i = num; i <= x; i++){  
            for (int j = num; j <= x - i; j++){  
                System.out.print("  ");   
            }  
            //Displays numbers
            for (int k = i; k >= num; k--){  
                System.out.print(k + " "); 
            }  
            //New line
            System.out.println();
        }

        System.out.println();

        //Displays "PATTERN D"
        System.out.println("PATTERN D");

        //For columns, rows, and spacing
        for (int i = 0; i <= x; i++){  
            for (int j = num; j <= i; j++){  
                System.out.print("  ");   
            }  
            //Displays numbers
        for (int k = num; k <= x - i; k++){  
            System.out.print(k + " ");  
        }  
        //New line
        System.out.println();   
    } 
    
    input.close();

    }
}