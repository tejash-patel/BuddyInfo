import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> address;

    public AddressBook(){
        address = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        address.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        address.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
