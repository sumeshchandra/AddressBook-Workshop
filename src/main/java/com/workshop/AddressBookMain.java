package com.workshop;


import java.util.Scanner;

public class AddressBookMain {

    Contacts contacts;

    private void addContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter The Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter The Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter The City: ");
        String city = scanner.nextLine();
        System.out.println("Enter The State: ");
        String state = scanner.nextLine();
        System.out.println("Enter The Zip Code: ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter The Mobile Number: ");
        String number = scanner.next();
        System.out.println("Enter The Email-id: ");
        String email = scanner.next();
        contacts = new Contacts(firstName, lastName, address, state, city, zipCode, number, email);
        System.out.println("Contact Successfully Added");
    }

    @Override
    public String toString() {
        return "AddressBookMain{" +
                "contacts=" + contacts +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        AddressBookMain addressBook = new AddressBookMain();
        addressBook.addContacts();
        System.out.println(addressBook.toString());
    }
}
