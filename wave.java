import java.util.Scanner;

public class wave{
    public static void main(String[] args){
//Declaration
        int amplitude, frequency;
//Scan Code
        Scanner input = new Scanner(System.in);

//Input
            System.out.println("Triangular Wave Form Program");
            System.out.print("Enter Amplitude: ");
            amplitude=input.nextInt();

            System.out.print("Enter Frequency: ");
            frequency=input.nextInt();

//Driver Code

//Frequency
for(int h=0; h<frequency; h++) {
//Increasing
    for (int i = 1; i <= amplitude; ++i)  
    {  
        for (int j = 1; j <= i; ++j)  
        {  
            System.out.print( i );  
        }  
        System.out.print("\n");  
    }
//Decreasing
    for (int i = amplitude-1; i >= 1; i--)  
    {  
        for (int j = 1; j <= i; j++)  
        {  
            System.out.print ( i );  
        }  
        System.out.print("\n");  
    }
    System.out.print("\n");
    }
}
}