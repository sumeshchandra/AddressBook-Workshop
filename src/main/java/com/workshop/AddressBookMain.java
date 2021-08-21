package com.workshop;

import java.util.ArrayList;

public class AddressBookMain {

    ArrayList<Contact> addressbook = new ArrayList<>();



    public int createContact(String firstName, String lastName, String address,
                             String city, String state, String zip, String phone,
                             String email) throws CustomException {

        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhone(phone);
        contact.setEmail(email);
        addressbook.add(contact);
        return addressbook.size();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");

    }
}
