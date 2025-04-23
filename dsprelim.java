import java.util.Scanner;
import java.util.ArrayList;

public class dsprelim {

    //Method for clearing the screen
    public static void clearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        
        //Arraylists for name, address, and course
        ArrayList<String> studentName = new ArrayList<String>();
        ArrayList<String> studentAddress = new ArrayList<String>();
        ArrayList<String> studentCourse = new ArrayList<String>();

        //Takes input from the user
        Scanner input = new Scanner(System.in);

        String name, address, course;
        int option;
        boolean bool = true;

        //While condition is true, it runs the code inside it unless the condition will become false
        while (bool) {

            System.out.println("Student Information:");
            System.out.println("1. Add");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Remove");
            System.out.println("5. Terminate");
            System.out.print("Enter your option: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {

                case 1:

                    clearScreen();

                    System.out.print("\nEnter name: ");
                    name = input.nextLine();

                    System.out.print("Enter address: ");
                    address = input.nextLine();

                    System.out.print("Enter course: ");
                    course = input.nextLine();

                    studentName.add(name);
                    studentAddress.add(address);
                    studentCourse.add(course);

                    clearScreen();

                    System.out.println("\nINFORMATION ADD: SUCCESSFUL");
                    System.out.println();

                    break;

                case 2:

                    if (studentName.size() == 0) {

                        clearScreen();
                        System.out.println("\nERROR: INFO NOT FOUND");
                        System.out.println();

                    } else {

                        clearScreen();

                        System.out.print("Enter name to be red: ");
                        name = input.nextLine();

                        if (studentName.contains(name)) {

                            int index = studentName.indexOf(name);

                            System.out.println();
                            System.out.println("Student Information:");
                            System.out.println("Name:" + " " + studentName.get(index));
                            System.out.println("Address:" + " " + studentAddress.get(index));
                            System.out.println("Course:" + " " + studentCourse.get(index));
                            System.out.println();

                        } else {

                            System.out.println("\nERROR: NAME NOT FOUND");

                        }

                    }

                    break;
                
                case 3:

                    if (studentName.size() == 0) {

                        clearScreen();
                        System.out.println("\nERROR: INFO NOT FOUND");
                        System.out.println();

                    } else {

                        clearScreen();

                        System.out.print("\nEnter name to update: ");
                        name = input.nextLine();

                        if (studentName.contains(name)) {

                            int index = studentName.indexOf(name);

                            System.out.print("Enter new address: ");
                            address = input.nextLine();

                            System.out.print("Enter new course: ");
                            course = input.nextLine();

                            studentAddress.set(index, address);
                            studentCourse.set(index, course);

                            clearScreen();
                            System.out.println("INFORMATION UPDATE: SUCCESSFUL");
                            System.out.println();

                        } else {

                            clearScreen();
                            System.out.println("\nERROR: NAME NOT FOUND");
                            System.out.println();

                        }

                    }

                    break;

                case 4:

                    if (studentName.size() == 0) {

                        clearScreen();
                        System.out.println("\nERROR: INFO NOT FOUND");
                        System.out.println();

                    } else {

                        clearScreen();

                        System.out.print("\nEnter name to remove: ");
                        name = input.nextLine();

                        if (studentName.contains(name)) {

                            int index = studentName.indexOf(name);

                            studentName.remove(index);
                            studentAddress.remove(index);
                            studentCourse.remove(index);

                            clearScreen();

                            System.out.println("\nINFORMATION REMOVE: SUCCESSFUL");
                            System.out.println();

                        } else {

                            clearScreen();
                            System.out.println("\nERROR: NAME NOT FOUND");
                            System.out.println();

                        }

                    }

                    break;

                case 5:

                    bool = false;

                    clearScreen();

                    System.out.println("\nPROGRAM TERMINATED");

                    break;

                default:

                    clearScreen();

                    System.out.println("\nERROR: INVALID OPTION");
                    System.out.println();
                
            }

        }

        //Closes scanner
        input.close();

    }
}