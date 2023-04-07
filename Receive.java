import java.util.*;

public class Receive {
    private String name;
    private String profession;
    private int noOfFamilyMember;
    private String reason;
    private String address;
    private String deliveryType;

    public Receive() {
    }

    public Receive(String name, String profession, int noOfFamilyMember, String reason, String address) {
        this.name = name;
        this.profession = profession;
        this.noOfFamilyMember = noOfFamilyMember;
        this.reason = reason;
        this.address = address;
    }

    public void input(Vector<Receive> rec) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\nEnter your details");
        System.out.print("Name: ");
        setName(inp.nextLine());
        System.out.print("Profession: ");
        setProfession(inp.nextLine());
        System.out.print("Number of family members: ");
        setFamily(inp.nextInt());
        inp.nextLine();
        System.out.print("State your reason: ");
        setReason(inp.nextLine());
        System.out.print("Address: ");
        setAddress(inp.nextLine());

        rec.add(new Receive(name, profession, noOfFamilyMember, reason, address));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setFamily(int noOfFamilyMember) {
        this.noOfFamilyMember = noOfFamilyMember;
    }

    public int getFamily() {
        return noOfFamilyMember;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void displayInfo() {
        System.out.println("\n==========Receiver details==========");
        System.out.println("Name: " + name);
        System.out.println("Profession: " + profession);
        System.out.println("Number of family members: " + noOfFamilyMember);
        System.out.println("State your reason: " + reason);
        System.out.println("Address: " + address);
        System.out.println("Delivery type: " + deliveryType + "\n");
    }

    public static void main(String[] args) {

    }
}
