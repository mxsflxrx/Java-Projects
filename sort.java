import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        
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

        Collections.sort(strng);

        System.out.println();

        for (String i: strng) {
            System.out.print(i + " ");
        }

    }
}
