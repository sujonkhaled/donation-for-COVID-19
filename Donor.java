import java.util.*;

public class Donor { // dobor nested class

    protected String name;
    protected String address;
    protected String moneyAmount;

    Donor() {
        name = "";
        address = "";
        moneyAmount = "";
    };

    Donor(String n, String a, String mA) {
        name = n;
        address = a;
        moneyAmount = mA;
    }

    void donorInput(Vector<Donor> don) { // read donor input

        Scanner Input = new Scanner(System.in);
        System.out.println("\n++++++++++ Provide the donor details ++++++++++\n");
        System.out.print("Enter Name: ");
        name = Input.nextLine();
        System.out.print("Enter Address: ");
        address = Input.nextLine();
        System.out.print("Enter Money Amount: ");
        moneyAmount = Input.nextLine();

        don.add(new Donor(name, address, moneyAmount));

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String moneyAmount() {
        return moneyAmount;
    }

    public static void main(String[] arg) {

    }
}
