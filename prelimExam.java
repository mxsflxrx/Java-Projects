import java.util.Scanner;

public class prelimExam {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int qt, qt2, qt3;
        int pr1, pr2, pr3;
        double tp, tp2, change;
        double tax = 1.12;
        double payment;

        //Displays order menu
        System.out.println("MENU FOR TODAY:");
        System.out.println("1 = ADOBONG MANOK - P60.00");
        System.out.println("2 = LECHON PAKSIW - P60.00");
        System.out.println("3 = MECHADO - P60.00");
        System.out.println("4 = GINISANG MONGGO - P60.00");
        System.out.println("5 = PORK STEAK - P60.00");
        System.out.print("What dish do you want?: ");
        int dish = input.nextInt();

        if (dish == 1){
            System.out.print("Quantity: ");
        } else if (dish == 2) {
            System.out.print("Quantity: ");
        }   else if (dish == 3) {
            System.out.print("Quantity: ");
        }   else if (dish == 4) {
            System.out.print("Quantity: ");
        }   else if (dish == 5) {
            System.out.print("Quantity: ");
        } else {
            System.out.println("INVALID ORDER");
        }
        
        qt = input.nextInt();

        System.out.print("Wanna Order Again? (0 = YES, 1 = NO): ");
        int confirmation = input.nextInt();

            if (confirmation == 0 ) {
                
                //Displays order menu
                System.out.println("MENU FOR TODAY:");
                System.out.println("1 = ADOBONG MANOK - P60.00");
                System.out.println("2 = LECHON PAKSIW - P60.00");
                System.out.println("3 = MECHADO - P60.00");
                System.out.println("4 = GINISANG MONGGO - P60.00");
                System.out.println("5 = PORK STEAK - P60.00");
                System.out.print("What dish do you want?: ");
                int dish2 = input.nextInt();

                if (dish2 == 1){
                    System.out.print("Quantity: ");
                } else if (dish2 == 2) {
                    System.out.print("Quantity: ");
                }   else if (dish2 == 3) {
                    System.out.print("Quantity: ");
                }   else if (dish2 == 4) {
                    System.out.print("Quantity: ");
                }   else if (dish2 == 5) {
                    System.out.print("Quantity: ");
                } else {
                    System.out.println("INVALID ORDER");

                    System.out.print("Input your payment: ");
                    payment = input.nextInt();

                    pr1 = qt * 60;
                    tp = pr1;
                    tp2 = tp * tax;
                    change = payment - tp2;

                    System.out.println();
                    System.out.println("=========================");
                    System.out.println("TOTAL PRICE:" + tp2);
                    System.out.println("THANK YOU! COME AGAIN!");
                    System.out.println("PAYMENT:" + payment);
                    System.out.println("CHANGE:" + change);
                    System.out.println("=========================");
                    System.out.println();

                }

                qt2 = input.nextInt();

                System.out.print("Wanna Order Again? (0 = YES, 1 = NO): ");
                int confirmation2 = input.nextInt();

                    if (confirmation2 == 0 ) {

                        //Displays order menu
                        System.out.println("MENU FOR TODAY:");
                        System.out.println("1 = ADOBONG MANOK - P60.00");
                        System.out.println("2 = LECHON PAKSIW - P60.00");
                        System.out.println("3 = MECHADO - P60.00");
                        System.out.println("4 = GINISANG MONGGO - P60.00");
                        System.out.println("5 = PORK STEAK - P60.00");
                        System.out.print("What dish do you want?: ");
                        int dish3 = input.nextInt();
    
                        if (dish3 == 1){
                            System.out.print("Quantity: ");
                        } else if (dish3 == 2) {
                            System.out.print("Quantity: ");
                        }   else if (dish3 == 3) {
                            System.out.print("Quantity: ");
                        }   else if (dish3 == 4) {
                            System.out.print("Quantity: ");
                        }   else if (dish3 == 5) {
                            System.out.print("Quantity: ");
                        } else {
                            System.out.println("INVALID ORDER");

                            System.out.print("Input your payment: ");
                            payment = input.nextInt();

                            pr1 = qt * 60;
                            pr2 = qt2 * 60;
                            tp = pr1+pr2;
                            tp2 = tp * tax;
                            change = payment - tp2;

                            System.out.println();
                            System.out.println("=========================");
                            System.out.println("TOTAL PRICE:" + tp2);
                            System.out.println("THANK YOU! COME AGAIN!");
                            System.out.println("PAYMENT:" + payment);
                            System.out.println("CHANGE:" + change);
                            System.out.println("=========================");
                            System.out.println();

                        }

                        qt3 = input.nextInt();

                        System.out.print("Input your payment: ");
                        payment = input.nextInt();
                
                        pr1 = qt * 60;
                        pr2 = qt2 * 60;
                        pr3 = qt3 * 60;
                        tp = pr1+pr2+pr3;
                        tp2 = tp * tax;
                        change = payment - tp2;

                        System.out.println();
                        System.out.println("=========================");
                        System.out.printf("TOTAL PRICE:" + tp2);
                        System.out.println("THANK YOU! COME AGAIN!");
                        System.out.println("PAYMENT:" + payment);
                        System.out.println("CHANGE:" + change);
                        System.out.println("=========================");
                        System.out.println();

                    } else if (confirmation2 == 1) {
                        
                        System.out.print("Input your payment: ");
                        payment = input.nextInt();

                        pr1 = qt * 60;
                        pr2 = qt2 * 60;
                        tp = pr1+pr2;
                        tp2 = tp * tax;
                        change = payment - tp2;

                        System.out.println();
                        System.out.println("=========================");
                        System.out.println("TOTAL PRICE:" + tp2);
                        System.out.println("PAYMENT:" + payment);
                        System.out.println("CHANGE:" + change);
                        System.out.println("THANK YOU! COME AGAIN!");
                        System.out.println("=========================");
                        System.out.println();

                    }
            } else if (confirmation == 1) {

                System.out.print("Input your payment: ");
                payment = input.nextInt();

                pr1 = qt * 60;
                tp = pr1;
                tp2 = tp * tax;
                change = payment - tp2;

                System.out.println();
                System.out.println("=========================");
                System.out.println("TOTAL PRICE:" + tp2);
                System.out.println("PAYMENT:" + payment);
                System.out.println("CHANGE:" + change);
                System.out.println("THANK YOU! COME AGAIN!");
                System.out.println("=========================");
                System.out.println();

    }

    input.close();

 }
}