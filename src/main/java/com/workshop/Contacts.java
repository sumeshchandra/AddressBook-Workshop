package com.workshop;

import java.util.regex.Pattern;

public class Contacts {

    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public long zip;
    public String PhoneNumber;
    public String emailId;

    public Contacts(String firstName, String lastName, String address, String state, String city, int zipCode, String number, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.PhoneNumber = PhoneNumber;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", phone=" + PhoneNumber + ", email=" + emailId + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Checks regex pattern for First name
     * If matches sets the first name.
     *
     * @param firstName
     * @throws CustomException
     */
    public void setFirstName(String firstName) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
        if (check) {
            this.firstName = firstName;
        } else {
            throw new CustomException(CustomException.Exception.FIRST_NAME_INCORRECT);
        }
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Checks regex pattern for First name
     * If matches sets the first name.
     *
     * @param lastName
     * @throws CustomException
     */
    public void setLastName(String lastName) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
        if (check)
            this.lastName = lastName;
        else
            throw new CustomException(CustomException.Exception.LAST_NAME_INCORRECT);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return PhoneNumber;
    }

    public void setPhone(String phone) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return emailId;
    }

    public void setEmail(String email) {
        this.emailId = emailId;
    }
}
