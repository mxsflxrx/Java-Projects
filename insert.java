import java.util.Scanner;
import java.util.ArrayList;

public class insert {
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

        for (int i=0; i < strng.size(); i++) {
            System.out.print(strng.get(i) + ", ");
        }

        System.out.print("\nInsert a Team Name: ");
        String teamName = input.nextLine();

        input.close();

        strng.add(teamName);

        for (int i=0; i < strng.size(); i++) {
            System.out.print(strng.get(i) + " ");
        }

    }
}
