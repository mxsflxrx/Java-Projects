import java.util.Scanner;

public class csCompute {
    public static void main(String[] args){

        int i1, i2, i3, i4, i5, i6, cs1, cs2, cs3, cs4, cs5, cs6, totalScore, totalItems;
        double grade;
        Scanner number = new Scanner(System.in);

    //Gets the value input
    System.out.print("Enter CS#1 items: ");
    i1 = number.nextInt();

    System.out.print("Enter CS#1 score: ");
    cs1 = number.nextInt();

    System.out.print("Enter CS#2 items: ");
    i2 = number.nextInt();

    System.out.print("Enter CS#2 score: ");
    cs2 = number.nextInt();

    System.out.print("Enter CS#3 items: ");
    i3 = number.nextInt();

    System.out.print("Enter CS#3 score: ");
    cs3 = number.nextInt();

    System.out.print("Enter CS#4 items: ");
    i4 = number.nextInt();

    System.out.print("Enter CS#4 score: ");
    cs4 = number.nextInt();

    System.out.print("Enter CS#5 items: ");
    i5 = number.nextInt();

    System.out.print("Enter CS#5 score: ");
    cs5 = number.nextInt();

    System.out.print("Enter CS#6 items: ");
    i6 = number.nextInt();

    System.out.print("Enter CS#6 score: ");
    cs6 = number.nextInt();

        //Formulas for solving
        totalScore = cs1+cs2+cs3+cs4+cs5+cs6;
        totalItems = i1+i2+i3+i4+i5+i6;
        grade = (((double)totalScore/(double)totalItems) * 50) + 50 ;

    //Display class standing grade
    System.out.printf("Class Standing Grade: %.2f", grade);

        number.close();

    }
}