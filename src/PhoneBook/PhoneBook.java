package PhoneBook;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class PhoneBook {
    List <Contacts> phoneBookList = new ArrayList<>();

    public boolean isEmpty() {
        return true;
    }

    public void addContact(String name, String email, String telephoneNumber) {
        checkIfItContainsAlphabets(telephoneNumber);
        if (telephoneNumber.length() == 11){
            Contacts myContacts = new Contacts(name, email, telephoneNumber);
            phoneBookList.add(myContacts);
        } else {
            throw new InputMismatchException("Please enter telephone number again");
        }
    }

    public int getContacts() {

        return phoneBookList.size();
    }

    public void removeContact(String name){
        for (Contacts contact: phoneBookList){
            if (contact.getName().equalsIgnoreCase(name)){
            phoneBookList.remove(contact);
            break;
        }
        }
    }

    public String searchContact(String name) {
        for (Contacts contact: phoneBookList){
            if (contact.getName().equalsIgnoreCase(name)){
                return contact.toString();
            }
        }return null;
    }

    public Contacts contactList() {
            for (Contacts contact: phoneBookList){
                System.out.printf("Name: " + contact.getName() + " \nTelephone Number:" + contact.getTelephoneNumber() + "\nEmail Address " + contact.getEmail() +"\n \n");


        } return null;
    }

    public void editContactName(String oldName, String newName){
        for (Contacts contact: phoneBookList){
            if (contact.getName().equalsIgnoreCase(newName)){
                contact.setName(newName);

            }

        }
    }
    public void blockContact(String telephoneNumber) {
        for (Contacts contact: phoneBookList){
            if (contact.getTelephoneNumber().equalsIgnoreCase(telephoneNumber)){

            }
        }
    }
    private void checkIfItContainsAlphabets(String phoneNumber){
        for (Character in : phoneNumber.toCharArray())
            if (!Character.isDigit(in)) throw new IllegalArgumentException("Telephone Number Contains Alphabet");
    }


}
