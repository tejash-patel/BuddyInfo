import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> address;

    public void addBuddy(BuddyInfo buddy){
        address.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        address.remove(buddy);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
