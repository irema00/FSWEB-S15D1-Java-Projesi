import model.Contact;
import model.GroceryList;
import model.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*    Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();
        int choice;
        do {
            System.out.println("Yapılmak istenen operasyonu seçin(0: quit, 1: ekleme, 2: çıkarma)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("eklenmesini istedğiniz elamanları giriniz.(birden fazlaysa virgül kullanın)");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("silinmesini istedğiniz elamanları giriniz.(birden fazlaysa virgül kullanın)");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.removeItems(itemsToRemove);
                    break;
            }
            groceryList.printSorted();
        } while (choice != 0);
        scanner.close();
*/

        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact contact1 = Contact.createContact("Bob", "31415926");
        Contact contact2 = Contact.createContact("Alice", "16180339");
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.printContacts();

    }
}