package com.workshop;


import java.util.Scanner;

public class AddressBookMain {

    static AddressBook service = new AddressBook();

    public static void main(String[] args)
    {
        boolean isExit = false;
        while (!isExit)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter options \n 1.Add Contact.\n 2.Edit Contact.\n 3.Delete Contact.\n 4. Search City.\n 5. view City \n 6.Display Contact.\n 7.Exit");
            int userInput = scanner.nextInt();
            switch (userInput)
            {
                case 1:
                    service.addNewContact();
                    break;
                case 2:
                    service.editContact();
                    break;
                case 3:
                    System.out.println("Enter the name of the person do you wants to delete:");
                    String personName = scanner.next();
                    service.deleteContact(personName);
                    break;
                case 4:
                    System.out.println("Enter the city to be Searched:");
                    String searchCity = scanner.next();
                    service.searchaPersoninaCity(searchCity);
                case 5:
                    service.displayList();
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}
