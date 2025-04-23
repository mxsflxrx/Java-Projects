import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvreader {
    public static void main(String[] args) {
        ArrayList<String[]> orders = new ArrayList<String[]>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("stock.csv"));

            String row;

            //br.readLine(); remove the backslashes if you want to exclude the header

            while((row = br.readLine()) != null ){
                String[] column = row.split(" ");
                orders.add(column);
            }

            for(String[] order : orders) {

                for(String cell : order) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}