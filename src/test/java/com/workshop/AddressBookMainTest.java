package com.workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AddressBookMainTest {

    AddressBookMain addressbook = null;

    @Before
    public void setUp() {
        addressbook = new AddressBookMain();
    }


    @Test
    public void given_AddingContactInList_IfSuccssful_ShouldReturnCorrectSizeOfList() throws CustomException{
       try {
           int result = addressbook.createContact("Sumesh", "Jena", "abcd", "Rourkela",
                   "Odisha", "769012", "7008944265", "abcqwe12@gmail.com");
           Assertions.assertEquals(1, result);
       }
       catch(CustomException e){
           Assert.assertEquals(CustomException.Exception.FIRST_NAME_INCORRECT,e.type);
       }

    }
}
