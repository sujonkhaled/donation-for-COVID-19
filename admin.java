import java.util.*;

public class admin {
    public static void main(String[] args) {

        Vector<Donor> don = new Vector<Donor>();
        Vector<Receive> rec = new Vector<Receive>();
        Donor d = new Donor();
        Receive r = new Receive();
        Scanner inp = new Scanner(System.in);
        int choice, choice2, choice3;

        do {

            System.out.println("############ Welcome to Bluestone Donation ############\n");

            System.out.println("1. Admin");
            System.out.println("2. Receiver\n");

            System.out.print("Press 0 to exit the System. Enter your choice-> ");
            choice = inp.nextInt();

            switch (choice) {
                // admin dashboard
                case 1: {
                    System.out.println("\n++++++++++ Welcome to Admin dashboard ++++++++++\n");
                    System.out.println("1. Add Donor");
                    System.out.println("2. Print all Donor");
                    System.out.println("3. Donate\n");
                    System.out.print("Enter your choice-> ");
                    choice2 = inp.nextInt();
                    switch (choice2) {
                        case 1: {
                            d.donorInput(don);
                            break;
                        }
                        case 2: {
                            if (don.size() > 0) {
                                System.out.println(
                                        "\n++++++++++++++++++++++List of Donor++++++++++++++++++++++\n");
                                System.out.printf("%-5s%-19s%-15s%-19s\n", "NO.", "Name", "Address", "Money");
                                for (int i = 0; i < don.size(); i++) {
                                    System.out.printf("%-5s%-20s%-15s%-19s\n", (i + 1),
                                            don.get(i).getName(),
                                            don.get(i).getAddress(),
                                            don.get(i).moneyAmount());
                                }
                                System.out.println("");
                            } else {
                                System.out.println("No donor available\n");
                            }
                            break;
                        } // end of print donor
                        case 3: {
                            if (don.size() > 0) {
                                if (rec.size() > 0) {
                                    String option;
                                    Scanner input = new Scanner(System.in);
                                    System.out.println("###########Receiver details###########");
                                    for (int i = 0, j = 0; i < rec.size() && j < don.size(); i++, j++) {
                                        System.out.println("Name: " + rec.get(i).getName());
                                        System.out.println("Prof: " + rec.get(i).getProfession());
                                        System.out.println("Reason: " + rec.get(i).getReason());
                                        System.out.println("Number of Family: " + rec.get(i).getFamily());

                                        System.out.println("Type yes to donate/no to delete the current receiver\n");
                                        System.out.print("Enter your choice: ");
                                        option = input.nextLine();
                                        if (option.equals("yes")) {
                                            System.out.println(rec.get(i).getName() + " has got donation from "
                                                    + don.get(j).getName() + ". Amount of money: "
                                                    + don.get(j).moneyAmount());
                                            don.remove(j);// remove donor from vector
                                        } else {
                                            System.out.println("Receiver has been removed\n");
                                        }
                                        rec.remove(i);// remove receiver from vector
                                    }
                                } else {
                                    System.out.println("No Receiver available\n");
                                }
                            } else {
                                System.out.println("No donor available");
                            }
                            break;
                        }
                    }
                    break;
                } // end of case1

                // Receiver dashboard
                case 2: {

                    System.out.println("\n++++++++++ Welcome to Admin dashboard ++++++++++\n");
                    System.out.println("1. Want to take donation??Register now");
                    System.out.println("2. Print all Receiver");
                    System.out.println("3. Delete your registration\n");
                    System.out.print("Enter your choice-> ");
                    choice3 = inp.nextInt();

                    switch (choice3) {
                        case 1:
                            r.input(rec);
                            break;
                        case 2: {
                            if (rec.size() > 0) {
                                System.out.println("\n++++++++++++++++++++++List of Receiver++++++++++++++++++++++\n");
                                System.out.printf("%-5s%-20s%-15s%-19s%-15s\n", "NO.", "Name", "Address",
                                        "No. of Family",
                                        "Reason");
                                for (int i = 0; i < rec.size(); i++) {
                                    System.out.printf("%-5d%-20s%-20s%-14d%-17s\n", (i + 1), rec.get(i).getName(),
                                            rec.get(i).getAddress(), rec.get(i).getFamily(), rec.get(i).getReason());
                                }
                                System.out.println("");
                            } else {
                                System.out.println("No Receiver\n");
                            }
                            break;
                        } // end of print receiver
                        case 3: {
                            Scanner input = new Scanner(System.in);
                            String name;
                            boolean ismatch = false;
                            if (rec.size() > 0) {
                                System.out.println("Type your name to delete your registration");
                                System.out.print("Name: ");
                                name = input.nextLine();

                                for (int i = 0; i < rec.size(); i++) {
                                    if (rec.get(i).getName().equals(name)) {
                                        rec.remove(i);
                                        ismatch = true;
                                        break;
                                    }
                                }
                                if (ismatch) {

                                } else {
                                    System.out.println("Name doesnot match\n");
                                }
                            } else {
                                System.out.println("No receiver available\n");
                            }
                            break;
                        }
                    }
                    break;
                } // end of case 2

                default: {
                    System.out.println("Wrong choice\n");
                    break;
                }
            }
        } while (choice != 0);
    }

}
