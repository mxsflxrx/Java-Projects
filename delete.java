import java.util.Scanner;
import java.util.ArrayList;

public class delete {
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
            System.out.print(strng.get(i) + " ");
        }

        System.out.print("\nEnter an index to be removed: ");
        int index = input.nextInt();

        input.close();

        strng.remove(index);

        for (int i=0; i < strng.size(); i++) {
            System.out.print(strng.get(i) + " ");
        }
        
    }   
}