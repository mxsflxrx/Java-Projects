import java.util.Scanner;
import java.util.ArrayList;

public class search {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        ArrayList<String> strng = new ArrayList<String>();

        strng.add("BLCK");
        strng.add("ECHO");
        strng.add("BREN");
        strng.add("RSG");
        strng.add("ONIC");
        strng.add("OMG");
        strng.add("NXPE");
        strng.add("TNC");

        System.out.print("Enter an MLBB Team Name Acronym: ");
        String teamName = input.nextLine();

        if (strng.contains(teamName)) {
            System.out.println(teamName + " is found in the arraylist!");
        } else {
            System.out.println(teamName + " is not found in the arraylist!");
        }

        input.close();

    }
    
}
