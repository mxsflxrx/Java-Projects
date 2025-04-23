import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class menuswitch {

    public static ArrayList<String[]> students = new ArrayList<String[]>();
    public static String path = "activity.csv";
    public static Scanner input = new Scanner (System.in);

    public static void clearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        
        boolean bool = true;
        int choice;

            while(bool){

                try{

                System.out.println("==================");
                System.out.println("1. Display list of students");
                System.out.println("2. Add students");
                System.out.println("3. Edit students");
                System.out.println("4. Exit");
                System.out.println("==================");
                System.out.println();
                System.out.print("Enter choice: ");
                choice = input.nextInt();
                input.nextLine();
                
                        switch(choice){
                            case 1:

                                clearScreen();
                                display();

                                break;
                            case 2:

                                clearScreen();
                                add();
    
                                break;
                            case 3:

                                clearScreen();

                                break;
                            case 4:
                                bool = false;
                                System.out.println("Program terminated!");
                                break;
                            default:
                                System.out.println("Try Again!");
                        }
    
                    }
                    catch (Exception e){

                        clearScreen();
                        System.out.println("Invalid choice. Try again!");
                        input.next();

                    }
                
            } 
    }

    public static void display(){

        try{
            BufferedReader br = new BufferedReader(new FileReader(path));

            String row;
            br.readLine();

            while((row = br.readLine()) != null ){
                String[] column = row.split(" ");
                students.add(column);
            }

            for(String[] student : students) {

                for(String cell : student) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }

            System.out.println();

            br.close();

        }catch(IOException e){

            System.out.println("An error occured!");

        }

    }

    public static void add() throws Exception{

        long id = System.currentTimeMillis();

        System.out.print("Enter First Name: ");
        String firstname = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastname = input.nextLine();

        System.out.print("Enter Gender: ");
        String gender = input.nextLine();

        System.out.print("Enter Phone Number: ");
        String phonenumber = input.nextLine();

        System.out.print("Enter Email Address: ");
        String emailaddress = input.nextLine();

        System.out.print("Enter House Number/Street: ");
        String address1 = input.nextLine();

        System.out.print("Enter Barangay/Town/City/Province: ");
        String address2 = input.nextLine();

        Student student = new Student(lastname, firstname, lastname, gender, phonenumber, emailaddress, address1, address2);

        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
        bw.write(id + "," + firstname + "," + lastname + "," + gender + "," + phonenumber + "," + emailaddress + "," + address1 + "," + address2);
        bw.newLine();
        bw.close();

    }
}