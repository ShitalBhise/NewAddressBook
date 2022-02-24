package book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookMain {

	static Scanner scanner = new Scanner(System.in);
	ArrayList<AddressBook> person = new ArrayList<>();

	public void addPerson() {
		System.out.println("Enter the First Name");
		String fName = scanner.next();
		System.out.println("Enter the Last Name");
		String lName = scanner.next();
		System.out.println("Enter the Address");
		String address = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the Zip");
		String zip = scanner.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNo = scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();

//creating Addressbook object and passing arguments inside constructor
		AddressBook p = new AddressBook(fName, lName, city, state, zip, address, phoneNo, email);
//adding p object into the linked list with Addressbook class data type
		person.add(p);
//printing person array list
		System.out.println(p);

	}

	// Edit AddressBook details using person name

	/// editing contact by searching names
	public void editPerson() {
		System.out.println("Enter the name to edit");
		String s = scanner.next();

		for (int i = 0; i < person.size(); i++) {
			AddressBook p = person.get(i);
			if (s.equals(p.getfname())) {
				while (true) {
					System.out.println("Enter choice to edit 1)firstName\n2)lastName\n3)city\n"
							+ "4)state\n5)zip\n6)address\n7)phoneNo\n8)email\n9)exit");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						p.setfname(scanner.next());
						break;
					case 2:
						p.setlname(scanner.next());
						break;
					case 3:
						p.setcity(scanner.next());
						break;
					case 4:
						p.setstate(scanner.next());
						break;
					case 5:
						p.setzip(scanner.next());

						break;
					case 6:
						p.setaddress(scanner.next());
						break;
					case 7:
						p.setphoneNo(scanner.next());
						break;
					case 8:
						p.setemail(scanner.next());
						break;
					default:
						System.out.println("select correct choice");
						break;
					}// end of switch
					if (choice == 9)
						break;
				} // end while
				person.set(i, p);
				System.out.println("person after editing");
				System.out.println(person);

			} // end of if
		} // end of for loop

	}

	public void deletePerson() {
		System.out.println("Enter the name to search and delete");
		String s = scanner.next();
		for (int i = 0; i < person.size(); i++) {
			AddressBook p = person.get(i);
			if (s.equals(p.getfname())) {
				person.remove(i);
			}
		}
		System.out.println("AddressBook after deletion");
		if (person.isEmpty() != true)
			System.out.println(person);
		else {
			System.out.println("AddressBook deleted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressbookMain main = new AddressbookMain();
		main.addPerson();
		main.editPerson();
		main.deletePerson();
	}

}
