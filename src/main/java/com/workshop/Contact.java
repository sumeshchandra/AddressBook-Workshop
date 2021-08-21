package com.workshop;

import java.util.regex.Pattern;

public class Contact {

    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phone;
    public String email;

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Checks regex pattern for First name
     * If matches sets the first name.
     * @param firstName
     * @throws
     */
    public void setFirstName(String firstName) throws CustomException  {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
        if (check){
            System.out.println("valid");
        } else{
            System.out.println("Invalid");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
        if(check)
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
