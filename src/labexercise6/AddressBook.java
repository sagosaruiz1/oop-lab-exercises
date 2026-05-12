package labexercise6;
import java.util.Scanner;

class AddressBookEntry {
    String name;
    String address;
    String phone;
    String email;

    AddressBookEntry(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + phone);
        System.out.println("Email Address: " + email);
        System.out.println("----------------------");
    }
}

class AddressBookMethod {
    AddressBookEntry[] entries = new AddressBookEntry[100];
    int count = 0;
    
    AddressBookMethod() {
    	addEntry("Silene", "Spain", "1111", "tokyo@ldp.com");
    	addEntry("Sergio", "Spain", "0000", "professor@ldp.com");
    	addEntry("Andres", "Spain", "2222", "berlin@ldp.com");
    }

    void addEntry(String name, String address, String phone, String email) {
        if (count < 100) {
            entries[count++] = new AddressBookEntry(name, address, phone, email);
            System.out.println("Entry added.");
        } else {
            System.out.println("Address book is full.");
        }
    }

    void deleteEntry(int index) {
    	if (index < 0 || index >= count) {
    		System.out.println("Invalid index.");
    		return;
    	}
    	for (int i = index; i < count - 1; i++) {
    		entries[i] = entries[i + 1];
    	}
    	entries[--count] = null;
    	System.out.println("Entry No." + (index + 1) + " has been deleted.");
    }
    
    void viewEntries() {
        if (count == 0) {
            System.out.println("No entries found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Entry #" + (i + 1));
            entries[i].display();
        }
    }

    void updateEntry(int index, String name, String address, String phone, String email) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid index.");
            return;
        }
        entries[index].name = name;
        entries[index].address = address;
        entries[index].phone = phone;
        entries[index].email = email;
        System.out.println("Entry updated.");
    }
}

public class AddressBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBookMethod book = new AddressBookMethod();
		int choice;
		
		do {
			System.out.println("\n======== Addres Book ========");
			System.out.println("1. Add Entry");
			System.out.println("2. Delete Entry");
			System.out.println("3. View Entries");
			System.out.println("4. Update Entry");
			System.out.println("5. Exit");
			System.out.println("Choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Address: ");
				String address = sc.nextLine();
				System.out.print("Telephone Number: ");
				String phone = sc.nextLine();
				System.out.print("Email Address: "); 
				String email = sc.nextLine(); 
				book.addEntry(name, address, phone, email); 
				break;
			
			case 2:
				System.out.print("Enter what entry to delete: ");
				int del = sc.nextInt() - 1;
				book.deleteEntry(del);
				break;
				
			case 3:
				book.viewEntries();
				break;
				
			case 4:
				System.out.print("Enter what entry to update: ");
				int update = sc.nextInt() - 1;
				sc.nextLine();
				
				System.out.println("Enter Updated Contact Details for Entry No." + (update + 1));
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Address: ");
				address = sc.nextLine();
				System.out.print("Telephone Number: ");
				phone = sc.nextLine();
				System.out.print("Email Address: ");
				email = sc.nextLine();
				
				book.updateEntry(update, name, address, phone, email);
				break;
				
			case 5:
				System.out.println("Thank you, Goodbye!");
				break;
				
			default:
				System.out.println("Invalid choice.");
			}
		} while (choice != 5);
		
		sc.close();
	}

}
